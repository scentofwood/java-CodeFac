package kr.co.fastcampus;

/* classpath 지정하여 실행하기
   ① C:\A_PGM\java-CodeFac\fastcampus>javac kr\co\fastcampus\ClasspathTest.java
   ② C:\A_PGM\java-CodeFac\fastcampus>java -cp . kr.co.fastcampus.ClasspathTest
*/
/* jar파일을 만들어 classpath 지정하여 실행하기
   ① C:\A_PGM\java-CodeFac\fastcampus>jar -c -f fastcampus1.jar kr\*
   ② C:\A_PGM\java-CodeFac\fastcampus>move fastcampus1.jar ..\fastcampus_bin
   ③ C:\A_PGM\java-CodeFac\fastcampus_bin>java -cp fastcampus1.jar kr.co.fastcampus.ClasspathTest
*/
/* jar파일을 만들어 jar파일만으로 실행하기
   ① notepad manifest_ClasspathTest.txt
      -- 파일내용 ---------------------------
      Main-Class: kr.co.fastcampus.ClasspathTest
      
      ---------------------------------------
   ② C:\A_PGM\java-CodeFac\fastcampus>jar -c -m manifest_ClasspathTest.txt -f fastcampus2.jar kr\*
   ③ C:\A_PGM\java-CodeFac\fastcampus>move fastcampus2.jar ..\fastcampus_bin
   ④ C:\A_PGM\java-CodeFac\fastcampus_bin>java -jar fastcampus2.jar
*/

class ClasspathTest {
   public static void main(String[] args) {
      System.out.println("Hello!! Classpath World!");
      System.out.println("빌드를 배워봅시다");
   }

}