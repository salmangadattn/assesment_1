public class Asses_Q4 {

    /*
        Q4) Create a two dimensional array of integers and display:
            *  sum of all elements of each column
            *  sum of all elements of each row
    */

    public static void main(String[] args) {

            int[][] arr = {{2,3,6,6,3},
                           {3,8,9,2,1},
                           {3,6,8,4,6},
                           {2,4,8,7,3},
                           {3,5,4,1,0}};

            int row_sum = 0;
            int col_sum = 0;


            for(int i=0;i<arr.length;i++){
                for (int j=0;j<arr[i].length;j++){
                    row_sum+=arr[i][j];
                }
                System.out.println("Row "+ (i+1)+" sum is : "+ row_sum);
                row_sum=0;
            }

            for (int i=0;i<arr[0].length;i++){
                for (int j=0;j<arr.length;j++){
                    col_sum+=arr[j][i];
                }
                System.out.println("Column "+(i+1)+" sum is "+col_sum);
                col_sum=0;
            }

    }
}
