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

        tf = new TextField("먼저 마우스를 원하는 위치에 두고 클릭 하세요",30);

        // Button클래스의 인스턴스를 생성한다.
        b1 = new Button("시작");

        // 재료들을 컨테이너에 담아준다.
        add(tf);
        add(b1);

        // 이벤트 등록
        b1.addActionListener(this);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        MouseEventTest test = new MouseEventTest(); //클래스 인스턴스 생성
        test.setSize(300, 400);                     //사이즈를 정함
        test.setVisible(true);                      //창이 보여지게 함
    }
    
    public static void click(int x, int y) throws AWTException{
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

        // System.out.println("버튼이 눌렸어요~~~");
        SimpleDateFormat simpleDate = new SimpleDateFormat("HH:mm:ss");

        String cmd = arg0.getActionCommand(); //버튼이 가지고 있는 레이블 값만 뽑아온다.
        if(cmd.equals("시작")) {
            if (this.x == 0 && this.y == 0) {
                tf.setText("마우스 위치를 확인하세요.");
            }
            else {
                for(;;) {
                    tf.setText("x:" + this.x + "  y:" + this.y + "  현재[" + simpleDate.format(new Date()) + "] 10초마다 갱신");
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
        }else if(cmd.equals("중지")) {
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