package homework9.task_3_1;


public class ExpensesClient {

  public static void main(String[] args) {
    SalesTeam supermarketTeam = new SalesTeam();
    supermarketTeam.addEmployee(createMeatDepartment());
    supermarketTeam.addEmployee(createMilkDepartment());
    supermarketTeam.addEmployee(createConfectioneryDepartment());
    supermarketTeam.payExpenses();
  }

  private static SalesTeam createMeatDepartment() {
    SalesTeam meatTeam = new SalesTeam();

    Manager manager = new Manager("Oleg", 150);
    Salesperson salesperson_1 = new Salesperson("Ivan", 200, manager);
    Salesperson salesperson_2 = new Salesperson("Galyna", 180, manager);
    Salesperson salesperson_3 = new Salesperson("Mykola", 220, manager);
    Salesperson salesperson_4 = new Salesperson("Viktoria", 190, manager);

    meatTeam.addEmployee(manager);
    meatTeam.addEmployee(salesperson_1);
    meatTeam.addEmployee(salesperson_2);
    meatTeam.addEmployee(salesperson_3);
    meatTeam.addEmployee(salesperson_4);

    return meatTeam;
  }

  private static SalesTeam createMilkDepartment() {
    SalesTeam milkTeam = new SalesTeam();

    Manager manager = new Manager("Stepan", 120);
    Salesperson salesperson_1 = new Salesperson("Oleg", 140, manager);
    Salesperson salesperson_2 = new Salesperson("Maksym", 140, manager);
    Salesperson salesperson_3 = new Salesperson("Iryna", 150, manager);

    milkTeam.addEmployee(manager);
    milkTeam.addEmployee(salesperson_1);
    milkTeam.addEmployee(salesperson_2);
    milkTeam.addEmployee(salesperson_3);

    return milkTeam;
  }

  private static SalesTeam createConfectioneryDepartment() {
    SalesTeam confectioneryTeam = new SalesTeam();

    Manager manager = new Manager("Polina", 210);
    Salesperson salesperson_1 = new Salesperson("Daria", 300, manager);
    Salesperson salesperson_2 = new Salesperson("Victor", 320, manager);
    Salesperson salesperson_3 = new Salesperson("Andrii", 200, manager);
    Salesperson salesperson_4 = new Salesperson("Anton", 260, manager);
    Salesperson salesperson_5 = new Salesperson("Mark", 380, manager);

    confectioneryTeam.addEmployee(manager);
    confectioneryTeam.addEmployee(salesperson_1);
    confectioneryTeam.addEmployee(salesperson_2);
    confectioneryTeam.addEmployee(salesperson_3);
    confectioneryTeam.addEmployee(salesperson_4);
    confectioneryTeam.addEmployee(salesperson_5);

    return confectioneryTeam;
  }
}
