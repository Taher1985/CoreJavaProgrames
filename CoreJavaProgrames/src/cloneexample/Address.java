package cloneexample;

public class Address {

	private int id;
	private String addressLine1;
	private String city;
	private long zipCode;

	public Address(int id, String addressLine1, String city, long zipCode) {
		this.id = id;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", addressLine1=" + addressLine1
				+ ", city=" + city
				+ ", zipCode=" + zipCode + "]";
	}
}
