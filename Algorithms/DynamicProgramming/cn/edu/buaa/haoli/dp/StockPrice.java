package cn.edu.buaa.haoli.dp;
import java.util.Scanner;

public class StockPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int p = 1;
			int nextfall = 3;
			int gap = 3;
			for(int i = 2; i <= n; i++){
				if(i == nextfall){
					p = p - 1;
					nextfall += gap;
					gap++;
				}
				else{
					p = p+1;
				}
			}
			System.out.println(p);
		}
		sc.close();
	}
}
