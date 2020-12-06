import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class LabelTest extends Frame{

    //인스턴스 변수를 미리 만들어준다.
    private Label lab1, lab2, lab3;

    LabelTest(){
        setLayout(new FlowLayout());

        //Label클래스의 인스턴스를 생성한다.
        lab1 = new Label("첫번째 라벨"); //레이블 클래스는 클래스 특성상 바로 초기화가 가능하다.
        lab2 = new Label("두번째 라벨");
        lab3 = new Label("세번째 라벨");
        //Label을 그릇에 담아야 사용이 가능하다.

        //재료들을 컨테이너에 담아준다.
        add(lab1);
        add(lab2);
        add(lab3);

        //각각의 라벨의 배경색깔을 바꾼다.
        lab1.setBackground(Color.BLUE);
        lab2.setBackground(Color.RED);
        lab3.setBackground(Color.YELLOW);

        //화면 사이즈를 픽셀단위로 설정해준다.
        //setSize(300, 400);

        //화면크기와 실행 위치까지 정할 수 있다.
        setBounds(100, 200, 400, 300);

        //화면에 보여지게끔 설정을 해준다.
        setVisible(true);
    }

    public static void main(String[] args) {    

        //Frame클래스를 상속받아 LabelTest의 인스턴스를 생성한다.
        LabelTest f = new LabelTest();
    }
}