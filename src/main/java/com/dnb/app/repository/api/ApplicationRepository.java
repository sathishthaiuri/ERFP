package com.dnb.app.repository.api;

import java.util.List;

import com.dnb.app.model.ApplicationModel;
import com.dnb.app.vo.ApplicationVO;

public interface ApplicationRepository {

	void insertApplication(ApplicationModel applicationVO);

	ApplicationModel selectApplication(Integer appId);

	void updateApplication(ApplicationModel applicationVO);

	void deleteApplication(ApplicationVO applicationVO);

	List<ApplicationModel> listApplicationRecords();

	ApplicationModel scoreRecalculation(ApplicationModel applicationVO);

}
