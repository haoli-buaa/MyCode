import java.util.Scanner;


public class Cross01 {

	/**
	 * 19:58
	 * 20:11 accepted
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine().trim();
			System.out.println(maxSubLength(s));
		}
	}
	private static int maxSubLength(String str){
		if(str == null || str.length() == 0)
			return 0;
		int max = 1, count = 1;
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) != str.charAt(i-1))
				count++;
			else
				count = 1;
			max = count > max ? count : max;
		}
		return max;
	}

}
