package mynotes.jsf.bean;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="registrationValueChangeListnerForm")
@SessionScoped
public class RegistrationValueChangeListnerForm {
	
	
	private Map<String,String> countries;
	private Map<String,String> cities;
	private String name;
	private String country;
	private String city;
	@PostConstruct
	public void init(){
		countries = new LinkedHashMap<String,String>();		
		countries.put("India", "ind");//label, value
		countries.put("United States", "us"); 
		cities = new LinkedHashMap<String,String>();		
		cities.put("Mumbai", "mum");//label, value
		cities.put("Pune", "pun"); 
	}
	
	public Map<String, String> getCities() {
		return cities;
	}
	public void setCities(Map<String, String> cities) {
		this.cities = cities;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Map<String, String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}

}
