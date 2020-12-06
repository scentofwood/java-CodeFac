import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MouseEventTest extends Frame implements MouseListener, ActionListener {
    
    private TextField tf;
    private Button b1;
    int x = 0, y = 0;

    public MouseEventTest() {
        setLayout(new FlowLayout());

        tf = new TextField("���� ���콺�� ���ϴ� ��ġ�� �ΰ� Ŭ�� �ϼ���",30);

        // ButtonŬ������ �ν��Ͻ��� �����Ѵ�.
        b1 = new Button("����");

        // ������ �����̳ʿ� ����ش�.
        add(tf);
        add(b1);

        // �̺�Ʈ ���
        b1.addActionListener(this);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        MouseEventTest test = new MouseEventTest(); //Ŭ���� �ν��Ͻ� ����
        test.setSize(300, 400);                     //����� ����
        test.setVisible(true);                      //â�� �������� ��
    }
    
    public static void click(int x, int y) throws AWTException{
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

        // System.out.println("��ư�� ���Ⱦ��~~~");
        SimpleDateFormat simpleDate = new SimpleDateFormat("HH:mm:ss");

        String cmd = arg0.getActionCommand(); //��ư�� ������ �ִ� ���̺� ���� �̾ƿ´�.
        if(cmd.equals("����")) {
            if (this.x == 0 && this.y == 0) {
                tf.setText("���콺 ��ġ�� Ȯ���ϼ���.");
            }
            else {
                for(;;) {
                    tf.setText("x:" + this.x + "  y:" + this.y + "  ����[" + simpleDate.format(new Date()) + "] 10�ʸ��� ����");
                    try {
                        Thread.sleep(10000);
                        click(this.x, this.y);
                    } catch (InterruptedException t) {
                        t.printStackTrace();
                    } catch (AWTException t) {
                        t.printStackTrace();
                    }
                }    
            }
        }else if(cmd.equals("����")) {
            dispose();
        }else {
            //
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("x:" + e.getX() + " y:" + e.getY() + " count:" + e.getClickCount());
        tf.setText("x:" + e.getX() + "  y:" + e.getY());
        this.x = e.getX();
        this.y = e.getY();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }

}