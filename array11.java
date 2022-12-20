import java.util.Scanner;

public class array11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 3;
		int a[][]=new int[size][size];
		System.out.println("Enter the elements of array");
		for (int i=0 ;i< size;i++){
			for (int j=0;j<size;j++){
				a[i][j]=sc.nextInt();
			}

		}
		int max =a[0][0];
		for (int i=0 ;i< size;i++){
			for (int j=0;j<size;j++){
				if (a[i][j]>max){
					max=a[i][j];
					System.out.print("");


				}
System.out.print("");


			}
//
//			System.out.println("the largest number is "+max);
//\


		}

		System.out.print("the largest number is "+max);


	}
}