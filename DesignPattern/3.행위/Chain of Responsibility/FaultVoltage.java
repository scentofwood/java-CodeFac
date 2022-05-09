class FaultVoltage extends Boundary{
    public FaultVoltage(int upper, int lower){
        super(upper, lower);
    }

    protected void individualAction(){
        System.out.println("fault operation");
    }
}
