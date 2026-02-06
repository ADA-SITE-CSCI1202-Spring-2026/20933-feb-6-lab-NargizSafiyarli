import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n= sc.nextInt();
        double s=0;
        for (int i=0;i<=n;i++){
            s= (s+(Math.pow(-1,i)*Math.pow(x,2*i+1)/factorial(2*i+1)));

        }
        System.out.println(s);

    }
    static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }
}
