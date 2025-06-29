import java.util.Scanner;

public class arr6 {
     public static void main(String[] args) {
        int n;
        int s=0;
        int m=1;
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter n no. of element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
          s += arr[i];
          m *= arr[i];
        }
        System.out.println("Sum of all elements : "+s);
         System.out.println("Product of all elements : "+m);
}
}
