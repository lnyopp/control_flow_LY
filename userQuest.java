import java.util.Scanner;

public class UserQuest {
    public static void userQuestions() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Name: "); // type a word and hit enter

        String name = input.next();
        System.out.printf("Hello %s", name);
        System.out.println();
        System.out.println(
                "I am going to ask you a series of Questions, and from that, generate a random lottery number!");
        System.out.println();
        System.out.println("Would you like to continue with the interactice portion? Enter 'Yes' or 'Y' ");
        String ans = input.next().toUpperCase();

        if (ans.equals("YES") || ans.equals("Y")) {
            System.out.print("Excellent, let's continue!");
            LottoQuest.getLotteryNum();

        } else {
            System.out.println("Please return later to complete the survey");
            input.close();
            return;

        }

        input.close();
    }
}