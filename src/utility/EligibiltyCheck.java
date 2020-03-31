package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface {

	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
	    
		int age =user.getAge();
		int height =user.getHeight() ;
		int weight=user.getWeight();
	    String country=user.getCountry();
	    System.out.println(age);
		if((18 <= age && age<= 35)&&(155 <=height&&height<=170)&&(55<= weight&&weight<= 90)&&(country.equals("ProGrad")) )// You cannot check String using == Apprao
			return true;
		return false;
		
	}

	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int score=Integer.parseInt(points);
		if(score>50)
			return true;
		return false;
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		if(checkUser(user))
			return true;
		
		return false;
	}
	
}