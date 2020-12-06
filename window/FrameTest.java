import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.MarshalledObject;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.activation.ActivationDesc;
import java.rmi.activation.ActivationException;
import java.rmi.activation.ActivationID;
import java.rmi.activation.ActivationInstantiator;

// 버튼 클릭 3초 후에 종료
public class FrameTest extends Frame implements ActionListener{

    private Button b;

    FrameTest(){
        b = new Button("버튼");
        add(b);

        b.addActionListener(this);

        setSize(300, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException t) {
            t.printStackTrace();
        }
        dispose(); // 윈도우를 종료시키는 메서드이다.

    }

    public static void main(String[] args) {
        new FrameTest();
    }
}