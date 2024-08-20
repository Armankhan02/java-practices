import java.util.Scanner;

public class positiveornegtivenumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        if(number%2==0){
            System.out.println("number is postive "+number);
        }else if (number%2!=0){
            System.out.println("number is negative "+number);
        }else{
            System.out.println("number is invilde");
        }
        sc.close();
    }
    
}
