package com.dnb.app.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ApplicationVO")
public class ApplicationVO {

	private Integer appId = null;

	private String appName = null;
	private String appCategory = null;
	private String supportScope = null;

	/** Stability Risk */
	private String ageInYears = null;
	private Integer noReleaseUbr = null;
	private Integer noTktsVlm = null;
	private Integer noSev1Sev2 = null;
	private Integer noIncTkt = null;
	private Integer noSrtCount = null;
	private String noTktRslvVendor = null; // Changed
	private String manualIntervension = null;
	private Integer noOutofoffCallouts = null;

	private String noTktsVlmContrb = null;
	private String noSev1Sev2Contrb = null;
	private String noSrtCountContrb = null;
	private String noReleaseUbrContrb = null;
	private String manualIntervensionContrb = null;
	private String noTktRslvVendorContrb = null;
	
	/** Complexity Risk */
	private Integer noInterfacApp = null;
	private String dataVolumeDay = null;
	private String techSuprtAvlbt = null;
	private String codeAvlbt = null;
	private String increaDataVlmYr = null;
	private String regCompliance = null;
	
	private String noInterfacAppContrb = null;
	private String dataVolumeDayContrb = null;
	private String techSuprtAvlbtContrb = null;
	private String codeAvlbtContrb = null;
	private String increaDataVlmYrContrb = null;
	private String regComplianceContrb = null;

	/** Impact & Recovery Risk */
	private String revImpact = null;
	private String impatcToCustomer = null;
	private String recoveryDuration = null;
	private String impactUpDnStream = null;
	private String impactBrandImg = null;
	private String bizCriticalityText  = null;
	
	private String revImpactContrb = null;
	private String impatcToCustomerContrb = null; 
	private String recoveryDurationContrb = null;
	private String impactUpDnStreamContrb = null;
	private String impactBrandImgContrb = null;

	/** Infra Risk */
	private String appPerfSla = null;
	private String scalability = null;
	private String obsoleteInfra = null;
	private String drEnvAvlbt = null;
	private String nwInfraIssuePm = null;
	
	private String appPerfSlaContrb = null;
	private String scalabilityContrb = null;
	private String obsoleteInfraContrb = null;
	private String drEnvAvlbtContrb = null;
	private String nwInfraIssuePmContrb = null;

	/** People Risk */
	private String smeAvlbt = null;
	private String vendorExptCts = null;
	private String vendorExptEnsono = null;
	private String avlbtBizUsers = null;
	
	private String smeAvlbtContrb = null;
	private String vendorExptCtsContrb = null;
	private String vendorExptEnsonoContrb = null;
	private String avlbtBizUsersContrb = null;
	
	/** Security Risk */
	private String secVlnbtyCode = null;
	private String secVlnbtyInfra = null;
	private String compVlnblts = null;
	private String confMgtVlnbty = null;
	
	private String secVlnbtyCodeContrb = null;
	private String secVlnbtyInfraContrb = null;
	private String compVlnbltsContrb = null;
	
	/** SCORE CARDS */
	private String appRiskMaintColor = null;
	private String appRiskMaintCategory = null;
	private String appRiskMaintScore = null;
	
	private String appInfraRiskColor = null;
	private String appInfraRiskCategory = null;
	private String appInfraRiskScore = null;
	
	private String appSecurityRiskColor = null;
	private String appSecurityRiskCategory = null;
	private String appSecurityRiskScore = null;
	
	private String appPeopleRiskColor = null;
	private String appPeopleRiskCategory = null;
	private String appPeopleRiskScore = null;
	
