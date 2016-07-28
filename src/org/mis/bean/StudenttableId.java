package org.mis.bean;

/**
 * StudenttableId entity. @author MyEclipse Persistence Tools
 */

public class StudenttableId implements java.io.Serializable {

	// Fields

	private Integer studentId;
	private String studentName;
	private String studentSex;

	// Constructors

	/** default constructor */
	public StudenttableId() {
	}

	/** full constructor */
	public StudenttableId(Integer studentId, String studentName,
			String studentSex) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSex = studentSex;
	}

	// Property accessors

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		return this.studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudenttableId))
			return false;
		StudenttableId castOther = (StudenttableId) other;

		return ((this.getStudentId() == castOther.getStudentId()) || (this
				.getStudentId() != null && castOther.getStudentId() != null && this
				.getStudentId().equals(castOther.getStudentId())))
				&& ((this.getStudentName() == castOther.getStudentName()) || (this
						.getStudentName() != null
						&& castOther.getStudentName() != null && this
						.getStudentName().equals(castOther.getStudentName())))
				&& ((this.getStudentSex() == castOther.getStudentSex()) || (this
						.getStudentSex() != null
						&& castOther.getStudentSex() != null && this
						.getStudentSex().equals(castOther.getStudentSex())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getStudentId() == null ? 0 : this.getStudentId().hashCode());
		result = 37
				* result
				+ (getStudentName() == null ? 0 : this.getStudentName()
						.hashCode());
		result = 37
				* result
				+ (getStudentSex() == null ? 0 : this.getStudentSex()
						.hashCode());
		return result;
	}

}