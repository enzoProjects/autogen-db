package jpa.msservice.autogenerate.reflection;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

@Component
public class ObjMapper {

    private final Random random;

    public ObjMapper() {
        this.random = new Random();
    }

    public <T> T newInstanceOfT(Class<T> clazz) {
        try {
            final T obj = clazz.newInstance();
            Arrays.stream(obj.getClass().getDeclaredFields()).forEach((field) -> {
                try {
                    Class<?> fieldClazz = field.getType();
                    field.setAccessible(true);
                    if (fieldClazz.equals(int.class) || fieldClazz.equals(Integer.class)) {
                        field.set(obj, random.nextInt(9));
                    } else if (fieldClazz.equals(String.class)) {
                        field.set(obj, Integer.toString(random.nextInt(9)));
                    } else if (fieldClazz.equals(Date.class)) {
                        field.set(obj, new Date(Calendar.getInstance().getTime().getTime()));
                    }// else if (fieldClazz.equals(BigInteger.class)) {
                    //    field.set(obj, BigInteger.valueOf(random.nextLong()));
                    //} else if (fieldClazz.equals(BigDecimal.class)) {
                    //    field.set(obj, BigDecimal.valueOf(random.nextFloat()));
                    //}
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });

            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
