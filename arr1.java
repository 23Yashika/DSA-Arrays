import java.util.Scanner;

public class arr1 {
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
        for(int i=0;i<n;i++){
            System.out.println("index "+i+" : "+arr[i]);
        }
    }
}
