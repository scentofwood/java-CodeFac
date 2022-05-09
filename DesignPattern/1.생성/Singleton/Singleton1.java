<<<<<<< HEAD
public class Singleton1{
    private static Singleton1 single = new Singleton1();
    private Singleton1() {
        System.out.println("인스턴스를생성했습니다.");
    }
    public static Singleton1 getInstance() {
        return single;
    }
=======
public class Singleton1{
    private static Singleton1 single = new Singleton1();
    private Singleton1() {
        System.out.println("인스턴스를생성했습니다.");
    }
    public static Singleton1 getInstance() {
        return single;
    }
>>>>>>> e97b4a725efdb8f7fbb47b9238916a892260de42
}