import java.util.Scanner;

public class arr5 {
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

        
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

       
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        
        int e = 0, o = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[e++] = arr[i];
            } else {
                odd[o++] = arr[i];
            }
        }

       
        System.out.print("Even array: ");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.print("Odd array: ");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}
