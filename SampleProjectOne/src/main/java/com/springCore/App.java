package com.springCore;

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
        System.out.println( "Hello World!" );
        
        ApplicationContext context =new ClassPathXmlApplicationContext("Config.xml");
        
        Student s1 =(Student) context.getBean("student1");
        System.out.println(s1);
        
        // We can Inject The values into the property Tag itSelf
        Student s2= (Student) context.getBean("student2");
         System.out.println(s2);
    }
    
    
}
