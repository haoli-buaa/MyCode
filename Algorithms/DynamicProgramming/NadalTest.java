import java.util.Scanner;

public class NadalTest {

	/**
	 * 开始 21:06 
	 * 编译 21:20
	 * 通过 21:25
	 * 难度 2（简单）
	 * 时长：19min
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		int count = 0;
		for(int i = 0; i < a.length(); i++){
			if(similar(a.charAt(i), b.charAt(i)))
				count++;
		}
		System.out.printf("%.2f%%", count*100.0/a.length());
	}
	private static boolean similar(char a, char b){
		if(isChar(a) ^ (b == '0'))
			return true;
		return false;
	}
	private static boolean isChar(char a){
		if(a >= 'a' && a<= 'z')
			return true;
		if(a >= 'A' && a<= 'Z')
			return true;
		if(a >= '0' && a<= '9')
			return true;
		return false;
	}
}
