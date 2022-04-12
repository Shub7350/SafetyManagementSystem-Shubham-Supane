package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import com.model.PreDefinedIncidentAction;

@Service
public class PreDefinedIncidentAction {
	@Autowired
	PreDefinedIncidentActionDAO PreDefinedIncidentActionDAOImpl;
	public void addPreDefinedIncident(PreDefinedIncidentAction action) {
		requestforactiondaoimpl.addRequest(action);
	}
	public PreDefinedIncidentAction findPreDefinedIncident(int id) {
		return predefinedincidentactionimpl.findPreDefinedIncident(id);
		
	}
	public List<PreDefinedIncidentAction> findAllAction() {
		return PreDefinedIncidentActiondaoimpl.findAllAction();
	}
	public boolean updatePreDefinedIncident(PreDefinedIncidentAction action) {
		return predefinedincidentactiondaoimpl.updatePreDefinedIncident(action);
	}
	public boolean deletePreDefinedIncident(PreDefinedIncidentAction action) {
		return predefinedincidentactiondaoimpl.deletePreDefinedIncident(action);
	}
}