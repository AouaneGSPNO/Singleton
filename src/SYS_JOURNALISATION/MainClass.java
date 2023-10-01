package SYS_JOURNALISATION;

public class MainClass {
  public static void main(String[] args) {

    Logger logger1 = Logger.getInstance();
    Logger logger2 = Logger.getInstance();
    Logger logger3 = Logger.getInstance();
    
    logger1.logDeposit("01", 90);
    logger2.logWithdraw("02", 70);
    logger1.logTransfer("01", "03", 60);
    logger3.logDeposit("04", 78);
    logger2.logWithdraw("05", 35);

  }

}
