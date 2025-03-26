package Arrays.TwoDimentionalArray;

public class TwoDIntArr {
    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] = 23;
        a[0][1] = 24;
        a[0][2] = 25;

        a[1][0] = 33;
        a[1][1] = 44;
        a[1][2] = 55;

        a[2][0] = 31;
        a[2][1] = 41;
        a[2][2] = 51;

        a[3][0] = 30;
        a[3][1] = 40;
        a[3][2] = 50;

        int row = a.length;
        int col = a[0].length;

        for(int i=0 ; i<row ; i++)
        {
            for(int j=0;j<col ;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
