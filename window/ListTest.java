import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class ListTest extends Frame{
    private List list1, list2;

    ListTest(){
        setLayout(new FlowLayout());

        list1 = new List(5, true);    //()���ڴ� ��µ� �������� �����Ѵ�. �⺻����Ʈ�� 4���̴�.
        list2 = new List(3);

        list1.add("���");
        list1.add("��");
        list1.add("����");
        list1.add("��");
        list1.add("����");

        list2.add("¥���");
        list2.add("���");
        list2.add("���");
        list2.add("������");
        list2.add("«¥��");

        add(list1);
        add(list2);

        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {

        new ListTest();

    }
}