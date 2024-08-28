import java.util.Scanner;

public class smallestNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x= sc.nextInt();
        double y = sc.nextInt();
        double z=sc.nextInt();
        double smallestNumber =smallestNumber(x,y,z);
        System.out.println("smallest Number is : "+smallestNumber);
        double lragestNumber = lragestNumber(x, y, z);
        System.out.println("largest number is : "+lragestNumber);
    }
    public static double smallestNumber(double x, double y, double z){
        return Math.min(Math.min(x, y), z);
    }
    public static double lragestNumber(double x, double y, double z){
        return Math.max(Math.max(x, y), z);
    }
    
}
