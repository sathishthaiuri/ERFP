package com.dnb.app.data.manager;

import java.util.HashMap;
import java.util.Map;

import com.dnb.app.vo.ApplicationVO;

public class ApplicationFramework {

	private static Map<String, Float> appMaintRiskValueRangeMap;
	private static Map<String, String> appMaintRiskCategoryMap;
	
	/** -------------------------------- */
	
	private static Map<String, Float> stabilityNoTktsVlmMap;
	private static Map<String, Float> stabilityNoSev1Sev2Map;
	private static Map<String, Float> stabilityNoSrtCountMap;
	private static Map<String, Float> stabilityNoReleaseUbrMap;
	private static Map<String, Float> stabilityNoTktRslvVendorMap;
	private static Map<String, Float> stabilityManualIntervensionMap;
	
	/** -------------------------------- */

	private static Map<String, Float> complexityNoInterfacAppMap;
	private static Map<String, Float> complexityDataVolumeDayMap;
	private static Map<String, Float> complexityTechSuprtAvlbtMap;
	private static Map<String, Float> complexityCodeAvlbtMap;
	private static Map<String, Float> complexityIncreaDataVlmYrMap;
	private static Map<String, Float> complexityRegComplianceMap;
	
	/** -------------------------------- */

	private static Map<String, Float> impactRevImpactMap;
	private static Map<String, Float> impactImpatcToCustomerMap;
	private static Map<String, Float> impactRecoveryDurationMap;
	
	/** -------------------------------- */
	
	private static Map<String, Float> infraPerformanceMap;
	private static Map<String, Float> infraObsoleteInfraMap;
	private static Map<String, Float> infraAvlbtOfDREnvMap;
	private static Map<String, Float> infraScalabilityIssuMap;
	private static Map<String, Float> infraFrequencyInfraMap;
	private static Map<String, Float> infraRiskValueRangeMap;
	private static Map<String, String> infraRiskCategoryMap;
	
	/** -------------------------------- */
	
	private static Map<String, Float> peopleSMEAvlbtMap;
	private static Map<String, Float> peopleVendorExpCTSMap;
	private static Map<String, Float> peopleVendorExpEnsonoMap;
	private static Map<String, Float> peopleAvlbtOfBizUsersMap;
	private static Map<String, Float> peopleRiskValueRangeMap;
	private static Map<String, String> peopleRiskCategoryMap;
	
	/** -------------------------------- */
	
	private static Map<String, Float> secVlnbtyCodeMap;
	private static Map<String, Float> secVlnbtyInfraMap;
	private static Map<String, Float> secCompVlnbltsMap;
	private static Map<String, Float> secRiskValueRangeMap;
	private static Map<String, String> secRiskCategoryMap;
	
	public void init() {
		initializeAppMaintRiskScores();
		
		initializeScalabilityRiskScores();
		initializeComplexityRiskScores();
		initializeImpactRiskScores();
		
		initializeInfraRiskScores();
		initializePeopleRiskScores();
		initializeSecurityRiskScores();
	}
	
	private void initializeAppMaintRiskScores(){
		
		appMaintRiskValueRangeMap = new HashMap<String, Float>();
		appMaintRiskCategoryMap = new HashMap<String, String>();
		
		appMaintRiskValueRangeMap.put("Category-A-Min", 5.0f);
		appMaintRiskValueRangeMap.put("Category-A-Max", 10.0f);
		appMaintRiskValueRangeMap.put("Category-B-Min", 4.0f);
		appMaintRiskValueRangeMap.put("Category-B-Max", 5.0f);
		appMaintRiskValueRangeMap.put("Category-C-Min", 3.0f);
		appMaintRiskValueRangeMap.put("Category-C-Max", 4.0f);
		appMaintRiskValueRangeMap.put("Category-D-Min", 0.0f);
		appMaintRiskValueRangeMap.put("Category-D-Max", 3.0f);
		
		appMaintRiskCategoryMap.put("A", "RED");
		appMaintRiskCategoryMap.put("B", "YELLOW");
		appMaintRiskCategoryMap.put("C", "YELLOW");
		appMaintRiskCategoryMap.put("D", "GREEN");
		
		System.out.println("initializeAppMaintRiskScores()...Done");
	}
	
