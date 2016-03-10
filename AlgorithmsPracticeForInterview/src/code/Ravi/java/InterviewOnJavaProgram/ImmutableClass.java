package code.Ravi.java.InterviewOnJavaProgram;

import java.util.Date;

/**
 * An immutable class is one whose state can not be changed once created. There
 * are certain guidelines to create an class immutable. are simple to construct,
 * test, and use. are automatically thread-safe and have no synchronization
 * issues. do not need a copy constructor. do not need an implementation of
 * clone. allow hashCode to use lazy initialization, and to cache its return
 * value. make good Map keys and Set elements .
 * 
 * @author ravikson
 * 
 * @HowToCreate Don’t provide “setter” methods — methods that modify fields or
 *              objects referred to by fields. Make all fields final and
 *              private. Don’t allow subclasses to override methods. Special
 *              attention when having mutable instance variables. (Always
 *              remember that your instance variables will be either mutable or
 *              immutable. Identify them and return new objects with copied
 *              content for all mutable objects. Immutable variables can be
 *              returned safely without extra effort.)
 * 
 * @Note A more sophisticated approach is to make the constructor private and
 *       construct instances in factory methods.
 * 
 * */
@SuppressWarnings("deprecation")
public class ImmutableClass {
	public static void main(String[] args) {
		ImmutableClassImplementation im = ImmutableClassImplementation
				.createNewInstance(100, "test", new Date());
		System.out.println(im);
		tryModification(im.getImmutableField1(), im.getImmutableField2(),
				im.getMutableField());
		System.out.println(im);
	}

	private static void tryModification(Integer immutableField1,
			String immutableField2, Date mutableField) {
		immutableField1 = 10000;
		immutableField2 = "test changed";
		mutableField.setDate(10);
	}
}

/**
 * Always remember that your instance variables will be either mutable or
 * immutable. Identify them and return new objects with copied content for all
 * mutable objects. Immutable variables can be returned safely without extra
 * effort.
 * */
final class ImmutableClassImplementation {

	/**
	 * Integer class is immutable as it does not provide any setter to change
	 * its content
	 * */
	private final Integer immutableField1;
	/**
	 * String class is immutable as it also does not provide setter to change
	 * its content
	 * */
	private final String immutableField2;

	/**
	 * Date class is mutable as it provide setters to change various date/time
	 * parts
	 * */
	private final Date mutableField;

	// Default private constructor will ensure no unplanned construction of
	// class
	private ImmutableClassImplementation(Integer fld1, String fld2, Date date) {
		this.immutableField1 = fld1;
		this.immutableField2 = fld2;
		this.mutableField = new Date(date.getTime());
	}

	// Factory method to store object creation logic in single place
	public static ImmutableClassImplementation createNewInstance(Integer fld1,
			String fld2, Date date) {
		return new ImmutableClassImplementation(fld1, fld2, date);
	}

	// Provide no setter methods

	/**
	 * Integer class is immutable so we can return the instance variable as it
	 * is
	 * */
	public Integer getImmutableField1() {
		return immutableField1;
	}

	/**
	 * String class is also immutable so we can return the instance variable as
	 * it is
	 * */
	public String getImmutableField2() {
		return immutableField2;
	}

	/**
	 * Date class is mutable so we need a little care here. We should not return
	 * the reference of original instance variable. Instead a new Date object,
	 * with content copied to it, should be returned.
	 * */
	public Date getMutableField() {
		return new Date(mutableField.getTime());
	}

	@Override
	public String toString() {
		return immutableField1 + " - " + immutableField2 + " - " + mutableField;
	}
}
