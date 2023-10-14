package commandPattern;
import java.util.Scanner;

//Vince Ted Matthew D. Chua//
    //October 14- 2023//
  //Software Engineering//
 //Laboratory Assignment 5//

//Main program to implement all the commands behind-the-scenes//
public class SmartHome {
    //Basic structure of program
    public static void main(String[] args) {
        //Implements Scanner
        Scanner sc = new Scanner(System.in);

        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        Alexa alexa = new Alexa
                (new IncreaseTemperatureCommand(thermostat),
                new LowerTemperatureCommand(thermostat),
                new LightOnCommand(light),
                new LightOutCommand(light),
                new PlaySpotifyCommand(musicPlayer),
                new StopSpotifyCommand(musicPlayer));

        System.out.println("Initiating Smart Home-Alexa");

        boolean toExit = false;
        while (!toExit) {
            System.out.println("Choose Automative Functions:\n");
            System.out.println("[1]: Play Music");
            System.out.println("[2]: Initiate All Commands");
            System.out.println("[3]: Make the Room Cold");
            System.out.println("[4]: Make The Room Hot");
            System.out.println("[5]: Destroy All Lights");
            System.out.println("[6]: Loop Music");
            System.out.println("[7]: Turn Of All Commands");
            System.out.println("[8]: Terminate Program");

            System.out.println("Enter Choice: ");

            int options = sc.nextInt();

            switch (options) {
                case 1:
                    alexa.playOneMusic();
                    break;
                case 2:
                    alexa.startEverything();
                    break;
                case 3:
                    alexa.makeRoomCold();
                    break;
                case 4:
                    alexa.makeRoomBurningRed();
                    break;
                case 5:
                    alexa.destroyLights();
                    break;
                case 6:
                    alexa.loopMusic();
                    break;
                case 7:
                    alexa.turnOfAllCommands();
                    break;
                case 8:
                    toExit = true;
                    System.out.print("Program-Terminating.... -CHUA,VINCE");
                    break;
                default:
                    System.out.println("Incorrect Choice, Try again!");
                    break;

            }
        }



    }
}
