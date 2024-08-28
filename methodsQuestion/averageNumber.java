import java.util.Scanner;

/**
 * averageNumber
 */
public class averageNumber {

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z =sc.nextInt();
        int averageNumber= averageNumber(x, y, z);
        System.out.println(averageNumber);

     }
     public static int averageNumber(int x, int y, int z){
        int ag = (x+y+z)/2;
        return ag;
     }
}