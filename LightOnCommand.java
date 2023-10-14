package commandPattern;

public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light newLight)  {
        light = newLight;

    }
    public String execute() {
        return light.lightsOn();
    }
}
