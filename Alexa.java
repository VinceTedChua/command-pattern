package commandPattern;

public class Alexa {
    private IncreaseTemperatureCommand increaseTemperatureCommand;
    private LowerTemperatureCommand lowerTemperatureCommand;
    private LightOnCommand lightOnCommand;
    private LightOutCommand lightOutCommand;
    private PlaySpotifyCommand playSpotifyCommand;
    private StopSpotifyCommand stopSpotifyCommand;

    public Alexa (IncreaseTemperatureCommand newIncTempCmd,
                  LowerTemperatureCommand newLowTmpCmd,
                  LightOnCommand newLightOnCmd,
                  LightOutCommand newLightOutCmd,
                  PlaySpotifyCommand newPlaySpotCmd,
                  StopSpotifyCommand newStopSpotCmd)
    {
        increaseTemperatureCommand = newIncTempCmd;
        lowerTemperatureCommand = newLowTmpCmd;
        lightOnCommand = newLightOnCmd;
        lightOutCommand = newLightOutCmd;
        playSpotifyCommand = newPlaySpotCmd;
        stopSpotifyCommand = newStopSpotCmd;


    }
    public void playOneMusic()  {
        System.out.println(playSpotifyCommand.execute());
        System.out.println(stopSpotifyCommand.execute());
    }
    public void startEverything() {
        System.out.println(increaseTemperatureCommand.execute());
        System.out.println(lowerTemperatureCommand.execute());
        System.out.println(lightOnCommand.execute());
        System.out.println(lightOutCommand.execute());

    }
    public void makeRoomCold() {
        System.out.println(lowerTemperatureCommand.execute());
        System.out.println(lowerTemperatureCommand.execute());
        System.out.println(lowerTemperatureCommand.execute());
    }
    public void makeRoomBurningRed() {
        System.out.println(increaseTemperatureCommand.execute());
        System.out.println(increaseTemperatureCommand.execute());
        System.out.println(increaseTemperatureCommand.execute());
    }
    public void destroyLights() {
        System.out.println(lightOnCommand.execute());
        System.out.println(lightOutCommand.execute());
        System.out.println(lightOnCommand.execute());
        System.out.println(lightOutCommand.execute());
        System.out.println(lightOnCommand.execute());
        System.out.println(lightOutCommand.execute());
    }
    public void loopMusic() {
        System.out.println(playSpotifyCommand.execute());
        System.out.println(playSpotifyCommand.execute());
        System.out.println(playSpotifyCommand.execute());
        System.out.println(playSpotifyCommand.execute());
    }
    public void turnOfAllCommands() {
        System.out.println(lightOutCommand.execute());
        System.out.println(stopSpotifyCommand.execute());
    }


}

