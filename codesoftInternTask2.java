import java.util.*;

public class codesoftInternTask2 {
    //TASK 2:-
    public static void averagePercentage(int n) {
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter various subject marks and sum those marks : ");
        int totalMarks = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            totalMarks = totalMarks + a[i];
        }
        System.out.println("The totalmarks of all subjects is : " + totalMarks);
        int Averagepercentage = totalMarks / n;
        System.out.println("Average percentage of all the subjects is : " + Averagepercentage);
        if(Averagepercentage > 90) {
            System.out.println("A+");
        }else if(Averagepercentage < 90 && Averagepercentage > 75) {
            System.out.println("B+");
        }else if(Averagepercentage < 75 && Averagepercentage > 60) {
            System.out.println("C+");
        }else {
            System.out.println("D");
        }
    }

    public static void main(String args[]) {

        System.out.println("Enter the number of subjects : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        averagePercentage(n);
    }
}
