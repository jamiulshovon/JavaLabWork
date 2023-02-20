public class person {
    private String name;
    private int age;

    public person(String Name, int Age) {
        this.age = Age;
        this.name = Name;
    }

    public Void person() {
        System.out.println(name);
        System.out.println(age);
        return null;
    }

    public String getName() {
        return name;
    }

    public int getage() {
        return age;
    }

    public static void main(String[] args) {
        person obj = new person("shovon", 24);
        obj.person();

    }

}
