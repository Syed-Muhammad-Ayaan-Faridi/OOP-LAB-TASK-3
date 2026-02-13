import java.util.Scanner;

class Member {
    private int memberID;
    private String name;
    private double previousweight;
    private double weight;
    private int workoutHours;

    // Setter
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.previousweight = this.weight;
        this.weight = weight;
    }

    public void setWorkoutHours(int workoutHours) {
        this.workoutHours = workoutHours;
    }

    // Getter
    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getWorkoutHours() {
        return workoutHours;
    }

    // access progress
    public void accessProgress() {
        if (workoutHours >= 10 && weight < previousweight) {
            System.out.println("Good Progress");
        } else {
            System.out.println("Need Improvement");
        }
    }
}

public class Task4 {
    public static void main(String[] args) {

        int MemberID;
        String Name;
        double Weight;
        int WorkoutHr;

        Scanner inp = new Scanner(System.in);
        Member[] membersArray = new Member[3];
        for (int i = 0; i < 3; i++) {
            // Dynamic obj
            membersArray[i] = new Member();
            // Set data
            System.out.println("Set data for member " + i + 1);

            System.out.print("Enter Name of Member: ");
            Name = inp.nextLine();
            System.out.print("Enter ID of Member: ");
            MemberID = inp.nextInt();
            System.out.print("Enter Workout Hours of Member: ");
            WorkoutHr = inp.nextInt();
            System.out.print("Enter Weight of Member: ");
            Weight = inp.nextDouble();
            membersArray[i].setName(Name);
            membersArray[i].setMemberID(MemberID);
            membersArray[i].setWeight(Weight);
            membersArray[i].setWorkoutHours(WorkoutHr);

            inp.nextLine();
        }

        // Displaying
        for (int i = 0; i < 3; i++) {
            System.out.print("Member Name: " + membersArray[i].getName());
            System.out.print("\nMember ID: " + membersArray[i].getMemberID());
            System.out.print("\nMember Weight: " + membersArray[i].getWeight() + "kgs");
            System.out.print("\nMember Workout Hours: " + membersArray[i].getWorkoutHours() + "hrs");
            System.out.print("\nMember Progress: ");
            membersArray[i].accessProgress();
        }
        inp.close();
    }
}