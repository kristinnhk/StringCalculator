package tdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;



//test 1. complete

//test 2. didn't have to change anything

//test 3 my method doesn't specifically read delimiters but plucks the numbers
//out of a string, it works on all test cases and i hope it's fine
//although it doesn't use delimiters like i said.

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
			System.out.println(m.group()); //just for my own purpose while programming
		}
		System.out.println(result);
		return 0;
	}
}
