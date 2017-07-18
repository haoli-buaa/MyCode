package Sum_Solution;

public class Solution {
	public int Sum_Solution(int n) {
		Temp[] a = new Temp[n];
		Temp b = new Temp();
        return Temp.getSum();
    }
	private static int N;
	private static int sum;
	static class Temp{		
		public Temp(){
			++N;
			sum += N;
			System.out.println("Executed");
		}
		public static void reset(){
			N = 0;
			sum = 0;
		}
		public static int getSum(){
			return sum;
		}
	}
	public static void main(String[] args){
		int n = 100;
		Solution sol = new Solution();
		System.out.println(sol.Sum_Solution(n));				
	}
}
