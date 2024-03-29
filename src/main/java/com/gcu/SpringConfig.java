package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.gcu.business.ProductsBusinessService;
import com.gcu.business.ProductsBusinessServiceInterface;

import groovy.lang.Singleton;

@Configuration
public class SpringConfig 
{
	/**
	 * bean for products business service inteface
	 * contract between classes
	 * @return
	 */
	@Primary
	@Bean(name = "ProductsBusinessService", initMethod = "init", destroyMethod = "destroy")
	public ProductsBusinessServiceInterface getProductsBusiness() {
		return new ProductsBusinessService();
	}
}
