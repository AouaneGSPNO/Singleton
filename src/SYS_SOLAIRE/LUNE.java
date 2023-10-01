package SYS_SOLAIRE;

public class LUNE {
  private static LUNE instance;
  public String value;

  private LUNE(String value) {

    this.value = value;
  }

  public static LUNE getInstance(String value) {
    if (instance == null) {
      instance = new LUNE (value);
    }
    return instance;
  }

  public String getValue() {
    return value;
  }

}
