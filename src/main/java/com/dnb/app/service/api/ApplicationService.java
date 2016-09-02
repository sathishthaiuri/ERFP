package com.dnb.app.service.api;

import java.util.List;

import com.dnb.app.exception.ServiceException;
import com.dnb.app.vo.ApplicationVO;
import com.dnb.app.vo.UserDetailsVO;

public interface ApplicationService {

	void insertApplication(ApplicationVO applicationVO) throws ServiceException;

	ApplicationVO selectApplication(Integer appId) throws ServiceException;

	void updateApplication(ApplicationVO applicationVO) throws ServiceException;

	void deleteApplication(ApplicationVO applicationVO) throws ServiceException;

	List<ApplicationVO> listApplicationRecords() throws ServiceException;

	ApplicationVO scoreRecalculation(ApplicationVO applicationVO) throws ServiceException;

	UserDetailsVO validateUserDetails(UserDetailsVO userDetailsVO);

}
