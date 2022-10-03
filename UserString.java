import java.util.Scanner;

public class UserString {

    //Driver Code
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        System.out.println("The number of occurances of \'" + ch + "\' in \"" + s + "\" is " + count(String, ch));
    }

    //Method that returns counts of the given character in the string
    public static int count(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++)
        {
            //check for the character in the string
            if (str.charAt(i) == ch)
                count++;
        }
        return count;
    }
}