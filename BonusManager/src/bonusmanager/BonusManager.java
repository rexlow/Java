package bonusmanager;

public class BonusManager {

    public static void main(String[] args) {
        Programmer emma = new Programmer("Emma Mckay", 2010, 10000.00);
        Programmer azah = new Programmer("Azah Muda", 2014, 24000.00);
        Programmer maslita = new Programmer("Maslita Aziz", 1998, 15000.00);
        Programmer sanusi = new Programmer("Sanusi Azmi", 2009, 13000.00);
        
        try {
            emma.displayInfo();
        } catch (BonusException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            azah.displayInfo();
        } catch (BonusException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            maslita.displayInfo();
        } catch (BonusException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            sanusi.displayInfo();
        } catch (BonusException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}

class BonusException extends Exception {
    private static final String exceptionMessage = "Service year is more than 15. Bonus will not entitled.";
    BonusException() {
        super(exceptionMessage);
    }
}

class Employee {
  private String name;
  protected int startYear;
  private double baseSalary;

  public Employee(String name, int startYear, double baseSalary) {
    this.name = name;
    this.startYear = startYear;
    this.baseSalary = baseSalary;
  }

  public String getName() {
    return name;
  }

  public int getStartYear() {
    return startYear;
  }

  public double getBaseSalary() {
    return baseSalary;
  }
  
}

class Programmer extends Employee {
    private double totalSalary;
    private int entitlement;
    private final int currentYear = 2014;
    
    public Programmer(String name, int startYear, double baseSalary) {
        super(name, startYear, baseSalary);
    }
    
    public double getTotalSalary() {
        return totalSalary;
    }
    
    public int getEntitlement() {
        int yearOfService = currentYear - startYear;
        switch(yearOfService) {
                case 1:
                case 2:
                    entitlement = 2;
                    break;
                case 3:
                case 4:
                case 5:
                    entitlement = 4;
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    entitlement = 6;
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    entitlement = 8;
                    break;
                default:
                    entitlement = 0;
                    break;
            }
        return entitlement;
    }
    
    public void calculateBonus() throws BonusException {
        if (entitlement == 0) {
            throw new BonusException();
        } else {
            double totalBonus = getBaseSalary()*entitlement;
            totalSalary = getBaseSalary()+totalBonus;
        }
    }
    
    public void displayInfo() throws BonusException {
        System.out.println("Name: " + getName());
        System.out.println("Base Salary: " + getBaseSalary());
        System.out.println("Entitlement: " + getEntitlement());
        calculateBonus();
        System.out.println("Total Salary: " + getTotalSalary());
    }
}