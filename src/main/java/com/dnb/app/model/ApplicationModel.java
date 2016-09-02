package com.dnb.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "app_risk_profile")
//@SequenceGenerator(name = "arp_seq", sequenceName = "arp_appid_seq", allocationSize=1)
public class ApplicationModel implements Serializable {

	private Integer APP_ID;

	private String APP_NAME;
	private String APP_CATEGORY;
	private String SUPPORT_SCOPE;

	private String AGE_IN_YEARS;
	private Integer NO_RELEASE_UBR;
	private Integer NO_TKTS_VLM;
	private Integer NO_SEV1_SEV2;
	private Integer NO_INC_TKT;
	private Integer NO_SRT_COUNT;
	private String NO_TKT_RSLV_W_VENDOR;
	private String MANUAL_INTERVENSION;
	private Integer NO_OUTOFOFF_CALLOUTS;

	private Integer NO_INTERFAC_APP;
	private String DATA_VOLUME_DAY;
	private String TECH_SUPRT_AVLBT;
	private String CODE_AVLBT;
	private String INCREA_DATA_VLM_YR;
	private String REG_COMPLIANCE;

	private String REV_IMPACT;
	private String IMPATC_TO_CUSTOMER;
	private String RECOVERY_DURATION;
	private String IMPACT_UP_DN_STREAM;
	private String IMPACT_BRAND_IMG;

	private String APP_PERF_SLA;
	private String SCALABILITY;
	private String OBSOLETE_INFRA;
	private String DR_ENV_AVLBT;
	private String NW_INFRA_ISSUE_PM;

	private String SME_AVLBT;
	private String VENDOR_EXPT_CTS;
	private String VENDOR_EXPT_ENSONO;
	private String AVALBT_BIZ_USERS;

