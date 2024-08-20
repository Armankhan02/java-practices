class checkFloatnum{
    public static void main(String args[]){
        double x=10.44;
        double y=10.44;
        y=Math.round(y*1000);
        y=y/1000;
        x=Math.round(x*1000);
        x=x/1000;
        if(x==y){
            System.out.println("decimal is same");
        }else{
            System.out.println("decimal is not same ");
        }
    }
}