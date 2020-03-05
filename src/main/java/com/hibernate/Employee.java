package com.hibernate;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="EMPLOYEE")
	public class Employee {
		@Override
		public String toString() {
			return "Employee [id=" + id + ", fname=" + fname + ", email=" + email + "]";
		}
		private int id;
		private String fname;
		private String email;
		
		@Column(name = "id")
	   @Id
	  // @GeneratedValue(strategy = GenerationType.IDENTITY)
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		

	}

