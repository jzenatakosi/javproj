import java.util.Scanner;
public class Algos {
    public static void main(String[] args) {
        int temp;
        Scanner newtemp= new Scanner(System.in);
        System.out.printf("Enter temperature in celcius\n");
        temp= newtemp.nextInt();
        double f=1.8*temp+32;
        System.out.println(f);
    }
}
