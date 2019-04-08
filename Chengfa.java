package ljk;
/**
 * 输入数字.阶乘   （xiugai）
 */

import java.util.Scanner;

public class Chengfa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
        for (int i = 1; i <= height; i++) {
	        for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
	        System.out.println();
      }
	}

}
