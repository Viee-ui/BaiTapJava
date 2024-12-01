//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Việt", "92 Quảng Nam");
        Student studnent = new Student("24ITe", 2024, 100);
        Staff staff = new Staff("Việt", "92 Quảng Nam", "VKU", 900000);

        System.out.println(person);
        System.out.println(studnent);
        System.out.println(staff);
    }
}