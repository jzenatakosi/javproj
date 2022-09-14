public class Mains {
    public static void main(String[] args){
        System.out.println("hello dear people");
        int x=32;
        do
        {
            if (x==16 ||x==24)
            {
                x-=4;
                continue;
            }
            System.out.println(x);
            x-=4;
        }
        while(x>11);
    }
}
