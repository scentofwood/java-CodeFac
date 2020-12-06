import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextTest extends Frame{
    private TextField tf;
    private TextArea ta;

    TextTest(){
        setLayout(new FlowLayout());

        tf = new TextField("여기는 textfied",30); //한 줄입력, 크기를 늘리고 싶다면 인자의 값을 쓴다.
        ta = new TextArea("여기는 TextArea", 5, 30);    //여러 줄 입력, 행과 열의 크기를 입력할 수 있다.

        add(tf);
        add(ta);

        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {

        new TextTest();
    }
}

