public class Employee {

    int empId;
    String name;

    public Employee(int Id, String nam) {
        this.empId = Id;
        this.name = nam;

    }

    Void info() {
        System.out.println("Id:" + empId + " " + "Name:" + name);
        return null;

    }

    public static void main(String[] args) {
        Employee e1 = new Employee(221155560, "Jamiul");
        e1.info();
        Employee e2 = new Employee(221155560, "Shovon");
        e2.info();
    }
}
