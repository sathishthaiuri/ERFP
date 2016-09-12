package com.dnb.app.data.manager;

import java.util.ArrayList;
import java.util.List;

import com.dnb.app.model.ApplicationModel;
import com.dnb.app.vo.ApplicationVO;

public class ApplicationManager {

	
	public static List<ApplicationVO> assignScores(List<ApplicationVO> applicationVOList){
		
		return null;
	}
	
	public static ApplicationVO assignModel2VoMapper(ApplicationModel applicationModel) {

		ApplicationVO applicationVO = new ApplicationVO();
		
		applicationVO.setAppId(applicationModel.getAPP_ID());
		applicationVO.setAppName(applicationModel.getAPP_NAME());
		applicationVO.setAppCategory(applicationModel.getAPP_CATEGORY());
		applicationVO.setSupportScope(applicationModel.getSUPPORT_SCOPE());
		applicationVO.setAgeInYears(applicationModel.getAGE_IN_YEARS());
		applicationVO.setNoReleaseUbr(applicationModel.getNO_RELEASE_UBR());
		applicationVO.setNoTktsVlm(applicationModel.getNO_TKTS_VLM());
		applicationVO.setNoSev1Sev2(applicationModel.getNO_SEV1_SEV2());
		applicationVO.setNoIncTkt(applicationModel.getNO_INC_TKT());
		applicationVO.setNoSrtCount(applicationModel.getNO_SRT_COUNT());
		applicationVO.setNoTktRslvVendor(applicationModel.getNO_TKT_RSLV_W_VENDOR());
		applicationVO.setManualIntervension(applicationModel.getMANUAL_INTERVENSION());
		applicationVO.setNoOutofoffCallouts(applicationModel.getNO_OUTOFOFF_CALLOUTS());
		applicationVO.setNoInterfacApp(applicationModel.getNO_INTERFAC_APP());
		applicationVO.setDataVolumeDay(applicationModel.getDATA_VOLUME_DAY());
		applicationVO.setTechSuprtAvlbt(applicationModel.getTECH_SUPRT_AVLBT());
		applicationVO.setCodeAvlbt(applicationModel.getCODE_AVLBT());
		applicationVO.setIncreaDataVlmYr(applicationModel.getINCREA_DATA_VLM_YR());
		applicationVO.setRegCompliance(applicationModel.getREG_COMPLIANCE());
		applicationVO.setRevImpact(applicationModel.getREV_IMPACT());
		applicationVO.setImpatcToCustomer(applicationModel.getIMPATC_TO_CUSTOMER());
		applicationVO.setRecoveryDuration(applicationModel.getRECOVERY_DURATION());
		applicationVO.setImpactUpDnStream(applicationModel.getIMPACT_UP_DN_STREAM());
		applicationVO.setImpactBrandImg(applicationModel.getIMPACT_BRAND_IMG());
		applicationVO.setAppPerfSla(applicationModel.getAPP_PERF_SLA());
		applicationVO.setScalability(applicationModel.getSCALABILITY());
		applicationVO.setObsoleteInfra(applicationModel.getOBSOLETE_INFRA());
		applicationVO.setDrEnvAvlbt(applicationModel.getDR_ENV_AVLBT());
		applicationVO.setNwInfraIssuePm(applicationModel.getNW_INFRA_ISSUE_PM());
		applicationVO.setSmeAvlbt(applicationModel.getSME_AVLBT());
		applicationVO.setVendorExptCts(applicationModel.getVENDOR_EXPT_CTS());
		applicationVO.setVendorExptEnsono(applicationModel.getVENDOR_EXPT_ENSONO());
		applicationVO.setAvlbtBizUsers(applicationModel.getAVALBT_BIZ_USERS());
		applicationVO.setSecVlnbtyCode(applicationModel.getSEC_VLNBTY_CODE());
		applicationVO.setSecVlnbtyInfra(applicationModel.getSEC_VLNBTY_INFRA());
		applicationVO.setCompVlnblts(applicationModel.getCOMP_VLNBLTS());
		applicationVO.setConfMgtVlnbty(applicationModel.getCONF_MGT_VLNBTY());
		
		return applicationVO;
	}
	
