import java.util.Scanner;

public class arr14 {
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
int sl;
        for(int i=0;i<n;i++){
if(max < arr[i]){
    max = arr[i];
}
        }
        sl = Integer.MIN_VALUE;
for(int i=0;i<n;i++){
    if(arr[i]>sl && arr[i]<max){
        sl = arr[i];
    }
}

if(n==1){
     System.out.println("-1");
}else{
System.out.println("second maximun in array : "+ sl);
}
        
    }
}