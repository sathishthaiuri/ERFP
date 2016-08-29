/**
 * 
 */
package com.dnb.app.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dnb.app.model.ApplicationModel;
import com.dnb.app.repository.api.ApplicationRepository;
import com.dnb.app.vo.ApplicationVO;

@Repository
public class ApplicationRepositoryImpl implements ApplicationRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertApplication(ApplicationModel applicationModel) {
		sessionFactory.getCurrentSession().save(applicationModel);
	}

	@Override
	public ApplicationModel selectApplication(Integer applicationId) {
		return (ApplicationModel) sessionFactory.getCurrentSession().get(ApplicationModel.class, applicationId);
	}

	@Override
	public void updateApplication(ApplicationModel applicationModel) {
		sessionFactory.getCurrentSession().update(applicationModel);
	}

	@Override
	public void deleteApplication(ApplicationVO applicationVO) {
		ApplicationModel applicationModel = (ApplicationModel) sessionFactory.getCurrentSession().get(ApplicationModel.class, applicationVO.getAppId());
		sessionFactory.getCurrentSession().delete(applicationModel);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ApplicationModel> listApplicationRecords() {
		return (List<ApplicationModel>) sessionFactory.getCurrentSession().createQuery("from ApplicationModel").list();
	}

	@Override
	public ApplicationModel scoreRecalculation(ApplicationModel applicationVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
