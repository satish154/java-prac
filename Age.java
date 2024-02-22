import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        int a=3;
        int b=4;
        System.out.println(a/b);
    }
    
}
