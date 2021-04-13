
import java.util.Scanner;

    public class Animal {
        public static void main(String[] args){
           int x = 0;
            while(x == 0) {
                Scanner input = new Scanner(System.in);
                System.out.print("What kind of sound does it make? ");
                String sound = input.nextLine();

                if (sound.equals("bark")) {
                    System.out.println("It is a Dog.");
                } else if (sound.equals("meow")) {
                    System.out.println("It is a Cat.");
                } else if (sound.equals("quack")) {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("It is a Duck.");
                    }
                } else {
                    System.out.println("Unknown animal.");
                }

                System.out.print("Would you like to continue? Enter 0 and for exit enter any number. ");
                x =input.nextInt();

            }

        }
    }

