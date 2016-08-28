package com.dnb.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dnb.app.data.manager.ApplicationManager;
import com.dnb.app.exception.ServiceException;
import com.dnb.app.service.api.ApplicationService;
import com.dnb.app.vo.ApplicationVO;
import com.dnb.app.wrapper.ResponseWrapper;

@Controller
public class ApplicationController {

	@Autowired
	private ApplicationService erfpService;

	@RequestMapping(value = "insertApplication", method = { RequestMethod.GET, RequestMethod.POST }, headers = "Accept=application/json")
	public @ResponseBody ResponseWrapper insertApplication(@RequestBody ApplicationVO applicationVO) throws ServiceException {
		erfpService.insertApplication(applicationVO);
		return new ResponseWrapper(HttpStatus.OK, applicationVO.getAppName() + " inserted Successfully");
	}

	@RequestMapping(value = "selectApplication", method = { RequestMethod.GET, RequestMethod.POST }, headers = "Accept=application/json")
	public @ResponseBody ApplicationVO selectApplication(@RequestBody ApplicationVO applicationVO) throws ServiceException {
		return erfpService.selectApplication(applicationVO.getAppId());
	}

	@RequestMapping(value = "updateApplication", method = { RequestMethod.GET,	RequestMethod.POST }, headers = "Accept=application/json")
	public @ResponseBody ResponseWrapper updateApplication(@RequestBody ApplicationVO applicationVO) throws ServiceException {
		erfpService.updateApplication(applicationVO);
		return new ResponseWrapper(HttpStatus.OK, applicationVO.getAppName() + " updated Successfully");
	}

	@RequestMapping(value = "deleteApplication", method = { RequestMethod.GET,	RequestMethod.POST }, headers = "Accept=application/json")
	public @ResponseBody ResponseWrapper deleteApplication(@RequestBody ApplicationVO applicationVO) throws ServiceException {
		erfpService.deleteApplication(applicationVO);
		return new ResponseWrapper(HttpStatus.OK, applicationVO.getAppName() + " removed Successfully");
	}

	@RequestMapping(value = "listApplicationRecords", method = { RequestMethod.GET, RequestMethod.POST }, headers = "Accept=application/json")
	public @ResponseBody List<ApplicationVO> listApplicationRecords() throws ServiceException {
		//return erfpService.listApplicationRecords();
		return ApplicationManager.simulateApplicationRecords();
	}

	@RequestMapping(value = "scoreRecalculation", method = { RequestMethod.GET, RequestMethod.POST }, headers = "Accept=application/json")
	public @ResponseBody ApplicationVO scoreRecalculation(@RequestBody ApplicationVO applicationVO) throws ServiceException {
		return erfpService.scoreRecalculation(applicationVO);
	}
	
}
