package fr.sita.movie.service;

import java.util.Map;

import fr.sita.movie.datamodel.UserModel;

public class UserDAO extends GenericDAO<UserModel, String> {

	@Override
	public void setParameters(Map<String, Object> parameters, UserModel criteria) {
		parameters.put("pTitle", criteria.getUsername());
	}
}