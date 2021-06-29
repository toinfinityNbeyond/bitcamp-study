package Day0628;

public class BoardUser {

  public static void main(String[] args) {
    Board ob = new Board();
    ob.setTitle("6월 장미축제"); 
    String data = ob.getTitle(); 
    // getter,setter ==>lombok 롬복 연결
    System.out.println(data); 

  }// end
}// class END
