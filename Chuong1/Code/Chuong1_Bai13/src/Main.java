import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if (kiemtraSNT(n)){
            System.out.println(n + " la so nguyen to");
        }
        else
            System.out.println(n + " khong phai la so nguyen to");
    }

    public static boolean kiemtraSNT(int n){
        if (n < 0)
            return false;
        int ucnn = 2;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                ucnn++;
            }
        }
        return (ucnn == 2);
    }
}