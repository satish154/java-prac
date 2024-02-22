import java.util.Scanner;
public class Odd {
    public static void OddNum(int n) {
        int i=2;
        int sum=0;
        while(i<=n){
            if(i%2==1){
                sum=sum+i;
            }
        i++;       
        }
    System.out.println(sum);
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        OddNum(n);
             
    }
}
