package matr;

import java.util.Scanner;

class MatrixOperation{
    public int[][] inputMat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Row: ");
        int row = sc.nextInt();
        System.out.print("Number of Column: ");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("Enter (%d,%d) element: ",i+1,j+1);
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    public void printMat(int[][] mat){
        for(int[] a : mat){
            for(int e: a)
                System.out.print(e + "\t");
            System.out.println();
        }
    }

    public int[][] addition(int[][]mat1, int[][] mat2){
        int row1 = mat1.length;
        int col1 = mat1[0].length;
        int row2 = mat2.length;
        int col2 = mat2[0].length;

        if((row1 != row2) || (col1 != col2))
        {
            System.out.println("\nAddition Not Possible");
            return null;
        }

        int[][] result = new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    public int[][] transpose(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int[][] matNew = new int[col][row];
        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                matNew[j][i] = mat[i][j];
        return matNew;
    }

    public int[][] multiplication(int[][] mat1, int[][] mat2){
        int row1 = mat1.length;
        int col1 = mat1[0].length;
        int row2 = mat2.length;
        int col2 = mat2[0].length;

        if(col1 != row2)
        {
            System.out.println("\nMultiplication Not Possible");
            return null;
        }

        int[][] result = new int[row1][col2];
        for(int i=0;i<row1;i++)
            for(int j=0;j<col2;j++)
                for(int k=0;k<col1;k++)
                    result[i][j] += mat1[i][k] * mat2[k][j];
        return result;
    }
}