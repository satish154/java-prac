import java.util.Scanner;

public class Product {
    
    public static int CalProduct(int a,int b) {
        int Product=a*b;
        return Product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Pro=CalProduct(a, b);
        System.err.println("product of 2 numbers is :"+Pro);

    }
}
