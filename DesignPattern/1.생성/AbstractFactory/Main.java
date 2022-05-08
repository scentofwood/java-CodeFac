import factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) { // usage()를통해사용법을설명
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("example: java Main listfactory.ListFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("중앙일보", "www.joongang.co.kr");
        Link hani = factory.createLink("동아일보", "www.donga.com");
        Link us_yahoo = factory.createLink("Yahoo!", "www.yahoo.com");
        Link google = factory.createLink("Google", "www.google.co.kr");
        Tray traynews = factory.createTray("신문");
        traynews.add( joins);
        traynews.add(hani);
        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        Tray traysearch = factory.createTray("서치엔진");
        traysearch.add(trayyahoo);
        traysearch.add(google);
        Page page = factory.createPage("LinkPage", "홍길동");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
    
}
