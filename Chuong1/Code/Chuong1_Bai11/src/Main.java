
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int n = sc.nextInt();
        System.out.println("Ket qua: " + tinhTong(n));
    }

    public static int tinhTong(int n){
        if (n == 0)
            return n;
        return (n + tinhTong(n-1));
    }
}