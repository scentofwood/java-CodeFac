import java.awt.Checkbox;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class CheckboxTest extends Frame {

    private Panel p1, p2;   // �ǳ��� ���� ����ó���� �� �� ����

    Checkbox c1, c2, c3;
    Checkbox r1, r2;
    CheckboxGroup g1;

    CheckboxTest(){
        setLayout(new FlowLayout());

        p1 = new Panel();
        p2 = new Panel();

        // üũ�ڽ��� �����. üũ�ڽ��� ���߼����� �����ϴ�.
        c1 = new Checkbox("ù��° üũ�ڽ�", true); // üũ�ڽ��� �̸� üũ�� �ǵ��� true���� ��
        c2 = new Checkbox("�ι�° üũ�ڽ�");
        c3 = new Checkbox("����° üũ�ڽ�");

        p1.add(c1);
        p1.add(c2);
        p1.add(c3);

        // ���� ��ư�� ����� ���� üũ�ڽ� �׷��� �����.
        g1 = new CheckboxGroup();                     
        // ���� ��ư�� �����. ���� ��ư�� �ϳ��� �����ؾ��Ѵ�.
        // ���� �̸�, üũ�ڽ� ��������, �׷��̸��� ���ش�.
        r1 = new Checkbox("ù��° ����", true, g1);
        r2 = new Checkbox("�ι�° ����", false, g1);

        p2.add(r1);
        p2.add(r2);

        // ������ �ǳ��� �������� �ٲ۴�.
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.MAGENTA);
        
        add(p1);
        add(p2);

        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {

        new CheckboxTest();//Ŭ������ ȣ���ϴ� �ν��Ͻ� ����, �ڱ� �ڽ��̱� ������ Ŭ���� �̸� ����

    }

}