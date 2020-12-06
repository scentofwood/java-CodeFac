import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class LabelTest extends Frame{

    //�ν��Ͻ� ������ �̸� ������ش�.
    private Label lab1, lab2, lab3;

    LabelTest(){
        setLayout(new FlowLayout());

        //LabelŬ������ �ν��Ͻ��� �����Ѵ�.
        lab1 = new Label("ù��° ��"); //���̺� Ŭ������ Ŭ���� Ư���� �ٷ� �ʱ�ȭ�� �����ϴ�.
        lab2 = new Label("�ι�° ��");
        lab3 = new Label("����° ��");
        //Label�� �׸��� ��ƾ� ����� �����ϴ�.

        //������ �����̳ʿ� ����ش�.
        add(lab1);
        add(lab2);
        add(lab3);

        //������ ���� �������� �ٲ۴�.
        lab1.setBackground(Color.BLUE);
        lab2.setBackground(Color.RED);
        lab3.setBackground(Color.YELLOW);

        //ȭ�� ����� �ȼ������� �������ش�.
        //setSize(300, 400);

        //ȭ��ũ��� ���� ��ġ���� ���� �� �ִ�.
        setBounds(100, 200, 400, 300);

        //ȭ�鿡 �������Բ� ������ ���ش�.
        setVisible(true);
    }

    public static void main(String[] args) {    

        //FrameŬ������ ��ӹ޾� LabelTest�� �ν��Ͻ��� �����Ѵ�.
        LabelTest f = new LabelTest();
    }
}