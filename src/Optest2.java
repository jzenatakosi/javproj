import java.util.Scanner;
public class Optest2 {
    public static void main(String[] args) {
double cell3;
        float numArray[][]=new float[5][3];

        numArray[0][0]=12.6f;
        numArray[0][1]=10.6f;
        numArray[0][2]=numArray[0][0]+numArray[0][1];


studmarks();

    }
    public static void studmarks()
    {
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter Test mark:");
        int test1 = mark.nextInt();
        System.out.println("Enter Assignment mark:");
        int assignment = mark.nextInt();
        System.out.println("Enter Exam mark:");
        int exam = mark.nextInt();

        int fnlcwk = (test1 + assignment) / 2;
        int fnmrk = fnlcwk + exam;
        if (fnmrk == 20) {
            System.out.printf("Low mark");
        } else if (fnmrk >= 40) {
            System.out.printf("medium mark");
        } else if (fnmrk >= 60) {
            int bon = fnmrk + 10;
            System.out.println(bon);

        } else if (fnmrk >= 80) {
            System.out.printf("Excellent");
        } else {
            System.out.printf("Failed");
        }
    };


    }

