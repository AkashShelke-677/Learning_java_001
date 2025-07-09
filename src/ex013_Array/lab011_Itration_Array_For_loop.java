package ex013_Array;

public class lab011_Itration_Array_For_loop {
    public static void main(String[] args) {
        int [][] array;
        array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i<array.length;i++)
            { //this loop will run for row

                for (int j = 0; j<array[i].length;j++)
                    {//this will go to collumn
                        System.out.print(array[i][j] + " | ");
                    }
            System.out.println();  // to add space and print as it is

             }
    }
}
