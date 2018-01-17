package telstra.code.test.telephonedirectory;

import telstra.code.test.telephonedirectory.bo.CustomerRecord;
import telstra.code.test.telephonedirectory.impl.TelephoneDirectoryImpl;
import telstra.code.test.telephonedirectory.intf.TelephoneDirectoryInteraface;

public class TelephoneDirectoryMain {
	TelephoneDirectoryInteraface directoryInteraface;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelephoneDirectoryMain directoryMain=new TelephoneDirectoryMain();
		directoryMain.setDirectoryInteraface(new TelephoneDirectoryImpl());
		
		directoryMain.getDirectoryInteraface().insertRecord(new CustomerRecord("Durga Prasad","Das","1234567890","1234"));
		directoryMain.getDirectoryInteraface().insertRecord(new CustomerRecord("Jaya","Rathore","1234567891","2234"));
		directoryMain.getDirectoryInteraface().insertRecord(new CustomerRecord("Ramesh Chandra","Das","1234567892","9234"));
		directoryMain.getDirectoryInteraface().insertRecord(new CustomerRecord("Gyanshi","Das","1234567894","1934"));

		directoryMain.getDirectoryInteraface().printRecords();

		directoryMain.getDirectoryInteraface().deleteRecord(new CustomerRecord(null,"","1234567892",""));

		directoryMain.getDirectoryInteraface().printRecords();
		directoryMain.getDirectoryInteraface().lookupRecord(new CustomerRecord(null,"","1234567894",""));
	}

	public TelephoneDirectoryInteraface getDirectoryInteraface() {
		return directoryInteraface;
	}

	public void setDirectoryInteraface(TelephoneDirectoryInteraface directoryInteraface) {
		this.directoryInteraface = directoryInteraface;
	}

}
