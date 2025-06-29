import java.util.Scanner;

public class arr7 {
     public static void main(String[] args) {
        int n;
       int count =0;
int target ;
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
       
        int [] arr = new int[n];
        System.out.println("enter n no. of element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
          System.out.println("enter a target : ");
        target = sc.nextInt();
        for(int i=0;i<n;i++){
         if(arr[i] == target){
            count++;
         }
        }
        System.out.println("Count of "+ target +" : "+count);
       
}
}
