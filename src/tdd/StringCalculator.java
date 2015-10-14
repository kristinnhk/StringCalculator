package tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;



//test 1. complete
//realtest 2 didn't have to change anything either
//test 2. didn't have to change anything(was actually test nr 3 )

//test 4 my method doesn't specifically read delimiters but plucks the numbers
//out of a string, it works on all test cases and i hope it's fine
//although it doesn't use delimiters like i said. (
//test 5 added a try catch block and an array to store all the negatives in the text
//test 6 simple, only add number if it is less than 1000

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
		List<Integer> negative = new ArrayList<Integer>();
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(numbers);
		try {
			while (m.find()) {
				int temp = Integer.parseInt(m.group());
				if(temp > 0){
					if(temp < 1000) result += temp;
					//System.out.println(m.group()); //just for my own purpose while programming
				}
				else{
					negative.add(temp);
				}
			
			}
			if(negative.size() > 0) throw new Exception();
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.print("\"Negatives not allowed: ");
			for(int i = 0; i < negative.size(); i++){
				
				System.out.print(negative.get(0));
				if(i+1 == negative.size()) System.out.println("\"");
				else System.out.print(",");
			}
			
		}
		
		return 0;
	}
}
