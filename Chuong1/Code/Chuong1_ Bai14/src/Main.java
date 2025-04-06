import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho ten: ");
        String fullName = sc.nextLine();
        String properFullName = toProperCase(fullName);
        System.out.println("Ket qua: " + properFullName);

    }

    public static String toProperCase(String fullName){
        String[] words = fullName.split(" ");
        StringBuilder properName = new StringBuilder();

        for (String word : words){
            if (!word.isEmpty()){
                properName.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return properName.toString().trim();
    }
}