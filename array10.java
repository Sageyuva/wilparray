import java.util.Scanner;

public class array10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = 2;
		int a[][]=new int[size][size];
		System.out.println("Enter the elements of array");
		for (int i=0 ;i< size;i++){
			for (int j=0;j<size;j++){
				a[i][j]=sc.nextInt();
			}

		}
		System.out.println("Elements of the array are");
		for (int i=0 ;i< size;i++){
			for (int j=0;j<size;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.print("");
		}
		System.out.println("Elements of the reverse array are");
		for (int i=size-1 ;i>=0;i--){
			for (int j=size-1;j>=0;j--){
				System.out.print(a[i][j]+" ");
			}
			System.out.print("");
		}
	}
}