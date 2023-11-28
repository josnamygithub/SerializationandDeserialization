package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;

@SpringBootApplication
public class Deserializationclass {

	public static void main(String[] args) throws IOException , ClassNotFoundException {
		SpringApplication.run(SerializationandDeserializationApplication.class, args);
 
		Emp emp = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("D:\\josna.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp =(Emp) in.readObject();
			in.close();
			fileIn.close();
		}
		finally {
			System.out.println("Deserialization Employee....");
			System.out.println("First Name of Employee "+emp.getName());
			System.out.println("First Name of Employee "+emp.getAddress());

		}
		
	}
}


