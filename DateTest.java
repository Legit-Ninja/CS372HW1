import java.util.Scanner;
public class DateTest()
        {

            public static void main()
            {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the the current date as numbers " +
                "in the order of day, followed by month, followed by year");
                Date today = new Date();
                int todayDay = input.nextInt();     //sets the date to today
                int todayMonth = input.nextInt();
                int todayYear = input.nextInt();
                today.setDate(todayDay, todayMonth, todayYear);
                System.out.println("Today's date is: " + today.getDate());

                System.put.println("Enter the new date you would like to find the number of days since/after today" +
                "in the same format");
                int compareDay = input.nextInt();
                int compareMonth = input.nextInt();         //creates a new date to compare to
                int compareYear = input.nextInt();
                Date otherDate = new Date();
                otherDate.newDate(compareDay, compareMonth, compareYear);

                System.out.println("The difference in days between the two dates is: " +    //tests getDifference method
                today.getDifference(otherDate));

        }



            }
        }
