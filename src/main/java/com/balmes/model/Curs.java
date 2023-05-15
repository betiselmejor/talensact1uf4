package com.balmes.model;

import java.util.ArrayList;
import java.util.List;

public class Curs {

	private int cursId;
	private String titolCurs;
	private String descCurs;
	private String urlCurs;
	private List<Estudiant> estudiants = new ArrayList<>();

	public Curs(int cursId, String titolCurs, String descCurs, String urlCurs, List<Estudiant> estudiants) {
		this.cursId = cursId;
		this.titolCurs = titolCurs;
		this.descCurs = descCurs;
		this.urlCurs = urlCurs;
		this.estudiants = estudiants;
	}

	public Curs() {
	}

	public Curs(int cursId, String titolCurs, String descCurs, String urlCurs) {
		this.cursId = cursId;
		this.titolCurs = titolCurs;
		this.descCurs = descCurs;
		this.urlCurs = urlCurs;
	}

	public List<Estudiant> getEstudiants() {
		return estudiants;
	}

	public void setEstudiants(List<Estudiant> estudiants) {
		this.estudiants = estudiants;
	}

	public int getCursId() {
		return cursId;
	}

	public void setCursId(int cursId) {
		this.cursId = cursId;
	}

	public String getTitolCurs() {
		return titolCurs;
	}

	public void setTitolCurs(String titolCurs) {
		this.titolCurs = titolCurs;
	}

	public String getDescCurs() {
		return descCurs;
	}

	public void setDescCurs(String descCurs) {
		this.descCurs = descCurs;
	}

	public String getUrlCurs() {
		return urlCurs;
	}

	public void setUrlCurs(String urlCurs) {
		this.urlCurs = urlCurs;
	}

	@Override
	public String toString() {
		return "Curs [cursId=" + cursId + ", titolCurs=" + titolCurs + ", descCurs=" + descCurs + ", urlCurs=" + urlCurs
				+ "]";
	}

}
