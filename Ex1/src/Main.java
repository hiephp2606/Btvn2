import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//         cong hai ma tran
        System.out.println("nhap so cot: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("nhap so hang: ");
        int col = Integer.parseInt(sc.nextLine());

//        ma tran 1
        System.out.println("* nhap ma tran thu nhat *");
        int [][]arr1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("a["+i+"]["+j+"]: ");
                arr1[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf(" "+arr1[i][j]);
            }
            System.out.println("\n");
        }


//        ma tran 2
        System.out.println("* nhap ma tran thu hai *");
        int [][]arr2 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("b["+i+"]["+j+"]: ");
                arr2[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf(" "+arr2[i][j]);
            }
            System.out.println("\n");
        }

//      cong hai ma tran
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

//        in
        System.out.println("2 ma tran sau khi cong la: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf(" "+arr1[i][j]);
            }
            System.out.println("\n");
        }
    }
}