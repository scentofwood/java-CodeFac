public class Main{
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재 " + p.getPrinterName() + "으로 바뀌었습니다.");
        p.print("Printer의 print()로 출력된 것입니다.");
    }
}