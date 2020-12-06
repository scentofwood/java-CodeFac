package kr.co.fastcampus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* lib jar파일을 추가해보기
   ① 아래 3개파일을 인터넷에서 다운로드
     C:\A_PGM\java-CodeFac\fastcampus\lib\logback-classic-1.2.3.jar
                                          logback-core-1.2.3.jar
                                          slf4j-api-1.7.30.jar
   ② C:\A_PGM\java-CodeFac\fastcampus>javac -cp lib\logback-classic-1.2.3.jar;lib\logback-core-1.2.3.jar;lib\slf4j-api-1.7.30.jar kr\co\fastcampus\LibTest.java
   ③ C:\A_PGM\java-CodeFac\fastcampus>java -cp lib\logback-classic-1.2.3.jar;lib\logback-core-1.2.3.jar;lib\slf4j-api-1.7.30.jar;. kr.co.fastcampus.LibTest
*/
/* jar파일을 만들어 jar파일만으로 실행하기
   ① notepad manifest_LibTest.txt
      -- 파일내용 ---------------------------
      Main-Class: kr.co.fastcampus.LibTest
      Class-Path: lib\logback-classic-1.2.3.jar lib\logback-core-1.2.3.jar lib\slf4j-api-1.7.30.jar

      ---------------------------------------
   ② C:\A_PGM\java-CodeFac\fastcampus>jar -c -m manifest_LibTest.txt -f fastcampus3.jar kr\* logback.xml
     위에서 logback.xml 는 변경 안할 경우에는 포함 안해도 된다
   ③ C:\A_PGM\java-CodeFac\fastcampus>move fastcampus3.jar ..\fastcampus_bin
   ④ C:\A_PGM\java-CodeFac\fastcampus>copy lib\* ..\fastcampus_bin\lib
   ⑤ C:\A_PGM\java-CodeFac\fastcampus_bin>java -jar fastcampus3.jar
*/

class LibTest {
   private static Logger logger = LoggerFactory.getLogger(LibTest.class);
   public static void main(String[] args) {
      logger.info("Hello!! Lib World!");
      logger.info("로그레벨은 logback.xml로 변경가능 : TRACE - DEBUG - INFO - WARN - ERROR");
      logger.trace("트레이스는 나올까요?");  // 디폴트는 DEBUG. 따라서 안나옴. 
      logger.debug("디버그는 나올까요?");
      logger.info("인포는 나올까요?");
      logger.warn("경고는 나올까요?");
      logger.error("에러는 나올까요?");
   }

}