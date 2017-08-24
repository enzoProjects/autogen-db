package jpa.msservice.autogenerate;

import jpa.msservice.autogenerate.DAO.*;
import jpa.msservice.autogenerate.model.*;
import jpa.msservice.autogenerate.reflection.ObjMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Component
public class ApplicationLoader implements CommandLineRunner {

    private final ObjMapper objMapper;

    private final ClienteDao clienteDao;
    private final EmpresaDao empresaDao;
    private final PersonaDao personaDao;
    private final CuentaDao cuentaDao;
    private final TarjetaDao tarjetaDao;
    private final UsuarioDao usuarioDao;

    @Autowired
    public ApplicationLoader(ObjMapper objMapper, ClienteDao clienteDao, EmpresaDao empresaDao, PersonaDao personaDao, CuentaDao cuentaDao, TarjetaDao tarjetaDao, UsuarioDao usuarioDao) {
        this.objMapper = objMapper;

        this.clienteDao = clienteDao;
        this.empresaDao = empresaDao;
        this.personaDao = personaDao;
        this.cuentaDao = cuentaDao;
        this.tarjetaDao = tarjetaDao;
        this.usuarioDao = usuarioDao;
    }

    private static final Integer CLIENTES_SIZE = 100;
    private static final String ENTIDAD = "54";

    private final Random random = new Random();


    private static final Logger logger = LoggerFactory.getLogger(ApplicationLoader.class);

    @Override
    public void run(String... strings) throws Exception {



        //loop para añadir clientes
        List<McliClienteEntity> clientes = new LinkedList<>();

        for (int j = 0; j < CLIENTES_SIZE; j++) {

            McliClienteEntity cliente = objMapper.newInstanceOfT(McliClienteEntity.class);

            cliente.setIdCliente(randomId());
            cliente.setEntidad(ENTIDAD);
            cliente.setDocumentoIdentificacion(randomRut());


            if (random.nextBoolean()) {
                cliente.setCodigoTipoCliente("E");
                clienteDao.save(cliente);

                McliEmpresaEntity empresa = objMapper.newInstanceOfT(McliEmpresaEntity.class);
                empresa.setIdCliente(cliente.getIdCliente());
                empresa.setEntidad(ENTIDAD);
                empresa.setNombreFantasia("empresa");
                empresaDao.save(empresa);
            } else {
                cliente.setCodigoTipoCliente("P");
                clienteDao.save(cliente);

                McliPersonaEntity persona = objMapper.newInstanceOfT(McliPersonaEntity.class);
                persona.setIdCliente(cliente.getIdCliente());
                persona.setEntidad(ENTIDAD);
                persona.setPrimerNombre("primerNombre");
                persona.setApellidoPaterno("apellidoPaterno");
                personaDao.save(persona);
            }
            clientes.add(cliente);

            List<MctaMaestroCuentaEntity> cuentas = new LinkedList<>();

            for (int i = 0; i < random.nextInt(3); i++) {
                MctaMaestroCuentaEntity cuenta = objMapper.newInstanceOfT(MctaMaestroCuentaEntity.class);
                cuenta.setEntidad(ENTIDAD);
                cuenta.setIdCuenta(randomId());
                cuenta.setIdCliente(cliente.getIdCliente());
                if (random.nextBoolean()) cuenta.setIndicadorVigente("SI");
                else cuenta.setIndicadorVigente("NO");

                cuentas.add(cuenta);
                cuentaDao.save(cuenta);

            }

            Integer nrotar = randomId();
            if(cuentas.size() > 0) {
                for (int i = 0; i < random.nextInt(5); i++) {
                    MctaMaestroTarjetaEntity tarjeta = objMapper.newInstanceOfT(MctaMaestroTarjetaEntity.class);
                    tarjeta.setIdTarjeta(randomId());
                    tarjeta.setNumeroTarjeta(Integer.toString(nrotar + i));
                    if(random.nextBoolean()) {
                        McliClienteEntity adicional = getClienteRandom(clientes);
                        if (adicional.getIdCliente() != cliente.getIdCliente()){
                            tarjeta.setIdClienteAdicional(adicional.getIdCliente());

                        } else tarjeta.setIdClienteAdicional(null);
                    } else tarjeta.setIdClienteAdicional(null);

                    tarjeta.setEntidad(cliente.getEntidad());
                    tarjeta.setIdCliente(cliente.getIdCliente());
                    tarjeta.setIdCuenta(getRandomIdCuenta(cuentas));
                    tarjetaDao.save(tarjeta);
                }
            }
        }
    }

    private McliClienteEntity getClienteRandom(List<McliClienteEntity> clientes) {
        return clientes.get(random.nextInt(clientes.size()));
    }

    private int getRandomIdCuenta(List<MctaMaestroCuentaEntity> cuentas) {
        return cuentas.get(random.nextInt(cuentas.size())).getIdCuenta();
    }

    private int randomId() {
        return random.nextInt(10000000);
    }

    private String randomRut() {
        return Integer.toString(100000000 + random.nextInt(900000000));
    }


}