	private void initializeScalabilityRiskScores() {
		
		stabilityNoTktsVlmMap = new HashMap<String, Float>();
		stabilityNoSev1Sev2Map = new HashMap<String, Float>();
		stabilityNoSrtCountMap = new HashMap<String, Float>();
		stabilityNoReleaseUbrMap = new HashMap<String, Float>();
		stabilityNoTktRslvVendorMap = new HashMap<String, Float>();
		stabilityManualIntervensionMap = new HashMap<String, Float>();
		
		stabilityNoTktsVlmMap.put("Range-One-Min", 0.0f);
		stabilityNoTktsVlmMap.put("Range-One-Max", 0.0f);
		stabilityNoTktsVlmMap.put("Range-One-Score", 0.0f);
		stabilityNoTktsVlmMap.put("Range-Two-Min", 1.0f);
		stabilityNoTktsVlmMap.put("Range-Two-Max", 50.0f);
		stabilityNoTktsVlmMap.put("Range-Two-Score", 2.0f);
		stabilityNoTktsVlmMap.put("Range-Three-Min", 51.0f);
		stabilityNoTktsVlmMap.put("Range-Three-Max", 100.0f);
		stabilityNoTktsVlmMap.put("Range-Three-Score", 4.0f);
		stabilityNoTktsVlmMap.put("Range-Four-Min", 101.0f);
		stabilityNoTktsVlmMap.put("Range-Four-Max", 500.0f);
		stabilityNoTktsVlmMap.put("Range-Four-Score", 6.0f);
		stabilityNoTktsVlmMap.put("Range-Five-Min", 501.0f);
		stabilityNoTktsVlmMap.put("Range-Five-Max", 1500.0f);
		stabilityNoTktsVlmMap.put("Range-Five-Score", 8.0f);
		stabilityNoTktsVlmMap.put("Range-Six-Min", 1501.0f);
		stabilityNoTktsVlmMap.put("Range-Six-Max", 8000.0f);
		stabilityNoTktsVlmMap.put("Range-Six-Score", 10.0f);
		stabilityNoTktsVlmMap.put("Weightage", 7.0f);
		
		stabilityNoSev1Sev2Map.put("Range-One-Min", 0.0f);
		stabilityNoSev1Sev2Map.put("Range-One-Max", 0.0f);
		stabilityNoSev1Sev2Map.put("Range-One-Score", 0.0f);
		stabilityNoSev1Sev2Map.put("Range-Two-Min", 1.0f);
		stabilityNoSev1Sev2Map.put("Range-Two-Max", 10.0f);
		stabilityNoSev1Sev2Map.put("Range-Two-Score", 5.0f);
		stabilityNoSev1Sev2Map.put("Range-Three-Min", 11.0f);
		stabilityNoSev1Sev2Map.put("Range-Three-Max", 100.0f);
		stabilityNoSev1Sev2Map.put("Range-Three-Score", 10.0f);
		stabilityNoSev1Sev2Map.put("Weightage", 7.0f);
		
		stabilityNoSrtCountMap.put("Range-One-Min", 0.0f);
		stabilityNoSrtCountMap.put("Range-One-Max", 0.0f);
		stabilityNoSrtCountMap.put("Range-One-Score", 0.0f);
		stabilityNoSrtCountMap.put("Range-Two-Min", 1.0f);
		stabilityNoSrtCountMap.put("Range-Two-Max", 15.0f);
		stabilityNoSrtCountMap.put("Range-Two-Score", 5.0f);
		stabilityNoSrtCountMap.put("Range-Three-Min", 16.0f);
		stabilityNoSrtCountMap.put("Range-Three-Max", 100.0f);
		stabilityNoSrtCountMap.put("Range-Three-Score", 10.0f);
		stabilityNoSrtCountMap.put("Weightage", 7.0f);	
		
		stabilityNoReleaseUbrMap.put("Range-One-Min", 0.0f);
		stabilityNoReleaseUbrMap.put("Range-One-Max", 0.0f);
		stabilityNoReleaseUbrMap.put("Range-One-Score", 0.0f);
		stabilityNoReleaseUbrMap.put("Range-Two-Min", 1.0f);
		stabilityNoReleaseUbrMap.put("Range-Two-Max", 30.0f);
		stabilityNoReleaseUbrMap.put("Range-Two-Score", 5.0f);
		stabilityNoReleaseUbrMap.put("Range-Three-Min", 31.0f);
		stabilityNoReleaseUbrMap.put("Range-Three-Max", 60.0f);
		stabilityNoReleaseUbrMap.put("Range-Three-Score", 10.0f);
		stabilityNoReleaseUbrMap.put("Weightage", 7.0f);	

		stabilityManualIntervensionMap.put("Low < 2 Hours/Day", 0.0f);
		stabilityManualIntervensionMap.put("Medium <4 Hours/Day", 5.0f);
		stabilityManualIntervensionMap.put("High >4 Hours/Day", 10.0f);
		stabilityManualIntervensionMap.put("Weightage", 7.0f);

		stabilityNoTktRslvVendorMap.put("Low < 2 Tickets/Year", 0.0f);
		stabilityNoTktRslvVendorMap.put("Medium >2 & < 8 Tickets/Year", 5.0f);
		stabilityNoTktRslvVendorMap.put("High > 8 Tickets/Year", 10.0f);
		stabilityNoTktRslvVendorMap.put("Weightage", 5.0f);

		
		
		System.out.println("initializeScalabilityRiskScores()...Done");
		
	}

