package pucrs.tp.address;

import pucrs.tp.address.Address;

import java.util.ArrayList;
import java.util.List;

public class InputBook {
	private String name;
	private List<Address> addressList;

	public InputBook(String oneName) {
		name = oneName;
		addressList = new ArrayList<Address>();
	}

	public void insertAddress(Address e) {
		addressList.add(e);
	}

	public String get() {
		return (name);
	}

	public Address getAddress(int i, int j) {
		Address aux = addressList.get(i);
		if (j != 0)
			addressList.remove(i);
		return (aux);
	}
}
