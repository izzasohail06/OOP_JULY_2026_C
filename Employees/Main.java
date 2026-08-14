public class Main{
    public static void main(String[] args) {
        Date dob = new Date(26,4,2008);
        Date doh = new Date(14,8,2025);
        Employee Amir = new Employee("Amir", dob, doh);
        System.out.println(Amir);

    }
}