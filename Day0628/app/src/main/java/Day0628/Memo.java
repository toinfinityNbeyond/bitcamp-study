package Day0628;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Memo extends Frame implements WindowListener, ActionListener {
  private Button btnExit = new Button(" exit ");
  private Button btnSend = new Button(" send ");
  private TextField tf = new TextField(20);
  private TextArea ta = new TextArea();
  private Font ff = new Font("consolas", Font.BOLD, 20);
  private Panel pan = new Panel(); // 레이아웃 받침대 = 쟁반


  public Memo() {
    // 초간단 메모장
    pan.add(tf); pan.add(btnSend); pan.add(btnExit);

    ta.setFont(ff);
    this.add("Center" , ta);
    this.add("South", pan); // pan = panel 판넬


    // 이벤트 연결 리스너추가
    this.addWindowListener(this); // 앞this 뒤this
    tf.addActionListener(this);
    btnSend.addActionListener(this);
    btnExit.addActionListener(this);


    // 프레임의 메서드 값 변경
    ta.setBackground(Color .yellow);
    this.setSize(400, 500);
    this.setTitle("초간단메모장");
    this.setVisible(true);
  }// end 

  @Override  public void windowClosing(WindowEvent e) { myExit(); } // end
  @Override public void windowOpened(WindowEvent e) {}
  @Override public void windowClosed(WindowEvent e) {}
  @Override public void windowIconified(WindowEvent e) {}
  @Override public void windowDeiconified(WindowEvent e) {}
  @Override public void windowActivated(WindowEvent e) {}
  @Override public void windowDeactivated(WindowEvent e) {}



  @Override
  public void actionPerformed(ActionEvent ae) {
    //  actionPerformed 메뉴 클릭, 버튼 클릭, 이미지 클릭, 입력란 enter 
    if (ae.getSource()==tf) {  //tf 한 줄 입력란
      myText();
    }else if (ae.getSource()==btnSend) {
      myText();
    }else if (ae.getSource()==btnExit) {
      myExit();
    }else {}

  }// end 

  public void myText() {
    // 첫번째 tf입력란 데이터가져오기
    // 두번째 tf내용을 ta에 추가 후 tf 내용삭제, tf 입력란에 초점
    String data = tf.getText();
    ta.append(data+"\n");
    tf.setText("");
    tf.requestFocus();
  }// end

  public void myExit() {
    System.out.println("초간단 메모장 프로그램을 종료 1:16 2:38");
    System.exit(1);
  }//end 


  public static void main (String[] args) {
    Memo pad = new Memo();  //   new Memo(); // 이렇게도 사용가능.
    //    pad.windowClosing(null); // 에러는 아니지만 
  }// end

}// class END
