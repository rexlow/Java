import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AnnualLoan extends Loan implements LoanInterface {

  public AnnualLoan(String date, int loanDuration, double oriLoan) {
    super();
    this.date = date;
    this.loanDuration = loanDuration;
    this.oriLoan = oriLoan;
  }

  public double CalculateFee() {
    if (loanDuration >= 0 && loanDuration < 6) {
      balanceDue = oriLoan;
    } else if (loanDuration >= 6 && loanDuration < 12) {
      balanceDue = oriLoan + 800.00;
    } else if (loanDuration >= 12 && loanDuration < 18) {
      balanceDue = oriLoan + 1800.00;
    } else if (loanDuration >= 18 && loanDuration < 24) {
      balanceDue = oriLoan + 3000.00;
    } else if (loanDuration >= 24) {
      balanceDue = oriLoan + 4000.00;
    }

    return balanceDue;
  }

  public void CalculateDuration() {
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MM yyyy");
    LocalDate oriDate = LocalDate.parse(date, formatter);
    LocalDate newDate = oriDate.plusMonths(loanDuration);
    System.out.println(newDate);
  }
}
