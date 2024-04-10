import java.util.Random;

class DragRaceGame {

    public static void main(String[] args) {
        System.out.println("Welcome to Drag Race!");

        int car1Speed = getRandomSpeed();
        int car2Speed = 0; // Initialize car2Speed

        System.out.println("Car1 speed: " + car1Speed + "kmph");
        System.out.println("Car2 Speed: " + car2Speed + "kmph");

        if (car1Speed > car2Speed) {
            System.out.println("Car1 wins!");
        } else if (car1Speed < car2Speed) {
            System.out.println("Car2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    
    private static int getRandomSpeed() {
        Random random = new Random();
        return random.nextInt(51) + 100;
    }
}