	private String changeStatusSummary = null;
	
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppCategory() {
		return appCategory;
	}
	public void setAppCategory(String appCategory) {
		this.appCategory = appCategory;
	}
	public String getSupportScope() {
		return supportScope;
	}
	public void setSupportScope(String supportScope) {
		this.supportScope = supportScope;
	}
	public String getAgeInYears() {
		return ageInYears;
	}
	public void setAgeInYears(String ageInYears) {
		this.ageInYears = ageInYears;
	}
	public Integer getNoReleaseUbr() {
		return noReleaseUbr;
	}
	public void setNoReleaseUbr(Integer noReleaseUbr) {
		this.noReleaseUbr = noReleaseUbr;
	}
	public Integer getNoTktsVlm() {
		return noTktsVlm;
	}
	public void setNoTktsVlm(Integer noTktsVlm) {
		this.noTktsVlm = noTktsVlm;
	}
	public Integer getNoSev1Sev2() {
		return noSev1Sev2;
	}
	public void setNoSev1Sev2(Integer noSev1Sev2) {
		this.noSev1Sev2 = noSev1Sev2;
	}
	public Integer getNoIncTkt() {
		return noIncTkt;
	}
	public void setNoIncTkt(Integer noIncTkt) {
		this.noIncTkt = noIncTkt;
	}
	public Integer getNoSrtCount() {
		return noSrtCount;
	}
	public void setNoSrtCount(Integer noSrtCount) {
		this.noSrtCount = noSrtCount;
	}
	public String getNoTktRslvVendor() {
		return noTktRslvVendor;
	}
	public void setNoTktRslvVendor(String noTktRslvVendor) {
		this.noTktRslvVendor = noTktRslvVendor;
	}
	public String getManualIntervension() {
		return manualIntervension;
	}
	public void setManualIntervension(String manualIntervension) {
		this.manualIntervension = manualIntervension;
	}
	public Integer getNoOutofoffCallouts() {
		return noOutofoffCallouts;
	}
	public void setNoOutofoffCallouts(Integer noOutofoffCallouts) {
		this.noOutofoffCallouts = noOutofoffCallouts;
	}
	public Integer getNoInterfacApp() {
		return noInterfacApp;
	}
	public void setNoInterfacApp(Integer noInterfacApp) {
		
		this.noInterfacApp = noInterfacApp;
	}
	public String getDataVolumeDay() {
		return dataVolumeDay;
	}
	public void setDataVolumeDay(String dataVolumeDay) {
		this.dataVolumeDay = dataVolumeDay;
	}
	public String getTechSuprtAvlbt() {
		return techSuprtAvlbt;
	}
	public void setTechSuprtAvlbt(String techSuprtAvlbt) {
		this.techSuprtAvlbt = techSuprtAvlbt;
	}
	public String getCodeAvlbt() {
		return codeAvlbt;
	}
	public void setCodeAvlbt(String codeAvlbt) {
		this.codeAvlbt = codeAvlbt;
	}
	public String getIncreaDataVlmYr() {
		return increaDataVlmYr;
	}
	public void setIncreaDataVlmYr(String increaDataVlmYr) {
		this.increaDataVlmYr = increaDataVlmYr;
	}
	public String getRegCompliance() {
		return regCompliance;
	}
	public void setRegCompliance(String regCompliance) {
		this.regCompliance = regCompliance;
	}
	public String getRevImpact() {
		return revImpact;
	}
	public void setRevImpact(String revImpact) {
		this.revImpact = revImpact;
	}
	public String getImpatcToCustomer() {
		return impatcToCustomer;
	}
	public void setImpatcToCustomer(String impatcToCustomer) {
		this.impatcToCustomer = impatcToCustomer;
	}
	public String getRecoveryDuration() {
		return recoveryDuration;
	}
	public void setRecoveryDuration(String recoveryDuration) {
		this.recoveryDuration = recoveryDuration;
	}
	public String getImpactUpDnStream() {
		return impactUpDnStream;
	}
	public void setImpactUpDnStream(String impactUpDnStream) {
		this.impactUpDnStream = impactUpDnStream;
	}
	public String getImpactBrandImg() {
		return impactBrandImg;
	}
	public void setImpactBrandImg(String impactBrandImg) {
		this.impactBrandImg = impactBrandImg;
	}
	
	public String getBizCriticalityText() {
		return bizCriticalityText;
	}
	public void setBizCriticalityText(String bizCriticalityText) {
		this.bizCriticalityText = bizCriticalityText;
	}
	
