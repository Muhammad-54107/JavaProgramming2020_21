package Day38_StaticKeyword;

public class SalaryCalculator {

    public double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax;

    public void setInfo(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = (stateTaxRate > 1)? stateTaxRate / 100 : stateTaxRate; // 8 will be 0.08
        this.federalTaxRate = (federalTaxRate > 1)? federalTaxRate / 100 : federalTaxRate;
        this.salary = calculatorSalary();
        this.salaryAfterTax = calculateSalaryAfterTax();
    }

    public double calculatorSalary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double calculateStateTax(){
        return salary * stateTaxRate;
    }

    public double calculateFederalTax(){
        return salary * federalTaxRate;
    }

    public double calculateTotalTax(){
        return calculateStateTax() + calculateFederalTax();
    }

    public double calculateSalaryAfterTax(){
        return salary - calculateTotalTax();
    }

    @Override
    public String toString() {
        return "SalaryCalculator{"  +
                "hourlyRate= $" + hourlyRate +
                ", salary= $" + salary +
                ", salaryAfterTax= $" + salaryAfterTax +
                '}';
    }

    public boolean equals(SalaryCalculator s1){
        return this.salary == s1.salary;
    }

}

/*
2. Create getPassWord custom class called SalaryCalculator

                    Attributes:
                        hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax

                    Methods:
                        calculateSalary: returns the annual salary

                        calculateStateTax: returns the total tax

                        calculateFederalTax: returns the total tax

                        calculateTotalTax: returns the total tax

                        calculateSalaryAfterTax: returns the salary after calculator

                        setInfo: accepts four arguments (hourlyRate, weeklyHours, stateTax, federalTax) and iitializes all instances

                        toString() method
 */