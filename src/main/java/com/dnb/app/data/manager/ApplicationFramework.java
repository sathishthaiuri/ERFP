package com.dnb.app.data.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContextAware;

import com.dnb.app.vo.ApplicationVO;

public class ApplicationFramework {

	private static int infraPerformanceWeightage = 20;
	private static int infraObsoleteInfraWeightage = 20;
	private static int infraAvlbtOfDREnvWeightage =20;
	private static int infraScalabilityIssuWeightage = 20;
	private static int infraFrequencyInfraWeightage = 20;
	
	public static Map<String, Integer> infraPerformanceMap;
	public static Map<String, Integer> infraObsoleteInfraMap;
	public static Map<String, Integer> infraAvlbtOfDREnvMap;
	public static Map<String, Integer> infraScalabilityIssuMap;
	public static Map<String, Integer> infraFrequencyInfraMap;
	public static Map<String, Integer> infraRiskValueRangeMap;
	public static Map<String, String> infraRiskCategoryMap;
	
	/** -------------------------------- */
	
	public static Map<String, Integer> peopleSMEAvlbtMap;
	public static Map<String, Integer> peopleVendorExpCTSMap;
	public static Map<String, Integer> peopleVendorExpEnsonoMap;
	public static Map<String, Integer> peopleAvlbtOfBizUsersMap;
	public static Map<String, Integer> peopleRiskValueRangeMap;
	public static Map<String, String> peopleRiskCategoryMap;
	
	/** -------------------------------- */
	
	public static Map<String, Integer> secVlnbtyCodeMap;
	public static Map<String, Integer> SecVlnbtyInfraMap;
	public static Map<String, Integer> compVlnbltsMap;
	public static Map<String, String> secRiskCategoryMap;
	public static Map<String, Integer> secRiskValueRangeMap;
	
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
		peopleVendorExpEnsonoMap.put("Weightage", 20);		

		peopleAvlbtOfBizUsersMap.put("Yes", 0);
		peopleAvlbtOfBizUsersMap.put("No", 10);
		peopleAvlbtOfBizUsersMap.put("Weightage", 20);
		
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
		SecVlnbtyInfraMap = new HashMap<String, Integer>();
		compVlnbltsMap = new HashMap<String, Integer>();
		secRiskValueRangeMap = new HashMap<String, Integer>();
		secRiskCategoryMap = new HashMap<String, String>();
		
		secVlnbtyCodeMap.put("Yes - High Priority issues", 7);
		secVlnbtyCodeMap.put("Yes - Medium/Low Priority issues", 3);
		secVlnbtyCodeMap.put("No", 0);
		secVlnbtyCodeMap.put("Weightage", 35);
		
		SecVlnbtyInfraMap.put("Yes - High Priority issues", 7);
		SecVlnbtyInfraMap.put("Yes - Medium/Low Priority issues", 3);
		SecVlnbtyInfraMap.put("No", 0);
		SecVlnbtyInfraMap.put("Weightage", 35);
		
		compVlnbltsMap.put("Yes - High Priority issues", 6);
		compVlnbltsMap.put("Yes - Medium/Low Priority issues", 3);
		compVlnbltsMap.put("No", 0);
		compVlnbltsMap.put("Weightage", 30);		

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
		
		int infraPerformanceVal;
		int infraObsoleteInfraVal;
		int infraAvlbtOfDREnvVal;
		int infraScalabilityIssuVal;
		int infraFrequencyInfraVal; 
		
		float infraRiskScore = 0.0f;
		String infraCategory = null;
		String infraRiskColor = null;
		
		String appPerfSlaVal = applicationVO.getAppPerfSla();
		String scalabilityVal = applicationVO.getScalability();
		String obsoleteInfraVal = applicationVO.getObsoleteInfra();
		String drEnvAvlbtVal = applicationVO.getDrEnvAvlbt();
		String nwInfraIssuePmVal = applicationVO.getNwInfraIssuePm();
		
		infraPerformanceVal = infraPerformanceMap.get(appPerfSlaVal);
		infraObsoleteInfraVal = infraObsoleteInfraMap.get(obsoleteInfraVal);
		infraAvlbtOfDREnvVal = infraAvlbtOfDREnvMap.get(drEnvAvlbtVal);
		infraScalabilityIssuVal = infraScalabilityIssuMap.get(scalabilityVal);
		infraFrequencyInfraVal = infraFrequencyInfraMap.get(nwInfraIssuePmVal);
		
		infraRiskScore = ((infraPerformanceVal * infraPerformanceMap.get("Weightage"))/100) + 
						 ((infraObsoleteInfraVal * infraObsoleteInfraWeightage)/100) + 
						 ((infraAvlbtOfDREnvVal * infraAvlbtOfDREnvWeightage)/100) +
						 ((infraScalabilityIssuVal * infraScalabilityIssuWeightage)/100) + 
						 ((infraFrequencyInfraVal * infraFrequencyInfraWeightage)/100);
		
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
	
	
}
