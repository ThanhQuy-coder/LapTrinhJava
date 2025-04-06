import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("Ket qua: " + tinhGiaiThua(n));
    }

    public static int tinhGiaiThua(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return (n * tinhGiaiThua(n-1));
    }
}