package commandPattern;

public class IncreaseTemperatureCommand implements Command {
    private Thermostat thermostat;
    public IncreaseTemperatureCommand (Thermostat newThermostat) {
        thermostat = newThermostat;

    }

    public String execute() {
        return thermostat.increaseTemperature();
    }
}
