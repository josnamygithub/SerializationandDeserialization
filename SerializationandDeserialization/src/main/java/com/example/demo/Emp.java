package com.example.demo;

import java.io.Serializable;

public class Emp implements Serializable  {
		private String name ;
		private String address;
		
		public Emp(String name , String address) {
			this.name = name;
			this.address = address;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Emp [name=" + name + ", address=" + address + "]";
		}
		
		
	}