	private void initializeComplexityRiskScores() {
		
		complexityNoInterfacAppMap = new HashMap<String, Float>();
		complexityDataVolumeDayMap = new HashMap<String, Float>();
		complexityTechSuprtAvlbtMap = new HashMap<String, Float>();
		complexityCodeAvlbtMap = new HashMap<String, Float>();
		complexityIncreaDataVlmYrMap = new HashMap<String, Float>();
		complexityRegComplianceMap = new HashMap<String, Float>();
		
		complexityNoInterfacAppMap.put("Range-A-Min", 0.0f);
		complexityNoInterfacAppMap.put("Range-A-Max", 0.0f);
		complexityNoInterfacAppMap.put("Range-B-Min", 1.0f);
		complexityNoInterfacAppMap.put("Range-B-Max", 8.0f);
		complexityNoInterfacAppMap.put("Range-C-Min", 9.0f);
		complexityNoInterfacAppMap.put("Range-C-Max", 50.0f);
		complexityNoInterfacAppMap.put("Weightage", 5.0f);
		
		complexityDataVolumeDayMap.put("Low < 50K Txns", 1.0f);
		complexityDataVolumeDayMap.put("Medium > 50K Txns to 1 Mn Txns", 5.0f);
		complexityDataVolumeDayMap.put("High >1M Txns", 10.0f);
		complexityDataVolumeDayMap.put("Weightage", 2.5f);
		
		complexityTechSuprtAvlbtMap.put("Web & Support Available", 3.0f);
		complexityTechSuprtAvlbtMap.put("Web & Support Unavailable", 6.0f);
		complexityTechSuprtAvlbtMap.put("Legacy & Support Available", 4.0f);
		complexityTechSuprtAvlbtMap.put("Legacy & Support Unavailable", 8.0f);
		complexityTechSuprtAvlbtMap.put("Niche & Support Available", 5.0f);
		complexityTechSuprtAvlbtMap.put("Niche & Support Unavailable", 10.0f);
		complexityTechSuprtAvlbtMap.put("Weightage", 5.0f);		
		
		complexityCodeAvlbtMap.put("Yes", 0.0f);
		complexityCodeAvlbtMap.put("Partial", 6.0f);
		complexityCodeAvlbtMap.put("No", 10.0f);
		complexityCodeAvlbtMap.put("Weightage", 10.0f);

		complexityIncreaDataVlmYrMap.put("Yes", 10.0f);
		complexityIncreaDataVlmYrMap.put("No", 0.0f);
		complexityIncreaDataVlmYrMap.put("Weightage", 10.0f);
		
		complexityRegComplianceMap.put("Low < 3%", 0.0f);
		complexityRegComplianceMap.put("Medium 3% to 8%", 5.0f);
		complexityRegComplianceMap.put("High  > 8%", 10.0f);
		complexityRegComplianceMap.put("Weightage", 2.5f);
		
		System.out.println("initializeComplexityRiskScores()...Done");
		
	}
	
