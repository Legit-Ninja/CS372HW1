import java.util.Scanner;
public class EmployeeTest {

    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the new Hire's name, " +
                "followed by the date of hire, followed by the position. ");
        String name = in.nextLine();
        String hireDate = in.nextLine();
        String position = in.nextLine();
        Employee e1 = new Employee(name, hireDate, position);
        System.out.println("the info on your new hire is as follows, and I quote:" +
        "name: " + e1.name + " Date of hire: " + e1.getHireDate() + " Position: " +
         e1.position + " Superior: " + e1.getSuperior() + " ID:" + e1.getID());
    }
}

