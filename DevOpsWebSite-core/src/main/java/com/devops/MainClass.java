import com.devops.users.UserDetails;

public class MainClass{

	public static void main(String args[]){

		UserDetails ud = new UserDetails();

		if(ud.userExists("devops2020","devops@2020")){
			System.out.println("\n\tUser Does exists");
		}else System.out.println("\n\tUser Does Not exists");

	}

}