	private void initializeImpactRiskScores() {
		
		impactRevImpactMap = new HashMap<String, Float>();
		impactImpatcToCustomerMap = new HashMap<String, Float>();
		impactRecoveryDurationMap = new HashMap<String, Float>();
		
		impactRevImpactMap.put("Direct & Immediate Revenue Impact", 10.0f);
		impactRevImpactMap.put("Direct but not immediate Revenue Impact", 7.0f);
		impactRevImpactMap.put("Indirect Revenue Impact", 4.0f);
		impactRevImpactMap.put("No Revenue Impact", 0.0f);
		impactRevImpactMap.put("Weightage", 9.0f);
		
		impactImpatcToCustomerMap.put("High > 50 Users", 10.0f);
		impactImpatcToCustomerMap.put("Medium - 10 to 50 users", 6.0f);
		impactImpatcToCustomerMap.put("Low < 10 users", 0.0f);
		impactImpatcToCustomerMap.put("Weightage", 8.0f);
		
		impactRecoveryDurationMap.put("< 4 Hours", 0.0f);
		impactRecoveryDurationMap.put("4 to 12 Hours", 4.0f);
		impactRecoveryDurationMap.put("12 Hours to 1 Day", 6.0f);
		impactRecoveryDurationMap.put("> 1 Day", 10.0f);
		impactRecoveryDurationMap.put("Weightage", 8.0f);		

		System.out.println("initializeImpactRiskScores()...Done");
		
	}
	
	private void initializeInfraRiskScores() {
		
		infraPerformanceMap = new HashMap<String, Float>();
		infraObsoleteInfraMap = new HashMap<String, Float>();
		infraAvlbtOfDREnvMap = new HashMap<String, Float>();
		infraScalabilityIssuMap = new HashMap<String, Float>();
		infraFrequencyInfraMap = new HashMap<String, Float>();
		infraRiskValueRangeMap = new HashMap<String, Float>();
		infraRiskCategoryMap = new HashMap<String, String>();
		
		infraPerformanceMap.put("Above defined SLA ", 0.0f);
		infraPerformanceMap.put("Met SLA", 5.0f);
		infraPerformanceMap.put("Below SLA", 10.0f);
		infraPerformanceMap.put("Weightage", 20.0f);
		
		infraObsoleteInfraMap.put("Yes", 10.0f);
		infraObsoleteInfraMap.put("Partial", 5.0f);
		infraObsoleteInfraMap.put("No", 0.0f);
		infraObsoleteInfraMap.put("Weightage", 20.0f);
		
		infraAvlbtOfDREnvMap.put("Yes", 0.0f);
		infraAvlbtOfDREnvMap.put("Partial", 5.0f);
		infraAvlbtOfDREnvMap.put("No", 10.0f);
		infraAvlbtOfDREnvMap.put("Weightage", 20.0f);		

		infraScalabilityIssuMap.put("Yes", 10.0f);
		infraScalabilityIssuMap.put("Partial", 5.0f);
		infraScalabilityIssuMap.put("No", 0.0f);
		infraScalabilityIssuMap.put("Weightage", 20.0f);
		
		infraFrequencyInfraMap.put("> 5", 10.0f);
		infraFrequencyInfraMap.put("> 2 and < 5", 5.0f);
		infraFrequencyInfraMap.put("< 2", 0.0f);
		infraFrequencyInfraMap.put("Weightage", 20.0f);
		
		infraRiskValueRangeMap.put("Category-A-Min", 6.0f);
		infraRiskValueRangeMap.put("Category-A-Max", 10.0f);
		infraRiskValueRangeMap.put("Category-B-Min", 2.0f);
		infraRiskValueRangeMap.put("Category-B-Max", 6.0f);
		infraRiskValueRangeMap.put("Category-C-Min", 0.0f);
		infraRiskValueRangeMap.put("Category-C-Max", 2.0f);
		
		infraRiskCategoryMap.put("A", "RED");
		infraRiskCategoryMap.put("B", "YELLOW");
		infraRiskCategoryMap.put("C", "GREEN");
		
		System.out.println("initializeInfraRiskScores()...Done");
		
	}

