public class Test
{
    private int a = 0;
    private static int count = 0;
    public int getA() { 
        return a; 
    }
    public static int getCount() { 
        return count;
    }
    public static void main() {
        int sum = 0;
        sum = a; // (��)
        sum += count; // (��)
        System.out.println(getA()); // (��)
        System.out.println(getCount()); // (��)
    }
}