package warmup.hackerank;

public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] a =
                {
                        {11, 2, 4},
                        {4, 5, 6},
                        {10, 8, -12},
                };

        int sumOfStraightDiagonal=0;
        int sumOfReverseDiagonal=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j){
                    sumOfStraightDiagonal+=a[i][j];
                }
                if(i+j==a.length-1){
                    sumOfReverseDiagonal+=a[i][j];
                }
            }
        }

        System.out.println("Difference is " + Math.abs(sumOfStraightDiagonal-sumOfReverseDiagonal));
    }
}
