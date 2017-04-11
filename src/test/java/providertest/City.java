package providertest;

/**
 * @author Administrator
 *
 */
public class City {

	private String cityName;
	private String address;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", address=" + address + "]";
	}
	public City(String cityName, String address) {
		super();
		this.cityName = cityName;
		this.address = address;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String productString = "1213211312132@1231";
		System.out.println(productString.contains("@"));
	}
	
}
