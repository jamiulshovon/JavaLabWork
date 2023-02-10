public class Lab4Int {

    static int method1(int a) {
        System.out.println(" Static method1");
        return a;
    }

    public int method2(int b) {
        System.out.println("Non Static method2");
        return b;
    }

    public static void main(String[] args) {
        method1(5);
        Lab4Int obj = new Lab4Int();
        obj.method2(6);

    }
}
