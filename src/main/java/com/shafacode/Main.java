package com.shafacode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        /*
        Never do this.
        CustomerService customerService = new CustomerService(new CustomerDataAccessService());
        new CustomerController(customerService);

         */
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(Main.class, args);

        /*
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
         */

    }

}
