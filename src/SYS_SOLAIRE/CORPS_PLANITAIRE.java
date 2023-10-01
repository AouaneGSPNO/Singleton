package SYS_SOLAIRE;

import java.util.ArrayList;

public class CORPS_PLANITAIRE {
  private static CORPS_PLANITAIRE instance;
  public String[] value;

  private CORPS_PLANITAIRE(String[] value) {

    this.value = value;
  }

  public static CORPS_PLANITAIRE getInstance(String[] value) {
    if (instance == null) {
      instance = new CORPS_PLANITAIRE (value);
    }
    return instance;
  }

  public String[] getValue() {
    return value;
  }

}
