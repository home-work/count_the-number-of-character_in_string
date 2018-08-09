import java.util.Scanner;

public class NumberOfCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER a String: ");
        String s = scanner.nextLine();
        int sizeOfArrayCharacters = s.length();
        char[] arrayCharacters = new char[sizeOfArrayCharacters];
        for (int i = 0; i < sizeOfArrayCharacters; i++) {
            arrayCharacters[i] = s.charAt(i);
            System.out.printf(arrayCharacters[i] + "\t");
        }

        System.out.println("\nENTER character that you want count: ");
        String character = scanner.next();
        int count = 0;
        for (int i = 0; i < arrayCharacters.length; i++) {
            if (character.equals(String.valueOf(arrayCharacters[i]))) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của kí tự " + character + " là: " + count);
    }
}