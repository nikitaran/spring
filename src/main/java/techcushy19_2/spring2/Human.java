package techcushy19_2.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	

	 @Autowired
	 @Qualifier("heartobj")
	private Heart heart;
	
	
	

	
     
	public Human(Heart heart) {
		
		this.heart = heart;
	}
	
	


	public Human() {
		super();
	}



/*	public void setHeart(Heart heart) {
		this.heart = heart;
		
		System.out.println("set method called");
	} */
	
	
	public void startPumping() {
		
		if(heart !=null) {
			heart.pump();
			
		}else
		System.out.println("dead");
		
		
	}
	

}
