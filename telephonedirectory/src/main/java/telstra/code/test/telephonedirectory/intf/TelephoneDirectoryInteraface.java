package telstra.code.test.telephonedirectory.intf;

import telstra.code.test.telephonedirectory.bo.CustomerRecord;

public interface TelephoneDirectoryInteraface {
	public boolean insertRecord(CustomerRecord record);
	public boolean deleteRecord(CustomerRecord record);
	public boolean updateRecord(CustomerRecord record, String newPhoneNumber);
	public void printRecords();
	public String lookupRecord(CustomerRecord record);
	

}
