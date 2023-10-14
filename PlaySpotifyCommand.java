package commandPattern;

public class PlaySpotifyCommand implements Command {
    private MusicPlayer player;
    public PlaySpotifyCommand(MusicPlayer newPlayer)  {
        player = newPlayer;

    }
    public String execute() {
        return player.playSpotify();
    }
}
