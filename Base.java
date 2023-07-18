package Decimal_to_Any_Base;

import java.util.Scanner;

public class Base{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		System.out.println("Enter the base");
		int base = scanner.nextInt();
		scanner.close();
		System.out.print(decimaltobase(number,base));
	}
	public static String decimaltobase(int number,int base) {
		if (number == 0) {
            return "0";
        } else {
            String result = "";
            while (number > 0) {
                // char digit=Character.forDigit((number%base),16);//converting to hexadecimal
                int temp = number % base;
                result += temp + "";
                number /= base;
            }
            StringBuilder sb = new StringBuilder(result);
            sb.reverse();
            return sb.toString();
        }
	}
	}
