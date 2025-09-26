class Solution 
{
    public int divide(int dividend, int divisor) 
    {
        //Alright. This looks to be a fun problem
        //Thing the first to do is of course just use the basic thing of division - subtract with the divisor
        //We can do recursion for this
        //Base case would be when the dividend is smaller than the divisor
        //At that point, we return the final number
        //And recursive case would be jsut subtracting it
        //Actually, no need for recursion here. Just good old for loops will work. Not for loops, actually, but a while loop
        //Okay, do that
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int countforneg = 0;
        if (dividend < 0) {
            countforneg++;
        }
        if (divisor < 0) {
            countforneg++;
        }

        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        int quotient = 0;

        while (ldividend >= ldivisor) {
            long temp = ldivisor;
            int multiple = 1;

            while ((temp << 1) <= ldividend) {
                temp <<= 1;
                multiple <<= 1;
            }

            ldividend -= temp;
            quotient += multiple;
        }

        if (countforneg == 1) {
            quotient = -quotient;
        }

        return quotient;
    }
}

 