import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonTest extends Frame implements ActionListener {

    // 인스턴스 변수를 미리 만들어준다.
    private Button b1, b2, b3;

    ButtonTest() {
        setLayout(new FlowLayout());

        // Button클래스의 인스턴스를 생성한다.
        b1 = new Button("첫번째 버튼");
        b2 = new Button("두번째 버튼");
        b3 = new Button("세번째 버튼");

        // 재료들을 컨테이너에 담아준다.
        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);

        // 각각의 버튼의 배경색깔을 바꾼다.
        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.RED);
        b3.setBackground(Color.YELLOW);

        // 화면 사이즈를 픽셀단위로 설정해준다.
        // setSize(300, 400);

        // 화면크기와 실행 위치까지 정할 수 있다.
        setBounds(100, 200, 400, 300);

        // 화면에 보여지게끔 설정을 해준다.
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        MouseEvent me = new MouseEvent(tree, 0, 0, 0, 100, 100, 1, false);
        for(MouseListener ml: tree.getMouseListeners()){
            ml.mousePressed(me);
        }
    }

    public static void main(String[] args) {

        // Frame클래스를 상속받아 LabelTest의 인스턴스를 생성한다.
        ButtonTest f = new ButtonTest();
    }

}