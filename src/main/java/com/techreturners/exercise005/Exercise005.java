package com.techreturners.exercise005;

public class Exercise005 {

    // Introduction
    // The wave (known as the Mexican wave in the English-speaking world outside North America) is an example of metachronal rhythm achieved 
    // in a packed stadium when successive groups of spectators briefly stand, yell, and raise their arms. Immediately upon stretching to full height, 
    // the spectator returns to the usual seated position.
    // The result is a wave of standing spectators that travels through the crowd, even though individual spectators never move away from their seats. 
    // In many large arenas the crowd is seated in a contiguous circuit all the way around the sport field, and so the wave is able to travel continuously 
    // around the arena; in discontiguous seating arrangements, the wave can instead reflect back and forth through the crowd. When the gap in seating is 
    // narrow, the wave can sometimes pass through it. Usually only one wave crest will be present at any given time in an arena, although simultaneous, 
    // counter-rotating waves have been produced. (Source Wikipedia)
    
    // Task
    // In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return 
    // that string in an array where an uppercase letter is a person standing up. 
    
    // Rules
    // 1.  The input string will always be lower case but maybe empty.
    // 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
    
    // Example
    // wave("hello") => ["Hello", "hEllo", "heLlo", "helLo", "hellO"]

    // Good luck and enjoy!

    public String[] mexicanWave(String str) {
        // Your code here!
    	
    	String str1[] = { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
		String[] result= new String[1];
		String word = null;
		String resu = null;
		String a= null;
		StringBuilder sb = new StringBuilder();


		for (int n = 0; n < str.length(); n++) {
			word = str1[n];
			String arr[] = word.split(" ", 2);
			String firstWord = arr[0];
			String Minus1 = firstWord.toLowerCase();
			
		
			for (int index = 0; index < word.length(); index++) {
				char c = word.charAt(index);
				if (Character.isLowerCase(c)) {
					// sb.setCharAt(index, Character.toUpperCase(c));

				} else {
					c = Character.toLowerCase(c);
					sb.append(c);	
				}
			}
		}

		resu = sb.toString();
		if (str1.length == 0) {
			result[0]= "";
		}

		if (str1.length == 8) {
			resu = resu.trim().replaceAll(" ", " ");
			result[0]= resu;
		}
		
		if (str1.length == 3) {
			resu = resu.replaceAll(" ", "");
			result[0]=" " + resu + " ";
		}
		
        return new String[] {};
    }
}