public class Myloops {
    public static void main(String[] args) {
        /*int count=0;
        int num=0;
        while (count<10){
            System.out.println(count);
            ++count;
        }
        System.out.printf("below is a for loop \n");
        for(int i=0;i<5;i++){
            num+=2;
            System.out.println(num);}*/

        System.out.printf("     ");
        for(int i=1;i<=9;i++){
            System.out.printf("%4d",i);

        }
        System.out.println("\n---------------------------------------------");
        for(int j=1;j<=9;j++){
            System.out.println(j+ "  |    ");
            for(int i=1;i<=9;i++){
                System.out.printf("    %4d",j*i);
            }
            System.out.println();

        }
        int x;
    }
}
