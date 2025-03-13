import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        System.out.println("Ket qua: " + binary);
    }
}