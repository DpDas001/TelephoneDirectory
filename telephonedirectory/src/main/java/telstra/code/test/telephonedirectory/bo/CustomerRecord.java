package telstra.code.test.telephonedirectory.bo;

import org.apache.commons.lang3.StringUtils;

public class CustomerRecord implements Comparable<CustomerRecord> {

	private String firstName;
	private String surname;
	private String telephoneNumber;
	private String extensionNumber;

	public CustomerRecord() {
		
	}

	public CustomerRecord(String firstName, String surname, String telephoneNumber, String extensionNumber) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.telephoneNumber = telephoneNumber;
		this.extensionNumber = extensionNumber;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	

	

	public int compareTo(CustomerRecord record) {
		// TODO Auto-generated method stub
		return this.getSurname().compareTo((record.getSurname()));
		
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getExtensionNumber() {
		return extensionNumber;
	}

	public void setExtensionNumber(String extensionNumber) {
		this.extensionNumber = extensionNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((extensionNumber == null) ? 0 : extensionNumber.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((telephoneNumber == null) ? 0 : telephoneNumber.hashCode());
		return result;
	}

	

}
