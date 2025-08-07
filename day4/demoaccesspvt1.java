import java.lang.reflect.Method;

class sampledemo {
    private String str = "welcome";

    private void displayPvt() {
        System.out.println("Accessing this method outside of the class");
    }
}

class sample {
    private void display() {
        System.out.println("Welcome to display2");
    }
}

public class demoaccesspvt1 {
    public static void main(String[] args) throws Exception {

        // Accessing private method of sampledemo
        Class<?> c = Class.forName("sampledemo");
        Object o = c.getDeclaredConstructor().newInstance();
        Method m1 = c.getDeclaredMethod("displayPvt");
        m1.setAccessible(true);
        m1.invoke(o);

        // Accessing private method of sample
        Class<?> cs = Class.forName("sample");
        Object oi = cs.getDeclaredConstructor().newInstance();  // corrected
        Method mm = cs.getDeclaredMethod("display");            // corrected
        mm.setAccessible(true);
        mm.invoke(oi);  // corrected
    }
}
