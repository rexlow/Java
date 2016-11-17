public class MejaException extends Exception {

  protected final static String errorMessage = "Meja no 10 tidak boleh dipakai";

  public MejaException() {

    super(errorMessage);

  }

}
