// 추상 클래스를 상속 받아 오버라이드
// 각 개체별로 이름을 private 지정, getString으로 이름 접근

public class Com_2 extends Colleague {
    private String name = "COM_2";
    
    @Override
    public void send(String event) {
        mediator.send(name, event);
    }
    
    @Override
    public void receive(String name, String event) {
        System.out.println("Receive from " + name + " " + event);
    }
    
    @Override
    public String getString() {
        return name;
    }
}