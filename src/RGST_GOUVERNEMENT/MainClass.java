package RGST_GOUVERNEMENT;

import SYS_SOLAIRE.SOLAIRE;

public class MainClass {
  public static void main(String[] args) {

    Citoyen personne  = Citoyen.getInstance (15L,"hassan","PAS DE SOUCI");
    System.out.println("\n****** On cree une premiere  instance ****\n");
    System.out.println(personne.toString ());

    Citoyen personne1 = Citoyen.getInstance(16L,"ahmed","objet de pblm ");
    System.out.println("\n****** On essaie une autre instance ****\n");
    System.out.println(personne1.toString ());


  }

}
