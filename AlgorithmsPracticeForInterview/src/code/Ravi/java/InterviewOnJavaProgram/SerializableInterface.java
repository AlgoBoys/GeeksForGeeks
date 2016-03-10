package code.Ravi.java.InterviewOnJavaProgram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import com.sun.xml.internal.ws.developer.Serialization;

/**
 * Serializable interface guarantees i.e. ability to serialize the classes <br/>
 * <br/>
 * use serialVersioUID <br/>
 * <br/>
 * The serialVersionUID is a universal version identifier for a Serializable
 * class. Deserialization uses this number to ensure that a loaded class
 * corresponds exactly to a serialized object. If no match is found, then an
 * InvalidClassException is thrown. Do not change the value of this field in
 * future versions, unless you are knowingly making changes to the class which
 * will render it incompatible with old serialized objects. If needed, follow
 * above given guidelines.
 * 
 * @author ravikson
 * 
 * @Note Deserialization must be treated as any constructor : validate the
 *       object state at the end of deserializing -- this implies that
 *       readObject should almost always be implemented in Serializable classes,
 *       such that this validation is performed. If constructors make defensive
 *       copies for mutable object fields, so must readObject.
 * 
 * @Important The .ser extension is conventionally used for files representing
 *            serialized objects. No static or transient fields undergo default
 *            serialization. Extendable classes should not be Serializable,
 *            unless necessary.Inner classes should rarely, if ever, implement
 *            Serializable.
 */
public class SerializableInterface {

	public static void main(String[] args) {

		// Serialization code
		try {
			UserDetails myDetails = new UserDetails("Ravi111", "Soni", 11111,
					new Date(Calendar.getInstance().getTimeInMillis()));
			FileOutputStream fileOut = new FileOutputStream("userDetails.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(myDetails);
			out.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}

		// de-Serialization code
		try {
			UserDetails deserializedUserDetails = null;
			FileInputStream fileIn = new FileInputStream("userDetails.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			deserializedUserDetails = (UserDetails) in.readObject();
			in.close();
			fileIn.close();
			// verify the object state
			System.out.println(deserializedUserDetails.getfFirstName());
			System.out.println(deserializedUserDetails.getfLastName());
			System.out.println(deserializedUserDetails.getfAccountNumber());
			System.out.println(deserializedUserDetails.getfDateOpened());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}

	}

}

class UserDetails implements Serializable {

	private static final long serialVersionUID = 7526471155622776147L;

	@Serialization
	private String fFirstName;

	@Serialization
	private String fLastName;

	@Serialization
	private int fAccountNumber;

	@Serialization
	private Date fDateOpened;

	// The default constructor
	public UserDetails() {
		this("FirstName", "LastName", 0, new Date(System.currentTimeMillis()));
	}

	public UserDetails(String aFirstName, String aLastName, int aAccountNumber,
			Date aDateOpened) {
		super();
		setfFirstName(aFirstName);
		setfLastName(aLastName);
		setfAccountNumber(aAccountNumber);
		setfDateOpened(aDateOpened);
	}

	/**
	 * @return the fFirstName
	 */
	public String getfFirstName() {
		return fFirstName;
	}

	/**
	 * @param fFirstName
	 *            the fFirstName to set
	 */
	public void setfFirstName(String aNewFirstName) {
		verifyNameProperty(aNewFirstName);
		fFirstName = aNewFirstName;
	}

	/**
	 * 
	 * @param aName
	 */
	private void verifyNameProperty(String aName) {
		boolean nameHasNoContent = (aName.equals("")) || (aName == null);
		if (nameHasNoContent) {
			throw new IllegalArgumentException(
					"Names must be non-null and non-empty.");
		}
	}

	/**
	 * @return the fLastName
	 */
	public String getfLastName() {
		return fLastName;
	}

	/**
	 * @param fLastName
	 *            the fLastName to set
	 */
	public void setfLastName(String aNewLastName) {
		verifyNameProperty(aNewLastName);
		fLastName = aNewLastName;
	}

	/**
	 * @return the fAccountNumber
	 */
	public int getfAccountNumber() {
		return fAccountNumber;
	}

	/**
	 * @param fAccountNumber
	 *            the fAccountNumber to set
	 */
	public void setfAccountNumber(int aNewAccountNumber) {
		validateAccountNumber(aNewAccountNumber);
		fAccountNumber = aNewAccountNumber;
	}

	private void validateAccountNumber(int aAccountNumber) {
		if (aAccountNumber < 0) {
			String message = "Account Number must be greater than or equal to 0.";
			throw new IllegalArgumentException(message);
		}
	}

	/**
	 * @return the fDateOpened
	 */
	public Date getfDateOpened() {
		return fDateOpened;
	}

	/**
	 * @param fDateOpened
	 *            the fDateOpened to set
	 */
	public void setfDateOpened(Date aNewDate) {
		Date newDate = new Date(aNewDate.getTime());
		validateAccountOpenDate(newDate);
		fDateOpened = newDate;
	}

	private void validateAccountOpenDate(Date aDateOpened) {
		if (aDateOpened.getTime() < 0) {
			throw new IllegalArgumentException(
					"Date Opened must be after 1970.");
		}
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private void writeObject(ObjectOutputStream aOutputStream)
			throws IOException {
		aOutputStream.defaultWriteObject();
	}

	private void readObject(ObjectInputStream aInputStream)
			throws ClassNotFoundException, IOException {
		aInputStream.defaultReadObject();
		fDateOpened = new Date(fDateOpened.getTime());
		verifyUserDetails();
	}

	private void verifyUserDetails() {
		validateAccountNumber(fAccountNumber);
		verifyNameProperty(fFirstName);
		verifyNameProperty(fLastName);
		validateAccountOpenDate(fDateOpened);
	}
}
