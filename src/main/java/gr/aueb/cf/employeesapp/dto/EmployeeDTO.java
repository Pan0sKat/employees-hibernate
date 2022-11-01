package gr.aueb.cf.employeesapp.dto;

public class EmployeeDTO {
	
	private Long id;
	private String lastname;
	private String firstname;
	
	public EmployeeDTO() {}
	
	/**
	 * @param id
	 * @param lastname
	 * @param firstname
	 */
	public EmployeeDTO(Long id, String lastname, String firstname) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
	
	

}
