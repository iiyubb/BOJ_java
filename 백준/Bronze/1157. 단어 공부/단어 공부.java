import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		word = word.toUpperCase();
		
		int[] arr = new int[26];
		
		for (int i=0; i<word.length(); i++) {
			arr[word.charAt(i) - 65]++;
		}
		
		int max = -1;
		char ch = '?';
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
		
	}

}
