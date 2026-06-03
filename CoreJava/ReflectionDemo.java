import java.lang.reflect.Method;

class Student {

    public void show() {
        System.out.println("Reflection Example");
    }
}

public class ReflectionDemo {

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName("Student");

        Object obj =
                cls.getDeclaredConstructor()
                   .newInstance();

        Method[] methods =
                cls.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }

        Method method =
                cls.getMethod("show");

        method.invoke(obj);
    }
}