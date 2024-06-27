public class reverse_a_NUmber {
    public static int reverseNum(int N)
    {
        int number =0;
        while(N != 0){
            int remainder = N%10;
            number = (number *10) + remainder;
            N=N/10;
        }
        return number;
    }
    public static void main(String[]args){
        System.out.println(reverseNum(567));
    }
}
