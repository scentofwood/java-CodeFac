class NormalVoltage extends Boundary {
    public NormalVoltage(int upper, int lower){
        super(upper, lower);
    }

    protected void individualAction() {
        System.out.println("normal operation");
    }
}
