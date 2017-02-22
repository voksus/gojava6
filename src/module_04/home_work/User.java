package module_04.home_work;

/**
 * Created by voksus on 22.02.2017.
 */
public class User {

    long id;
    String name;
    double balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    Bank bank;

    public User(String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
        id = this.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("User: ");
        result.append(name);
        result.append("\t\t\t\t\tBalance: ");
        result.append(balance);
        result.append("\nWorking in company: ");
        result.append(companyName);
        result.append("\tSalary is: ");
        result.append(salary);
        result.append("\t\tNumber of month employment: ");
        result.append(monthsOfEmployment);
        result.append("\nBank: ");
        result.append(bank.getClass().getSimpleName());
        result.append(".\t\t\t\tID: ");
        result.append(id);
        result.append("\n-------------------------------------------------------------------------------\n");
        return result.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

}