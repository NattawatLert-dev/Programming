package a02array_string;

public class A3Array2D {
    public static void main(String[] args) {
        
        // Array 2D = Array ที่มี 2 มิติ หรือพูดง่าย ๆ คือ Array ที่เก็บ Array อีกทีหนึ่ง
        //            เหมาะสำหรับข้อมูลที่เป็นตาราง เช่น คะแนนนักเรียนหลายวิชา
        //                                        ตารางหมากรุก (8×8)
        //                                        เมทริกซ์ทางคณิตศาสตร์
        //                                        ตารางที่นั่ง
        //                                        เกม เช่น Sudoku หรือ Tic-Tac-Toe

        // การประกาศ Array

        // แบบที่ 1
        int[][] matrix = new int[2][3];
        
        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        
        matrix[1][0] = 40;
        matrix[1][1] = 50;
        matrix[1][2] = 60;

        System.out.println(matrix[1][1]); // 50

        // แบบที่ 2
        int[][] matrix1 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // เข้าถึงสมาชิกด้วย for loop
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        // เข้าถึงสมาชิกด้วย for each
        
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Array 2D ที่แต่ละแถวยาวไม่เท่ากัน (Jagged Array)

        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        System.out.println(jagged[2][0]); // 6

    }
}
