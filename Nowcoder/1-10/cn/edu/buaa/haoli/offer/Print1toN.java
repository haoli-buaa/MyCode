package cn.edu.buaa.haoli.offer;

import java.util.Scanner;

public class Print1toN {
	public static void main(String[] args){
		while (true) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			new Print1toN().printOnetoN(n);
		}
	}
	public void printOnetoN(int n){
		//保存当前数及最大值
		char[] num = new char[n];
		
		//recursive
		int cur = 0;
		printRecursively(num, cur, n);
		
		//非递归方式 
		/*char[] max = new char[n];
		for(int i = 0; i < n; i++){
			num[i] = '0';
			max[i] = '9';
		}
		num[n-1] = '1';
		while(!eq(num,max)){
			print(num);
			increment(num);
		}
		print(max);*/
	}
	private void printRecursively(char[] number, int cur, int len){
		if(cur == len-1){
			for(int i = 0; i < 10; i++){
				number[cur] = (char)('0' + i);
				print(number);
			}
			return;
		}
		for(int i = 0; i < 10; i++){
			number[cur] = (char)('0' + i);
			printRecursively(number, cur+1, len);
		}
			
	}
	private void increment(char[] number){
		boolean c = true;
		int index = number.length - 1;
		while(c && index >= 0){
			int val = number[index] - '0' + 1;
			if(val < 10){
				number[index] = (char)(number[index] + 1);
				c = false;
			}
			else
				number[index] = '0';
			index--;
		}
	}
	private void print(char[] number){
		int index = 0;
		//找到第一个非零元素
		while(index < number.length){
			if(number[index] != '0')
				break;
			index++;
		}
		while(index < number.length)
			System.out.print(number[index++]);
		System.out.println();
	}
	private boolean eq(char[] a, char[] b){
		for(int i = 0; i < a.length; i++){
			if(a[i] != b[i])
				return false;
		}
		return true;
	}
}