	private void initializePeopleRiskScores() {
		
		peopleSMEAvlbtMap = new HashMap<String, Float>();
		peopleVendorExpCTSMap = new HashMap<String, Float>();
		peopleVendorExpEnsonoMap = new HashMap<String, Float>();
		peopleAvlbtOfBizUsersMap = new HashMap<String, Float>();
		peopleRiskValueRangeMap = new HashMap<String, Float>();
		peopleRiskCategoryMap = new HashMap<String, String>();
		
		peopleSMEAvlbtMap.put("Yes > 1 SME", 0.0f);
		peopleSMEAvlbtMap.put("Yes - 1 SME", 5.0f);
		peopleSMEAvlbtMap.put("No", 10.0f);
		peopleSMEAvlbtMap.put("Weightage", 25.0f);
		
		peopleVendorExpCTSMap.put("Yes", 0.0f);
		peopleVendorExpCTSMap.put("No", 10.0f);
		peopleVendorExpCTSMap.put("Weightage", 25.0f);
		
		peopleVendorExpEnsonoMap.put("Yes", 0.0f);
		peopleVendorExpEnsonoMap.put("No", 10.0f);
		peopleVendorExpEnsonoMap.put("Weightage", 25.0f);		

		peopleAvlbtOfBizUsersMap.put("Yes", 0.0f);
		peopleAvlbtOfBizUsersMap.put("No", 10.0f);
		peopleAvlbtOfBizUsersMap.put("Weightage", 25.0f);
		
		peopleRiskValueRangeMap.put("Category-A-Min", 8.0f);
		peopleRiskValueRangeMap.put("Category-A-Max", 10.0f);
		peopleRiskValueRangeMap.put("Category-B-Min", 5.0f);
		peopleRiskValueRangeMap.put("Category-B-Max", 8.0f);
		peopleRiskValueRangeMap.put("Category-C-Min", 2.0f);
		peopleRiskValueRangeMap.put("Category-C-Max", 5.0f);
		peopleRiskValueRangeMap.put("Category-D-Min", 0.0f);
		peopleRiskValueRangeMap.put("Category-D-Max", 2.0f);
		
		peopleRiskCategoryMap.put("A", "RED");
		peopleRiskCategoryMap.put("B", "YELLOW");
		peopleRiskCategoryMap.put("C", "YELLOW");
		peopleRiskCategoryMap.put("D", "GREEN");
		
		System.out.println("initializePeopleRiskScores()...Done");
		
	}

