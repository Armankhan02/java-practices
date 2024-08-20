public class averageofnum {
    public static void main(String args[]){
        int [] arr= {10,12,13,14};
        double sum=0;
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        sum=sum/2;
        System.out.println(sum);
    }
    
}
