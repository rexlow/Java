public class DemoLoan {

  public static void main(String[] args) {

    System.out.println("Time              Fee");
    System.out.println("-----------       -----------");
    System.out.println("6  months         $800.00");
    System.out.println("12 months         $1800.00");
    System.out.println("18 months         $3000.00");
    System.out.println("24 months         $4000.00\n");

    AnnualLoan loanAli = new AnnualLoan("10 11 2016", 8, 5000);
    System.out.println("Loan For Ali");
    System.out.println("Start Date    : 10 Nov 2016");
    System.out.println("Loan Duration : 8 months");
    System.out.println("Loan Amount   : $5000");
    System.out.print("Ali has to pay $" + loanAli.CalculateFee() + " before ");
    loanAli.CalculateDuration();

    AnnualLoan loanAbu = new AnnualLoan("10 11 2016", 18, 5000);
    System.out.println("Loan For Abu");
    System.out.println("Start Date    : 20 Nov 2016");
    System.out.println("Loan Duration : 18 months");
    System.out.println("Loan Amount   : $5000");
    System.out.print("Abu has to pay $" + loanAbu.CalculateFee() + " before ");
    loanAbu.CalculateDuration();
  }

}
