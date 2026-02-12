import java.util.Scanner;

class Student{
    private int rollNum;
    private String name;
    private double Marks;
    //Getter
    public int getRollno(){
        return rollNum;
    }
    public double getMarks(){
        return Marks;
    }
    public String getName(){
        return name;
    }
    //Setter
    public void setRollno(int Rollnum){
        this.rollNum = Rollnum;
    }
    public void setMarks(double marks){
        this.Marks = marks;
    }
    public void setName(String Name){
        this.name = Name;
    }
    //Grade Calculation
    public void calculateGrade(double Marks){
        if (Marks >= 90) System.out.println("A+");
        else if (Marks >= 80 && Marks < 90) System.out.println("A");
        else if (Marks >= 70 && Marks < 80) System.out.println("B");
        else if (Marks >= 60 && Marks < 70) System.out.println("C");
        else if (Marks >= 50 && Marks < 60) System.out.println("D");
        else if (Marks >= 40 && Marks < 50) System.out.println("E");
        else System.out.println("U");
    }
}
public class Task1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your Roll number: ");
        int Roll = inp.nextInt();
        System.out.print("Enter your Marks: ");
        double marks = inp.nextDouble();
        inp.nextLine();
        System.out.print("Enter your Name: ");
        String Name = inp.nextLine();
        Student Object = new Student();
        Object.setRollno(Roll);
        Object.setName(Name);
        Object.setMarks(marks);
        System.out.println("Student Name: "+Object.getName());
        System.out.println("Student Roll Number: "+Object.getRollno());
        System.out.println("Student Marks: "+Object.getMarks());
        Object.calculateGrade(marks);
        inp.close();
    }
}
