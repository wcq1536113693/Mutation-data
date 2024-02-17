// This is mutant program.
// Author : ysma

package t1;


public class Mid
{

    public static int getMid( int a, int b, int c )
    {
        int mid;
        
        if (a > b) {
            if (c > b) {
                if (c < a) {
                    mid = c;
                } else {
                    mid = a;
                }
            } else {
                mid = b;
            }
        } else {
            if (b > c) {
                if (a > c) {
                    mid = a;
                } else {
                    mid = c;
                }
            } else {
                mid = b;
            }
        }
        return mid;
    }

    public static void main( java.lang.String[] args )
    {
    }

}
