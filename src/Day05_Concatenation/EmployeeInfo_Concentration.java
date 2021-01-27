package Day05_Concatenation;

public class EmployeeInfo_Concentration {

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

        System.out.println("EmployeeObject' full name is: "+fullName);
        System.out.println(fullName +"' Gender is: "+gender );
        System.out.println(fullName+"'s age is: "+age+" years old");
        System.out.println(fullName+" works at " + companyName );
        System.out.println(fullName+"'s job title is: "+jobTitle );
        System.out.println( fullName+ "'s salary is: $ " +salary);






    }
}




/*
 output:
                    EmployeeObject' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false



 */



