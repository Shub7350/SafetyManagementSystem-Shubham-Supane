package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import com.model.RequestForAction;

@Service
public class RequestForAction {
	@Autowired
	RequestForActionDAO RequestForActDAOImpl;
	public void addRequest(RequestForAction action) {
		requestforactiondaoimpl.addRequest(action);
	}
	public RequestForAction findAction(int id) {
		return requetforactiondaoimpl.findRequest(id);
		
	}
	public List<RequetForAction> findAllAction() {
		return RequestForActiondaoimpl.findAllAction();
	}
	public boolean updateAction(RequestForAction action) {
		return requestforactiondaoimpl.updateRequest(action);
	}
	public boolean deleteAction(RequestForAction action) {
		return requestforactiondaoimpl.deleteRequest(action);
	}
}