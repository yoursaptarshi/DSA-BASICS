//Given a number N. Count the number of digits in N which evenly divide N.

/*
 * Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly

Input:
N = 23
Output
0
Explanation:
2 and 3, none of them
divide 23 evenly
 */

 class Solution{
    static int evenlyDivides(int N){
        // code here
        if(N==0)
        {
            return 1;
        }
        int count = 0;
        int number =N;
        while (number !=0 )
        {
            int remainder = number %10;
            number = number/10;
            if(remainder == 0){
                //as zero can not be devided and shows errror
                continue;
            }
            if(N%remainder == 0)
            {
                count ++;
            }
            
        }
        return count;
    }
}