	public String getAppPerfSla() {
		return appPerfSla;
	}
	public void setAppPerfSla(String appPerfSla) {
		this.appPerfSla = appPerfSla;
	}
	public String getScalability() {
		return scalability;
	}
	public void setScalability(String scalability) {
		this.scalability = scalability;
	}
	public String getObsoleteInfra() {
		return obsoleteInfra;
	}
	public void setObsoleteInfra(String obsoleteInfra) {
		this.obsoleteInfra = obsoleteInfra;
	}
	public String getDrEnvAvlbt() {
		return drEnvAvlbt;
	}
	public void setDrEnvAvlbt(String drEnvAvlbt) {
		this.drEnvAvlbt = drEnvAvlbt;
	}
	public String getNwInfraIssuePm() {
		return nwInfraIssuePm;
	}
	public void setNwInfraIssuePm(String nwInfraIssuePm) {
		this.nwInfraIssuePm = nwInfraIssuePm;
	}
	public String getSmeAvlbt() {
		return smeAvlbt;
	}
	public void setSmeAvlbt(String smeAvlbt) {
		this.smeAvlbt = smeAvlbt;
	}
	public String getVendorExptCts() {
		return vendorExptCts;
	}
	public void setVendorExptCts(String vendorExptCts) {
		this.vendorExptCts = vendorExptCts;
	}
	public String getVendorExptEnsono() {
		return vendorExptEnsono;
	}
	public void setVendorExptEnsono(String vendorExptEnsono) {
		this.vendorExptEnsono = vendorExptEnsono;
	}
	public String getAvlbtBizUsers() {
		return avlbtBizUsers;
	}
	public void setAvlbtBizUsers(String avlbtBizUsers) {
		this.avlbtBizUsers = avlbtBizUsers;
	}
	public String getSecVlnbtyCode() {
		return secVlnbtyCode;
	}
	public void setSecVlnbtyCode(String secVlnbtyCode) {
		this.secVlnbtyCode = secVlnbtyCode;
	}
	public String getSecVlnbtyInfra() {
		return secVlnbtyInfra;
	}
	public void setSecVlnbtyInfra(String secVlnbtyInfra) {
		this.secVlnbtyInfra = secVlnbtyInfra;
	}
	public String getCompVlnblts() {
		return compVlnblts;
	}
	public void setCompVlnblts(String compVlnblts) {
		this.compVlnblts = compVlnblts;
	}
	public String getConfMgtVlnbty() {
		return confMgtVlnbty;
	}
	public void setConfMgtVlnbty(String confMgtVlnbty) {
		this.confMgtVlnbty = confMgtVlnbty;
	}
	
	/** Calculated Stuff */
	
	public String getAppRiskMaintScore() {
		return appRiskMaintScore;
	}
	public void setAppRiskMaintScore(String appRiskMaintScore) {
		this.appRiskMaintScore = appRiskMaintScore;
	}
	public String getAppRiskMaintColor() {
		return appRiskMaintColor;
	}
	public void setAppRiskMaintColor(String appRiskMaintColor) {
		this.appRiskMaintColor = appRiskMaintColor;
	}
	public String getAppRiskMaintCategory() {
		return appRiskMaintCategory;
	}
	public void setAppRiskMaintCategory(String appRiskMaintCategory) {
		this.appRiskMaintCategory = appRiskMaintCategory;
	}
	public String getAppInfraRiskScore() {
		return appInfraRiskScore;
	}
	public void setAppInfraRiskScore(String appInfraRiskScore) {
		this.appInfraRiskScore = appInfraRiskScore;
	}
	public String getAppInfraRiskColor() {
		return appInfraRiskColor;
	}
	public void setAppInfraRiskColor(String appInfraRiskColor) {
		this.appInfraRiskColor = appInfraRiskColor;
	}
	public String getAppInfraRiskCategory() {
		return appInfraRiskCategory;
	}
	public void setAppInfraRiskCategory(String appInfraRiskCategory) {
		this.appInfraRiskCategory = appInfraRiskCategory;
	}
	public String getAppSecurityRiskScore() {
		return appSecurityRiskScore;
	}
	public void setAppSecurityRiskScore(String appSecurityRiskScore) {
		this.appSecurityRiskScore = appSecurityRiskScore;
	}
	public String getAppSecurityRiskColor() {
		return appSecurityRiskColor;
	}
	public void setAppSecurityRiskColor(String appSecurityRiskColor) {
		this.appSecurityRiskColor = appSecurityRiskColor;
	}
	public String getAppSecurityRiskCategory() {
		return appSecurityRiskCategory;
	}
	public void setAppSecurityRiskCategory(String appSecurityRiskCategory) {
		this.appSecurityRiskCategory = appSecurityRiskCategory;
	}
	public String getAppPeopleRiskScore() {
		return appPeopleRiskScore;
	}
	public void setAppPeopleRiskScore(String appPeopleRiskScore) {
		this.appPeopleRiskScore = appPeopleRiskScore;
	}
	public String getAppPeopleRiskColor() {
		return appPeopleRiskColor;
	}
	public void setAppPeopleRiskColor(String appPeopleRiskColor) {
		this.appPeopleRiskColor = appPeopleRiskColor;
	}
	public String getAppPeopleRiskCategory() {
		return appPeopleRiskCategory;
	}
	public void setAppPeopleRiskCategory(String appPeopleRiskCategory) {
		this.appPeopleRiskCategory = appPeopleRiskCategory;
	}
	
