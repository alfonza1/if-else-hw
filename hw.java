

public class hw {


    public static void main(String[] args) {
       int miles = 4;
       int fee = 2;
       int fee1 = 5;
        int fee2 = 10;
        int fee3 = 15;
        int fee4 = 20;
       if(miles > 0 && miles <= 4){
           System.out.println("your fee will be $"+ fee);
       }
       else if(miles > 4 && miles <= 15 ){
           System.out.println("your fee will be $"  + fee1);}
        else if( miles > 15 && miles <= 25 ){System.out.println("your fee will be $"  + fee2);}
        else if( miles > 25 && miles <= 50 ){System.out.println("your fee will be $"  + fee3);}
        else{
            System.out.println("your fee will be $"  + fee4);
        }
    }
}
