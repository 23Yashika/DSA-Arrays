import java.util.Scanner;

public class arr3 {
     public static void main(String[] args) {
        int n;
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter n no. of element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i+=2){
            System.out.println(arr[i]);
        }
    }
}
