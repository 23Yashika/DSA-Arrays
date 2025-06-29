import java.util.Scanner;

public class arr11 {
    public static void main(String[] args) {
        int n, target, flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a target: ");
        target = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
               for(int k= j+1;k<n;k++){
 if(arr[i] + arr[j] + arr[k] == target) {
                    flag = 1;
                    break;
                }
               }
               
            }
            if(flag == 1) break; 
        }

        if(flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
