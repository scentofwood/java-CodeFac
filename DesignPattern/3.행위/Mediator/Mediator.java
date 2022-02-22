// ArrayList ���� �� �����ڸ� ���� Mediator ��ü�� setMediator�� ����, ArrayList�� ����

import java.util.ArrayList;

public class Mediator implements Imediator {
    private ArrayList<Colleague> testArray = new ArrayList<Colleague>();
    
    public Mediator(Colleague e) {
        e.setMediator(this);
        testArray.add(e);
    }
    
    @Override
    public void send(String colleague, String event) {
        for (Colleague s : testArray) {
            if (s.getString() == colleague) {
                s.receive(colleague, event);
            }
        }
    }
}