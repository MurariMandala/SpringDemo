package murari.SpringDemo;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// getBean is available in both Bean Factory and Application Context and both are belongs to spring framework
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        //Vehicle car=new Car();
   // 	Vehicle vehicle=(Vehicle)context.getBean("bike");
    //	vehicle.drive();
    	Car vehicle=(Car)context.getBean("car");
    	Tyre tyre=(Tyre)context.getBean("tyre");
    	tyre.setBrand("MRF");
    	System.out.println(tyre.getBrand());
    	System.out.println(tyre);
    }
}
