import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        String sNum = input.nextLine();                 //prompts user to enter a number
        while (!isNumber(sNum)) {
                System.out.println("Please make sure that at least your first character is a number.");
                sNum = input.nextLine();        //makes sure the first character is a number
        }
        System.out.println("The value of your number is: " + getNumber(sNum));
    }

    public static int getNumber(String num)
    {
        int intNum = 0;
        for (int i = 0; i < num.length(); i++)
        {
            //PT -- what is num.charAt(i) isn't a digit?
            intNum = intNum * 10 + num.charAt(i) - '0';       //algorithim to take characters to numbers
        }
        return intNum;
    }
    public static boolean isNumber(String num) {        //checks to make sure that the first charcater enterex matches the ascii for 1-9

        //PT -- more readable: return (num.charAt(0) >= '0' && num.charAt(0) <= '9')
        if (num.charAt(0) >= 48 && num.charAt(0) <= 57)
        {
                return true;
        }
        return false;
    }
}
