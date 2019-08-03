package com.anncode.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {
	
	private int id;

	public Magazine(String title, Date editionDate, String editoral) {
		super(title, editionDate, editoral);
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: MAGAZINE ::" +
				"\n Title: " + getTitle() +
				"\n Editorial: " + getEditoral() +
				"\n Edition Date: " + getEditionDate();
	}
	
		
	
}
