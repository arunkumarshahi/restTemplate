package com.sg.api.model;

import java.util.ArrayList;
import java.util.List;

public class UserData {
	private List<User> data =new ArrayList<User>();

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}

}
