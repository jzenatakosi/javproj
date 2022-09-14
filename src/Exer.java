import java.util.Scanner;
public class Exer {
    /*public static float camparetwo(float num1, float num2 ){
        if (num1>num2){
            return num1;
        }
        else {
            float mutl=(num1*num2);
            float rem=mutl%2;
            return rem;
        }

    }*/

    public static void main(String[] args){
        //float ans1,ans2;
        //Scanner num= new Scanner(System.in);

        //int a=num.nextInt();
        //int b=num.nextInt();
        //ans1=camparetwo(a,b);
        //System.out.println("the answer is: "+ans1);
        //float c =num.nextFloat();
        //float d =num.nextFloat();
        //ans2=camparetwo(c,d);
       // System.out.println("the answer is "+ans2);
        int num1=27;
        int num2=43;
        int func_call= adding(num1,num2);
        System.out.println(func_call);
    }
    public static int  adding(int a, int b){
        //put the code to be executed

        int sum =a+b;

        //System.out.println(sum);
        return sum;
    }
}
//int num=1;
//int num2=1;

