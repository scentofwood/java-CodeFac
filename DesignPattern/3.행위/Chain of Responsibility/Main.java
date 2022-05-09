public class Main {
    public static void main(String[] args) {
        Boundary voltage = new NormalVoltage(230, 210);
        Boundary warning = new WarningVoltage(240, 200);
        Boundary fault = new FaultVoltage(Integer.MAX_VALUE, Integer.MIN_VALUE);

        voltage.setNested(warning);
        warning.setNested(fault);

        voltage.action(220);
        voltage.action(235);
        voltage.action(245);
    }
}
