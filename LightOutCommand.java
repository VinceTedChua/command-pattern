package commandPattern;

public class LightOutCommand implements Command {
    private Light light;
    public LightOutCommand(Light newLight)  {
        light = newLight;

    }
    public String execute() {
        return light.lightsOut();
    }
}
