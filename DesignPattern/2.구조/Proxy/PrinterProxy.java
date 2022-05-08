public class PrinterProxy implements Printable {
    private String name;
    private Printer real;
    
    public PrinterProxy() {
    }
    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        // TODO Auto-generated method stub
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }
    @Override
    public String getPrinterName() {
        // TODO Auto-generated method stub
        return name;
    }
    @Override
    public void print(String string) {
        // TODO Auto-generated method stub
        realize();
        System.out.println("PrinterProxyÀÇ realize() ¿Ï·á");
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
