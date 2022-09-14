import java.util.Scanner;
public class JavArrays {
    public static void main(String[] args){
       /* int [] marks= new int[7];
        marks[0]=10;
        marks[1]=12;
        marks[2]=5;
        marks[3]=100;
        marks[4]=90;
        marks[5]=60*marks[2]+marks[1];
        marks[6]=11;
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.printf("hope you see the answer");*/
        for (int i=0; i<3; i++) {

            password_check();
        }
        double [] twelve= new double[13];
        twelve[0]=12.0;
    }
    public static void password_check()
    {
        String userName="ray@ug";
        String passWord="#Bihogo@17";
        Scanner username = new Scanner(System.in);
        System.out.printf("Please Enter Username: \n");
        String user=username.nextLine();
        System.out.printf("Please Enter Password: \n");
        Scanner password=new Scanner(System.in);
         String pass=password.nextLine();
        if(user==userName && pass==passWord){
            System.out.printf("Access granted\n");
        }
        else {
            System.out.printf("Access denied\n");
        }
    }
}
