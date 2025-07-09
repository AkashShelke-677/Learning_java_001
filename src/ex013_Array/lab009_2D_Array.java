package ex013_Array;

public interface lab009_2D_Array {
    public static void main(String[] args) {
 //2 Daimentional arrray
        // it will defined by 2 squre bracket
        int [] [] array_2D = {
                {1,2,3},  // it will take as row and column
                {4,5,6},
                {7,8,9}
        };
        //OR
        int [] [] array;
        array = new int [][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][] empt= new int [3][3];
         //123
         //11 12 13
         //21 22 23
        empt [0][0]=1;  // assignth value "0" th row "0"th column
        empt [0][1]= 2;
        empt [0][2]=3;

        empt [1][0]=11;
        empt [1][1]= 122;
        empt [1][2]=13;

        empt [2][0]=21;
        empt [2][1]=22;
        empt [2][2]=23;
    }
}
