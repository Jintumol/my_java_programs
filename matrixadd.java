import java.util.*;
public class matrixadd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r1,r2,c1,c2,matrix1[][],matrix2[][],matrix3[][],transpose[][],i,j;
        System.out.println("Enter the row and column size of 1st matrix");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter the row and column size of 2nd matrix");
        r2=sc.nextInt();
        c2=sc.nextInt();
        if(r1==r2 && c1==c2){
            matrix1=new int[r1][c1];
            matrix2=new int[r2][c2];

            System.out.println("Enter the elements to matrix1");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    matrix1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the elements to matrix2");
            for(i=0;i<r2;i++){
                for(j=0;j<c2;j++){
                    matrix2[i][j]=sc.nextInt();
                }
            }
            matrix3=new int[r1][c1];
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
                }
            }
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
            System.out.print(matrix3[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("addition not possible");
        }

        transpose=new int[c1][r1];
        for(i=0;i<c1;i++){
            for(j=0;j<r1;j++){
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
