package coding_challenge_30_days;

import java.util.Scanner;

public class day1 {

	public static void main(String[] args) {
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
                int num1;
                double num2;
                String str;
                num1=scan.nextInt();
                num2=scan.nextDouble();
                str=scan.nextLine();
                str+=scan.nextLine();
                System.out.println(num1+i);
                System.out.println(num2+d);
                System.out.print(s+str);
        scan.close();
	}

}
