import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextTest extends Frame{
    private TextField tf;
    private TextArea ta;

    TextTest(){
        setLayout(new FlowLayout());

        tf = new TextField("����� textfied",30); //�� ���Է�, ũ�⸦ �ø��� �ʹٸ� ������ ���� ����.
        ta = new TextArea("����� TextArea", 5, 30);    //���� �� �Է�, ��� ���� ũ�⸦ �Է��� �� �ִ�.

        add(tf);
        add(ta);

        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {

        new TextTest();
    }
}

