package com.dnb.app.data.manager;

import java.util.HashMap;
import java.util.Map;

import com.dnb.app.vo.ApplicationVO;

public class ApplicationFramework {

	private static Map<String, Integer> infraPerformanceMap;
	private static Map<String, Integer> infraObsoleteInfraMap;
	private static Map<String, Integer> infraAvlbtOfDREnvMap;
	private static Map<String, Integer> infraScalabilityIssuMap;
	private static Map<String, Integer> infraFrequencyInfraMap;
	private static Map<String, Integer> infraRiskValueRangeMap;
	private static Map<String, String> infraRiskCategoryMap;
	
	/** -------------------------------- */
	
	private static Map<String, Integer> peopleSMEAvlbtMap;
	private static Map<String, Integer> peopleVendorExpCTSMap;
	private static Map<String, Integer> peopleVendorExpEnsonoMap;
	private static Map<String, Integer> peopleAvlbtOfBizUsersMap;
	private static Map<String, Integer> peopleRiskValueRangeMap;
	private static Map<String, String> peopleRiskCategoryMap;
	
	/** -------------------------------- */
	
	private static Map<String, Integer> secVlnbtyCodeMap;
	private static Map<String, Integer> secVlnbtyInfraMap;
	private static Map<String, Integer> secCompVlnbltsMap;
	private static Map<String, Integer> secRiskValueRangeMap;
	private static Map<String, String> secRiskCategoryMap;
	
	public void init() {
		initializeInfraRiskScores();
		initializePeopleRiskScores();
		initializeSecurityRiskScores();
	}
	
	private void initializeInfraRiskScores() {
		
		infraPerformanceMap = new HashMap<String, Integer>();
		infraObsoleteInfraMap = new HashMap<String, Integer>();
		infraAvlbtOfDREnvMap = new HashMap<String, Integer>();
		infraScalabilityIssuMap = new HashMap<String, Integer>();
		infraFrequencyInfraMap = new HashMap<String, Integer>();
		infraRiskValueRangeMap = new HashMap<String, Integer>();
		infraRiskCategoryMap = new HashMap<String, String>();
		
		infraPerformanceMap.put("Above defined SLA ", 0);
		infraPerformanceMap.put("Met SLA", 5);
		infraPerformanceMap.put("Below SLA", 10);
		infraPerformanceMap.put("Weightage", 20);
		
		infraObsoleteInfraMap.put("Yes", 10);
		infraObsoleteInfraMap.put("Partial", 5);
		infraObsoleteInfraMap.put("No", 0);
		infraObsoleteInfraMap.put("Weightage", 20);
		
		infraAvlbtOfDREnvMap.put("Yes", 0);
		infraAvlbtOfDREnvMap.put("Partial", 5);
		infraAvlbtOfDREnvMap.put("No", 10);
		infraAvlbtOfDREnvMap.put("Weightage", 20);		

		infraScalabilityIssuMap.put("Yes", 10);
		infraScalabilityIssuMap.put("Partial", 5);
		infraScalabilityIssuMap.put("No", 0);
		infraScalabilityIssuMap.put("Weightage", 20);
		
		infraFrequencyInfraMap.put("> 5", 10);
		infraFrequencyInfraMap.put("> 2 and < 5", 5);
		infraFrequencyInfraMap.put("< 2", 0);
		infraFrequencyInfraMap.put("Weightage", 20);
		
		infraRiskValueRangeMap.put("Category-A-Min", 6);
		infraRiskValueRangeMap.put("Category-A-Max", 10);
		infraRiskValueRangeMap.put("Category-B-Min", 2);
		infraRiskValueRangeMap.put("Category-B-Max", 6);
		infraRiskValueRangeMap.put("Category-C-Min", 0);
		infraRiskValueRangeMap.put("Category-C-Max", 2);
		
		infraRiskCategoryMap.put("A", "RED");
		infraRiskCategoryMap.put("B", "YELLOW");
		infraRiskCategoryMap.put("C", "GREEN");
		
		System.out.println("initializeInfraRiskScores()...Done");
		
	}

