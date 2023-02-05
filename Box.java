public class Box {
    int height = 5;
    int width = 6;
    int length = 7;

    static int area(int width, int height) {
        return width * height;
    }

    static int area(int length, int width, int height) {
        return length * width * height;
    }

    void display() {
        System.out.println(area(length, width, height));
        System.out.println(area(length, height));
    }

    public static void main(String[] args) {
        Box objBox = new Box();
        objBox.display();
    }
}