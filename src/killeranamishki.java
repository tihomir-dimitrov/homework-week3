import java.util.Scanner;

public class killeranamishki {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                } else {
                    System.out.println("Tell the Robot how much to move again ");
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
        } else {
            robotsMovementAfterSpot = "Congrats! Object has been passed!";
        }
        return robotsMovementAfterSpot;
    }
}