	private void initializePeopleRiskScores() {
		
		peopleSMEAvlbtMap = new HashMap<String, Integer>();
		peopleVendorExpCTSMap = new HashMap<String, Integer>();
		peopleVendorExpEnsonoMap = new HashMap<String, Integer>();
		peopleAvlbtOfBizUsersMap = new HashMap<String, Integer>();
		peopleRiskValueRangeMap = new HashMap<String, Integer>();
		peopleRiskCategoryMap = new HashMap<String, String>();
		
		peopleSMEAvlbtMap.put("Yes > 1 SME", 0);
		peopleSMEAvlbtMap.put("Yes - 1 SME", 5);
		peopleSMEAvlbtMap.put("No", 10);
		peopleSMEAvlbtMap.put("Weightage", 25);
		
		peopleVendorExpCTSMap.put("Yes", 0);
		peopleVendorExpCTSMap.put("No", 10);
		peopleVendorExpCTSMap.put("Weightage", 25);
		
		peopleVendorExpEnsonoMap.put("Yes", 0);
		peopleVendorExpEnsonoMap.put("No", 10);
		peopleVendorExpEnsonoMap.put("Weightage", 25);		

		peopleAvlbtOfBizUsersMap.put("Yes", 0);
		peopleAvlbtOfBizUsersMap.put("No", 10);
		peopleAvlbtOfBizUsersMap.put("Weightage", 25);
		
		peopleRiskValueRangeMap.put("Category-A-Min", 8);
		peopleRiskValueRangeMap.put("Category-A-Max", 10);
		peopleRiskValueRangeMap.put("Category-B-Min", 5);
		peopleRiskValueRangeMap.put("Category-B-Max", 8);
		peopleRiskValueRangeMap.put("Category-C-Min", 2);
		peopleRiskValueRangeMap.put("Category-C-Max", 5);
		peopleRiskValueRangeMap.put("Category-D-Min", 0);
		peopleRiskValueRangeMap.put("Category-D-Max", 2);
		
		peopleRiskCategoryMap.put("A", "RED");
		peopleRiskCategoryMap.put("B", "YELLOW");
		peopleRiskCategoryMap.put("C", "YELLOW");
		peopleRiskCategoryMap.put("D", "GREEN");
		
		System.out.println("initializePeopleRiskScores()...Done");
		
	}

	private void initializeSecurityRiskScores() {
		
		secVlnbtyCodeMap = new HashMap<String, Integer>();
		secVlnbtyInfraMap = new HashMap<String, Integer>();
		secCompVlnbltsMap = new HashMap<String, Integer>();
		secRiskValueRangeMap = new HashMap<String, Integer>();
		secRiskCategoryMap = new HashMap<String, String>();
		
		secVlnbtyCodeMap.put("Yes - High Priority issues", 7);
		secVlnbtyCodeMap.put("Yes - Medium/Low Priority issues", 3);
		secVlnbtyCodeMap.put("No", 0);
		secVlnbtyCodeMap.put("Weightage", 35);
		
		secVlnbtyInfraMap.put("Yes - High Priority issues", 7);
		secVlnbtyInfraMap.put("Yes - Medium/Low Priority issues", 3);
		secVlnbtyInfraMap.put("No", 0);
		secVlnbtyInfraMap.put("Weightage", 35);
		
		secCompVlnbltsMap.put("Yes - High Priority issues", 6);
		secCompVlnbltsMap.put("Yes - Medium/Low Priority issues", 3);
		secCompVlnbltsMap.put("No", 0);
		secCompVlnbltsMap.put("Weightage", 30);		

		secRiskValueRangeMap.put("Category-A-Min", 4);
		secRiskValueRangeMap.put("Category-A-Max", 10);
		secRiskValueRangeMap.put("Category-B-Min", 2);
		secRiskValueRangeMap.put("Category-B-Max", 4);
		secRiskValueRangeMap.put("Category-C-Min", 0);
		secRiskValueRangeMap.put("Category-C-Max", 2);
		
		secRiskCategoryMap.put("A", "RED");
		secRiskCategoryMap.put("B", "YELLOW");
		secRiskCategoryMap.put("C", "GREEN");
		
		System.out.println("initializeSecurityRiskScores()...Done");
		
	}

