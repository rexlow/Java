public abstract class Burger
{
    public void packing()
    {
        //some logic for packing a burger
    }
    public abstract void price(); //price is different for different categories of burgers
}
public class VegBerger extends Burger
{
    public void price()
    {
        //set price for a veg burger.
    }
}
public class NonVegBerger extends Burger
{
    public void price()
    {
        //set price for a non-veg burger.
    }
}
