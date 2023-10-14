package commandPattern;

public class LowerTemperatureCommand implements Command {
    private Thermostat thermostat;
    public  LowerTemperatureCommand (Thermostat newThermostat) {
        thermostat = newThermostat;

    }

    public String execute() {
        return thermostat.increaseTemperature();
    }
}
