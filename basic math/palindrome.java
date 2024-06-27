public class palindrome {
    public static int reverseNum(int N){
        int number =0;
        while(N != 0){
            int remainder = N%10;
            N=N/10;
            number = (number *10) + remainder;
        }
        return number;
    }
    public static boolean palindromeCheck(int N){
        int reversedNumber = reverseNum(N);

        if(reversedNumber == N){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        int num1 = 1234321;
        int num2 = 3452687;

        System.out.println(palindromeCheck(num1));
        System.out.println(palindromeCheck(num2));
    }
}