	public static void assignVo2ModelMapper(ApplicationVO applicationVO, ApplicationModel applicationModel){

		//applicationModel.setAPP_ID(applicationVO.getAppId());
		applicationModel.setAPP_NAME(applicationVO.getAppName());
		applicationModel.setAPP_CATEGORY(applicationVO.getAppCategory());
		applicationModel.setSUPPORT_SCOPE(applicationVO.getSupportScope());
		applicationModel.setAGE_IN_YEARS(applicationVO.getAgeInYears());
		applicationModel.setNO_RELEASE_UBR(applicationVO.getNoReleaseUbr());
		applicationModel.setNO_TKTS_VLM(applicationVO.getNoIncTkt());
		applicationModel.setNO_SEV1_SEV2(applicationVO.getNoSev1Sev2());
		applicationModel.setNO_INC_TKT(applicationVO.getNoIncTkt());
		
		applicationModel.setNO_SRT_COUNT(applicationVO.getNoSrtCount());
		applicationModel.setNO_TKT_RSLV_W_VENDOR(applicationVO.getNoTktRslvVendor());
		applicationModel.setMANUAL_INTERVENSION(applicationVO.getManualIntervension());
		applicationModel.setNO_OUTOFOFF_CALLOUTS(applicationVO.getNoOutofoffCallouts());
		applicationModel.setNO_INTERFAC_APP(applicationVO.getNoInterfacApp());
		applicationModel.setDATA_VOLUME_DAY(applicationVO.getDataVolumeDay());
		applicationModel.setTECH_SUPRT_AVLBT(applicationVO.getTechSuprtAvlbt());
		applicationModel.setCODE_AVLBT(applicationVO.getCodeAvlbt());
		applicationModel.setINCREA_DATA_VLM_YR(applicationVO.getIncreaDataVlmYr());
		applicationModel.setREG_COMPLIANCE(applicationVO.getRegCompliance());
		
		applicationModel.setREV_IMPACT(applicationVO.getRevImpact());
		applicationModel.setIMPATC_TO_CUSTOMER(applicationVO.getImpatcToCustomer());
		applicationModel.setRECOVERY_DURATION(applicationVO.getRecoveryDuration());
		applicationModel.setIMPACT_UP_DN_STREAM(applicationVO.getImpactUpDnStream());
		applicationModel.setIMPACT_BRAND_IMG(applicationVO.getImpactBrandImg());
		applicationModel.setAPP_PERF_SLA(applicationVO.getAppPerfSla());
		applicationModel.setSCALABILITY(applicationVO.getScalability());
		applicationModel.setOBSOLETE_INFRA(applicationVO.getObsoleteInfra());
		applicationModel.setDR_ENV_AVLBT(applicationVO.getDrEnvAvlbt());
		applicationModel.setNW_INFRA_ISSUE_PM(applicationVO.getNwInfraIssuePm());
		applicationModel.setSME_AVLBT(applicationVO.getSmeAvlbt());
		applicationModel.setVENDOR_EXPT_CTS(applicationVO.getVendorExptCts());
		applicationModel.setVENDOR_EXPT_ENSONO(applicationVO.getVendorExptEnsono());
		applicationModel.setAVALBT_BIZ_USERS(applicationVO.getAvlbtBizUsers());
		applicationModel.setSEC_VLNBTY_CODE(applicationVO.getSecVlnbtyCode());
		applicationModel.setSEC_VLNBTY_INFRA(applicationVO.getSecVlnbtyInfra());
		applicationModel.setCOMP_VLNBLTS(applicationVO.getCompVlnblts());
		applicationModel.setCONF_MGT_VLNBTY(applicationVO.getConfMgtVlnbty());
		
	}

	/*private ApplicationVO calculateStabilityScores(ApplicationVO applicationVO){
		
		return null;
	}
	
	private ApplicationVO calculateComplexityScores(ApplicationVO applicationVO){
		
		return null;
	}

	private ApplicationVO calculateRecoveryScores(ApplicationVO applicationVO){
	
		return null;
	}

	private ApplicationVO calculateInfraRiskScores(ApplicationVO applicationVO){
	
		return null;
	}
	
	private ApplicationVO calculatePeopleRiskScores(ApplicationVO applicationVO){
		
		return null;
	}
	
	private ApplicationVO calculateSecurityRiskScores(ApplicationVO applicationVO){
		
		String secVlnbtyCodeVal = applicationVO.getSecVlnbtyCode();
		String secVlnbtyInfraVal = applicationVO.getSecVlnbtyInfra();
		String compVlnbltsVal = applicationVO.getCompVlnblts();
				
		return null;
	}*/
	
