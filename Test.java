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
        sum = a; // (가)
        sum += count; // (나)
        System.out.println(getA()); // (다)
        System.out.println(getCount()); // (라)
    }
}