//write a java code implementation for BonusException
//the constructor will set the message of exception to
//"Service year is more than 15. Bonus is not entitled."

class BonusException extends Exception{
  BonusException() {
    protected final static String message = "Service year is more than 15. Bonus is not entitled.";
    super(message);
  }
}
