 import java.util.Iterator;
import java.util.Scanner;

public class SimpleCode {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] forward = str.toCharArray();
		char[] rearrange = new char[str.length()];
		int k =str.length();
		int m =0;
		for (int i= (k/2); i< str.length(); i++) {
            rearrange[m++] = forward[i];
		}
		for (int i = 0; i <= (k/2)-1; i++) {
			rearrange[m++] = forward[i];
		}
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length()-i-1 ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print(rearrange[j]);
			}
			System.out.println("");
		}
	}

}

