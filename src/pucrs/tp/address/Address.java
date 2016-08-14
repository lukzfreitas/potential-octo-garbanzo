package pucrs.tp.address;

public class Address {
	private String street;
	private int number, apart, code;
	private InputBook inputBook;

	public Address(InputBook inputBook, String oneStreet, int oneNumber, int oneApart, int oneCode) {
		street = oneStreet;
		number = oneNumber;
		apart = oneApart;
		code = oneCode;
		inputBook = inputBook;
	}

	public void setStreet(String oneStreet) {
		street = oneStreet;
	}

	public void setField(int number, int data) {
		switch (number) {
		case 1:
			number = data;
			return;
		case 2:
			apart = data;
			return;
		case 3:
			code = data;
			return;
		}
	}

	public void printEnvelope() {
		System.out.println("For " + inputBook.get());
		System.out.println("Address: " + toString());
	}

	public String getStreet() {
		return (street);
	}

	public int getNumber() {
		return (number);
	}

	public int getCode() {
		return (code);
	}

	public String toString() {
		return(street+", "+number+"/"+apart+", "+code);
	}
}
