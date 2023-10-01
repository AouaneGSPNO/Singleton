package SYS_SOLAIRE;

import java.util.Arrays;

public class MainClass {
  public static void main(String[] args) {
    System.out.println("****** On cree une premiere instance ****\n");
    SOLAIRE soleil = SOLAIRE.getInstance("Ca marche bien c'est le soleil :)");
    String planètes [] = new String[8];
    planètes [0] = "p1"; planètes [1] = "p2"; planètes [2] = "p3";planètes [3] = "p4";
    planètes [4] = "p5";planètes [5] = "p6";planètes [6] = "p7";planètes [7] = "p8";
    CORPS_PLANITAIRE planete = CORPS_PLANITAIRE.getInstance (planètes);
    LUNE lune = LUNE.getInstance ("Ca marche bien c'est la lune :)");

    System.out.println(soleil.getValue()+"\n"+ "Voilà mes corps planétaires :"+Arrays.toString (planete.getValue ()) +"\n"+lune.getValue ());

    System.out.println("\n****** On essaie une autre instance ****\n");
    String autres_planètes []= new String [8];
    autres_planètes [0]="p100";autres_planètes [1]="p200";autres_planètes [2]="p300";autres_planètes [3]="p400";
    autres_planètes [4]="p500";autres_planètes [5]="p600";autres_planètes [6]="p700";autres_planètes [7]="p800";
    SOLAIRE soleil1 = SOLAIRE.getInstance("Ca marche pas !!!!");
   CORPS_PLANITAIRE planete1 = CORPS_PLANITAIRE.getInstance(autres_planètes);
    LUNE lune1 = LUNE.getInstance ("Ca marche pas :(");
    System.out.println(soleil1.getValue()+"\n"+ "Voilà mes corps planétaires :"+Arrays.toString (planete.getValue ()) +"\n"+lune1.getValue ());


  }

}
