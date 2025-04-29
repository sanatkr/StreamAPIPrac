package prac.String;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tester {

	public static void main(String[] args) {

		String input = "Java 8 Stream Example!";
		
		IntStream chars = input.chars();
		
		List<Character> collect = input.chars()
			 .mapToObj(i -> (char)i)
			 .collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		List<Character> collect2 = input.chars()
		 .mapToObj(i -> Character.valueOf((char)i))
		 .collect(Collectors.toList());
		
		System.out.println(collect2);
		
		System.out.println("Count vowels and consonants in a string using Java 8\r\n");
		
		List<Character> collect3 = input.chars()
		 .mapToObj(i -> (char)i)
		 .filter(ch -> Character.isLetter(ch))
		 .filter(ch -> "AEIOUaeiou".indexOf(ch)!=-1)
		 .collect(Collectors.toList());
		
		System.out.println("List of even characters --> "+collect3);
		
		List<Character> collect4 = input.chars()
		 .mapToObj(i -> (char)i)
		 .filter(ch -> Character.isLetter(ch))
		 .filter(ch -> "AEIOUaeiou".indexOf(ch)==-1)
		 .collect(Collectors.toList());
		
		System.out.println("List of odd characters --> "+collect4);
		
		
		
		Map<Character, Long> collect5 = input.chars()
		 .mapToObj(i -> (char)i)
		 .filter(ch -> Character.isLetter(ch))
		 .filter(ch -> "AEIOUaeiou".indexOf(ch)!=-1)
		 .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
		
		System.out.println("Map of even characters --> "+collect5);
		
		
		Map<Character, Long> collect6 = input.chars()
		 .mapToObj(i -> (char)i)
		 .filter(ch -> Character.isLetter(ch))
		 .map(ch -> Character.toLowerCase(ch))
		 .filter(ch -> "AEIOUaeiou".indexOf(ch)!=-1)
		 .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));

		System.out.println("Map of even characters --> "+collect6);
		
		
		
		
		System.out.println("Find the first non-repeating character in a string using Java 8");
		
		
		Optional<Character> first = input.chars()
			 .mapToObj(i -> (char)i)
			 .filter(Character::isLetter)
			 .filter(ch -> input.indexOf(ch)==input.lastIndexOf(ch))
			 .findFirst();
		
		System.out.println("First Non repeating character --> "+first.get());
		
		Optional<Character> first2 = IntStream.range(0,input.length())
			 .mapToObj(i -> input.charAt(input.length()-i-1))
			 .filter(ch -> Character.isLetter(ch))
			 .filter(ch -> input.indexOf(ch)==input.lastIndexOf(ch))
			 .findFirst();
		
		
		System.out.println("Last Non repeating character --> "+first2.get());
		
		
		Optional<Character> first3 = input.chars()
		 .mapToObj(i -> (char)i)
		 .filter(Character::isLetter)
		 .filter(ch -> input.indexOf(ch)!=input.lastIndexOf(ch))
		 .findFirst();
		
		System.out.println("First repeating character --> "+first3.get());





		

		
		
		
		
		
		
	}

}
