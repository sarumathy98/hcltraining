package org.hcl;
import org.springframework.stereotype.Component;

@Component
	public class Owner {
		private String name;
		private String password;
		private String mobile;
		public void setDetails(String name,String password,String mobile)
		{
			this.name=name;
			this.password=password;
			this.mobile=mobile;
		}
		public void display()
		{
			System.out.println(name+"\n"+password+"\n"+mobile);
		}

	}


