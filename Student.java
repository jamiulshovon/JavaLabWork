
public class Student {
    String Name;
    int Age;
    float CGPA;

    void display() {
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(CGPA);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.Name = "Shovon";
        obj.Age = 80;
        obj.CGPA = 3.71f;
        obj.display();
    }
}