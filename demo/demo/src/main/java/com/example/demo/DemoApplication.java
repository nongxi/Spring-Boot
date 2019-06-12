package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication
@Slf4j
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private DataSource dataSource;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		showConnection();
	}

	private void showConnection() throws Exception{
		log.info(dataSource.toString());
		Connection conn=dataSource.getConnection();
		log.info(conn.toString());
		conn.close();
	}
}
