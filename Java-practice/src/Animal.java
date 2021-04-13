
import java.util.Scanner;

    public class Animal {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);


            System.out.print("What kind of sound does it make? ");
            String sound = input.nextLine();

            if(sound.equals("bark") ){
                System.out.println("Name of the animal is Dog.");
            }else if(sound.equals("meow")){
                System.out.println("Name of the animal is Cat.");
            }else{
                System.out.println("Unknown animal.");
            }
            for (int i = 0; i < 10; i++){
                System.out.println();
            }


        }
    }

