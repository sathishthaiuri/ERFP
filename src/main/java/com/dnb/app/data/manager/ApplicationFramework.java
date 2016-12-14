package com.dnb.app.data.manager;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import com.dnb.app.util.ERFUtility;
import com.dnb.app.vo.ApplicationVO;

public class ApplicationFramework {

	private static String changeSummary = null; 
	private static Float defaultFloatValue = 0.0f;
	private static DecimalFormat decimalFormat1_2;
	private static final int CONTRIB_RATIO_100 = 100;
	private static final int CONTRIB_RATIO_40 = 40;
	private static final int CONTRIB_RATIO_35 = 35;
	private static final int CONTRIB_RATIO_25 = 25;
	
	private static Map<String, Float> appMaintRiskWeightageMap;
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
	private static Map<String, Float> impactUpDownSystemsMap;
	private static Map<String, Float> impactToBrandImageMap;
	
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
		
		decimalFormat1_2 = new DecimalFormat("#.##");
		initializeChangeSummary();
		initializeAppMaintRiskScores();
		
		initializeStabilityRiskScores();
		initializeComplexityRiskScores();
		initializeImpactRiskScores();
		
		initializeInfraRiskScores();
		initializePeopleRiskScores();
		initializeSecurityRiskScores();
	}
	
	private void initializeAppMaintRiskScores(){
		
		appMaintRiskWeightageMap = new HashMap<String, Float>();
		appMaintRiskValueRangeMap = new HashMap<String, Float>();
		appMaintRiskCategoryMap = new HashMap<String, String>();
		
		appMaintRiskWeightageMap.put("Stability-Weightage", 40.0f);
		appMaintRiskWeightageMap.put("Complexity-Weightage", 35.0f);
		appMaintRiskWeightageMap.put("Impact-Weightage", 25.0f);
		
		appMaintRiskValueRangeMap.put("Category-D-Min", 5.0f);
		appMaintRiskValueRangeMap.put("Category-D-Max", 10.0f);
		appMaintRiskValueRangeMap.put("Category-C-Min", 4.0f);
		appMaintRiskValueRangeMap.put("Category-C-Max", 5.0f);
		appMaintRiskValueRangeMap.put("Category-B-Min", 3.0f);
		appMaintRiskValueRangeMap.put("Category-B-Max", 4.0f);
		appMaintRiskValueRangeMap.put("Category-A-Min", 0.0f);
		appMaintRiskValueRangeMap.put("Category-A-Max", 3.0f);
		
		appMaintRiskCategoryMap.put("D", "RED");
		appMaintRiskCategoryMap.put("C", "YELLOW");
		appMaintRiskCategoryMap.put("B", "YELLOW");
		appMaintRiskCategoryMap.put("A", "GREEN");
		
		System.out.println("initializeAppMaintRiskScores()...Done");
	}
	
	private void initializeStabilityRiskScores() {
		
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

		stabilityNoTktRslvVendorMap.put("No", 0.0f);
		stabilityNoTktRslvVendorMap.put("Medium < 5 Tickets/Year", 5.0f);
		stabilityNoTktRslvVendorMap.put("High > 5 Tickets/Year", 10.0f);
		stabilityNoTktRslvVendorMap.put("Weightage", 5.0f);

		System.out.println("initializeStabilityRiskScores()...Done");
	}

	private void initializeComplexityRiskScores() {
		
		complexityNoInterfacAppMap = new HashMap<String, Float>();
		complexityDataVolumeDayMap = new HashMap<String, Float>();
		complexityTechSuprtAvlbtMap = new HashMap<String, Float>();
		complexityCodeAvlbtMap = new HashMap<String, Float>();
		complexityIncreaDataVlmYrMap = new HashMap<String, Float>();
		complexityRegComplianceMap = new HashMap<String, Float>();
		
		complexityNoInterfacAppMap.put("Range-One-Min", 0.0f);
		complexityNoInterfacAppMap.put("Range-One-Max", 0.0f);
		complexityNoInterfacAppMap.put("Range-One-Score", 0.0f);
		complexityNoInterfacAppMap.put("Range-Two-Min", 1.0f);
		complexityNoInterfacAppMap.put("Range-Two-Max", 8.0f);
		complexityNoInterfacAppMap.put("Range-Two-Score", 5.0f);
		complexityNoInterfacAppMap.put("Range-Three-Min", 9.0f);
		complexityNoInterfacAppMap.put("Range-Three-Max", 50.0f);
		complexityNoInterfacAppMap.put("Range-Three-Score", 10.0f);
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

		complexityIncreaDataVlmYrMap.put("Low < 3%", 0.0f);
		complexityIncreaDataVlmYrMap.put("Medium 3% to 8%", 5.0f);
		complexityIncreaDataVlmYrMap.put("High  > 8%", 10.0f);
		complexityIncreaDataVlmYrMap.put("Weightage", 2.5f);
		
		complexityRegComplianceMap.put("Yes", 10.0f);
		complexityRegComplianceMap.put("No", 0.0f);
		complexityRegComplianceMap.put("Weightage", 10.0f);
		
		System.out.println("initializeComplexityRiskScores()...Done");
		
	}
	
	private void initializeImpactRiskScores() {
		
		impactRevImpactMap = new HashMap<String, Float>();
		impactImpatcToCustomerMap = new HashMap<String, Float>();
		impactRecoveryDurationMap = new HashMap<String, Float>();
		impactUpDownSystemsMap = new HashMap<String, Float>();
		impactToBrandImageMap = new HashMap<String, Float>();
		
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
		
		impactUpDownSystemsMap.put("> 5 systems", 10.0f);
		impactUpDownSystemsMap.put("< 5 systems", 5.0f);
		impactUpDownSystemsMap.put("No", 0.0f);
		
		impactToBrandImageMap.put("Yes", 10.0f);
		impactToBrandImageMap.put("No", 0.0f);

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
		
		infraRiskValueRangeMap.put("Category-C-Min", 6.0f);
		infraRiskValueRangeMap.put("Category-C-Max", 10.0f);
		infraRiskValueRangeMap.put("Category-B-Min", 2.0f);
		infraRiskValueRangeMap.put("Category-B-Max", 6.0f);
		infraRiskValueRangeMap.put("Category-A-Min", 0.0f);
		infraRiskValueRangeMap.put("Category-A-Max", 2.0f);
		
		infraRiskCategoryMap.put("C", "RED");
		infraRiskCategoryMap.put("B", "YELLOW");
		infraRiskCategoryMap.put("A", "GREEN");
		
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
		
		peopleRiskValueRangeMap.put("Category-D-Min", 8.0f);
		peopleRiskValueRangeMap.put("Category-D-Max", 10.0f);
		peopleRiskValueRangeMap.put("Category-C-Min", 5.0f);
		peopleRiskValueRangeMap.put("Category-C-Max", 8.0f);
		peopleRiskValueRangeMap.put("Category-B-Min", 2.0f);
		peopleRiskValueRangeMap.put("Category-B-Max", 5.0f);
		peopleRiskValueRangeMap.put("Category-A-Min", 0.0f);
		peopleRiskValueRangeMap.put("Category-A-Max", 2.0f);
		
		peopleRiskCategoryMap.put("D", "RED");
		peopleRiskCategoryMap.put("C", "YELLOW");
		peopleRiskCategoryMap.put("B", "YELLOW");
		peopleRiskCategoryMap.put("A", "GREEN");
		
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

		secRiskValueRangeMap.put("Category-C-Min", 4.0f);
		secRiskValueRangeMap.put("Category-C-Max", 10.0f);
		secRiskValueRangeMap.put("Category-B-Min", 2.0f);
		secRiskValueRangeMap.put("Category-B-Max", 4.0f);
		secRiskValueRangeMap.put("Category-A-Min", 0.0f);
		secRiskValueRangeMap.put("Category-A-Max", 2.0f);
		
		secRiskCategoryMap.put("C", "RED");
		secRiskCategoryMap.put("B", "YELLOW");
		secRiskCategoryMap.put("A", "GREEN");
		
		System.out.println("initializeSecurityRiskScores()...Done");
		
	}

	public static void appMaintRiskScoreRecalculation(ApplicationVO applicationVO){
		
		float appMaintRiskScore;
		String appMaintRiskScoreText;
		String appMaintRiskCategory = null;
		String appMaintRiskColor = null;
		
		/*appMaintRiskScore = ((stabilityRiskScoreRecalculation(applicationVO) * appMaintRiskWeightageMap.get("Stability-Weightage")) / 100) +
							((complexityRiskScoreRecalculation(applicationVO) * appMaintRiskWeightageMap.get("Complexity-Weightage")) / 100) + 
							((impactRiskScoreRecalculation(applicationVO) * appMaintRiskWeightageMap.get("Impact-Weightage")) / 100);*/

		appMaintRiskScore = stabilityRiskScoreRecalculation(applicationVO) +
								complexityRiskScoreRecalculation(applicationVO) + 
									impactRiskScoreRecalculation(applicationVO);
		
		if( appMaintRiskScore >= appMaintRiskValueRangeMap.get("Category-D-Min") && appMaintRiskScore <= appMaintRiskValueRangeMap.get("Category-D-Max")){
			appMaintRiskCategory = "D";
			appMaintRiskColor = appMaintRiskCategoryMap.get(appMaintRiskCategory);
		}else if( appMaintRiskScore >= appMaintRiskValueRangeMap.get("Category-C-Min") && appMaintRiskScore < appMaintRiskValueRangeMap.get("Category-C-Max")){
			appMaintRiskCategory = "C";
			appMaintRiskColor = appMaintRiskCategoryMap.get(appMaintRiskCategory);
		}else if( appMaintRiskScore >= appMaintRiskValueRangeMap.get("Category-B-Min") && appMaintRiskScore < appMaintRiskValueRangeMap.get("Category-B-Max")){
			appMaintRiskCategory = "B";
			appMaintRiskColor = appMaintRiskCategoryMap.get(appMaintRiskCategory);
		}else if( appMaintRiskScore >= appMaintRiskValueRangeMap.get("Category-A-Min") && appMaintRiskScore < appMaintRiskValueRangeMap.get("Category-A-Max")){
			appMaintRiskCategory = "A";
			appMaintRiskColor = appMaintRiskCategoryMap.get(appMaintRiskCategory);
		}
		
		appMaintRiskScoreText = decimalFormat1_2.format(appMaintRiskScore);
		applicationVO.setAppRiskMaintScore(appMaintRiskScoreText);
		applicationVO.setAppRiskMaintCategory(appMaintRiskCategory);
		applicationVO.setAppRiskMaintColor(appMaintRiskColor);

	}
	
	private static float stabilityRiskScoreRecalculation(ApplicationVO applicationVO) {

		float stabilityRiskValue = 0.0f;

		Integer noTktsVlmVOVal = applicationVO.getNoTktsVlm();
		Integer noSev1Sev2VOVal = applicationVO.getNoSev1Sev2();
		Integer noSrtCountVOVal = applicationVO.getNoSrtCount();
		Integer noReleaseUbrVOVal = applicationVO.getNoReleaseUbr();
		String manualIntervensionText = applicationVO.getManualIntervension();
		String noTktRslvVendorText = applicationVO.getNoTktRslvVendor();

		Float noTktsVlmMatrixScore = calculateMatrixRangeScore(stabilityNoTktsVlmMap, noTktsVlmVOVal);
		Float noSev1Sev2MatrixScore = calculateMatrixRangeScore(stabilityNoSev1Sev2Map, noSev1Sev2VOVal);
		Float noSrtCountMatrixScore = calculateMatrixRangeScore(stabilityNoSrtCountMap, noSrtCountVOVal);
		Float noReleaseUbrMatrixScore = calculateMatrixRangeScore(stabilityNoReleaseUbrMap, noReleaseUbrVOVal);
		Float manualIntervensionScore = stabilityManualIntervensionMap.getOrDefault(manualIntervensionText, defaultFloatValue);
		Float noTktRslvVendorScore = stabilityNoTktRslvVendorMap.getOrDefault(noTktRslvVendorText, defaultFloatValue);

		Float noTktsVlmMatrixVal = (noTktsVlmMatrixScore * stabilityNoTktsVlmMap.get("Weightage")) / 100;
		Float noSev1Sev2MatrixVal = (noSev1Sev2MatrixScore * stabilityNoSev1Sev2Map.get("Weightage")) / 100;
		Float noSrtCountMatrixVal = (noSrtCountMatrixScore * stabilityNoSrtCountMap.get("Weightage")) / 100;
		Float noReleaseUbrMatrixVal = (noReleaseUbrMatrixScore * stabilityNoReleaseUbrMap.get("Weightage")) / 100;
		Float manualIntervensionVal = (manualIntervensionScore * stabilityManualIntervensionMap.get("Weightage")) / 100;
		Float noTktRslvVendorVal = (noTktRslvVendorScore * stabilityNoTktRslvVendorMap.get("Weightage")) / 100;

		stabilityRiskValue = noTktsVlmMatrixVal + noSev1Sev2MatrixVal + noSrtCountMatrixVal + noReleaseUbrMatrixVal +  manualIntervensionVal + noTktRslvVendorVal;
		
		applicationVO.setNoTktsVlmContrb(ERFUtility.returnContribution(noTktsVlmMatrixVal, stabilityRiskValue, CONTRIB_RATIO_40));
		applicationVO.setNoSev1Sev2Contrb(ERFUtility.returnContribution(noSev1Sev2MatrixVal, stabilityRiskValue, CONTRIB_RATIO_40));
		applicationVO.setNoSrtCountContrb(ERFUtility.returnContribution(noSrtCountMatrixVal, stabilityRiskValue, CONTRIB_RATIO_40));
		applicationVO.setNoReleaseUbrContrb(ERFUtility.returnContribution(noReleaseUbrMatrixVal, stabilityRiskValue, CONTRIB_RATIO_40));
		applicationVO.setManualIntervensionContrb(ERFUtility.returnContribution(manualIntervensionVal, stabilityRiskValue, CONTRIB_RATIO_40));
		applicationVO.setNoTktRslvVendorContrb(ERFUtility.returnContribution(noTktRslvVendorVal, stabilityRiskValue, CONTRIB_RATIO_40));
		
		String textLine = applicationVO.getNoTktsVlmContrb() + " | " + 
						  applicationVO.getNoSev1Sev2Contrb() + " | " + 
						  applicationVO.getNoSrtCountContrb() + " | " + 
						  applicationVO.getNoReleaseUbrContrb() + " | " + 
						  applicationVO.getManualIntervensionContrb() + " | " + 
						  applicationVO.getNoTktRslvVendorContrb();
		
		System.out.print("Stability Risk = "+textLine);

		return stabilityRiskValue;

	}
	
	private static float complexityRiskScoreRecalculation(ApplicationVO applicationVO){
		
		float complexityRiskValue = 0.0f;
		
		Integer noInterfacAppVOVal = applicationVO.getNoInterfacApp();
		String dataVolumeDayText = applicationVO.getDataVolumeDay();
		String techSuprtAvlbtText = applicationVO.getTechSuprtAvlbt();
		String codeAvlbtText = applicationVO.getCodeAvlbt();
		String increaDataVlmYrText = applicationVO.getIncreaDataVlmYr();
		String regComplianceText = applicationVO.getRegCompliance();
		
		Float noInterfacAppMatrixScore = calculateMatrixRangeScore(complexityNoInterfacAppMap, noInterfacAppVOVal);
		Float dataVolumeDayScore = complexityDataVolumeDayMap.getOrDefault(dataVolumeDayText, defaultFloatValue);
		Float techSuprtAvlbtScore = complexityTechSuprtAvlbtMap.getOrDefault(techSuprtAvlbtText, defaultFloatValue);
		Float codeAvlbtScore = complexityCodeAvlbtMap.getOrDefault(codeAvlbtText, defaultFloatValue);
		Float increaDataVlmYrScore = complexityIncreaDataVlmYrMap.getOrDefault(increaDataVlmYrText, defaultFloatValue);
		Float regComplianceScore = complexityRegComplianceMap.getOrDefault(regComplianceText, defaultFloatValue);
		
		Float noInterfacAppMatrixValue = (noInterfacAppMatrixScore * complexityNoInterfacAppMap.get("Weightage"))/100;
		Float dataVolumeDayValue = (dataVolumeDayScore * complexityDataVolumeDayMap.get("Weightage"))/100;
		Float techSuprtAvlbtValue = (techSuprtAvlbtScore * complexityTechSuprtAvlbtMap.get("Weightage"))/100;
		Float codeAvlbtValue = (codeAvlbtScore * complexityCodeAvlbtMap.get("Weightage"))/100;
		Float increaDataVlmYrValue = (increaDataVlmYrScore * complexityIncreaDataVlmYrMap.get("Weightage"))/100;
		Float regComplianceValue = (regComplianceScore * complexityRegComplianceMap.get("Weightage"))/100;
		
		complexityRiskValue = noInterfacAppMatrixValue + dataVolumeDayValue + techSuprtAvlbtValue + codeAvlbtValue + increaDataVlmYrValue + regComplianceValue;
		
		applicationVO.setNoInterfacAppContrb(ERFUtility.returnContribution(noInterfacAppMatrixValue, complexityRiskValue, CONTRIB_RATIO_35));
		applicationVO.setDataVolumeDayContrb(ERFUtility.returnContribution(dataVolumeDayValue, complexityRiskValue, CONTRIB_RATIO_35));
		applicationVO.setTechSuprtAvlbtContrb(ERFUtility.returnContribution(techSuprtAvlbtValue, complexityRiskValue, CONTRIB_RATIO_35));
		applicationVO.setCodeAvlbtContrb(ERFUtility.returnContribution(codeAvlbtValue, complexityRiskValue, CONTRIB_RATIO_35));
		applicationVO.setIncreaDataVlmYrContrb(ERFUtility.returnContribution(increaDataVlmYrValue, complexityRiskValue, CONTRIB_RATIO_35));
		applicationVO.setRegComplianceContrb(ERFUtility.returnContribution(regComplianceValue, complexityRiskValue, CONTRIB_RATIO_35));
		
		String textLine = applicationVO.getNoInterfacAppContrb() + " | " + 
						  applicationVO.getDataVolumeDayContrb() + " | " + 
						  applicationVO.getTechSuprtAvlbtContrb() + " | " + 
						  applicationVO.getCodeAvlbtContrb() + " | " + 
						  applicationVO.getIncreaDataVlmYrContrb() + " | " + 
						  applicationVO.getRegComplianceContrb();
		
		System.out.print("Complexity Risk = "+textLine);
		
		return complexityRiskValue;
	}
	
	private static float impactRiskScoreRecalculation(ApplicationVO applicationVO){
		
		float impactRiskValue = 0.0f;
		float bizCriticalityTotal = 0.0f;
		
		String revImpactText = applicationVO.getRevImpact();
		String impatcToCustomerText = applicationVO.getImpatcToCustomer();
		String recoveryDurationText = applicationVO.getRecoveryDuration();
		String impactUpDnStreamText = applicationVO.getImpactUpDnStream();
		String impactBrandImgText = applicationVO.getImpactBrandImg();
		
		Float revImpactScore = impactRevImpactMap.getOrDefault(revImpactText, defaultFloatValue);
		Float impatcToCustomerScore = impactImpatcToCustomerMap.getOrDefault(impatcToCustomerText, defaultFloatValue);
		Float recoveryDurationScore = impactRecoveryDurationMap.getOrDefault(recoveryDurationText, defaultFloatValue);
		Float impactUpDnStreamScore = impactUpDownSystemsMap.getOrDefault(impactUpDnStreamText, defaultFloatValue);
		Float impactBrandImgScore = impactToBrandImageMap.getOrDefault(impactBrandImgText, defaultFloatValue);
		
		Float revImpactValue = (revImpactScore * impactRevImpactMap.get("Weightage"))/100;
		Float impatcToCustomerValue = (impatcToCustomerScore * impactImpatcToCustomerMap.get("Weightage"))/100;
		Float recoveryDurationValue = (recoveryDurationScore * impactRecoveryDurationMap.get("Weightage"))/100;
		
		impactRiskValue = revImpactValue + impatcToCustomerValue + recoveryDurationValue;
		
		applicationVO.setRevImpactContrb(ERFUtility.returnContribution(revImpactValue, impactRiskValue, CONTRIB_RATIO_25));
		applicationVO.setImpatcToCustomerContrb(ERFUtility.returnContribution(impatcToCustomerValue, impactRiskValue, CONTRIB_RATIO_25));
		applicationVO.setRecoveryDurationContrb(ERFUtility.returnContribution(recoveryDurationValue, impactRiskValue, CONTRIB_RATIO_25));
		
		String textLine = applicationVO.getRevImpactContrb() + " | " + 
						  applicationVO.getImpatcToCustomerContrb() + " | " + 
						  applicationVO.getRecoveryDurationContrb();
		
		System.out.println("Impact & Recovery = "+textLine);
		
		bizCriticalityTotal = (revImpactScore + 
									impatcToCustomerScore + 
										recoveryDurationScore + 
												impactUpDnStreamScore + impactBrandImgScore);
		
		if(bizCriticalityTotal > 25){
			applicationVO.setBizCriticalityText("High");
		}else if(bizCriticalityTotal > 15 && bizCriticalityTotal <= 25){
			applicationVO.setBizCriticalityText("Medium");
		}else if(bizCriticalityTotal >= 0 && bizCriticalityTotal <= 15){
			applicationVO.setBizCriticalityText("Low");
		}
		
		return impactRiskValue;
	}
	
	public static void infraRiskScoreRecalculation(ApplicationVO applicationVO){
		
		float infraRiskValue;

		String infraCategory = null;
		String infraRiskColor = null;
		
		String appPerfSlaText = applicationVO.getAppPerfSla();
		String scalabilityText = applicationVO.getScalability();
		String obsoleteInfraText = applicationVO.getObsoleteInfra();
		String drEnvAvlbtText = applicationVO.getDrEnvAvlbt();
		String nwInfraIssuePmText = applicationVO.getNwInfraIssuePm();
		
		Float infraPerformanceScore = infraPerformanceMap.getOrDefault(appPerfSlaText, defaultFloatValue);
		Float infraObsoleteInfraScore = infraObsoleteInfraMap.getOrDefault(obsoleteInfraText, defaultFloatValue);
		Float infraAvlbtOfDREnvScore = infraAvlbtOfDREnvMap.getOrDefault(drEnvAvlbtText, defaultFloatValue);
		Float infraScalabilityIssuScore = infraScalabilityIssuMap.getOrDefault(scalabilityText, defaultFloatValue);
		Float infraFrequencyInfraScore = infraFrequencyInfraMap.getOrDefault(nwInfraIssuePmText, defaultFloatValue);
		
		Float infraPerformanceVal = (infraPerformanceScore * infraPerformanceMap.get("Weightage"))/100;
		Float infraObsoleteInfraVal = (infraObsoleteInfraScore * infraObsoleteInfraMap.get("Weightage"))/100;
		Float infraAvlbtOfDREnvVal = (infraAvlbtOfDREnvScore * infraAvlbtOfDREnvMap.get("Weightage"))/100;
		Float infraScalabilityIssuVal = (infraScalabilityIssuScore * infraScalabilityIssuMap.get("Weightage"))/100;
		Float infraFrequencyInfraVal = (infraFrequencyInfraScore * infraFrequencyInfraMap.get("Weightage"))/100;
		
		infraRiskValue = infraPerformanceVal + infraObsoleteInfraVal + infraAvlbtOfDREnvVal + infraScalabilityIssuVal + infraFrequencyInfraVal;
		
		applicationVO.setAppPerfSlaContrb(ERFUtility.returnContribution(infraPerformanceVal, infraRiskValue, CONTRIB_RATIO_100));
		applicationVO.setScalabilityContrb(ERFUtility.returnContribution(infraObsoleteInfraVal, infraRiskValue, CONTRIB_RATIO_100));
		applicationVO.setObsoleteInfraContrb(ERFUtility.returnContribution(infraAvlbtOfDREnvVal, infraRiskValue, CONTRIB_RATIO_100));
		applicationVO.setDrEnvAvlbtContrb(ERFUtility.returnContribution(infraScalabilityIssuVal, infraRiskValue, CONTRIB_RATIO_100));
		applicationVO.setNwInfraIssuePmContrb(ERFUtility.returnContribution(infraFrequencyInfraVal, infraRiskValue, CONTRIB_RATIO_100));
		
		String textLine = applicationVO.getAppPerfSlaContrb() + " | " + 
						  applicationVO.getScalabilityContrb() + " | " + 
						  applicationVO.getObsoleteInfraContrb() + " | " + 
						  applicationVO.getDrEnvAvlbtContrb() + " | " +
						  applicationVO.getNwInfraIssuePmContrb();
		
		System.out.print("People Risk = "+textLine);
		
		if( infraRiskValue >= infraRiskValueRangeMap.get("Category-C-Min") && infraRiskValue <= infraRiskValueRangeMap.get("Category-C-Max")){
			infraCategory = "C";
			infraRiskColor = infraRiskCategoryMap.get(infraCategory);
		}else if( infraRiskValue >= infraRiskValueRangeMap.get("Category-B-Min") && infraRiskValue < infraRiskValueRangeMap.get("Category-B-Max")){
			infraCategory = "B";
			infraRiskColor = infraRiskCategoryMap.get(infraCategory);
		}else if( infraRiskValue >= infraRiskValueRangeMap.get("Category-A-Min") && infraRiskValue < infraRiskValueRangeMap.get("Category-A-Max")){
			infraCategory = "A";
			infraRiskColor = infraRiskCategoryMap.get(infraCategory);
		}
		
		applicationVO.setAppInfraRiskScore(decimalFormat1_2.format(infraRiskValue));
		applicationVO.setAppInfraRiskCategory(infraCategory);
		applicationVO.setAppInfraRiskColor(infraRiskColor);
		
	}

	public static void peopleRiskScoreRecalculation(ApplicationVO applicationVO) {
		
		float peopleRiskValue = 0.0f;

		String peopleCategory = null;
		String peopleRiskColor = null;
		
		String peopleSMEAvlbtText = applicationVO.getSmeAvlbt();
		String peopleVendorExpCTSText = applicationVO.getVendorExptCts();
		String peopleVendorExpEnsonoText = applicationVO.getVendorExptEnsono();
		String peopleAvlbtOfBizUsersText = applicationVO.getAvlbtBizUsers();
		
		Float peopleSMEAvlbtScore = peopleSMEAvlbtMap.getOrDefault(peopleSMEAvlbtText, defaultFloatValue);
		Float peopleVendorExpCTSScore = peopleVendorExpCTSMap.getOrDefault(peopleVendorExpEnsonoText, defaultFloatValue);
		Float peopleVendorExpEnsonoScore = peopleVendorExpEnsonoMap.getOrDefault(peopleAvlbtOfBizUsersText, defaultFloatValue);
		Float peopleAvlbtOfBizUsersScore = peopleAvlbtOfBizUsersMap.getOrDefault(peopleVendorExpCTSText, defaultFloatValue);
		
		Float peopleSMEAvlbtValue = (peopleSMEAvlbtScore * peopleSMEAvlbtMap.get("Weightage"))/100;
		Float peopleVendorExpCTSValue = (peopleVendorExpCTSScore * peopleVendorExpCTSMap.get("Weightage"))/100;
		Float peopleVendorExpEnsonoValue = (peopleVendorExpEnsonoScore * peopleVendorExpEnsonoMap.get("Weightage"))/100;
		Float peopleAvlbtOfBizUsersValue = (peopleAvlbtOfBizUsersScore * peopleAvlbtOfBizUsersMap.get("Weightage"))/100;
		
		peopleRiskValue = peopleSMEAvlbtValue + peopleVendorExpCTSValue + peopleVendorExpEnsonoValue + peopleAvlbtOfBizUsersValue;
		
		applicationVO.setSmeAvlbtContrb(ERFUtility.returnContribution(peopleSMEAvlbtValue, peopleRiskValue, CONTRIB_RATIO_100));
		applicationVO.setVendorExptCtsContrb(ERFUtility.returnContribution(peopleVendorExpCTSValue, peopleRiskValue, CONTRIB_RATIO_100));
		applicationVO.setVendorExptEnsonoContrb(ERFUtility.returnContribution(peopleVendorExpEnsonoValue, peopleRiskValue, CONTRIB_RATIO_100));
		applicationVO.setAvlbtBizUsersContrb(ERFUtility.returnContribution(peopleAvlbtOfBizUsersValue, peopleRiskValue, CONTRIB_RATIO_100));
		
		String textLine = applicationVO.getSmeAvlbtContrb() + " | " + 
						  applicationVO.getVendorExptCtsContrb() + " | " + 
						  applicationVO.getVendorExptEnsonoContrb() + " | " + 
						  applicationVO.getAvlbtBizUsersContrb();
		
		System.out.print("People Risk = "+textLine);
		
		if( peopleRiskValue >= peopleRiskValueRangeMap.get("Category-D-Min") && peopleRiskValue <= peopleRiskValueRangeMap.get("Category-D-Max")){
			peopleCategory = "D";
			peopleRiskColor = peopleRiskCategoryMap.get(peopleCategory);
		}else if( peopleRiskValue >= peopleRiskValueRangeMap.get("Category-C-Min") && peopleRiskValue < peopleRiskValueRangeMap.get("Category-C-Max")){
			peopleCategory = "C";
			peopleRiskColor = peopleRiskCategoryMap.get(peopleCategory);
		}else if( peopleRiskValue >= peopleRiskValueRangeMap.get("Category-B-Min") && peopleRiskValue < peopleRiskValueRangeMap.get("Category-B-Max")){
			peopleCategory = "B";
			peopleRiskColor = peopleRiskCategoryMap.get(peopleCategory);
		}else if( peopleRiskValue >= peopleRiskValueRangeMap.get("Category-A-Min") && peopleRiskValue < peopleRiskValueRangeMap.get("Category-A-Max")){
			peopleCategory = "A";
			peopleRiskColor = peopleRiskCategoryMap.get(peopleCategory);
		}
		
		applicationVO.setAppPeopleRiskScore(decimalFormat1_2.format(peopleRiskValue));
		applicationVO.setAppPeopleRiskCategory(peopleCategory);
		applicationVO.setAppPeopleRiskColor(peopleRiskColor);
		
	}
	
	public static void securityRiskScoreRecalculation(ApplicationVO applicationVO) {
		
		Float securityRiskValue = 0.0f;

		String securityCategory = null;
		String securityRiskColor = null;
		
		String secVlnbtyCodeText = applicationVO.getSecVlnbtyCode();
		String secVlnbtyInfraText = applicationVO.getSecVlnbtyInfra();
		String secCompVlnbltsText = applicationVO.getCompVlnblts();
		
		Float secVlnbtyCodeScore = secVlnbtyCodeMap.getOrDefault(secVlnbtyCodeText, defaultFloatValue);
		Float secVlnbtyInfraScore = secVlnbtyInfraMap.getOrDefault(secVlnbtyInfraText, defaultFloatValue);
		Float secCompVlnbltsScore = secCompVlnbltsMap.getOrDefault(secCompVlnbltsText, defaultFloatValue);
		
		Float secVlnbtyCodeValue = (secVlnbtyCodeScore * secVlnbtyCodeMap.get("Weightage"))/100;
		Float secVlnbtyInfraValue = (secVlnbtyInfraScore * secVlnbtyInfraMap.get("Weightage"))/100;
		Float secCompVlnbltsValue = (secCompVlnbltsScore * secCompVlnbltsMap.get("Weightage"))/100;
		
		securityRiskValue = secVlnbtyCodeValue + secVlnbtyInfraValue + secCompVlnbltsValue;

		applicationVO.setSecVlnbtyCodeContrb(ERFUtility.returnContribution(secVlnbtyCodeValue, securityRiskValue, CONTRIB_RATIO_100));
		applicationVO.setSecVlnbtyInfraContrb(ERFUtility.returnContribution(secVlnbtyInfraValue, securityRiskValue, CONTRIB_RATIO_100));
		applicationVO.setCompVlnbltsContrb(ERFUtility.returnContribution(secCompVlnbltsValue, securityRiskValue, CONTRIB_RATIO_100));
	
		String textLine = applicationVO.getSecVlnbtyCodeContrb() + " | " + 
						  applicationVO.getSecVlnbtyInfraContrb() + " | " + 
						  applicationVO.getCompVlnbltsContrb();
		
		System.out.print("Security Risk = "+textLine);
		
		if( securityRiskValue >= secRiskValueRangeMap.get("Category-C-Min") && securityRiskValue <= secRiskValueRangeMap.get("Category-C-Max")){
			securityCategory = "C";
			securityRiskColor = secRiskCategoryMap.get(securityCategory);
		}else if( securityRiskValue >= secRiskValueRangeMap.get("Category-B-Min") && securityRiskValue < secRiskValueRangeMap.get("Category-B-Max")){
			securityCategory = "B";
			securityRiskColor = secRiskCategoryMap.get(securityCategory);
		}else if( securityRiskValue >= secRiskValueRangeMap.get("Category-A-Min") && securityRiskValue < secRiskValueRangeMap.get("Category-A-Max")){
			securityCategory = "A";
			securityRiskColor = secRiskCategoryMap.get(securityCategory);
		}
		
		applicationVO.setAppSecurityRiskScore(decimalFormat1_2.format(securityRiskValue));
		applicationVO.setAppSecurityRiskCategory(securityCategory);
		applicationVO.setAppSecurityRiskColor(securityRiskColor);
		
	}

	
	private static float calculateMatrixRangeScore(Map<String, Float> rangeMatrixMap, Integer lookUpValParam){
		
		int mapSize = rangeMatrixMap.size() / 3;
		float rangeMatrixScore = 0.0f;
		float lookUpVal = lookUpValParam; 
		
		for (int counter = 1; counter <= mapSize; counter++) {
			
			if(counter == 1){
				if( lookUpVal >= rangeMatrixMap.get("Range-One-Min") && lookUpVal <= rangeMatrixMap.get("Range-One-Max")){
					rangeMatrixScore = rangeMatrixMap.get("Range-One-Score");
					break;
				}
			}else if(counter == 2){
				if( lookUpVal >= rangeMatrixMap.get("Range-Two-Min") && lookUpVal <= rangeMatrixMap.get("Range-Two-Max")){
					rangeMatrixScore = rangeMatrixMap.get("Range-Two-Score");
					break;
				}
			}else if(counter == 3){
				if( lookUpVal >= rangeMatrixMap.get("Range-Three-Min") && lookUpVal <= rangeMatrixMap.get("Range-Three-Max")){
					rangeMatrixScore = rangeMatrixMap.get("Range-Three-Score");
					break;
				}
			}else if(counter == 4){
				if( lookUpVal >= rangeMatrixMap.get("Range-Four-Min") && lookUpVal <= rangeMatrixMap.get("Range-Four-Max")){
					rangeMatrixScore = rangeMatrixMap.get("Range-Four-Score");
					break;
				}
			}else if(counter == 5){
				if( lookUpVal >= rangeMatrixMap.get("Range-Five-Min") && lookUpVal <= rangeMatrixMap.get("Range-Five-Max")){
					rangeMatrixScore = rangeMatrixMap.get("Range-Five-Score");
					break;
				}
			}else if(counter == 6){
				if( lookUpVal >= rangeMatrixMap.get("Range-Six-Min") && lookUpVal <= rangeMatrixMap.get("Range-Six-Max")){
					rangeMatrixScore = rangeMatrixMap.get("Range-Six-Score");
					break;
				}
			}
		}
		
		return rangeMatrixScore;
	}

	
	public static String getChangeSummary() {
		return changeSummary;
	}
	
	private void initializeChangeSummary() {
		
		changeSummary =  "   <table>  "  + 
				 "   		<tr>  "  + 
				 "   			<td>  "  + 
				 "   				<table border='1'>  "  + 
				 "   					<tr>  "  + 
				 "   						<td colspan='5' align='center'><b>App.Maint Score (1)</b></td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr align='center'>  "  + 
				 "   						<td colspan='2'>Previous Values</td>  "  + 
				 "   						<td colspan='2'>New Values</td>  "  + 
				 "   						<td>Status</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Score</td>  "  + 
				 "   						<td>AMS-O-Score#</td>  "  + 
				 "   						<td>Score</td>  "  + 
				 "   						<td>AMS-N-Score#</td>  "  + 
				 "   						<td rowspan='3'>AMS-Status#</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Grade</td>  "  + 
				 "   						<td>AMS-O-Grade#</td>  "  + 
				 "   						<td>Grade</td>  "  + 
				 "   						<td>AMS-N-Grade#</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Color</td>  "  + 
				 "   						<td>AMS-O-Color#</td>  "  + 
				 "   						<td>Color</td>  "  + 
				 "   						<td>AMS-N-Color#</td>  "  + 
				 "   					</tr>  "  + 
				 "   				</table>  "  + 
				 "   			</td>  "  + 
				 "   			  "  + 
				 "   			<td>  "  + 
				 "   				<table border='1'>  "  + 
				 "   					<tr>  "  + 
				 "   						<td colspan='5' align='center'><b>Infra Risk Score (2)</b></td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr align='center'>  "  + 
				 "   						<td colspan='2'>Previous Values</td>  "  + 
				 "   						<td colspan='2'>New Values</td>  "  + 
				 "   						<td>Status</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Score</td>  "  + 
				 "   						<td>IRS-O-Score#</td>  "  + 
				 "   						<td>Score</td>  "  + 
				 "   						<td>IRS-N-Score#</td>  "  + 
				 "   						<td rowspan='3'>IRS-Status#</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Grade</td>  "  + 
				 "   						<td>IRS-O-Grade#</td>  "  + 
				 "   						<td>Grade</td>  "  + 
				 "   						<td>IRS-N-Grade#</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Color</td>  "  + 
				 "   						<td>IRS-O-Color#</td>  "  + 
				 "   						<td>Color</td>  "  + 
				 "   						<td>IRS-N-Color#</td>  "  + 
				 "   					</tr>  "  + 
				 "   				</table>  "  + 
				 "   			</td>  "  + 
				 "   		</tr>  "  + 
				 "   		<tr>  "  + 
				 "   			<td>  "  + 
				 "   				<table border='1'>  "  + 
				 "   					<tr>  "  + 
				 "   						<td colspan='5' align='center'><b>Security Risk Score (3)</b></td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr align='center'>  "  + 
				 "   						<td colspan='2'>Previous Values</td>  "  + 
				 "   						<td colspan='2'>New Values</td>  "  + 
				 "   						<td>Status</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Score</td>  "  + 
				 "   						<td>SRS-O-Score#</td>  "  + 
				 "   						<td>Score</td>  "  + 
				 "   						<td>SRS-N-Score#</td>  "  + 
				 "   						<td rowspan='3'>SRS-Status#</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Grade</td>  "  + 
				 "   						<td>SRS-O-Grade#</td>  "  + 
				 "   						<td>Grade</td>  "  + 
				 "   						<td>SRS-N-Grade#</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Color</td>  "  + 
				 "   						<td>SRS-O-Color#</td>  "  + 
				 "   						<td>Color</td>  "  + 
				 "   						<td>SRS-N-Color#</td>  "  + 
				 "   					</tr>  "  + 
				 "   				</table>  "  + 
				 "   			</td>  "  + 
				 "   			  "  + 
				 "   			<td>  "  + 
				 "   				<table border='1'>  "  + 
				 "   					<tr>  "  + 
				 "   						<td colspan='5' align='center'><b>People Risk Score (4)</b></td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr align='center'>  "  + 
				 "   						<td colspan='2'>Previous Values</td>  "  + 
				 "   						<td colspan='2'>New Values</td>  "  + 
				 "   						<td>Status</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Score</td>  "  + 
				 "   						<td>PRS-O-Score#</td>  "  + 
				 "   						<td>Score</td>  "  + 
				 "   						<td>PRS-N-Score#</td>  "  + 
				 "   						<td rowspan='3'>PRS-Status#</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Grade</td>  "  + 
				 "   						<td>PRS-O-Grade#</td>  "  + 
				 "   						<td>Grade</td>  "  + 
				 "   						<td>PRS-N-Grade#</td>  "  + 
				 "   					</tr>  "  + 
				 "   					  "  + 
				 "   					<tr>  "  + 
				 "   						<td>Color</td>  "  + 
				 "   						<td>PRS-O-Color#</td>  "  + 
				 "   						<td>Color</td>  "  + 
				 "   						<td>PRS-N-Color#</td>  "  + 
				 "   					</tr>  "  + 
				 "   				</table>  "  + 
				 "   			</td>  "  + 
				 "   		</tr>  "  + 
				 "  	</table>  " ; 
	}
}
