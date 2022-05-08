package kr.co.fastcampus;

/* classpath �����Ͽ� �����ϱ�
   �� C:\A_PGM\java-CodeFac\fastcampus>javac kr\co\fastcampus\ClasspathTest.java
   �� C:\A_PGM\java-CodeFac\fastcampus>java -cp . kr.co.fastcampus.ClasspathTest
*/
/* jar������ ����� classpath �����Ͽ� �����ϱ�
   �� C:\A_PGM\java-CodeFac\fastcampus>jar -c -f fastcampus1.jar kr\*
   �� C:\A_PGM\java-CodeFac\fastcampus>move fastcampus1.jar ..\fastcampus_bin
   �� C:\A_PGM\java-CodeFac\fastcampus_bin>java -cp fastcampus1.jar kr.co.fastcampus.ClasspathTest
*/
/* jar������ ����� jar���ϸ����� �����ϱ�
   �� notepad manifest_ClasspathTest.txt
      -- ���ϳ��� ---------------------------
      Main-Class: kr.co.fastcampus.ClasspathTest
      
      ---------------------------------------
   �� C:\A_PGM\java-CodeFac\fastcampus>jar -c -m manifest_ClasspathTest.txt -f fastcampus2.jar kr\*
   �� C:\A_PGM\java-CodeFac\fastcampus>move fastcampus2.jar ..\fastcampus_bin
   �� C:\A_PGM\java-CodeFac\fastcampus_bin>java -jar fastcampus2.jar
*/

class ClasspathTest {
   public static void main(String[] args) {
      System.out.println("Hello!! Classpath World!");
      System.out.println("���带 ������ô�");
   }

}