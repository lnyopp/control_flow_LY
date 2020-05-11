import java.util.Scanner;

public class lottoQuest {

    static String petName;
    static int petAge;
    static int luckyNum;
    static int jerseyNum;
    static int yearModel;
    static String actName;
    static int randNum;

    public static void getLotteryNum() {

        Scanner input = new Scanner(System.in);
        System.out.println("");
        // user favorite pet
        System.out.println("What is the name of your favorite pet? : ");
        petName = input.next();

        // user favorite pet age
        System.out.printf("How old is %s ? : ", petName);
        System.out.println();
        petAge = input.nextInt();
        // user lucky number
        System.out.println("Whats your lucky Number? : ");
        luckyNum = input.nextInt();
        // favorite QB
        System.out.println("Do you have a favorite Quarterback?  Yes or No");
        String favQB = input.next().toLowerCase();
        switch (favQB) {

            case "yes":
                System.out.println("What is their Jersey Number?");
                int jerseyNum = input.nextInt();
                break;

            case "no":
                System.out.println("That's ok!");
        }
        ;
        // model of car
        System.out.println("What model year of your car? Please use YY format");
        yearModel = input.nextInt();
        // favorite actor or actress
        System.out.println("What is the first name of your favorite Actor or Actress:");
        actName = input.next();
        // random number
        System.out.println("Please enter a whole number between 1 and 50: ");
        randNum = input.nextInt();
        if (randNum <= 50 && randNum >= 1) {
            System.out.printf("Got it! The number you choose is %d", randNum);

        } else {
            System.out.println("Please enter a valid whole number between 1 and 50");
        }

        input.close();
        magicBall.generateNum();
    }

}