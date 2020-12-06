import java.awt.Choice;
import java.awt.Frame;

public class ChoiceTest extends Frame{
    private Choice c;

    ChoiceTest(){
        c = new Choice();
        c.add("È«±æµ¿");
        c.add("ÀÓ²©Á¤");
        c.add("±èÀ¯½Å");
        c.add("°­°¨Âù");

        add(c);
        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {

        new ChoiceTest();

    }
}

