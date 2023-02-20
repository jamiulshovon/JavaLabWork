public class Room {
    int roomno;
    String roomtype;
    float roomarea;
    boolean ACmachine;

    public Room() {
        System.out.println("Hello");
    }

    public Room(int a, String b, float c, boolean d) {
        this.roomno = a;
        this.roomtype = b;
        this.roomarea = c;
        this.ACmachine = d;
    }

    public void displaydata() {
        System.out.println(roomno);
        System.out.println(roomtype);
        System.out.println(roomarea);
        System.out.println(ACmachine);
    }

    public static void main(String args[]) {
        Room obj = new Room(1, "classroom", 35.5f, true);
        obj.displaydata();
        Room newobj = new Room();
    }

}