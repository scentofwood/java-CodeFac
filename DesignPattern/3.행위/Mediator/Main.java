public class Main {
    public static void main(String[] args) {
        Com_1 test1 = new Com_1();
        Com_2 test2 = new Com_2();
        
        Mediator test_M1 = new Mediator(test1);
        Mediator test_M2 = new Mediator(test2);
        
        test_M1.send("COM_1", "æ»≥Á«œººø‰");
        test_M2.send("COM_2", "π›∞©Ω¿¥œ¥Ÿ");

        test1.send("hello world 1");
        test2.send("hello world 2");
    }
}