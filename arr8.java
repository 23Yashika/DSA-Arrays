import java.util.Scanner;

public class arr8 {
     public static void main(String[] args) {
        int n;
      boolean iasc = true;
      boolean desc = true;
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
       
        int [] arr = new int[n];
        System.out.println("enter n no. of element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
          
        for(int i=0;i<n-1;i++){
       if(arr[i] > arr[i+1]){
iasc = false;
       }else if(arr[i] < arr[i+1]){
        desc = false;
       }
        }
       if(iasc){
        System.out.println("Sorted Forward");
       }else if(desc){
         System.out.println("Sorted backward");
       }else{
        System.out.println("not sorted");
       }
       
}
}
