package DataStructures;

public class L01_Array {
    // fixed length
    // indexed

    public static void main(String[] args) {

        int[] number = new int[10];
        number[0] = 1;

        String[][] matrix = new String[10][10];
        matrix[0][0] = "xxx";
        matrix[9][9] = "yyy";
        System.out.println(matrix[0][0]);
        System.out.println(matrix[9][9]);

    }
}