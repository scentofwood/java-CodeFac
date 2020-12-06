import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelTest extends Frame implements ActionListener{
    private Panel p1, p2;
    private Button b1, b2, b3, b4;

    PanelTest(){
        setLayout(new FlowLayout());

        //Label클래스의 인스턴스를 생성한다.
        p1 = new Panel();
        p2 = new Panel();
        b1 = new Button("패널 2 보이기");
        b2 = new Button("패널 2 안보이기");
        b3 = new Button("패널 1 보이기");
        b4 = new Button("패널 1 안보이기");

        //재료들을 컨테이너에 담아준다.
        p1.add(b1);
        p1.add(b2);

        p2.add(b3);
        p2.add(b4);

        add(p1);
        add(p2);

        //각각의 판넬의 배경색깔을 바꾼다.
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.MAGENTA);

        //버튼이 눌리면 ActionListener 메서드가 호출되도록 한다.
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        //화면크기와 실행 위치까지 정할 수 있다.
        setSize(300, 400);

        //화면에 보여지게끔 설정을 해준다.(출력)
        setVisible(true);
    }

    //ActionListener 상속받아 메서드를 오버라이드 한다. 버튼을 누르면 메서드가 호출돤다.
    @Override
    public void actionPerformed(ActionEvent arg0) {

        // System.out.println("버튼이 눌렸어요~~~");

        String cmd = arg0.getActionCommand(); //버튼이 가지고 있는 레이블 값만 뽑아온다.
        if(cmd.equals("패널 2 보이기")) {
            p2.setVisible(true);
        }else if(cmd.equals("패널 2 안보이기")) {
            p2.setVisible(false);
        }else if(cmd.equals("패널 1 보이기")) {
            p1.setVisible(true);
        }else {
            p1.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new PanelTest();//클래스를 호출하는 인스턴스 생성, 자기 자신이기 때문에 클래스 이름 생략

    }
}