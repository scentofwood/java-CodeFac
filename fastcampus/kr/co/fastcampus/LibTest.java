package kr.co.fastcampus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* lib jar������ �߰��غ���
   �� �Ʒ� 3�������� ���ͳݿ��� �ٿ�ε�
     C:\A_PGM\java-CodeFac\fastcampus\lib\logback-classic-1.2.3.jar
                                          logback-core-1.2.3.jar
                                          slf4j-api-1.7.30.jar
   �� C:\A_PGM\java-CodeFac\fastcampus>javac -cp lib\logback-classic-1.2.3.jar;lib\logback-core-1.2.3.jar;lib\slf4j-api-1.7.30.jar kr\co\fastcampus\LibTest.java
   �� C:\A_PGM\java-CodeFac\fastcampus>java -cp lib\logback-classic-1.2.3.jar;lib\logback-core-1.2.3.jar;lib\slf4j-api-1.7.30.jar;. kr.co.fastcampus.LibTest
*/
/* jar������ ����� jar���ϸ����� �����ϱ�
   �� notepad manifest_LibTest.txt
      -- ���ϳ��� ---------------------------
      Main-Class: kr.co.fastcampus.LibTest
      Class-Path: lib\logback-classic-1.2.3.jar lib\logback-core-1.2.3.jar lib\slf4j-api-1.7.30.jar

      ---------------------------------------
   �� C:\A_PGM\java-CodeFac\fastcampus>jar -c -m manifest_LibTest.txt -f fastcampus3.jar kr\* logback.xml
     ������ logback.xml �� ���� ���� ��쿡�� ���� ���ص� �ȴ�
   �� C:\A_PGM\java-CodeFac\fastcampus>move fastcampus3.jar ..\fastcampus_bin
   �� C:\A_PGM\java-CodeFac\fastcampus>copy lib\* ..\fastcampus_bin\lib
   �� C:\A_PGM\java-CodeFac\fastcampus_bin>java -jar fastcampus3.jar
*/

class LibTest {
   private static Logger logger = LoggerFactory.getLogger(LibTest.class);
   public static void main(String[] args) {
      logger.info("Hello!! Lib World!");
      logger.info("�α׷����� logback.xml�� ���氡�� : TRACE - DEBUG - INFO - WARN - ERROR");
      logger.trace("Ʈ���̽��� ���ñ��?");  // ����Ʈ�� DEBUG. ���� �ȳ���. 
      logger.debug("����״� ���ñ��?");
      logger.info("������ ���ñ��?");
      logger.warn("���� ���ñ��?");
      logger.error("������ ���ñ��?");
   }

}