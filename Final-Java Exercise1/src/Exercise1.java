import java.util.Scanner;

public class Exercise1 {
    public void Task1()
    {
        Element();
    }

    public void Element()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Input numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}
