public interface Payment
{
    void makePayment();//by default it is a abstract method
}
public class PayPal implements Payment
{
    public void makePayment()
    {
        //some logic for PayPal payment
        //e.g. Paypal uses username and password for payment
    }
}
public class CreditCard implements Payment
{
    public void makePayment()
    {
        //some logic for CreditCard payment
        //e.g. CreditCard uses card number, date of expiry etc...
    }
}
