package com.example.jdbc.demo.jdbc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.sql.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class Application {


	private static final Logger log = LoggerFactory.getLogger(Application.class);

	private static Connection connection;


	public static void main(String[] args) throws SQLException, IOException {
		SpringApplication.run(Application.class, args);
	
	}
}








