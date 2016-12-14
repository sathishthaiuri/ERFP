package com.dnb.app.util;

import java.text.DecimalFormat;

public class ERFUtility {
	private static DecimalFormat decimalFormat1_2 = new DecimalFormat("#.##");
	
	public static String returnContribution(Float paramValue, Float categoryValue, Integer contribRatio){
		String contributionVal = null;
		
		if(paramValue > 0){
			contributionVal = decimalFormat1_2.format((paramValue/categoryValue) * contribRatio).concat("%");
		}else{
			contributionVal = "-";
		}
		
		return contributionVal;
	}
}
