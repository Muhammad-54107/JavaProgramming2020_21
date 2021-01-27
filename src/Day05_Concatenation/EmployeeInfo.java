package Day05_Concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Aaron"; //""for the texts
        String lastName = "James";
        String fullName = firstName+" "+lastName;// String===> for text
        char gender = 'M'; // '' for single character
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        double salary = 120000; //120000
        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.print(" EmployeeObject' full name is: ");
        System.out.println(fullName);

        System.out.print(fullName);
        System.out.print("' gender is: ");
        System.out.println(gender);

        System.out.print(fullName);
        System.out.print("' age is: ");
        System.out.print(age);
        System.out.println(" Years Old ");

        System.out.print(fullName);
        System.out.print("' works at: ");
        System.out.println(companyName);

        System.out.print(fullName);
        System.out.print("' Job title is: ");
        System.out.println(jobTitle);


        System.out.print(fullName);
        System.out.print("' salary is: ");
        System.out.println(salary);

        System.out.print(fullName);
        System.out.print("' is Full time empolyee: ");
        System.out.println(isFullTime);

        System.out.print(fullName);
        System.out.print("' is Married: ");
        System.out.println(isMarried);

    }

}
