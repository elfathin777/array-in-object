
public class ArrayMatrix {
	public static void main(String[] args) {
		int a [][] = {{1, 3, 4}, {3, 4, 5}};
		int b [][] = {{1, 3, 4}, {3, 4, 5}};
		
		int baris = 2;
		int kolom = 3;
		int n [][] = new int [baris][kolom];
		
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				n[i][j] = a[i][j] + b[i][j];
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}

}
