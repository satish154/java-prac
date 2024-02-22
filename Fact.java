import java.util.Scanner;

public class Fact {
    public static int CalFact(int n) {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
             fact=fact*i;

        }
        return fact;

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=CalFact(n);
        System.err.println("the factorial is:"+factorial);

        
    }
    
}
