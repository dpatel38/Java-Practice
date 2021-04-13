
import java.util.Scanner;

public class Madlib {
    public static void main(String[] args){
        //Use the variables below to compose the following paragraph:
        // name, adjective, verbOne, verbTwo, number, yourName
        //Dear name,
        //You are adverb adjective and I want to be your noun! I want to go to the nounTwo with you in number days.
        //Sincerely, yourName


        Scanner userInput = new Scanner(System.in);
        int ageLimit = 18;
        System.out.println("What is your age?");
        int age = Integer.parseInt(userInput.nextLine());
        if (age < ageLimit){
            System.out.println("You are too young! Sorry!");
            System.exit(0);
        } else {
            //Program continues as normal because they past the age test!
            System.out.println("Enter a name: ");
            String name = userInput.nextLine();

            System.out.println("Give me an adverb: ");
            String adverb = userInput.nextLine();

            System.out.println("Give me an adjective: ");
            String adjective = userInput.nextLine();

            System.out.println("Give me a noun: ");
            String noun = userInput.nextLine();

            System.out.println("Give me another noun: ");
            String nounTwo = userInput.nextLine();

            System.out.println("Give me your name: ");
            String yourName = userInput.nextLine();

            System.out.println("Give me a number: ");
            int number = userInput.nextInt();


            System.out.printf("Here is your story: \n");
            System.out.printf("\n Dear %s,", name);
            System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
            System.out.printf("\n I want to go to the %s with you in %d days.", nounTwo, number);
            System.out.printf("\n Sincerely, %s \n", yourName);
        }
    }
}

