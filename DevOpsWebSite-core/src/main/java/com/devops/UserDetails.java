package com.devops.users;

import java.util.*;

public class UserDetails{

	public HashMap<String,String> getUserDetails(){

		HashMap<String, String> map = new HashMap<String, String>();

		String existingUname1 = "devops2018";
		String existingPwd1 = "devops@2018";

		String existingUname2 = "devops2019";
		String existingPwd2 = "devops@2019";	

		String existingUname3 = "devops2020";
		String existingPwd3 = "devops@2020";

		map.put(existingUname1, existingPwd1);
		map.put(existingUname2, existingPwd2);
		map.put(existingUname3, existingPwd3);
		
		return map;

	}

	public boolean userExists(String uname,String pwd){

		boolean bln = false;

		HashMap<String, String> map = getUserDetails();

		if (map.containsKey(uname)) {
			if(map.containsKey(uname)){
				//System.out.println("user exists");
				//System.out.println("PWD: "+map.get(uname).toString());
				if((pwd.equals(map.get(uname).toString()))){
					//System.out.println("PWD: "+map.get(uname).toString());
					bln = true;
				}
			}
		} else {
			bln = false;
		}

		return bln;

	}
}