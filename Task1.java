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
        //Obj 1 Creation
        //Taking Input
        System.out.print("Enter your Roll number: ");
        int Roll = inp.nextInt();
        System.out.print("Enter your Marks: ");
        double marks = inp.nextDouble();
        inp.nextLine();
        System.out.print("Enter your Name: ");
        String Name = inp.nextLine();
        //Creating object
        Student Object = new Student();
        Object.setRollno(Roll);
        Object.setName(Name);
        Object.setMarks(marks);
        //Displaying details 
        System.out.println("Student Name: "+Object.getName());
        System.out.println("Student Roll Number: "+Object.getRollno());
        System.out.println("Student Marks: "+Object.getMarks());
        Object.calculateGrade(marks);
        //Object 2
        //Taking Input
        System.out.print("Enter your Roll number: ");
        Roll = inp.nextInt();
        System.out.print("Enter your Marks: ");
        marks = inp.nextDouble();
        inp.nextLine();
        System.out.print("Enter your Name: ");
        Name = inp.nextLine();
        //Creating Object
        Student Object2 = new Student();
        Object2.setRollno(Roll);
        Object2.setName(Name);
        Object2.setMarks(marks);
        //Displaying data 
        System.out.println("Student Name: "+Object2.getName());
        System.out.println("Student Roll Number: "+Object2.getRollno());
        System.out.println("Student Marks: "+Object2.getMarks());
        Object2.calculateGrade(marks);
        //Object 3
        //Taking Inputs
        System.out.print("Enter your Roll number: ");
        Roll = inp.nextInt();
        System.out.print("Enter your Marks: ");
        marks = inp.nextDouble();
        inp.nextLine();
        System.out.print("Enter your Name: ");
        Name = inp.nextLine();
        //Object Creation 
        Student Object3 = new Student();
        Object3.setRollno(Roll);
        Object3.setName(Name);
        Object3.setMarks(marks);
        Object3.calculateGrade(marks);
        //Displaying data 
        System.out.println("Student Name: "+Object3.getName());
        System.out.println("Student Roll Number: "+Object3.getRollno());
        System.out.println("Student Marks: "+Object3.getMarks());
        Object3.calculateGrade(marks);
        inp.close();
    }
}
