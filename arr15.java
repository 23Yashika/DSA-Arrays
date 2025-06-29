import java.util.Scanner;

public class arr15 {
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
int min = arr[0];
        for(int i=0;i<n;i++){
if(min > arr[i]){
    min = arr[i];
}
        }
int sm;
sm =Integer.MAX_VALUE;
for(int i=0;i<n;i++){
    if(sm > arr[i] && arr[i] > min){
        sm = arr[i];
    }
}
if(n==1){
    System.out.println("-1");
}else{
  System.out.println("second minimum in array : "+ sm);
}

      
    }
}