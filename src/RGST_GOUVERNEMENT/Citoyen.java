package RGST_GOUVERNEMENT;

public class Citoyen {
  private static Citoyen instance;
  public Long Id;
  public String Adresse;
  public String Info;

  private Citoyen(Long Id,String Adresse,String Info) {
    this.Id = Id;
    this.Adresse = Adresse;
    this.Info = Info;
  }
  public static Citoyen getInstance(Long Id,String Adresse,String Info) {
    if (instance == null) {
      instance = new Citoyen (Id,Adresse,Info);
    }
    return instance;
  }
  @Override
  public String toString() {
    return "Citoyen{" +
      "Id=" + Id +
      ", Adresse='" + Adresse + '\'' +
      ", Info='" + Info + '\'' +
      '}';
  }
}
