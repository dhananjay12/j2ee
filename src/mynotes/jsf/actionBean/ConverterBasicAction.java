package mynotes.jsf.actionBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import mynotes.jsf.bean.ConverterBasicForm;

@ManagedBean
public class ConverterBasicAction {
	
	@ManagedProperty(value="#{convertorBasicForm}")
	ConverterBasicForm aConverterBasicForm;

	public ConverterBasicForm getaConverterBasicForm() {
		return aConverterBasicForm;
	}

	public void setaConverterBasicForm(ConverterBasicForm aConverterBasicForm) {
		this.aConverterBasicForm = aConverterBasicForm;
	}
	
	public String submit(){
		
		System.out.println("Inside submit");		
		System.out.println("Age=>"+aConverterBasicForm.getAge());
		System.out.println("Date4=>"+aConverterBasicForm.getDate4());
		
		return "covertersBasic";
	}
	
	

}
