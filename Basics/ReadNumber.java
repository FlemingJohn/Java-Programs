import java.util.Scanner;

class ReadNumber{
    public static void main(String[] args) {
        int number;

        System.out.println("Enter the integer values: ");

        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();

        System.out.println("Enetered values is: "+ number);

        scan.close();
    }
}