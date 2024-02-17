// This is mutant program.
// Author : ysma

package t2;


public class TrashAndTakeOut
{

    public static int trash( int x )
    {
        int m;
        int n;
        m = 0;
        if (x > 0) {
            m = 4;
        }
        if (x > 5) {
            n = 3 * m;
        } else {
            n = 4 * m;
        }
        int o = takeOut( m, n );
        return o;
    }

    public static int takeOut( int a, int b )
    {
        int d;
        int e;
        d = 42 * a;
        if (a > 0) {
            e = 2 * b + d;
        } else {
            e = b + d;
        }
        return e;
    }

    public static void main( java.lang.String[] args )
    {
        for (int i = -100; i <= 100; i++) {
            trash( i );
        }
    }

}
