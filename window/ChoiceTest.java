import java.awt.Choice;
import java.awt.Frame;

public class ChoiceTest extends Frame{
    private Choice c;

    ChoiceTest(){
        c = new Choice();
        c.add("ȫ�浿");
        c.add("�Ӳ���");
        c.add("������");
        c.add("������");

        add(c);
        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {

        new ChoiceTest();

    }
}

