import java.util.Scanner;

class Student{ 
    private int RollNum;
    private String Name;
    private double marks;
    private int Attendance;

    //Setters
    public void setAttendance(int attendance) {
        Attendance = attendance;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public void setRollNum(int rollNum) {
        RollNum = rollNum;
    }
    public void setName(String name) {
        Name = name;
    }

    //Getters
    public int getAttendance() {
        return Attendance;
    }
    public double getMarks() {
        return marks;
    }
    public String getName() {
        return Name;
    }
    public int getRollNum() {
        return RollNum;
    }

    //calculateResult()
    public void calculateResult(){
        if (marks >= 40 && Attendance >= 75) System.out.println("Pass"); 
        else System.out.println("Fail");
    }
}
public class Task3 {
    public static void main(String[] args) {
        //Variables
        String name;
        int attend;
        int Roll;
        double marks;

        Scanner inp = new Scanner(System.in);
        int n = 3;

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            //Dynamic obj
            students[i] = new Student();
            //Set data
            System.out.println("Set data for student "+i+1);

            System.out.print("Enter Name of Student: ");
            name = inp.nextLine();
            System.out.print("Enter Marks of Student: ");
            marks = inp.nextDouble();
            System.out.print("Enter Attendance of Student: ");
            attend = inp.nextInt();
            System.out.print("Enter Roll Number of Student: ");
            Roll = inp.nextInt();
            students[i].setName(name);
            students[i].setAttendance(attend);
            students[i].setMarks(marks);
            students[i].setRollNum(Roll);

            inp.nextLine();
        }

        //Displaying
        for (int i = 0; i < n; i++) {
            System.out.print("Student Name: "+students[i].getName());
            System.out.print("\nStudent RollNum: "+students[i].getRollNum());
            System.out.print("\nStudent attended: "+students[i].getAttendance()+"% classes");
            System.out.print("\nStudent secured: "+students[i].getMarks()+" Marks");
            System.out.print("\nStudent Result: ");
            students[i].calculateResult();
        }
        inp.close();
    }
}
