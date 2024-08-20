import java.util.Scanner;

public class inserGivenIndex {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of array ");
    int n = sc.nextInt();
    System.out.println("Enter the value of array");
    int arr[]=new int[n];
    for(int i =0; i<arr.length; i++){
        arr[i]=sc.nextInt();
    }
    for(int i = 0; i<arr.length; i++){
        System.out.println("befor the array "+arr[i]);
    }
    System.out.println("enter the index value where you want to insert new value");
    int index = sc.nextInt();

    System.out.println("enter the new value of array");
   int el=sc.nextInt();
   
    for(int i =arr.length-1; i>index-1; i--){
        arr[i]=arr[i-1];
        
    }
     arr[index-1]=el;
for(int i =0; i<arr.length; i++){
    System.out.println("after inserting new element "+arr[i]);
}sc.close();
    }

}