	private void initializeSecurityRiskScores() {
		
		secVlnbtyCodeMap = new HashMap<String, Float>();
		secVlnbtyInfraMap = new HashMap<String, Float>();
		secCompVlnbltsMap = new HashMap<String, Float>();
		secRiskValueRangeMap = new HashMap<String, Float>();
		secRiskCategoryMap = new HashMap<String, String>();
		
		secVlnbtyCodeMap.put("Yes - High Priority issues", 7.0f);
		secVlnbtyCodeMap.put("Yes - Medium/Low Priority issues", 3.0f);
		secVlnbtyCodeMap.put("No", 0.0f);
		secVlnbtyCodeMap.put("Weightage", 35.0f);
		
		secVlnbtyInfraMap.put("Yes - High Priority issues", 7.0f);
		secVlnbtyInfraMap.put("Yes - Medium/Low Priority issues", 3.0f);
		secVlnbtyInfraMap.put("No", 0.0f);
		secVlnbtyInfraMap.put("Weightage", 35.0f);
		
		secCompVlnbltsMap.put("Yes - High Priority issues", 6.0f);
		secCompVlnbltsMap.put("Yes - Medium/Low Priority issues", 3.0f);
		secCompVlnbltsMap.put("No", 0.0f);
		secCompVlnbltsMap.put("Weightage", 30.0f);		

		secRiskValueRangeMap.put("Category-A-Min", 4.0f);
		secRiskValueRangeMap.put("Category-A-Max", 10.0f);
		secRiskValueRangeMap.put("Category-B-Min", 2.0f);
		secRiskValueRangeMap.put("Category-B-Max", 4.0f);
		secRiskValueRangeMap.put("Category-C-Min", 0.0f);
		secRiskValueRangeMap.put("Category-C-Max", 2.0f);
		
		secRiskCategoryMap.put("A", "RED");
		secRiskCategoryMap.put("B", "YELLOW");
		secRiskCategoryMap.put("C", "GREEN");
		
		System.out.println("initializeSecurityRiskScores()...Done");
		
	}

	public static void appMaintRiskScoreRecalculation(ApplicationVO applicationVO){
		
		float appMaintRiskScore;
		String appMaintRiskCategory = null;
		String appMaintRiskColor = null;
		
		appMaintRiskScore = scalabilityRiskScoreRecalculation(applicationVO) +
							  complexityRiskScoreRecalculation(applicationVO) + 
							  impactRiskScoreRecalculation(applicationVO);
		
		if( appMaintRiskScore >= appMaintRiskValueRangeMap.get("Category-A-Min") && appMaintRiskScore < appMaintRiskValueRangeMap.get("Category-A-Max")){
			appMaintRiskCategory = "A";
			appMaintRiskColor = appMaintRiskCategoryMap.get(appMaintRiskCategory);
		}else if( appMaintRiskScore >= appMaintRiskValueRangeMap.get("Category-B-Min") && appMaintRiskScore < appMaintRiskValueRangeMap.get("Category-B-Max")){
			appMaintRiskCategory = "B";
			appMaintRiskColor = appMaintRiskCategoryMap.get(appMaintRiskCategory);
		}else if( appMaintRiskScore >= appMaintRiskValueRangeMap.get("Category-C-Min") && appMaintRiskScore < appMaintRiskValueRangeMap.get("Category-C-Max")){
			appMaintRiskCategory = "C";
			appMaintRiskColor = appMaintRiskCategoryMap.get(appMaintRiskCategory);
		}else if( appMaintRiskScore >= appMaintRiskValueRangeMap.get("Category-D-Min") && appMaintRiskScore < appMaintRiskValueRangeMap.get("Category-D-Max")){
			appMaintRiskCategory = "D";
			appMaintRiskColor = appMaintRiskCategoryMap.get(appMaintRiskCategory);
		}
		
		applicationVO.setAppRiskMaintScore(String.valueOf(appMaintRiskScore));
		applicationVO.setAppRiskMaintCategory(appMaintRiskCategory);
		applicationVO.setAppRiskMaintColor(appMaintRiskColor);

	}
	
	private static float scalabilityRiskScoreRecalculation(ApplicationVO applicationVO){
		
		return 1.0f;
	}
	
	private static float complexityRiskScoreRecalculation(ApplicationVO applicationVO){
		
		return 2.0f;
	}
	
	private static float impactRiskScoreRecalculation(ApplicationVO applicationVO){
		
		return 3.0f;
	}
	
	public static void infraRiskScoreRecalculation(ApplicationVO applicationVO){
		
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

	public static void peopleRiskScoreRecalculation(ApplicationVO applicationVO) {
		
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
	
	public static void securityRiskScoreRecalculation(ApplicationVO applicationVO) {
		
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
