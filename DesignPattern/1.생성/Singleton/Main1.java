public class Main1{
    public static void main(String[] args) {
        Singleton1 obj1 = Singleton1.getInstance();
        Singleton1 obj2 = Singleton1.getInstance();
        if (obj1 == obj2)
            System.out.println("obj1�� obj2�� ���� ��ü.");
        else
            System.out.println("obj1�� obj2�� �ٸ� ��ü.");
    }
}