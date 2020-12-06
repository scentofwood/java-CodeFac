import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class ListTest extends Frame{
    private List list1, list2;

    ListTest(){
        setLayout(new FlowLayout());

        list1 = new List(5, true);    //()인자는 출력될 아이템을 지정한다. 기본리스트는 4개이다.
        list2 = new List(3);

        list1.add("사과");
        list1.add("배");
        list1.add("포도");
        list1.add("귤");
        list1.add("레몬");

        list2.add("짜장면");
        list2.add("울면");
        list2.add("라면");
        list2.add("볶음면");
        list2.add("짬짜면");

        add(list1);
        add(list2);

        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {

        new ListTest();

    }
}