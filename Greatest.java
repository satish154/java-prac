import java.util.Scanner;
public class Greatest {
    public static int Greatestoftwo(int First,int Second){
        if(First>Second)
        {
            System.out.println(First);
        }
        else{
            System.out.println(Second);
        }
        return 0 ;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int First=sc.nextInt();
        int Second=sc.nextInt();
        int Great=Greatestoftwo(First, Second);
        System.out.println(Great);


    }
}
