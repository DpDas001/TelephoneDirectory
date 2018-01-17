package telstra.code.test.validation;

import org.apache.commons.lang3.StringUtils;

import telstra.code.test.telephonedirectory.bo.CustomerRecord;

public class Utils {	
	public static boolean equals(CustomerRecord obj,CustomerRecord other) {
		
		
		if (StringUtils.isNotEmpty(other.getExtensionNumber()) && obj.getExtensionNumber().equals(other.getExtensionNumber()))
			return true;
	
		if (StringUtils.isNotEmpty(other.getFirstName()) && obj.getFirstName().equals(other.getFirstName()))
			return true;
		
		if (StringUtils.isNotEmpty(other.getSurname()) && obj.getSurname().equals(other.getSurname()))
			return true;
		if (StringUtils.isNotEmpty(other.getTelephoneNumber()) && obj.getTelephoneNumber().equals(other.getTelephoneNumber()))
			return true;
		return false;
	}
}
