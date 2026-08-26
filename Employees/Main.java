public class Main{
    public static void main(String[] args) {
        Date dob = new Date(20, 4, 2008);
        Date doh = new Date(14, 8, 2025);

        Date dob1 = new Date(20, 4, 2008);
        Date doh1 = new Date(14, 8, 2025);

        Employee Amir = new Employee("Amir", dob, doh);
        Employee Izza = new Employee("Izza", dob1, doh1);
        Amir.increment(Izza);
        Amir.display();
        Izza.display();

    }
}