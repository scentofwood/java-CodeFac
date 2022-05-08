public class TurnOnLightCommand implements Command {
    private Light theLight;

    public TurnOnLightCommand(Light theLight) {
        this.theLight = theLight;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        theLight.turnOn();
    }
    
}
