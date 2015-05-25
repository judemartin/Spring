package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

      obj.getMessage();
      ((AbstractApplicationContext) context).registerShutdownHook();
 
      Employee emp1 = (Employee) context.getBean("employee");
      	emp1.setId(1);
      	emp1.setName("Anish");
      	emp1.getId();
      	emp1.getName();
      
      Employee emp2 = (Employee) context.getBean("employee");
      emp2.getId();
      emp2.getName();
      

      Employee emp3 = (Employee) context.getBean("employee");
      	emp3.setId(2);
    	emp3.setName("Aubrey");
    	emp3.getId();
    	emp3.getName();
     
     Employee emp4 = (Employee) context.getBean("employee");
       	emp4.getId();
       	emp4.getName();
      
    	
      Admin admin1 = (Admin) context.getBean("admin");
    	admin1.setId(1234);
    	admin1.setName("Root");
    	
    	admin1.getId();
    	admin1.getName();
   
      Admin admin2 = (Admin) context.getBean("admin");
    	admin2.getId();
    	admin2.getName();
   
    

   }
}