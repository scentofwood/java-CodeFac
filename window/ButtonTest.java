import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonTest extends Frame implements ActionListener {

    // �ν��Ͻ� ������ �̸� ������ش�.
    private Button b1, b2, b3;

    ButtonTest() {
        setLayout(new FlowLayout());

        // ButtonŬ������ �ν��Ͻ��� �����Ѵ�.
        b1 = new Button("ù��° ��ư");
        b2 = new Button("�ι�° ��ư");
        b3 = new Button("����° ��ư");

        // ������ �����̳ʿ� ����ش�.
        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);

        // ������ ��ư�� �������� �ٲ۴�.
        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.RED);
        b3.setBackground(Color.YELLOW);

        // ȭ�� ����� �ȼ������� �������ش�.
        // setSize(300, 400);

        // ȭ��ũ��� ���� ��ġ���� ���� �� �ִ�.
        setBounds(100, 200, 400, 300);

        // ȭ�鿡 �������Բ� ������ ���ش�.
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

        // FrameŬ������ ��ӹ޾� LabelTest�� �ν��Ͻ��� �����Ѵ�.
        ButtonTest f = new ButtonTest();
    }

}