package accounts;

public class HumanResources {
    public static void main(String[] args) {
        workDayFile("Lee", "Finley", "Account Manager", 25);
        System.out.println();
        workDayFile("Ronan", "Richardson", "Account Receivable", 30);
        System.out.println();
        workDayFile("Carlos", "Mendez", "Event Manager", 20);
        System.out.println();
        workDayFile("Keaton", "Douglas", "House Keeper", 15);
        System.out.println();
        workDayFile("Samuel", "Peterson", "Account Payable", 26);
        System.out.println();
        workDayFile("Zakaria", "Thornton", "QA", 40);
        System.out.println();
        workDayFile("Isaiah", "Orozco", "Linux Admin", 35);
        System.out.println();
        workDayFile("Elmer", "Reid", "Sale Rep", 22);
        System.out.println();
        workDayFile("Victor", "Maccnn", "Project Manager", 40);
        System.out.println();
        workDayFile("Nathaniel", "Valdez", "Security Supervisor", 20);
    }
    public static void workDayFile(String firstName, String lastName, String title, double salary){
        double taxRate = 0.35;
        double grossYearly = (salary*40)*52;
        double grossMonthly = (salary*40)*4;
        double netIncomeYearly = grossYearly * (1 - taxRate);
        double netIncomeMonthly = grossMonthly * (1 - taxRate);

        System.out.println(firstName + " " + lastName + " " + title + " " + salary + " per hour");
        System.out.println("Gross monthly salary is: " + grossMonthly);
        System.out.println("Net monthly income is: " + netIncomeMonthly);
        System.out.println("Gross yearly salary is: " + grossYearly);
        System.out.println("Net yearl Income is: " + netIncomeYearly);
    }
}