	public String getChangeStatusSummary() {
		return changeStatusSummary;
	}
	public void setChangeStatusSummary(String changeStatusSummary) {
		this.changeStatusSummary = changeStatusSummary;
	}
	
	
	/** Contribution Parameters [Stability Risk] */
	public String getNoTktsVlmContrb() {
		return noTktsVlmContrb;
	}
	public void setNoTktsVlmContrb(String noTktsVlmContrb) {
		this.noTktsVlmContrb = noTktsVlmContrb;
	}
	public String getNoSev1Sev2Contrb() {
		return noSev1Sev2Contrb;
	}
	public void setNoSev1Sev2Contrb(String noSev1Sev2Contrb) {
		this.noSev1Sev2Contrb = noSev1Sev2Contrb;
	}
	public String getNoSrtCountContrb() {
		return noSrtCountContrb;
	}
	public void setNoSrtCountContrb(String noSrtCountContrb) {
		this.noSrtCountContrb = noSrtCountContrb;
	}
	public String getNoReleaseUbrContrb() {
		return noReleaseUbrContrb;
	}
	public void setNoReleaseUbrContrb(String noReleaseUbrContrb) {
		this.noReleaseUbrContrb = noReleaseUbrContrb;
	}
	public String getManualIntervensionContrb() {
		return manualIntervensionContrb;
	}
	public void setManualIntervensionContrb(String manualIntervensionContrb) {
		this.manualIntervensionContrb = manualIntervensionContrb;
	}
	public String getNoTktRslvVendorContrb() {
		return noTktRslvVendorContrb;
	}
	public void setNoTktRslvVendorContrb(String noTktRslvVendorContrb) {
		this.noTktRslvVendorContrb = noTktRslvVendorContrb;
	}
	
	/** Contribution Parameters [Complexity Risk] */
	public String getNoInterfacAppContrb() {
		return noInterfacAppContrb;
	}
	public void setNoInterfacAppContrb(String noInterfacAppContrb) {
		this.noInterfacAppContrb = noInterfacAppContrb;
	}
	public String getDataVolumeDayContrb() {
		return dataVolumeDayContrb;
	}
	public void setDataVolumeDayContrb(String dataVolumeDayContrb) {
		this.dataVolumeDayContrb = dataVolumeDayContrb;
	}
	public String getTechSuprtAvlbtContrb() {
		return techSuprtAvlbtContrb;
	}
	public void setTechSuprtAvlbtContrb(String techSuprtAvlbtContrb) {
		this.techSuprtAvlbtContrb = techSuprtAvlbtContrb;
	}
	public String getCodeAvlbtContrb() {
		return codeAvlbtContrb;
	}
	public void setCodeAvlbtContrb(String codeAvlbtContrb) {
		this.codeAvlbtContrb = codeAvlbtContrb;
	}
	public String getIncreaDataVlmYrContrb() {
		return increaDataVlmYrContrb;
	}
	public void setIncreaDataVlmYrContrb(String increaDataVlmYrContrb) {
		this.increaDataVlmYrContrb = increaDataVlmYrContrb;
	}
	public String getRegComplianceContrb() {
		return regComplianceContrb;
	}
	public void setRegComplianceContrb(String regComplianceContrb) {
		this.regComplianceContrb = regComplianceContrb;
	}
	
