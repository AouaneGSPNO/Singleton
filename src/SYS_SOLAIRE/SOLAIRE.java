package SYS_SOLAIRE;

public class SOLAIRE {
  private static SOLAIRE instance;
  public String value;

  private SOLAIRE(String value) {

    this.value = value;
  }

  public static SOLAIRE getInstance(String value) {
    if (instance == null) {
      instance = new SOLAIRE(value);
    }
    return instance;
  }

  public String getValue() {
    return value;
  }

}
