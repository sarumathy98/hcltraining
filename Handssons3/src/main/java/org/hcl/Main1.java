package org.hcl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
				ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
				Employee emp= context.getBean(Employee.class,"emp");
				emp.display();
				Address add= emp.getAddress();
				add.display();
				
			}




			}


	}

}