	public static void infraScoreRecalculation(ApplicationVO applicationVO){
		
		float infraPerformanceVal;
		float infraObsoleteInfraVal;
		float infraAvlbtOfDREnvVal;
		float infraScalabilityIssuVal;
		float infraFrequencyInfraVal; 
		
		float infraRiskScore;
		String infraCategory = null;
		String infraRiskColor = null;
		
		String appPerfSlaText = applicationVO.getAppPerfSla();
		String scalabilityText = applicationVO.getScalability();
		String obsoleteInfraText = applicationVO.getObsoleteInfra();
		String drEnvAvlbtText = applicationVO.getDrEnvAvlbt();
		String nwInfraIssuePmText = applicationVO.getNwInfraIssuePm();
		
		infraPerformanceVal = infraPerformanceMap.get(appPerfSlaText);
		infraObsoleteInfraVal = infraObsoleteInfraMap.get(obsoleteInfraText);
		infraAvlbtOfDREnvVal = infraAvlbtOfDREnvMap.get(drEnvAvlbtText);
		infraScalabilityIssuVal = infraScalabilityIssuMap.get(scalabilityText);
		infraFrequencyInfraVal = infraFrequencyInfraMap.get(nwInfraIssuePmText);
		
		infraRiskScore = ((infraPerformanceVal * infraPerformanceMap.get("Weightage"))/100) + 
						 ((infraObsoleteInfraVal * infraObsoleteInfraMap.get("Weightage"))/100) + 
						 ((infraAvlbtOfDREnvVal * infraAvlbtOfDREnvMap.get("Weightage"))/100) + 
						 ((infraScalabilityIssuVal * infraScalabilityIssuMap.get("Weightage"))/100) +  
						 ((infraFrequencyInfraVal * infraFrequencyInfraMap.get("Weightage"))/100);
		
		if( infraRiskScore >= infraRiskValueRangeMap.get("Category-A-Min") && infraRiskScore < infraRiskValueRangeMap.get("Category-A-Max")){
			infraCategory = "A";
			infraRiskColor = infraRiskCategoryMap.get(infraCategory);
		}else if( infraRiskScore >= infraRiskValueRangeMap.get("Category-B-Min") && infraRiskScore < infraRiskValueRangeMap.get("Category-B-Max")){
			infraCategory = "B";
			infraRiskColor = infraRiskCategoryMap.get(infraCategory);
		}else if( infraRiskScore >= infraRiskValueRangeMap.get("Category-C-Min") && infraRiskScore < infraRiskValueRangeMap.get("Category-C-Max")){
			infraCategory = "C";
			infraRiskColor = infraRiskCategoryMap.get(infraCategory);
		}
		
		applicationVO.setAppInfraRiskScore(String.valueOf(infraRiskScore));
		applicationVO.setAppInfraRiskCategory(infraCategory);
		applicationVO.setAppInfraRiskColor(infraRiskColor);
		
	}

