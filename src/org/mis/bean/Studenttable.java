package org.mis.bean;

/**
 * Studenttable entity. @author MyEclipse Persistence Tools
 */

public class Studenttable implements java.io.Serializable {

	// Fields

	private StudenttableId id;

	// Constructors

	/** default constructor */
	public Studenttable() {
	}

	/** full constructor */
	public Studenttable(StudenttableId id) {
		this.id = id;
	}

	// Property accessors

	public StudenttableId getId() {
		return this.id;
	}

	public void setId(StudenttableId id) {
		this.id = id;
	}

}