	/** Contribution Parameters [Impact & Recovery Risk] */
	public String getRevImpactContrb() {
		return revImpactContrb;
	}
	public void setRevImpactContrb(String revImpactContrb) {
		this.revImpactContrb = revImpactContrb;
	}
	public String getImpatcToCustomerContrb() {
		return impatcToCustomerContrb;
	}
	public void setImpatcToCustomerContrb(String impatcToCustomerContrb) {
		this.impatcToCustomerContrb = impatcToCustomerContrb;
	}
	public String getRecoveryDurationContrb() {
		return recoveryDurationContrb;
	}
	public void setRecoveryDurationContrb(String recoveryDurationContrb) {
		this.recoveryDurationContrb = recoveryDurationContrb;
	}
	public String getImpactUpDnStreamContrb() {
		return impactUpDnStreamContrb;
	}
	public void setImpactUpDnStreamContrb(String impactUpDnStreamContrb) {
		this.impactUpDnStreamContrb = impactUpDnStreamContrb;
	}
	public String getImpactBrandImgContrb() {
		return impactBrandImgContrb;
	}
	public void setImpactBrandImgContrb(String impactBrandImgContrb) {
		this.impactBrandImgContrb = impactBrandImgContrb;
	}
	
	/** Contribution Parameters [People Risk] */
	public String getSmeAvlbtContrb() {
		return smeAvlbtContrb;
	}
	public void setSmeAvlbtContrb(String smeAvlbtContrb) {
		this.smeAvlbtContrb = smeAvlbtContrb;
	}
	public String getVendorExptCtsContrb() {
		return vendorExptCtsContrb;
	}
	public void setVendorExptCtsContrb(String vendorExptCtsContrb) {
		this.vendorExptCtsContrb = vendorExptCtsContrb;
	}
	public String getVendorExptEnsonoContrb() {
		return vendorExptEnsonoContrb;
	}
	public void setVendorExptEnsonoContrb(String vendorExptEnsonoContrb) {
		this.vendorExptEnsonoContrb = vendorExptEnsonoContrb;
	}
	public String getAvlbtBizUsersContrb() {
		return avlbtBizUsersContrb;
	}
	public void setAvlbtBizUsersContrb(String avlbtBizUsersContrb) {
		this.avlbtBizUsersContrb = avlbtBizUsersContrb;
	}
	
	/** Contribution Parameters [Security Risk] */
	public String getSecVlnbtyCodeContrb() {
		return secVlnbtyCodeContrb;
	}
	public void setSecVlnbtyCodeContrb(String secVlnbtyCodeContrb) {
		this.secVlnbtyCodeContrb = secVlnbtyCodeContrb;
	}
	public String getSecVlnbtyInfraContrb() {
		return secVlnbtyInfraContrb;
	}
	public void setSecVlnbtyInfraContrb(String secVlnbtyInfraContrb) {
		this.secVlnbtyInfraContrb = secVlnbtyInfraContrb;
	}
	public String getCompVlnbltsContrb() {
		return compVlnbltsContrb;
	}
	public void setCompVlnbltsContrb(String compVlnbltsContrb) {
		this.compVlnbltsContrb = compVlnbltsContrb;
	}
	
	/** Contribution Parameters [Infra Risk] */
	public String getAppPerfSlaContrb() {
		return appPerfSlaContrb;
	}
	public void setAppPerfSlaContrb(String appPerfSlaContrb) {
		this.appPerfSlaContrb = appPerfSlaContrb;
	}
	public String getScalabilityContrb() {
		return scalabilityContrb;
	}
	public void setScalabilityContrb(String scalabilityContrb) {
		this.scalabilityContrb = scalabilityContrb;
	}
	public String getObsoleteInfraContrb() {
		return obsoleteInfraContrb;
	}
	public void setObsoleteInfraContrb(String obsoleteInfraContrb) {
		this.obsoleteInfraContrb = obsoleteInfraContrb;
	}
	public String getDrEnvAvlbtContrb() {
		return drEnvAvlbtContrb;
	}
	public void setDrEnvAvlbtContrb(String drEnvAvlbtContrb) {
		this.drEnvAvlbtContrb = drEnvAvlbtContrb;
	}
	public String getNwInfraIssuePmContrb() {
		return nwInfraIssuePmContrb;
	}
	public void setNwInfraIssuePmContrb(String nwInfraIssuePmContrb) {
		this.nwInfraIssuePmContrb = nwInfraIssuePmContrb;
	}
}
