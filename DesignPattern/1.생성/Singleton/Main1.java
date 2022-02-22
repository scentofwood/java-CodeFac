public class Main1{
    public static void main(String[] args) {
        Singleton1 obj1 = Singleton1.getInstance();
        Singleton1 obj2 = Singleton1.getInstance();
        if (obj1 == obj2)
            System.out.println("obj1과 obj2는 같은 객체.");
        else
            System.out.println("obj1과 obj2는 다른 객체.");
    }
}