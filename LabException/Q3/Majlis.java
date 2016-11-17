public class Majlis {
  protected String nameTetamu;
  protected int noMeja;

  public Majlis(String nameTetamu, int noMeja) {
    this.nameTetamu = nameTetamu;
    this.noMeja = noMeja;
  }

  public void bayar() throws MejaException{
    System.out.println("Hello " + nameTetamu);
    if (noMeja == 10) {
      throw new MejaException();
    } else {
      System.out.println("No Meja: " + noMeja);
    }


  }
}
