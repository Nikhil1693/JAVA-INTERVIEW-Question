import java.util.ArrayList;

public class SphereMatrixDemo {

	public static void main(String[] args) {
		
		matrix(3,3);

	}

	public static void matrix(int row,int col) {
		
		int a[][]=new int[row][col];
		int i;
		int startRow=0,startCol=0;
		int last_col=col-1;
		int last_row=row-1;
		
		
		int num=1;
		
		while(startRow<=last_row && startCol<=last_col) {
		for(i=startRow;i<=last_col;i++) {
			a[startRow][i]=num;
			System.out.print(num);
			num++;
		}
		startRow++;
		System.out.println();
		
		for(i=startRow;i<=last_row;i++) {
			a[i][last_col]=num;
			System.out.print(num);
			num++;
			}
		last_col--;
		 
		for(i=last_col;i>=startCol;i--) {
			a[last_row][i]=num;
			System.out.print(num);
			num++;
		}
		last_row--;
		
		System.out.println();
		
		for(i=last_row;i>=startRow;i--) {
			a[i][startCol]=num;
			System.out.print(num);
			num++;
					
		}
		startCol++;
		
	}

}
}