	public static List<ApplicationVO> simulateApplicationRecords(){
		
		ApplicationVO applicationVO1 = new ApplicationVO();
		applicationVO1.setAppId(1);
		applicationVO1.setAppName("OSP - Online");
		applicationVO1.setAppCategory("Data Supply Chain");
		applicationVO1.setSupportScope("General");
		applicationVO1.setAgeInYears("> 25 years");
		applicationVO1.setNoReleaseUbr(5);
		applicationVO1.setNoTktsVlm(5);
		applicationVO1.setNoSev1Sev2(5);
		applicationVO1.setNoIncTkt(5);
		applicationVO1.setNoSrtCount(5);
		applicationVO1.setNoTktRslvVendor("No");
		applicationVO1.setManualIntervension("Low < 2 Hours/Day");
		applicationVO1.setNoOutofoffCallouts(0);
		applicationVO1.setNoInterfacApp(1);
		applicationVO1.setDataVolumeDay("Low < 50K Txns");
		applicationVO1.setTechSuprtAvlbt("Legacy & Support Available");
		applicationVO1.setCodeAvlbt("Yes");
		applicationVO1.setIncreaDataVlmYr("Low < 3%");
		applicationVO1.setRegCompliance("No");
		applicationVO1.setRevImpact("Direct but not immediate Revenue Impact");
		applicationVO1.setImpatcToCustomer("Medium - 10 to 50 users");
		applicationVO1.setRecoveryDuration("< 4 Hours");
		applicationVO1.setImpactUpDnStream("< 5 systems");
		applicationVO1.setImpactBrandImg("Yes");
		applicationVO1.setAppPerfSla("Met SLA");
		applicationVO1.setScalability("No");
		applicationVO1.setObsoleteInfra("No");
		applicationVO1.setDrEnvAvlbt("Yes");
		applicationVO1.setNwInfraIssuePm("< 2");
		applicationVO1.setSmeAvlbt("Yes - 1 SME");
		applicationVO1.setVendorExptCts("Yes");
		applicationVO1.setVendorExptEnsono("Yes");
		applicationVO1.setAvlbtBizUsers("No");
		applicationVO1.setSecVlnbtyCode("No");
		applicationVO1.setSecVlnbtyInfra("No");
		applicationVO1.setCompVlnblts("No");
		applicationVO1.setConfMgtVlnbty("Yes");
		
		applicationVO1.setAppRiskMaintColor("YELLOW");
		applicationVO1.setAppRiskMaintCategory("C");
		applicationVO1.setAppRiskMaintScore("1.9");
		applicationVO1.setAppInfraRiskColor("GREEN");
		applicationVO1.setAppInfraRiskCategory("C");
		applicationVO1.setAppInfraRiskScore("1");
		applicationVO1.setAppSecurityRiskColor("RED");
		applicationVO1.setAppSecurityRiskCategory("A");
		applicationVO1.setAppSecurityRiskScore("9");
		applicationVO1.setAppPeopleRiskColor("RED");
		applicationVO1.setAppPeopleRiskCategory("A");
		applicationVO1.setAppPeopleRiskScore("1.8");
		
		ApplicationVO applicationVO2 = new ApplicationVO();
		applicationVO2.setAppId(2);
		applicationVO2.setAppName("AOS - Batch");
		applicationVO2.setAppCategory("Data Supply Chain");
		applicationVO2.setSupportScope("General");
		applicationVO2.setAgeInYears("> 25 years");
		applicationVO2.setNoReleaseUbr(15);
		applicationVO2.setNoTktsVlm(723);
		applicationVO2.setNoSev1Sev2(0);
		applicationVO2.setNoIncTkt(515);
		applicationVO2.setNoSrtCount(0);
		applicationVO2.setNoTktRslvVendor("No");
		applicationVO2.setManualIntervension("High >4 Hours/Day");
		applicationVO2.setNoOutofoffCallouts(50);
		applicationVO2.setNoInterfacApp(10);
		applicationVO2.setDataVolumeDay("Medium > 50K Txns to 1 Mn Txns");
		applicationVO2.setTechSuprtAvlbt("Legacy & Support Available");
		applicationVO2.setCodeAvlbt("Yes");
		applicationVO2.setIncreaDataVlmYr("Low < 3%");
		applicationVO2.setRegCompliance("No");
		applicationVO2.setRevImpact("Direct but not immediate Revenue Impact");
		applicationVO2.setImpatcToCustomer("Medium - 10 to 50 users");
		applicationVO2.setRecoveryDuration("4 to 12 Hours");
		applicationVO2.setImpactUpDnStream("< 5 systems");
		applicationVO2.setImpactBrandImg("No");
		applicationVO2.setAppPerfSla("Met SLA");
		applicationVO2.setScalability("No");
		applicationVO2.setObsoleteInfra("No");
		applicationVO2.setDrEnvAvlbt("Yes");
		applicationVO2.setNwInfraIssuePm("< 2");
		applicationVO2.setSmeAvlbt("Yes - 1 SME");
		applicationVO2.setVendorExptCts("Yes");
		applicationVO2.setVendorExptEnsono("Yes");
		applicationVO2.setAvlbtBizUsers("No");
		applicationVO2.setSecVlnbtyCode("No");
		applicationVO2.setSecVlnbtyInfra("No");
		applicationVO2.setCompVlnblts("No");
		applicationVO2.setConfMgtVlnbty("Yes");
		
		applicationVO2.setAppRiskMaintColor("GREEN");
		applicationVO2.setAppRiskMaintCategory("D");
		applicationVO2.setAppRiskMaintScore("2.5");
		applicationVO2.setAppInfraRiskColor("RED");
		applicationVO2.setAppInfraRiskCategory("A");
		applicationVO2.setAppInfraRiskScore("0.9");
		applicationVO2.setAppSecurityRiskColor("YELLOW");
		applicationVO2.setAppSecurityRiskCategory("B");
		applicationVO2.setAppSecurityRiskScore("5.9");
		applicationVO2.setAppPeopleRiskColor("RED");
		applicationVO2.setAppPeopleRiskCategory("A");
		applicationVO2.setAppPeopleRiskScore("3.8");
		
		List<ApplicationVO> applicationVOList = new ArrayList<ApplicationVO>();
		applicationVOList.add(applicationVO1);
		applicationVOList.add(applicationVO2);
		
		return applicationVOList;
	}
}
