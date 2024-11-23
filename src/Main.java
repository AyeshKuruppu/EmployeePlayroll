import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Employee Payroll System");
        Scanner payroll = new Scanner(System.in);

        System.out.println("Enter the Number Of Employees");
        int NoOfEmployees = payroll.nextInt();

        String [] EmpoyeeNames = new String[NoOfEmployees];
        double [] EmployeeSalaryWeeklyPay = new double[NoOfEmployees];

        double highestpay=0;
        String HighestPayEmployee = "";

        for(int i =0; i<NoOfEmployees; i++){
            System.out.println("Enter Employee Name : "+ (i +1) + ":");
            EmpoyeeNames[i] = payroll.next();

            System.out.println("Enter hourly wage for :" + EmpoyeeNames[i] + ":");
            double hourlywage = payroll.nextDouble();

            System.out.println("Enter hourly wage (for the whole week) for" + EmpoyeeNames[i]);
            double hourlyworkforWholeWeek = payroll.nextDouble();

            double pay=0;
            if(hourlyworkforWholeWeek > 40){
                pay = ((40 * hourlywage) + (hourlyworkforWholeWeek -40) * hourlywage *1.5);
            }else if (hourlyworkforWholeWeek < 40){
                pay = hourlywage *hourlyworkforWholeWeek;
            }

            EmployeeSalaryWeeklyPay[i] =pay;
            if(pay > highestpay){
                highestpay=pay;
                HighestPayEmployee = EmpoyeeNames[i];

            }

        }

        System.out.println("\n ===== PayRoll System =====");
        for (int i =0; i<NoOfEmployees; i++){
            System.out.println("Employee Name : " +EmpoyeeNames[i] );
            System.out.println("EmployeeSalaryWeeklyPay : "+"Employee Name :"+ EmployeeSalaryWeeklyPay[i]);
            System.out.println("====== ParRoll System ======");
        }

        System.out.println(EmployeeSalaryWeeklyPay);
        System.out.println(HighestPayEmployee);

        payroll.close();


    }
}