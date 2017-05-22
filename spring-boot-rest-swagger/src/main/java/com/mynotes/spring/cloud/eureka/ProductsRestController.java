package com.mynotes.spring.cloud.eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductsRestController {
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	@ResponseBody
	public String getContact() {
		return "Product Categories";
	}
	
	
	@RequestMapping(value = "/items", method = RequestMethod.GET)
	@ResponseBody
	public Item items(Item m) {
		Item n=new Item("asd", "asdasdasds000", 123.12);
		return n;
	}
		

}
