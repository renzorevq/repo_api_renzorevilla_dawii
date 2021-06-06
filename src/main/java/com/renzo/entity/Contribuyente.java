package com.renzo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRIBUYENTE")
public class Contribuyente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_CONTR")
	private Integer COD_CONTR;
	
	private String DNI_CONTR;
	
	private String NOM_CONTR;
	
	private String APE_PAT_CONTR;
	
	private String APE_MAT_CONTR;
	
	private String RAZ_SOC_CONTR;

	public Integer getCOD_CONTR() {
		return COD_CONTR;
	}

	public void setCOD_CONTR(Integer cOD_CONTR) {
		COD_CONTR = cOD_CONTR;
	}

	public String getDNI_CONTR() {
		return DNI_CONTR;
	}

	public void setDNI_CONTR(String dNI_CONTR) {
		DNI_CONTR = dNI_CONTR;
	}

	public String getNOM_CONTR() {
		return NOM_CONTR;
	}

	public void setNOM_CONTR(String nOM_CONTR) {
		NOM_CONTR = nOM_CONTR;
	}

	public String getAPE_PAT_CONTR() {
		return APE_PAT_CONTR;
	}

	public void setAPE_PAT_CONTR(String aPE_PAT_CONTR) {
		APE_PAT_CONTR = aPE_PAT_CONTR;
	}

	public String getAPE_MAT_CONTR() {
		return APE_MAT_CONTR;
	}

	public void setAPE_MAT_CONTR(String aPE_MAT_CONTR) {
		APE_MAT_CONTR = aPE_MAT_CONTR;
	}

	public String getRAZ_SOC_CONTR() {
		return RAZ_SOC_CONTR;
	}

	public void setRAZ_SOC_CONTR(String rAZ_SOC_CONTR) {
		RAZ_SOC_CONTR = rAZ_SOC_CONTR;
	}
	
}
