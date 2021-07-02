package Day0628;

public class A003 {
  public static void main (String[] args) {
    Bank bk = new Bank();
    //System.out.println( "password" + bk.pwd );
    //    bk.cal();

    Dunkin dd = new Dunkin() ;
    String name = dd.coffee();
    dd.donuts(7);
  }  
}
