package code1712;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class UniqueWords {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in); // create scanner
	      System.out.println("Enter a string of words:"); // prompt for user input
	      String input = scanner.nextLine().toLowerCase();
	      
	      // tokenize the input
	      String[] tokens = input.split(" ");
	      
	      List<String> list = new ArrayList<>(Arrays.asList(tokens));
	      
	      System.out.println(list);
	      
	      list.stream()
	      	.distinct()
	      	.sorted()
	      	.forEach(System.out::println);

	}

}
