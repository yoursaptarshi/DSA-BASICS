public class armstrongNumber {
    public static int length(int N){
        int count =0;
        if(N==0){
            return 1;
        }
        while(N!=0){
            N = N/10;
            count++;
        }
        return count;
    }
    public static int power(int a,int b){
        int pow =1;
        for(int i=0;i<b;i++){
            pow = pow * a;
        }
        return pow;
    }
   public static boolean checkArmstrong(int N){
    int power = length(N);
    int number = N;
    int sum =0;
    while(number!=0){
        int remainder = number%10;
        sum = sum +power(remainder,power);
        number = number/10;
    }

    if(N == sum){
        return true;
    }
    return false;

   } 

   public static void main(String[]args){
    int num1= 153; // armstrong number;
    int num2=134;//not arm strong number;
    System.out.println(checkArmstrong(num1));
    System.out.println(checkArmstrong(num2));
    
   }
}
