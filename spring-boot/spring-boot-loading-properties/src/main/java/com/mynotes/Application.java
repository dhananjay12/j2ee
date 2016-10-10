package com.mynotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties
public class Application {
	
	@Value("${project.database.maxConnections}")
	private  int maxNumberOfConnections;
	
	@Value("${project.name}")
	void setProjectName(String projectName) {
		System.out.println("setting project name:::::::::::: " + projectName);
		System.out.println("maxNumberOfConnections:::::::::::: " + maxNumberOfConnections);
	}

	@Autowired
	void getFromEnvironment(Environment env) {
		System.out.println(
				"setting environment:::::::::::: " + env.getProperty("project.name"));
	}

		
	@Autowired
	void setProjectProperties(ProjectProperties pp) {
		System.out.println("setProjectProperties.name:::::::::::: " + pp.getName());
		System.out.println("setProjectProperties.database:::::::::::: " + pp.getDatabase());
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
