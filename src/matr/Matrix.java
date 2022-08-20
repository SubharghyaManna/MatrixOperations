package matr;

import java.util.Scanner;

public class Matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MatrixOperation mo = new MatrixOperation();

        System.out.println("1. Addition");
        System.out.println("2. Transpose");
        System.out.println("3. Multiplication");
        System.out.print("Enter your choice: ");

        switch (sc.nextInt()) {
            case 1 -> {
                System.out.println("\nFor 1st Matrix");
                int[][] mat1 = mo.inputMat();
                System.out.println("\nFor 2nd Matrix");
                int[][] mat2 = mo.inputMat();
                System.out.println("\nGiven 1st Matrix:");
                mo.printMat(mat1);
                System.out.println("\nGiven 2nd Matrix:");
                mo.printMat(mat2);
                int[][] sum = mo.addition(mat1, mat2);
                if (sum == null)
                    break;
                System.out.println("\nResultant Matrix:");
                mo.printMat(sum);
            }
            case 2 -> {
                int[][] mat;
                mat = mo.inputMat();
                System.out.println("\nGiven Matrix:");
                mo.printMat(mat);
                System.out.println("\nResultant Matrix:");
                mo.printMat(mo.transpose(mat));
            }
            case 3 -> {
                System.out.println("\nFor 1st Matrix");
                int[][] mat3 = mo.inputMat();
                System.out.println("\nFor 2nd Matrix");
                int[][] mat4 = mo.inputMat();
                System.out.println("\nGiven 1st Matrix:");
                mo.printMat(mat3);
                System.out.println("\nGiven 2nd Matrix:");
                mo.printMat(mat4);
                int[][] ans = mo.multiplication(mat3, mat4);
                if (ans == null)
                    break;
                System.out.println("\nResultant Matrix:");
                mo.printMat(ans);
            }
            default -> System.out.println("\nWrong Choice !!! Program Exited...");
        }
    }
}