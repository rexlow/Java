class ThrowException extends Exception {
  ThrowException(String errorMessage) {
    super(errorMessage);
  }
}


public class CustomException {

  double balance;

  public CustomException(double balance) {
    this.balance = balance;
  }

  public void withdraw(double amount) throws ThrowException {
    if (amount <= balance) {
      balance = balance - amount;
      System.out.println("Transaction succeeded! Account balance: $" + balance);
    } else {
      throw new ThrowException("Insufficient balance by $" + (amount-balance));
    }
  }

  public static void main(String[] args) {
    try {
      new CustomException(1000).withdraw(500); //should succedd
      new CustomException(1000).withdraw(5000); //should throw exception
    } catch (ThrowException e) {
      System.out.println(e.getMessage());
    }
  }

}
