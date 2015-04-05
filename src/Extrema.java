//-----------------------------------------------------------------------------
// Extrema.java
// Author: CJ Ketchum
// 4/1/15
//-----------------------------------------------------------------------------

class Extrema {

    // maxArray()
    // returns the largest value in int array A
    static int maxArray(int[] A, int p, int r){
        if(r-p<=0)
            return A[r];

        int middle = (p+r)/2;

        return max(maxArray(A, p, middle), maxArray(A, middle+1, r));
    }

    // minArray()
    // returns the smallest value in int array A
    static int minArray(int[] A, int p, int r){
        if(r-p<=0)
            return A[r];

        int middle = (p+r)/2;

        return min(minArray(A, p, middle), minArray(A, middle+1, r));
    }

    public static int max(int one, int two){
        if(one >= two)
            return one;
        else return two;
    }

    public static int min(int one, int two){
        if(one <= two) 
            return one;
        else return two;
    }

    // main()
    public static void main(String[] args){
        int[] B = {-1, 2, 6, 3, 9, 2, -3, -2, 11, 5, 7};
        System.out.println( "max = " + maxArray(B, 0, B.length-1) );  // output: max = 11
        System.out.println( "min = " + minArray(B, 0, B.length-1) );  // output: min = -3
    }

}