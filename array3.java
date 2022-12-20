import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {1, 4, 34, 56, 7};
		int  key = sc.nextInt();
		int i, flag = 0;
		
		for(i = 0; i < array.length; i++) {
			if(array[i] == key) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			System.out.println(i+1);
		}
		else {
			System.out.println("-1");
		}
	}

}
