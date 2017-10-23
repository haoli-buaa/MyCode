package cn.edu.buaa.nlsde.haoli;

import java.util.Scanner;

public class Factorial {

	public static int getZeros(int n){
		long fac = factorial(n);
		int count = getTailZeros(n);
		fac /= Math.pow(10, count);
		while(fac != 0){
			if(fac % 10 == 0)
				count++;
			fac /= 10;
		}
		return count;
	}
	public static int getTailZeros(int n){
		//method:2和5因数个数的最小值
		//failed case: 7！=5040  expected：2 actual：1
		//当前方法仅能计算末尾0的个数
		int[] factor = new int[2];
		for(int i = 1; i <= n; i++){
			int x = i;
			while(x%5 == 0){
				factor[1]++;
				x /= 5;
			}
			//被2整除的数频比能被5整除的数高的多
			/*while((x&1) != 1){
				factor[0]++;
				x = x>>1;		
			}*/
		}
		return factor[0];
	}
	public static long factorial(int n){
		long res = 1L;
		for(int i = 1; i <= n; i++){
			res *= i;
		}
		return res;
	}
	public static int lastBinaryOne(int n){
		return numberofFactorInFactorial(2, n)+1;
	}
	public static int numberofFactorInFactorial(int factor, int factorialN){
		int count = 0;
		while(factorialN != 0){
			count += factorialN/factor;
			factorialN = factorialN/factor; 
		}
		return count;
	}
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(factorial(n));
			System.out.println(getZeros(n));
			System.out.println(Long.toBinaryString(factorial(n)));
			System.out.println(lastBinaryOne(n));
		}
		sc.close();
	}

}
