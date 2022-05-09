abstract class Boundary{
    protected int upper;
    protected int lower;

    protected Boundary nested = null;

    public void setNested(Boundary nested)
    { 
        this.nested = nested; 
    }

    public Boundary(int upper, int lower) {
        this.upper = upper;
        this.lower = lower;
    }

    public void action(int value) {
        if (isInBoundary(value) == true) 
            individualAction();
        else if (nested != null) 
            nested.action(value);
        else 
            individualAction();
    }

    abstract protected void individualAction();

    private boolean isInBoundary(int value) {
        if (value >= lower && value <= upper) 
            return true;
        else 
            return false;
    }
}