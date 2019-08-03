package com.anncode.amazonviewer.model;

import java.util.Date;

public class Publication {
	
	private String title;
	private Date editionDate;
	private String editoral;
	private String[] authors;
	
	public Publication(String title, Date editionDate, String editoral) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.editoral = editoral;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getEditionDate() {
		return editionDate;
	}

	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}

	public String getEditoral() {
		return editoral;
	}

	public void setEditoral(String editoral) {
		this.editoral = editoral;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	

}
