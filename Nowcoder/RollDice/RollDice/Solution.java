package RollDice;

public class Solution {
	int maxPoints = 6;
	public void diceSumProbability(int number){
		int[] count = new int[(maxPoints-1)*number+1];
		double total = Math.pow(maxPoints, number);
		probability(number, number, 0, count);
		System.out.println("Sum:	Probability");
		for(int i = 0; i < count.length; i++){
			double p = count[i]/total;
			System.out.printf("%d:\t%.2f\n",i+number, p);
		}		
	}
	public void diceSum(int number){
		int[][] count = new int[2][maxPoints*number+1];
		double total = Math.pow(maxPoints, number);
		int flag = 0;
		for(int i = 1; i <= maxPoints; i++)
			count[flag][i] = 1;
		for(int k = 2; k <= number; k++){
			for(int i = 0; i < k; i++)
				count[1-flag][i] = 0;
			for(int i = k; i <= k*maxPoints; i++){
				count[1-flag][i] = 0;
				for(int j = 1; j < i && j <= maxPoints; j++)
					count[1-flag][i] += count[flag][i-j];
			}
			flag = 1 - flag;	
		}
		System.out.println("Sum:	Probability");
		for(int i = number; i <= maxPoints*number; i++){
			double p = count[flag][i]/total;
			System.out.printf("%d:\t%.2f\n",i, p);
		}
	}
	void probability(int number, int current, int sum, int[] count){
		if(current == 1)
			for(int i = 1; i <= maxPoints; i++)
				count[sum+i-number]++;		
		else
			for(int i = 1; i <= maxPoints; i++)
				probability(number, current-1, sum+i, count);
	}
	public static void main(String[] args){
		//int n = 1;
		//int n = 2;
		int n = 3;
		Solution sol = new Solution();
		//sol.diceSumProbability(n);
		sol.diceSum(n);
	}
}
