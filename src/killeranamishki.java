import java.util.Scanner;

public class killeranamishki {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int robotsBattery = 100;
        int robotHits = 4;
        final int hitCounts;
        for(hitCounts = 0; hitCounts <= robotHits;) {
            {
                robotsBattery -= 20;
                if (hitCounts % 2 == 0) {

                }

            }
            System.out.println("What's in front of the Robot?");

            String objectInSightOfRobot = scanner.nextLine();
            String moveRobot = movementOfRobot(objectInSightOfRobot);

            System.out.printf("Robot's moves -> %s\n", moveRobot);

            System.out.println("Tell the Robot how much to move ");

            for (int isMouseInFront = 0; isMouseInFront < 1; ) {
                int numberOfPixels = Integer.parseInt(scanner.nextLine());

                if (numberOfPixels % 2 == 0) {
                    isMouseInFront++;
                    System.out.println("Mouse spotted!");
                    System.out.println("Mouse was killed ");
                } else {
                    System.out.println("Tell the Robot how much to move again ");
                }
                System.out.printf("Battery Left: %d%%\n", robotsBattery);
                if(robotsBattery == 0){
                   System.out.printf("No Battery left: %d%%\n", robotsBattery);
                   System.exit(0);
                }
            }

        }

        }
    public static String movementOfRobot(String objectInFrontOfRobot) {
        String robotsMovementAfterSpot;

        if (objectInFrontOfRobot.equalsIgnoreCase("Wall")) {
            robotsMovementAfterSpot = "Go Sideway";
        } else if (objectInFrontOfRobot.equalsIgnoreCase("Chair")) {
            robotsMovementAfterSpot = "Jump";
        } else if (objectInFrontOfRobot.equalsIgnoreCase("Nothing")) {
            robotsMovementAfterSpot = "Forward";
        }
        else {
            robotsMovementAfterSpot = "Congrats! Object has been passed!";
        }
        return robotsMovementAfterSpot;
    }
}
