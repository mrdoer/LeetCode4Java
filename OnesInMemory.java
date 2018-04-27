package chen.practice;
import java.util.Scanner;
public class OnesInMemory {
	@SuppressWarnings("resource")
	public int count() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int count = 0;
			int n = sc.nextInt();
			while(n != 0) {
				count++;
				n = n&(n-1);
			}
			System.out.println(count);
			
		}
	}

	public static void main(String[] args) {
		OnesInMemory o = new OnesInMemory();
		o.count();
	}
}
