import java.util.Scanner;
import java.util.Random;

public class magicBall {

    public static void generateNum() {
        // random numbers for Magic Ball
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int rand1 = rand.nextInt(75);
        int rand2 = rand.nextInt(65);

        int magicBallNum = (rand1 * (lottoQuest.luckyNum));

        while (magicBallNum > 75) {
            magicBallNum = magicBallNum - 75;
        }
        System.out.println();
        System.out.printf("Magic Ball: %d ", magicBallNum);

        // * Favorite quarterback number + age of pet + lucky number.
        //

        // * Use the value 42.
        int lotteryNum1 = 42;

        // * Use the age of their favorite pet + their car model year.
        int lotteryNum2 = (lottoQuest.petAge + lottoQuest.yearModel);

        if (lotteryNum2 > 65) {
            lotteryNum2 = lotteryNum2 - 65;
        }
        // * Use the two digit model year of their car and add their lucky number to it.
        int lotteryNum3 = (lottoQuest.yearModel + lottoQuest.luckyNum);

        if (lotteryNum3 > 65) {
            lotteryNum3 = lotteryNum3 - 65;
        }

        // * Use the random number between 1 and 50, subtracting one of the generated
        // random numbers.
        int lotteryNum4 = lottoQuest.randNum - rand2;
        if (lotteryNum4 < 1) {
            lotteryNum4 = lotteryNum4 + 65;
        }

        // * Convert the first letter of their favorite actor/actress to an integer and
        // use that value.
        int lotteryNum5 = (lottoQuest.actName).charAt(0);
        while (lotteryNum5 > 65) {
            lotteryNum5 = lotteryNum5 - 65;
        }
        // * Find the 3rd letter of their favorite pet. Convert that character value to
        // an integer value.
        int lotteryNum6 = (lottoQuest.petName).charAt(2);

        while (lotteryNum6 > 65) {
            lotteryNum6 = lotteryNum6 - 65;
        }
        // * Convert the last letter of their favorate actor/actress to an integer and
        // use that value.
        int lotteryNum7 = (lottoQuest.actName).charAt((lottoQuest.actName).length() - 1);

        while (lotteryNum7 > 65) {
            lotteryNum7 = lotteryNum7 - 65;
        }

        System.out.println();
        // lottery numbers:
        System.out.println("Lottery Numbers: " + lotteryNum1 + " " + lotteryNum2 + " " + lotteryNum3 + " " + lotteryNum4
                + " " + lotteryNum5);

        System.out.println("Would you like to try again? Yes or No");
        String tryAgain = input.nextLine().toUpperCase();

        if (tryAgain.equals("YES") || tryAgain.equals("Y")) {
            System.out.print("Here we go again!");

            lottoQuest.getLotteryNum();

        } else {
            System.out.println("Thank you for your participation");
            input.close();
            return;
        }
    }
};