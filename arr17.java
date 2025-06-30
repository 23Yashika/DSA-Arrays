import java.util.Scanner;

public class arr17 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position to delete elements:");
        int pos = sc.nextInt();

  for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Array after deletion:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
