package techcushy19_2.spring2;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Body {
	
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
	Human hunam =	(Human) con.getBean("hum");
	
		hunam.startPumping();;
	}
	
	
   
}
