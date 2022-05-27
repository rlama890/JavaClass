package day18.constructordemo;

public class User {

	
		String username;
		String password;
		
		
		public User(String u, String p) {
			username = u; 
			password = p;
			System.out.println("constructor called");
		}
		
//		public void assignInfo(String u, String p) {
//			username = u; 
//			password = p;
//		}
		
		public void displayInfo() {
			System.out.println("Username is:"+username);
			System.out.println("Password is:"+password);
        
		}
			public static void main(String[] args) {
		 User santosh = new User("santoshkarna", "abc");
//		 santosh.assignInfo("santoshkarna", "abc");
		 santosh.displayInfo();
		 
		 
		 System.out.println("===========");
		 
		 User raju = new User("rajuk", "rrr");
//		 raju.assignInfo("rajuk", "rrr");
		 raju.displayInfo();
		 
		 

	}

}
