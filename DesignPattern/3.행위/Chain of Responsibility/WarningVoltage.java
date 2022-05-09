class WarningVoltage extends Boundary{
    public WarningVoltage(int upper, int lower){
        super(upper, lower);
    }

    protected void individualAction(){
        System.out.println("warning operation");
    }
}
