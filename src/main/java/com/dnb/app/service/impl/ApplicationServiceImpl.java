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

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;

	@Override
	@Transactional
	public void insertApplication(ApplicationVO applicationVO) throws ServiceException {

		ApplicationModel applicationModel = new ApplicationModel();
		applicationModel.setAPP_ID(applicationVO.getAppId());
		ApplicationManager.assignVo2ModelMapper(applicationModel, applicationVO);
		
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
		ApplicationManager.assignVo2ModelMapper(applicationModel, applicationVO);
		
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

		ApplicationFramework.appMaintRiskScoreRecalculation(applicationVO);
		ApplicationFramework.infraRiskScoreRecalculation(applicationVO);
		ApplicationFramework.peopleRiskScoreRecalculation(applicationVO);
		ApplicationFramework.securityRiskScoreRecalculation(applicationVO);
		
		return applicationVO;
	}
}
