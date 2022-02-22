public class SingletonExam
{
    private static int counter = 0;
    
    private static class Singleton
    {
        private static SingletonExam INSTANCE = new SingletonExam();
    }
    
    public static SingletonExam getInstance()
    {
        counter++;
        System.out.println("호출  getInstance()");
        return Singleton.INSTANCE;
    }
    
    private SingletonExam()
    {
        counter++;
        System.out.println("호출  SingletonExam()");
    }
    
    public void increaseCounter()
    {
        counter++;
        System.out.println("호출  increaseCounter()");
    }
    
    public int getCounter()
    {
        return counter;
    }
}