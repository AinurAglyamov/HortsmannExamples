package chapter6;

import java.util.Arrays;

public class EmployeeSortTest {

    public static void main(String[] args) {
        Employee[] staff = new Employee[5];

        staff[0] = new Employee("Vitya", 35000.00);
        staff[1] = new Employee("Albus Dambldor", 36000.00);
        staff[2] = new Employee("Ainur", 45000.00);
        staff[3] = new Employee("Gwerman", 15000.00);
        staff[4] = new Employee("Vitya", 36000.00);

        System.out.println(Arrays.toString(staff));

        Arrays.sort(staff);

        System.out.println(Arrays.toString(staff));


    }
}