	private String SEC_VLNBTY_CODE;
	private String SEC_VLNBTY_INFRA;
	private String COMP_VLNBLTS;
	private String CONF_MGT_VLNBTY;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "APP_ID")
	public Integer getAPP_ID() {
		return APP_ID;
	}
	public void setAPP_ID(Integer aPP_ID) {
		APP_ID = aPP_ID;
	}
	
	/** --------------------------------------------------- */
	
	@Column(name = "APP_NAME")
	public String getAPP_NAME() {
		return APP_NAME;
	}
	public void setAPP_NAME(String aPP_NAME) {
		APP_NAME = aPP_NAME;
	}
	
	@Column(name = "APP_CATEGORY")
	public String getAPP_CATEGORY() {
		return APP_CATEGORY;
	}
	public void setAPP_CATEGORY(String aPP_CATEGORY) {
		APP_CATEGORY = aPP_CATEGORY;
	}
	
	@Column(name = "SUPPORT_SCOPE")
	public String getSUPPORT_SCOPE() {
		return SUPPORT_SCOPE;
	}
	public void setSUPPORT_SCOPE(String sUPPORT_SCOPE) {
		SUPPORT_SCOPE = sUPPORT_SCOPE;
	}
	
	/** --------------------------------------------------- */
	
	@Column(name = "AGE_IN_YEARS")
	public String getAGE_IN_YEARS() {
		return AGE_IN_YEARS;
	}
	public void setAGE_IN_YEARS(String aGE_IN_YEARS) {
		AGE_IN_YEARS = aGE_IN_YEARS;
	}
	
	@Column(name = "NO_RELEASE_UBR")
	public Integer getNO_RELEASE_UBR() {
		return NO_RELEASE_UBR;
	}
	public void setNO_RELEASE_UBR(Integer nO_RELEASE_UBR) {
		NO_RELEASE_UBR = nO_RELEASE_UBR;
	}
	
	@Column(name = "NO_TKTS_VLM")
	public Integer getNO_TKTS_VLM() {
		return NO_TKTS_VLM;
	}
	public void setNO_TKTS_VLM(Integer nO_TKTS_VLM) {
		NO_TKTS_VLM = nO_TKTS_VLM;
	}
	
	@Column(name = "NO_SEV1_SEV2")
	public Integer getNO_SEV1_SEV2() {
		return NO_SEV1_SEV2;
	}
	public void setNO_SEV1_SEV2(Integer nO_SEV1_SEV2) {
		NO_SEV1_SEV2 = nO_SEV1_SEV2;
	}
	
	@Column(name = "NO_INC_TKT")
	public Integer getNO_INC_TKT() {
		return NO_INC_TKT;
	}
	public void setNO_INC_TKT(Integer nO_INC_TKT) {
		NO_INC_TKT = nO_INC_TKT;
	}
	
	@Column(name = "NO_SRT_COUNT")
	public Integer getNO_SRT_COUNT() {
		return NO_SRT_COUNT;
	}
	public void setNO_SRT_COUNT(Integer nO_SRT_COUNT) {
		NO_SRT_COUNT = nO_SRT_COUNT;
	}
	
	@Column(name = "NO_TKT_RSLV_W_VENDOR")
	public String getNO_TKT_RSLV_W_VENDOR() {
		return NO_TKT_RSLV_W_VENDOR;
	}
	public void setNO_TKT_RSLV_W_VENDOR(String nO_TKT_RSLV_W_VENDOR) {
		NO_TKT_RSLV_W_VENDOR = nO_TKT_RSLV_W_VENDOR;
	}
	
	@Column(name = "MANUAL_INTERVENSION")
	public String getMANUAL_INTERVENSION() {
		return MANUAL_INTERVENSION;
	}
	public void setMANUAL_INTERVENSION(String mANUAL_INTERVENSION) {
		MANUAL_INTERVENSION = mANUAL_INTERVENSION;
	}
	
	@Column(name = "NO_OUTOFOFF_CALLOUTS")
	public Integer getNO_OUTOFOFF_CALLOUTS() {
		return NO_OUTOFOFF_CALLOUTS;
	}
	public void setNO_OUTOFOFF_CALLOUTS(Integer nO_OUTOFOFF_CALLOUTS) {
		NO_OUTOFOFF_CALLOUTS = nO_OUTOFOFF_CALLOUTS;
	}
	
	/** --------------------------------------------------- */
	
	@Column(name = "NO_INTERFAC_APP")
	public Integer getNO_INTERFAC_APP() {
		return NO_INTERFAC_APP;
	}
	public void setNO_INTERFAC_APP(Integer nO_INTERFAC_APP) {
		NO_INTERFAC_APP = nO_INTERFAC_APP;
	}
	
	@Column(name = "DATA_VOLUME_DAY")
	public String getDATA_VOLUME_DAY() {
		return DATA_VOLUME_DAY;
	}
	public void setDATA_VOLUME_DAY(String dATA_VOLUME_DAY) {
		DATA_VOLUME_DAY = dATA_VOLUME_DAY;
	}
	
	@Column(name = "TECH_SUPRT_AVLBT")
	public String getTECH_SUPRT_AVLBT() {
		return TECH_SUPRT_AVLBT;
	}
	public void setTECH_SUPRT_AVLBT(String tECH_SUPRT_AVLBT) {
		TECH_SUPRT_AVLBT = tECH_SUPRT_AVLBT;
	}
	
	@Column(name = "CODE_AVLBT")
	public String getCODE_AVLBT() {
		return CODE_AVLBT;
	}
	public void setCODE_AVLBT(String cODE_AVLBT) {
		CODE_AVLBT = cODE_AVLBT;
	}
	
	@Column(name = "INCREA_DATA_VLM_YR")
	public String getINCREA_DATA_VLM_YR() {
		return INCREA_DATA_VLM_YR;
	}
	public void setINCREA_DATA_VLM_YR(String iNCREA_DATA_VLM_YR) {
		INCREA_DATA_VLM_YR = iNCREA_DATA_VLM_YR;
	}
	
	@Column(name = "REG_COMPLIANCE")
	public String getREG_COMPLIANCE() {
		return REG_COMPLIANCE;
	}
	public void setREG_COMPLIANCE(String rEG_COMPLIANCE) {
		REG_COMPLIANCE = rEG_COMPLIANCE;
	}
	
	/** --------------------------------------------------- */
	
	@Column(name = "REV_IMPACT")
	public String getREV_IMPACT() {
		return REV_IMPACT;
	}
	public void setREV_IMPACT(String rEV_IMPACT) {
		REV_IMPACT = rEV_IMPACT;
	}
	
	@Column(name = "IMPATC_TO_CUSTOMER")
	public String getIMPATC_TO_CUSTOMER() {
		return IMPATC_TO_CUSTOMER;
	}
	public void setIMPATC_TO_CUSTOMER(String iMPATC_TO_CUSTOMER) {
		IMPATC_TO_CUSTOMER = iMPATC_TO_CUSTOMER;
	}
	
	@Column(name = "RECOVERY_DURATION")
	public String getRECOVERY_DURATION() {
		return RECOVERY_DURATION;
	}
	public void setRECOVERY_DURATION(String rECOVERY_DURATION) {
		RECOVERY_DURATION = rECOVERY_DURATION;
	}
	
	@Column(name = "IMPACT_UP_DN_STREAM")
	public String getIMPACT_UP_DN_STREAM() {
		return IMPACT_UP_DN_STREAM;
	}
	public void setIMPACT_UP_DN_STREAM(String iMPACT_UP_DN_STREAM) {
		IMPACT_UP_DN_STREAM = iMPACT_UP_DN_STREAM;
	}
	
	@Column(name = "IMPACT_BRAND_IMG")
	public String getIMPACT_BRAND_IMG() {
		return IMPACT_BRAND_IMG;
	}
	public void setIMPACT_BRAND_IMG(String iMPACT_BRAND_IMG) {
		IMPACT_BRAND_IMG = iMPACT_BRAND_IMG;
	}
	
	/** --------------------------------------------------- */
	
	@Column(name = "APP_PERF_SLA")
	public String getAPP_PERF_SLA() {
		return APP_PERF_SLA;
	}
	public void setAPP_PERF_SLA(String aPP_PERF_SLA) {
		APP_PERF_SLA = aPP_PERF_SLA;
	}
	
	@Column(name = "SCALABILITY")
	public String getSCALABILITY() {
		return SCALABILITY;
	}
	public void setSCALABILITY(String sCALABILITY) {
		SCALABILITY = sCALABILITY;
	}
	
	@Column(name = "OBSOLETE_INFRA")
	public String getOBSOLETE_INFRA() {
		return OBSOLETE_INFRA;
	}
	public void setOBSOLETE_INFRA(String oBSOLETE_INFRA) {
		OBSOLETE_INFRA = oBSOLETE_INFRA;
	}
	
	@Column(name = "DR_ENV_AVLBT")
	public String getDR_ENV_AVLBT() {
		return DR_ENV_AVLBT;
	}
	public void setDR_ENV_AVLBT(String dR_ENV_AVLBT) {
		DR_ENV_AVLBT = dR_ENV_AVLBT;
	}
	
	@Column(name = "NW_INFRA_ISSUE_PM")
	public String getNW_INFRA_ISSUE_PM() {
		return NW_INFRA_ISSUE_PM;
	}
	public void setNW_INFRA_ISSUE_PM(String nW_INFRA_ISSUE_PM) {
		NW_INFRA_ISSUE_PM = nW_INFRA_ISSUE_PM;
	}
	
	/** --------------------------------------------------- */
	
	@Column(name = "SME_AVLBT")
	public String getSME_AVLBT() {
		return SME_AVLBT;
	}
	public void setSME_AVLBT(String sME_AVLBT) {
		SME_AVLBT = sME_AVLBT;
	}
	
	@Column(name = "VENDOR_EXPT_CTS")
	public String getVENDOR_EXPT_CTS() {
		return VENDOR_EXPT_CTS;
	}
	public void setVENDOR_EXPT_CTS(String vENDOR_EXPT_CTS) {
		VENDOR_EXPT_CTS = vENDOR_EXPT_CTS;
	}
	
	@Column(name = "VENDOR_EXPT_ENSONO")
	public String getVENDOR_EXPT_ENSONO() {
		return VENDOR_EXPT_ENSONO;
	}
	public void setVENDOR_EXPT_ENSONO(String vENDOR_EXPT_ENSONO) {
		VENDOR_EXPT_ENSONO = vENDOR_EXPT_ENSONO;
	}
	
	@Column(name = "AVALBT_BIZ_USERS")
	public String getAVALBT_BIZ_USERS() {
		return AVALBT_BIZ_USERS;
	}
	public void setAVALBT_BIZ_USERS(String aVALBT_BIZ_USERS) {
		AVALBT_BIZ_USERS = aVALBT_BIZ_USERS;
	}
	
	@Column(name = "SEC_VLNBTY_CODE")
	public String getSEC_VLNBTY_CODE() {
		return SEC_VLNBTY_CODE;
	}
	public void setSEC_VLNBTY_CODE(String sEC_VLNBTY_CODE) {
		SEC_VLNBTY_CODE = sEC_VLNBTY_CODE;
	}
	
	@Column(name = "SEC_VLNBTY_INFRA")
	public String getSEC_VLNBTY_INFRA() {
		return SEC_VLNBTY_INFRA;
	}
	public void setSEC_VLNBTY_INFRA(String sEC_VLNBTY_INFRA) {
		SEC_VLNBTY_INFRA = sEC_VLNBTY_INFRA;
	}
	
	@Column(name = "COMP_VLNBLTS")
	public String getCOMP_VLNBLTS() {
		return COMP_VLNBLTS;
	}
	public void setCOMP_VLNBLTS(String cOMP_VLNBLTS) {
		COMP_VLNBLTS = cOMP_VLNBLTS;
	}
	
	@Column(name = "CONF_MGT_VLNBTY")
	public String getCONF_MGT_VLNBTY() {
		return CONF_MGT_VLNBTY;
	}
	public void setCONF_MGT_VLNBTY(String cONF_MGT_VLNBTY) {
		CONF_MGT_VLNBTY = cONF_MGT_VLNBTY;
	}
	
	/** --------------------------------------------------- */

}
