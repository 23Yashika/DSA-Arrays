import java.util.Scanner;

public class arr12 {
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
int max = arr[0];
        for(int i=0;i<n;i++){
if(max < arr[i]){
    max = arr[i];
}
        }
        System.out.println("maximun in array : "+ max);
    }
}