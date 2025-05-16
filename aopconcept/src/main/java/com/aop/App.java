package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;
//import com.aop.service.PaymentServiceImpl;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
        
        PaymentService paymentobj = context.getBean("payment",PaymentService.class);
        
        // here we are going to use AOP(Aspect Oriented Program) i.e. to insert some information or to authenticate user details 
        //before and after actual business/service i.e. to insert something before debit and after credit
        //without changing the original business logic/code, for that we need dependency spring aop,aspect j runtime,aspectjweaver
        //now we have to focus on what we want to perform and that code is known as advice and is placed under aspect class
        paymentobj.makePayment();
    }
}
