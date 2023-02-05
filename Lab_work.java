public class Lab_work {
    int x = 5;

    void sum() {
        x = x + 5;
        System.out.println(x);
    }

    void display() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Lab_work myObj = new Lab_work();
        System.out.println(myObj.x);
        myObj.sum();
        myObj.display();
    }
}