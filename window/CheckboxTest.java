import java.awt.Checkbox;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class CheckboxTest extends Frame {

    private Panel p1, p2;   // 판넬을 만들어서 영역처리를 할 수 있음

    Checkbox c1, c2, c3;
    Checkbox r1, r2;
    CheckboxGroup g1;

    CheckboxTest(){
        setLayout(new FlowLayout());

        p1 = new Panel();
        p2 = new Panel();

        // 체크박스를 만든다. 체크박스는 다중선택이 가능하다.
        c1 = new Checkbox("첫번째 체크박스", true); // 체크박스에 미리 체크가 되도록 true값을 줌
        c2 = new Checkbox("두번째 체크박스");
        c3 = new Checkbox("세번째 체크박스");

        p1.add(c1);
        p1.add(c2);
        p1.add(c3);

        // 라디오 버튼을 만들기 위해 체크박스 그룹을 만든다.
        g1 = new CheckboxGroup();                     
        // 라디오 버튼을 만든다. 라디오 버튼은 하나만 선택해야한다.
        // 라디오 이름, 체크박스 선택유무, 그룹이름을 써준다.
        r1 = new Checkbox("첫번째 라디오", true, g1);
        r2 = new Checkbox("두번째 라디오", false, g1);

        p2.add(r1);
        p2.add(r2);

        // 각각의 판넬의 배경색깔을 바꾼다.
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.MAGENTA);
        
        add(p1);
        add(p2);

        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {

        new CheckboxTest();//클래스를 호출하는 인스턴스 생성, 자기 자신이기 때문에 클래스 이름 생략

    }

}