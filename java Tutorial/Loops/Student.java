public class Student {

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to print student information
    public void StudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        // Create a new Student object
        Student student1 = new Student("Ram", 21, 64.4);

        // Print student information
        System.out.println("Student 1 Information:");
        student1.StudentInfo();

        // Update student information
        student1.setName("Kamal");
        student1.setAge(22);
        student1.setGrade(71.45);

        // Print updated student information
        System.out.println("\nUpdated Student 1 Information:");
        student1.StudentInfo();
    }
}
