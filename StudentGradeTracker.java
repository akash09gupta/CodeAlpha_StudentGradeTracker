import java.util.Scanner;
import java.util.ArrayList;
//First Task To Make a StudentGradeTracker
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //getting the size of students data
        System.out.print("Enter the size of student's data: ");
        int sizeOfData=sc.nextInt();

        ArrayList<Integer> grades=new ArrayList<>();
        //input the grades from the teacher
        for(int i=0; i<sizeOfData; i++) {
            System.out.println("Enter the grades for student "+(i+1)+":");
            grades.add(sc.nextInt());
        }
        int sum=0;
        //set as defualt data of 0's index to our high and low grades
        int lowest=grades.get(0);
        int highest=grades.get(0);
        for(int i=0; i<sizeOfData; i++) {
            //calculating the sum of grades
            sum+=grades.get(i);
            //finding highest grades
            if (grades.get(i)>highest) {
                highest=grades.get(i);
            }
            //finding lowest grades
            else if (grades.get(i)<lowest) {
                lowest=grades.get(i);
            }
        }
        //Calculating the avg grades
        float avg=(float) sum / sizeOfData;
        System.out.println("Highest Grades : "+highest);
        System.out.println("Lowest Grades : "+lowest);
        System.out.println("Average Grades : "+avg);
        sc.close();
    }
}