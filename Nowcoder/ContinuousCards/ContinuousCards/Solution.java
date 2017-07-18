package ContinuousCards;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	int cardsNumber = 5;
	public boolean isContinuous(int [] numbers) {		
		//先排序后判断是否连续 O(nlogn)
		//获得第一个非零元素
		//获得非零牌的合理取值范围，在范围内，并且无重复
		inputCheck(numbers);
		Arrays.sort(numbers);
		int nonZero = 0;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] != 0){
				nonZero = i;
				break;
			}
		}
		int min = numbers[numbers.length-1] - cardsNumber + 1;				
		for(int i = nonZero; i < numbers.length; i++){
			if(numbers[i] < min)
				return false;
			if(i != nonZero && numbers[i]== numbers[i-1])
				return false;
		}
		return true;
    }
	public boolean continuous(int[] numbers){
		if(numbers.length == 0)
			return false;
		Set<Integer> set = new HashSet<Integer>();
		int max =0;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] > max)
				max = numbers[i];
		}
		int min = max - numbers.length + 1;
		for(int i = 0; i < numbers.length; i ++){
			if(numbers[i] != 0){
				if(numbers[i] < min || !set.add(numbers[i]))
					return false;				
			}
		}
		return true;		
	}
	void inputCheck(int[] cards){
		if(cards.length != cardsNumber){
			System.out.println("Wrong Input");
			System.exit(-1);
		}
	}
	public static void main(String[] args){
		//int[] number = {3,7,1,5,4};
		//int[] number = {0,0,1,2,5};
		int[] number = {9,7,0,5,4}; 
		Solution sol = new Solution();
		System.out.println(sol.isContinuous(number));
	}
}
