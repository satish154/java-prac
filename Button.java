import java.util.Scanner;

public class Button {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button =sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int b=sc.nextInt();
        // if(a==b){
            // System.out.println("a and b,are equal");
        // }
        // else if(a>b)
        // {
            // System.out.println("a is greater");
        // }
        // else
        // {
            // System.out.println("b is equal");
        // }
        // switch (button) {
            // case 1:System.out.println("hello");
                // 
                // break;
            // case 2:System.out.println("namaste");
                // break;
            // case 3:System.out.println("welcome");
            // break;
            // default:System.out.println("invalid button");
                // break;
        // }
        switch (button) {
            case 1:System.out.println(a+b);
                     break;
            case 2:System.out.println(a-b);
             break;
             case 3:System.out.println(a*b);
             break;
             case 4:System.out.println(a%b);
             break;
             case 5:System.out.println(a%b);
             break;
            default:
                break;
        }
    }
    
}
