package cn.edu.buaa.haoli.chapter3;

import java.util.Scanner;

public class Fibonacci {

	public static long getFibo(int n){
		if(n <= 0)
			throw new IllegalArgumentException("n should be an positive integer");
		int[] init = {1,1,1,0};
		int[] matrix = matrixPower(init, n-1);
		return matrix[0];
	}
	
	public static int[] matrixPower(int[] m, int n){
		int[] res = {1, 0, 0, 1};
		int[] base = new int[4];
		for(int i = 0; i < 4; i++){
			base[i] = m[i];
		}
		while(n > 0){
			if((n & 1) != 0){					
				matrixMultiply(res,res,base);
			}
			squareMatrix(base);
			n >>= 1;
		}
		return res;
		
	}
	
	public static void matrixMultiply(int[] c, int[] a, int[] b){
		int[] aux = new int[4];
		aux[0] = a[0]*b[0] + a[1]*b[2];
		aux[1] = a[0]*b[1] + a[1]*b[3];
		aux[2] = a[2]*b[0] + a[3]*b[2];
		aux[3] = a[2]*b[1] + a[3]*b[3];		
		for(int i = 0; i < 4; i++){
			c[i] = aux[i];
		}
	}
	
	public static void squareMatrix(int[] a){
		int[] aux = new int[4];
		for(int i = 0; i < 4; i++){
			aux[i] = a[i];
		}
		a[0] = aux[0]*aux[0] + aux[1]*aux[2];
		a[1] = aux[0]*aux[1] + aux[1]*aux[3];
		a[2] = aux[2]*aux[0] + aux[3]*aux[2];
		a[3] = aux[2]*aux[1] + aux[3]*aux[3];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(getFibo(n));
		}
	}

}
