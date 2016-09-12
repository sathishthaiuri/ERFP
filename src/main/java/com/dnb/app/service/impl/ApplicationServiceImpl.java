package com.dnb.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dnb.app.data.manager.ApplicationFramework;
import com.dnb.app.data.manager.ApplicationManager;
import com.dnb.app.exception.ServiceException;
import com.dnb.app.model.ApplicationModel;
import com.dnb.app.repository.api.ApplicationRepository;
import com.dnb.app.service.api.ApplicationService;
import com.dnb.app.vo.ApplicationVO;
import com.dnb.app.vo.UserDetailsVO;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;

	@Override
	@Transactional
	public void insertApplication(ApplicationVO applicationVO) throws ServiceException {

		ApplicationModel applicationModel = new ApplicationModel();
		applicationModel.setAPP_ID(applicationVO.getAppId());
		ApplicationManager.assignVo2ModelMapper(applicationVO, applicationModel);
		
		try {
			applicationRepository.insertApplication(applicationModel);
		} catch (Exception e) {
			throw new ServiceException(HttpStatus.INTERNAL_SERVER_ERROR,
					"Unable to add " + applicationVO.getAppName() + ". Please try again later!", "Warn");
		}

	}

	@Override
	@Transactional
	public ApplicationVO selectApplication(Integer applicationId) throws ServiceException {
		ApplicationModel applicationModel = applicationRepository.selectApplication(applicationId);
		return ApplicationManager.assignModel2VoMapper(applicationModel);
	}

	@Override
	@Transactional
	public void updateApplication(ApplicationVO applicationVO) throws ServiceException {
		ApplicationModel applicationModel = applicationRepository.selectApplication(applicationVO.getAppId());
		ApplicationManager.assignVo2ModelMapper(applicationVO, applicationModel);
		
		try {
			applicationRepository.updateApplication(applicationModel);
		} catch (Exception e) {
			throw new ServiceException(HttpStatus.INTERNAL_SERVER_ERROR,
					"Unable to modify " + applicationVO.getAppName() + ". Please try again later!", "Warn");
		}

	}

	@Override
	@Transactional
	public void deleteApplication(ApplicationVO applicationVO) throws ServiceException {
		
		try {
			applicationRepository.deleteApplication(applicationVO);
		} catch (Exception e) {
			throw new ServiceException(HttpStatus.INTERNAL_SERVER_ERROR,
					"Unable to remove the Application with Id: " + applicationVO.getAppId() + ". Please try again later!", "Warn");
		}
	}

	@Override
	@Transactional
	public List<ApplicationVO> listApplicationRecords() throws ServiceException {

		List<ApplicationModel> applicationsModelList;
		try {
			applicationsModelList = applicationRepository.listApplicationRecords();
		} catch (Exception e) {
			throw new ServiceException(HttpStatus.INTERNAL_SERVER_ERROR, "Unable to pull the Applications records.", "Severe");
		}
		
		List<ApplicationVO> applicationVOList = new ArrayList<>();
		ApplicationVO applicationVO = null;
		for (ApplicationModel applicationModel : applicationsModelList) {
			applicationVO = ApplicationManager.assignModel2VoMapper(applicationModel);
			applyScoreCalculation(applicationVO);
			
			applicationVOList.add(applicationVO);
		}
		return applicationVOList;
	}


	private void applyScoreCalculation(ApplicationVO applicationVO) throws ServiceException {

		ApplicationFramework.appMaintRiskScoreRecalculation(applicationVO);
		ApplicationFramework.infraRiskScoreRecalculation(applicationVO);
		ApplicationFramework.peopleRiskScoreRecalculation(applicationVO);
		ApplicationFramework.securityRiskScoreRecalculation(applicationVO);
	}

	@Override
	public ApplicationVO scoreRecalculation(ApplicationVO applicationVO) throws ServiceException {
		
		//prepareChangeStatusSummary(applicationVO, "Initial");
		ApplicationFramework.appMaintRiskScoreRecalculation(applicationVO);
		ApplicationFramework.infraRiskScoreRecalculation(applicationVO);
		ApplicationFramework.peopleRiskScoreRecalculation(applicationVO);
		ApplicationFramework.securityRiskScoreRecalculation(applicationVO);
		//prepareChangeStatusSummary(applicationVO, "Final");
		
		return applicationVO;
	}
	
	@Override
	public UserDetailsVO validateUserDetails(UserDetailsVO userDetailsVO){
		
		return userDetailsVO;
	}
	
	private void prepareChangeStatusSummary(ApplicationVO applicationVO, String prepareStage){
		String changeSummaryText = null;
		
		if(prepareStage.contains("Initial")){
			changeSummaryText = ApplicationFramework.getChangeSummary();
			
			changeSummaryText = changeSummaryText.replace("AMS-O-Score#", applicationVO.getAppRiskMaintScore());
			changeSummaryText = changeSummaryText.replace("AMS-O-Grade#", applicationVO.getAppRiskMaintCategory());
			changeSummaryText = changeSummaryText.replace("AMS-O-Color#", applicationVO.getAppRiskMaintColor());
			
			changeSummaryText = changeSummaryText.replace("IRS-O-Score#", applicationVO.getAppInfraRiskScore());
			changeSummaryText = changeSummaryText.replace("IRS-O-Grade#", applicationVO.getAppInfraRiskCategory());
			changeSummaryText = changeSummaryText.replace("IRS-O-Color#", applicationVO.getAppInfraRiskColor());
			
			changeSummaryText = changeSummaryText.replace("SRS-O-Score#", applicationVO.getAppSecurityRiskScore());
			changeSummaryText = changeSummaryText.replace("SRS-O-Grade#", applicationVO.getAppSecurityRiskCategory());
			changeSummaryText = changeSummaryText.replace("SRS-O-Color#", applicationVO.getAppSecurityRiskColor());
			
			changeSummaryText = changeSummaryText.replace("PRS-O-Score#", applicationVO.getAppPeopleRiskScore());
			changeSummaryText = changeSummaryText.replace("PRS-O-Grade#", applicationVO.getAppPeopleRiskCategory());
			changeSummaryText = changeSummaryText.replace("PRS-O-Color#", applicationVO.getAppPeopleRiskColor());
			
			applicationVO.setChangeStatusSummary(changeSummaryText);
		}else if(prepareStage.contains("Final")){
			changeSummaryText = applicationVO.getChangeStatusSummary();
			
			changeSummaryText = changeSummaryText.replace("AMS-N-Score#", applicationVO.getAppRiskMaintScore());
			changeSummaryText = changeSummaryText.replace("AMS-N-Grade#", applicationVO.getAppRiskMaintCategory());
			changeSummaryText = changeSummaryText.replace("AMS-N-Color#", applicationVO.getAppRiskMaintColor());
			
			changeSummaryText = changeSummaryText.replace("IRS-N-Score#", applicationVO.getAppInfraRiskScore());
			changeSummaryText = changeSummaryText.replace("IRS-N-Grade#", applicationVO.getAppInfraRiskCategory());
			changeSummaryText = changeSummaryText.replace("IRS-N-Color#", applicationVO.getAppInfraRiskColor());
			
			changeSummaryText = changeSummaryText.replace("SRS-N-Score#", applicationVO.getAppSecurityRiskScore());
			changeSummaryText = changeSummaryText.replace("SRS-N-Grade#", applicationVO.getAppSecurityRiskCategory());
			changeSummaryText = changeSummaryText.replace("SRS-N-Color#", applicationVO.getAppSecurityRiskColor());
			
			changeSummaryText = changeSummaryText.replace("PRS-N-Score#", applicationVO.getAppPeopleRiskScore());
			changeSummaryText = changeSummaryText.replace("PRS-N-Grade#", applicationVO.getAppPeopleRiskCategory());
			changeSummaryText = changeSummaryText.replace("PRS-N-Color#", applicationVO.getAppPeopleRiskColor());
			
			applicationVO.setChangeStatusSummary(changeSummaryText);
		} 
		
	}
}
