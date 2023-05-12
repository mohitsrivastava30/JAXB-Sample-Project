package com.example.client;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.example.binding.Employee;

public class Test {
	public static void main(String args[]) throws JAXBException
	{
		Employee employee = new Employee();
		employee.setEmpNo(1);
		employee.setName("ABC");
		employee.setSallary(20000.0);
		
		JAXBContext context=JAXBContext.newInstance(employee.getClass());
		Marshaller marsheller=context.createMarshaller();
		marsheller.marshal(employee, System.out);
		
	}

}
