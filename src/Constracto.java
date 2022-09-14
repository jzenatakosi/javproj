import java.util.Scanner;
public class Constracto{
    String Firstname;
    String Lastname;
    String coursename;
    int Age;
    public  Constracto(String Fname,String lname,String course, int age){
        Firstname=Fname;
        Lastname=lname;
         coursename=course;
         Age=age;
    }

    public  void entry() {
        System.out.println("The First name is " + Firstname);
        System.out.println("The last name is " + Lastname);
        System.out.println("The course name is " + coursename);
        System.out.println("The Age is " + Age);
    }
    public static void main(String[] args) {
        Scanner newentry= new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String First_name=newentry.nextLine();
        System.out.println("Enter Last Name: ");
        String Last_name=newentry.nextLine();
        System.out.println("Enter Course Name: ");
        String c_name=newentry.nextLine();
        System.out.println("Enter Age: ");
        int age= newentry.nextInt();
Constracto studs1=new Constracto(First_name,Last_name,c_name,age);

Constracto studs2=new Constracto(First_name,Last_name,c_name,age);

        Constracto studs3=new Constracto(First_name,Last_name,c_name,age);
        studs3.entry();
        studs1.entry();
        studs2.entry();


    }
}
