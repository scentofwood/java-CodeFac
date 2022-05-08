public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            Director director = new Director(new TextBuilder());
            String result = (String)director.construct();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            Director director = new Director(new HTMLBuilder());
            String filename = (String)director.construct();
            System.out.println(filename + "이작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }
    }
    public static void usage() {
        System.out.println("Usage: 일반 텍스트문서 작성하려면 => 'java Main plain'");
        System.out.println("Usage: HTML 파일문서 작성하려면   => 'java Main html' ");
    }
}
