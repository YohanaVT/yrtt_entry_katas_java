package com.techreturners.exercise002;

import java.time.LocalDateTime;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

    public int past(int h, int m, int s) {
        // Your code here!
    	LocalDateTime locaDate = LocalDateTime.now();
		int hours  = locaDate.getHour();

		int totalh = 0;
    	int totalm = 0;
    	int totals = 0;
    	int result = 0;
    	
    	//You must uncomment the 'if' so that after midnight it returns in millisecond
    	//if((hours >= 00) && (hours <= 05)) {
    		totalh = h * 3600000;
        	totals = s * 1000;
        	totalm = m * 60000;
    	//}
    	
    	result = totalh + totals + totalm;
        return result;
    }
}