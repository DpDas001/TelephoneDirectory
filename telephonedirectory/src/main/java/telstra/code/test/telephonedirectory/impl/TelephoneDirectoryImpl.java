package telstra.code.test.telephonedirectory.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import telstra.code.test.telephonedirectory.bo.CustomerRecord;
import telstra.code.test.telephonedirectory.intf.TelephoneDirectoryInteraface;
import telstra.code.test.validation.Utils;

public class TelephoneDirectoryImpl implements TelephoneDirectoryInteraface{
	
	private List<CustomerRecord> telephoneDirectory = new ArrayList<>();
	private final Logger slf4jLogger = LoggerFactory.getLogger(TelephoneDirectoryImpl.class);
	
	
	public boolean insertRecord(CustomerRecord record) {
		telephoneDirectory.add(record);
		Collections.sort(telephoneDirectory);
		return true;
	}

	
	
	
	public boolean deleteRecord(CustomerRecord record) {
		// TODO Auto-generated method stub
		int index=0;
		
		for(CustomerRecord customerRecord: telephoneDirectory) {
			if (Utils.equals(customerRecord, record)) {
				break;
			}
			index++;
		}
		
		if(index!=0 && index <telephoneDirectory.size()) {
		telephoneDirectory.remove(index);
		slf4jLogger.info("--------------------------Record deleted------------------------------------");
		}
		else {slf4jLogger.info("--------------------------Record not exists--------------------------------");}
	
		Collections.sort(telephoneDirectory);
		
		return true;
	}

	
	
	
	public boolean updateRecord(CustomerRecord record,String newPhoneNumber) {
		// TODO Auto-generated method stub
		
		for(CustomerRecord customerRecord: telephoneDirectory) {
			if(Utils.equals(customerRecord, record)) {
				customerRecord.setTelephoneNumber(newPhoneNumber);
				break;
			}
		}
		slf4jLogger.info("----------------------Record Updated Successfully-----------------------------");
		return true;
	}

	public void printRecords() {
		
		// TODO Auto-generated method stub
		// Print the list objects in tabular format.
	    System.out.println("-----------------------------------------------------------------------------");
	    System.out.printf("%15s %15s %20s %5s", "First Name", "Surname", "TelephoneNo", "Extno");
	    System.out.println();
	    System.out.println("-----------------------------------------------------------------------------");
	    
		for(CustomerRecord customerRecord: telephoneDirectory) {
			
			System.out.format("%15s %15s %20s %5s", 
					customerRecord.getFirstName(), customerRecord.getSurname(), customerRecord.getTelephoneNumber(), customerRecord.getExtensionNumber());
	        System.out.println();
		}
		 System.out.println("-----------------------------------------------------------------------------");
		
	}

	
	public String lookupRecord(CustomerRecord record) {
		// TODO Auto-generated method stub
		String extn="";
		for(CustomerRecord customerRecord: telephoneDirectory) {
			if(Utils.equals(customerRecord, record)) {
				extn =customerRecord.getExtensionNumber();
				break;
			}
		}
		if(extn.equals("")) {
			 System.out.println("----------------Extn no not found-----------------------------------------");
		}else {
			System.out.println("----------------Extn no found-----------------------------------------"+extn);
		}
		return extn;
	}

}
