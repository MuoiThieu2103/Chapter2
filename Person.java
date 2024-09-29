public class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Teacher extends Person {
    private String institutionName;
    private String[] courses;


    public Teacher(String name, int age, String address, String institutionName, String[] courses) {
        super(name, age, address);
        this.institutionName = institutionName;
        this.courses = courses;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Institution Name: " + institutionName);
        System.out.print("Courses: ");
        for (String course : courses) {
            System.out.print(course + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] courses = {"Math", "Physics", "Chemistry"};

        Teacher teacher = new Teacher("Tu Nguyen", 18, "470 Tran Dai Nghia", "DH Tram Mam", courses);

        teacher.displayInfo();
    }
}
