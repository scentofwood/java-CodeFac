// ArrayList 생성 후 생성자를 통해 Mediator 개체의 setMediator에 전송, ArrayList에 저장

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