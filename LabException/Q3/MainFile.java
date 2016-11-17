public class MainFile {

  public static void main(String[] args) throws MejaException{
    Majlis mejaA = new Majlis("Ali", 2);
    Majlis mejaB = new Majlis("Abu", 3);
    Majlis mejaC = new Majlis("Along", 4);
    Majlis mejaD = new Majlis("Alim", 23);
    Majlis mejaE = new Majlis("Acah", 10);

    mejaA.bayar();
    mejaB.bayar();
    mejaC.bayar();
    mejaD.bayar();
    mejaE.bayar();
  }
}
