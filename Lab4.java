public class Lab4 {

    static void method1() {
        System.out.println("Static method");
    }

    public void method2() {
        System.out.println("Non-static method");
    }

    public static void main(String[] args) {
        method1();
        Lab4 obj = new Lab4();
        obj.method2();
    }
}
