package mynotes.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Size;


@ManagedBean(name="validatorDeclarativeBeanAndAction")

public class ValidatorDeclarativeBeanAndAction {
	
	@Size(min = 5, max=20, message = "Please enter a valid username (5-20 characters)")
	private String name;
	private String age;
	
	public String submit(){
		System.out.println("In Submit");
		System.out.println("name=>"+name);
		System.out.println("age=>"+age);
		return "validatorDeclarative";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

}
