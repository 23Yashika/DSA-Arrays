import java.util.Scanner;

public class arr16 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position to insert elements:");
        int pos = sc.nextInt();

        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position!");
            return;
        }

        System.out.println("Enter inserting elements:");
        int e = sc.nextInt();

        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = e;

        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
