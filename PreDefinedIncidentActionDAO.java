package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.PreDefinedIncidentAction;



@Repository
public interface PreDefinedIncidentActionDAO {
	public void addPreDefinedIncident(PreDefinedincidnetAction action);
	public PreDefinedIncidentAction findPreDefinedIncident(int id);
	public List<PreDefinedIncidentAction> findAllPreDefinedIncidentAction();
	public boolean updatePreDefinedIncidentAction(PreDefinedIncidentAction action);
	public boolean deletePreDefinedIncidentAction(PreDefinedIncidentAction action);


}