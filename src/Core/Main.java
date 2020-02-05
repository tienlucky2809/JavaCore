package Core;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.Hello();

        Employee employee = new Employee();
        employee.Hello();

        Person person = new Student();
        person.Hello();
    }
}
