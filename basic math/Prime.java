public class Prime {
    public static boolean checkPrime(int N){
        for(int i=2;i<Math.sqrt(N);i++){
            if(N%i==0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        int num1=17;
        int num2=544;
        System.out.println(checkPrime(num1));

        System.out.println(checkPrime(num2));
    }
}
