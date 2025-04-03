package com.example.demo;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	//Esto es para que lea las varibles de entorno en el archivo application.properties
	/*Se debe agregar el .env en la carpeta raiz con las variables:
		+ DB_URL
		+ DB_USERNAME
		+ DB_PASSWORD
	*/
	static {
		Dotenv dotenv = Dotenv.configure().load();
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