	public static void peopleScoreRecalculation(ApplicationVO applicationVO) {
		
		float peopleSMEAvlbtVal;
		float peopleVendorExpCTSVal;
		float peopleVendorExpEnsonoVal;
		float peopleAvlbtOfBizUsersVal;
		
		float peopleRiskScore = 0.0f;
		String peopleCategory = null;
		String peopleRiskColor = null;
		
		String peopleSMEAvlbtText = applicationVO.getSmeAvlbt();
		String peopleVendorExpCTSText = applicationVO.getVendorExptCts();
		String peopleVendorExpEnsonoText = applicationVO.getVendorExptEnsono();
		String peopleAvlbtOfBizUsersText = applicationVO.getAvlbtBizUsers();
		
		peopleSMEAvlbtVal = peopleSMEAvlbtMap.get(peopleSMEAvlbtText);
		peopleVendorExpCTSVal = peopleVendorExpCTSMap.get(peopleVendorExpEnsonoText);
		peopleVendorExpEnsonoVal = peopleVendorExpEnsonoMap.get(peopleAvlbtOfBizUsersText);
		peopleAvlbtOfBizUsersVal = peopleAvlbtOfBizUsersMap.get(peopleVendorExpCTSText);
		
		peopleRiskScore = ((peopleSMEAvlbtVal * peopleSMEAvlbtMap.get("Weightage"))/100) + 
						 ((peopleVendorExpCTSVal * peopleVendorExpCTSMap.get("Weightage"))/100) + 
						 ((peopleVendorExpEnsonoVal * peopleVendorExpEnsonoMap.get("Weightage"))/100) +  
						 ((peopleAvlbtOfBizUsersVal * peopleAvlbtOfBizUsersMap.get("Weightage"))/100);
		
		if( peopleRiskScore >= peopleRiskValueRangeMap.get("Category-A-Min") && peopleRiskScore < peopleRiskValueRangeMap.get("Category-A-Max")){
			peopleCategory = "A";
			peopleRiskColor = peopleRiskCategoryMap.get(peopleCategory);
		}else if( peopleRiskScore >= peopleRiskValueRangeMap.get("Category-B-Min") && peopleRiskScore < peopleRiskValueRangeMap.get("Category-B-Max")){
			peopleCategory = "B";
			peopleRiskColor = peopleRiskCategoryMap.get(peopleCategory);
		}else if( peopleRiskScore >= peopleRiskValueRangeMap.get("Category-C-Min") && peopleRiskScore < peopleRiskValueRangeMap.get("Category-C-Max")){
			peopleCategory = "C";
			peopleRiskColor = peopleRiskCategoryMap.get(peopleCategory);
		}else if( peopleRiskScore >= peopleRiskValueRangeMap.get("Category-D-Min") && peopleRiskScore < peopleRiskValueRangeMap.get("Category-D-Max")){
			peopleCategory = "D";
			peopleRiskColor = peopleRiskCategoryMap.get(peopleCategory);
		}
		
		applicationVO.setAppPeopleRiskScore(String.valueOf(peopleRiskScore));
		applicationVO.setAppPeopleRiskCategory(peopleCategory);
		applicationVO.setAppPeopleRiskColor(peopleRiskColor);
		
	}
	

	public static void securityScoreRecalculation(ApplicationVO applicationVO) {
		
		float secVlnbtyCodeVal;
		float secVlnbtyInfraVal;
		float secCompVlnbltsVal;
		
		float securityRiskScore = 0.0f;
		String securityCategory = null;
		String securityRiskColor = null;
		
		String secVlnbtyCodeText = applicationVO.getSecVlnbtyCode();
		String secVlnbtyInfraText = applicationVO.getSecVlnbtyInfra();
		String secCompVlnbltsText = applicationVO.getCompVlnblts();
		
		secVlnbtyCodeVal = secVlnbtyCodeMap.get(secVlnbtyCodeText);
		secVlnbtyInfraVal = secVlnbtyInfraMap.get(secVlnbtyInfraText);
		secCompVlnbltsVal = secCompVlnbltsMap.get(secCompVlnbltsText);
		
		securityRiskScore = ((secVlnbtyCodeVal * secVlnbtyCodeMap.get("Weightage"))/100) + 
						 ((secVlnbtyInfraVal * secVlnbtyInfraMap.get("Weightage"))/100) +  
						 ((secCompVlnbltsVal * secCompVlnbltsMap.get("Weightage"))/100);
		
		if( securityRiskScore >= secRiskValueRangeMap.get("Category-A-Min") && securityRiskScore < secRiskValueRangeMap.get("Category-A-Max")){
			securityCategory = "A";
			securityRiskColor = secRiskCategoryMap.get(securityCategory);
		}else if( securityRiskScore >= secRiskValueRangeMap.get("Category-B-Min") && securityRiskScore < secRiskValueRangeMap.get("Category-B-Max")){
			securityCategory = "B";
			securityRiskColor = secRiskCategoryMap.get(securityCategory);
		}else if( securityRiskScore >= secRiskValueRangeMap.get("Category-C-Min") && securityRiskScore < secRiskValueRangeMap.get("Category-C-Max")){
			securityCategory = "C";
			securityRiskColor = secRiskCategoryMap.get(securityCategory);
		}
		
		applicationVO.setAppSecurityRiskScore(String.valueOf(securityRiskScore));
		applicationVO.setAppSecurityRiskCategory(securityCategory);
		applicationVO.setAppSecurityRiskColor(securityRiskColor);
		
	}
	
	
}
