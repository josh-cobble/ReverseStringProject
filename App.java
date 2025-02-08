import java.util.Scanner;

public class App {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

boolean run = true;

while (run) {

System.out.println("\nWelcome to the Reverse Project!\n");
System.out.println("Please input any word(s), characters, or number(s) (except -1) you would like to see reversed. You may include spaces.");
System.out.println("Ex: Enter 'Hello' or '12 34' (without the quotation marks). Entering 'Hello' should output 'olleH'\n");
System.out.println("Enter -1 to exit\n");

String firstInput = scanner.nextLine();

char[] convertInput = firstInput.toCharArray();

for (int i = (convertInput.length - 1); i >= 0; i--) {
    System.out.print(convertInput[i]);
}

if(firstInput.equals("-1")) {
    System.out.println("Exit successful.");
    run = false;
}

}

scanner.close();

}

}
