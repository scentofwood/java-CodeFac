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

// ��ư Ŭ�� 3�� �Ŀ� ����
public class FrameTest extends Frame implements ActionListener{

    private Button b;

    FrameTest(){
        b = new Button("��ư");
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
        dispose(); // �����츦 �����Ű�� �޼����̴�.

    }

    public static void main(String[] args) {
        new FrameTest();
    }
}