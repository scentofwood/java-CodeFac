public class TurnOffLightCommand implements Command {
    private Light theLight;

    public TurnOffLightCommand(Light theLight) {
        this.theLight = theLight;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        theLight.turnOff();
    }
    
}
