package tdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;



//test 1. complete

//test 2. didn't have to change anything


public class StringCalculator {
	public static void main(String args[]){
		StringCalculator calc = new StringCalculator();
		
		In in = new In();
		String numbers = in.readLine();
		calc.Add(numbers);
	}
	
	public int Add(String numbers){
		if(numbers.isEmpty()) return 0;
		int result = 0;
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(numbers);
		while (m.find()) {
			result += Integer.parseInt(m.group());
			System.out.println(m.group());
		}
		System.out.println(result);
		return 0;
	}
}
