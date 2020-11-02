package com.techreturners.exercise004;

public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        // Add your code here
    	StringBuilder cadena = new StringBuilder();
		String[] arrOfStr1 = str.split(" ");
		String extraFirst="";
		String change="";
		String extraLast="";
		String newValue = "";
		String result="";
		String world="";

		for (int n = 0; n < arrOfStr1.length; n++) {
			world = arrOfStr1[n];
			extraFirst = world.substring(0, 1);
			change = world.replace(extraFirst, "");
			extraLast = world.substring(world.length() - 1);
			char letter = extraLast.charAt(0);
			
			if (letter == ('!')) {
				extraLast = change.substring(change.length() - 1);
				String newReplace = change.replace(extraLast, "");
				newValue = newReplace + extraFirst + "ay!";
			} else {
				newValue = change + extraFirst + "ay";
			}

			arrOfStr1[n] = newValue;
		}
		
		for (int x=0;x<arrOfStr1.length;x++){
			   cadena =cadena.append(arrOfStr1[x] + " ");
		}
		
		result =cadena.toString().trim();
        return result;
    }
}
