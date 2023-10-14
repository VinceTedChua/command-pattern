package commandPattern;

public class StopSpotifyCommand implements Command {
    private MusicPlayer player;
    public StopSpotifyCommand(MusicPlayer newPlayer) {
        player = newPlayer;
    }
    public String execute() {
        return player.stopSpotify();
    }


}
