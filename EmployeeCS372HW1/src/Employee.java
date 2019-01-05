public class Employee {
    private int ID;
    private String Superior;
    private String hireDate;
    String position;
    String name;

    private int IDpool = 1;
    Employee(String name_, String hireDate_, String position_) {
        ID = IDpool+1;
        Superior = "the boss";
        name = name_;
        position = position_;
        hireDate = hireDate_;
    }

    public int getID() { return ID; }
    public String getHireDate() { return hireDate; }
    public String getSuperior() { return Superior; }
}