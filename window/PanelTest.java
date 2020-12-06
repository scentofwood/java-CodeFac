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

        //LabelŬ������ �ν��Ͻ��� �����Ѵ�.
        p1 = new Panel();
        p2 = new Panel();
        b1 = new Button("�г� 2 ���̱�");
        b2 = new Button("�г� 2 �Ⱥ��̱�");
        b3 = new Button("�г� 1 ���̱�");
        b4 = new Button("�г� 1 �Ⱥ��̱�");

        //������ �����̳ʿ� ����ش�.
        p1.add(b1);
        p1.add(b2);

        p2.add(b3);
        p2.add(b4);

        add(p1);
        add(p2);

        //������ �ǳ��� �������� �ٲ۴�.
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.MAGENTA);

        //��ư�� ������ ActionListener �޼��尡 ȣ��ǵ��� �Ѵ�.
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        //ȭ��ũ��� ���� ��ġ���� ���� �� �ִ�.
        setSize(300, 400);

        //ȭ�鿡 �������Բ� ������ ���ش�.(���)
        setVisible(true);
    }

    //ActionListener ��ӹ޾� �޼��带 �������̵� �Ѵ�. ��ư�� ������ �޼��尡 ȣ��ô�.
    @Override
    public void actionPerformed(ActionEvent arg0) {

        // System.out.println("��ư�� ���Ⱦ��~~~");

        String cmd = arg0.getActionCommand(); //��ư�� ������ �ִ� ���̺� ���� �̾ƿ´�.
        if(cmd.equals("�г� 2 ���̱�")) {
            p2.setVisible(true);
        }else if(cmd.equals("�г� 2 �Ⱥ��̱�")) {
            p2.setVisible(false);
        }else if(cmd.equals("�г� 1 ���̱�")) {
            p1.setVisible(true);
        }else {
            p1.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new PanelTest();//Ŭ������ ȣ���ϴ� �ν��Ͻ� ����, �ڱ� �ڽ��̱� ������ Ŭ���� �̸� ����

    }
}