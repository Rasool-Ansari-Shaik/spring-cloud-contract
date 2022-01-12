package com.example.controller;

import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;

import com.example.DemoSpringCloudContractApplication;
import com.example.service.DemoService;

import io.restassured.RestAssured;

@SpringBootTest(classes = DemoSpringCloudContractApplication.class,
			webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoHelloBaseContract {
	
	private static final String LOCAL_HOST = "http://localhost:";
	
	@LocalServerPort
	private Integer port;
	
	@MockBean
	private DemoService demoService;
	
	@BeforeEach	
	public void setup() throws IOException {
		RestAssured.baseURI = LOCAL_HOST + port;
		when(demoService.getMessage()).thenReturn(retrieveMessage());
	}

	private String retrieveMessage() {
		return "Hello World";
	}

}
