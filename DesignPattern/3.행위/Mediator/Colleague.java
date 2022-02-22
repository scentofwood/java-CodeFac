// 추상 클래스에서 중개자 객체를 만들어서 setMediator로 데이터 수신
public abstract class Colleague {
    Imediator mediator;
    
    public void setMediator(Imediator mediator) {
        this.mediator = mediator;
    }
    
    public void send(String name, String event) {
        mediator.send(name, event);
    }
    
    abstract public void send(String event);
    abstract public void receive(String name, String event);
    abstract public String getString();
}