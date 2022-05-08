public class ExamThreeMain
{
public static void main(String[] args)
{
    SingletonExam se = SingletonExam.getInstance();
    System.out.println("1 " + se.getCounter());
    System.out.println("");

    se.increaseCounter();
    System.out.println("2 " + se.getCounter());
    System.out.println("");

    se.increaseCounter();
    System.out.println("3 " + se.getCounter());
    System.out.println("");

    SingletonExam.getInstance().increaseCounter();
    System.out.println("4 " + se.getCounter());
    System.out.println("");

    SingletonExam.getInstance().increaseCounter();
    System.out.println("5 " + se.getCounter());
    System.out.println("");
    
    System.out.println(SingletonExam.getInstance().getCounter());
}
}