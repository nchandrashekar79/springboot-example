package com.example.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.example.demo.controller.api.HelloApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {

	@Override
	public String hello() {
		return "Hello";
	}
	
	@Override
	public String defaultMethod() {
		return "Welcome to Springboot demo Project";
	}

	@Override
	public String test() throws UnknownHostException {
		InetAddress ip = InetAddress.getLocalHost();
		String hostAddr = "My IP address is: " + ip.getHostAddress();
		System.out.print(hostAddr);
		return hostAddr;
	}
	
	@Override
	public String getEmployeesById(String id) {
		return "ID: " + id;
	}
}
