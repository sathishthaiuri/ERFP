package com.dnb.app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dnb.app.data.manager.ApplicationManager;
import com.dnb.app.exception.ServiceException;
import com.dnb.app.net.codejava.spring.Book;
import com.dnb.app.service.api.ApplicationService;
import com.dnb.app.vo.ApplicationVO;
import com.dnb.app.vo.UserDetailsVO;
import com.dnb.app.wrapper.ResponseWrapper;
import com.google.gson.Gson;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


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
	public @ResponseBody String listApplicationRecords() throws ServiceException {
		//return erfpService.listApplicationRecords();
		
		//return ApplicationManager.simulateApplicationRecords();
		//String jsonObj = new Gson().toJson(ApplicationManager.simulateApplicationRecords() );

		String jsonObj = new Gson().toJson(erfpService.listApplicationRecords());
		return jsonObj;
	}

	@RequestMapping(value = "scoreRecalculation", method = { RequestMethod.GET, RequestMethod.POST }, headers = "Accept=application/json")
	public @ResponseBody ApplicationVO scoreRecalculation(@RequestBody String jsonData) throws ServiceException {		
		//System.out.println("jsonData"+jsonData);
		ApplicationVO applicationVO = new Gson().fromJson(jsonData, ApplicationVO.class);
		
		/*System.out.println("applicationVO"+applicationVO);
		if(applicationVO.getIncreaDataVlmYr()!=null && applicationVO.getIncreaDataVlmYr().contains("Percent")){
			applicationVO.setIncreaDataVlmYr(applicationVO.getIncreaDataVlmYr().replace("Percent", " %"));
		}*/
		
		return erfpService.scoreRecalculation(applicationVO);
	}
	
	@RequestMapping(value = "validateUserDetails", method = { RequestMethod.POST }, headers = "Accept=application/json")
	public @ResponseBody UserDetailsVO validateUserDetails(@RequestBody UserDetailsVO userDetailsVO) throws ServiceException {
		return erfpService.validateUserDetails(userDetailsVO);
	}
	
	@RequestMapping(value = "/userSessionLogoff", method = RequestMethod.GET)
	public String signOut(HttpSession httpSession) {
		httpSession.invalidate();
		System.out.println("User session cleared");
		
		return "sessionCleared";
	}

	/**
	 * Handle request to download an Excel document via JXL
	 */
	@RequestMapping(value = "downloadExcelJXL", method = { RequestMethod.GET, RequestMethod.POST }, headers = "Accept=application/json")
	public @ResponseBody Response downloadExcelJXL() throws ServiceException, IOException, RowsExceededException, WriteException {
		
		WritableWorkbook wworkbook;
		wworkbook = Workbook.createWorkbook(new File("output.xls"));
		WritableSheet wsheet = wworkbook.createSheet("First Sheet", 0);
		Label label = new Label(0, 2, "A label record");
		wsheet.addCell(label);
		jxl.write.Number number = new jxl.write.Number(3, 4, 3.1459);
		wsheet.addCell(number);
		wworkbook.write();
		wworkbook.close();

		ResponseBuilder response = Response.ok((Object) wworkbook);
		response.header("Content-Disposition", "attachment; filename=new-excel-file.xls");

		return response.build();

	}

	/**
	 * Handle request to download an Excel document via Apache POI
	 */
	@RequestMapping(value = "/downloadExcelPOI", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView downloadExcelPOI() {
		// create some sample data
		List<Book> listBooks = new ArrayList<Book>();
		listBooks.add(new Book("Effective Java", "Joshua Bloch", "0321356683",
				"May 28, 2008", 38.11F));
		listBooks.add(new Book("Head First Java", "Kathy Sierra & Bert Bates",
				"0596009208", "February 9, 2005", 30.80F));
		listBooks.add(new Book("Java Generics and Collections",
				"Philip Wadler", "0596527756", "Oct 24, 2006", 29.52F));
		listBooks.add(new Book("Thinking in Java", "Bruce Eckel", "0596527756",
				"February 20, 2006", 43.97F));
		listBooks.add(new Book("Spring in Action", "Craig Walls", "1935182358",
				"June 29, 2011", 31.98F));

		// return a view which will be resolved by an excel view resolver
		return new ModelAndView("excelView", "listBooks", listBooks);
	}
}
