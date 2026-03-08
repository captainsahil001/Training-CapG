package com.config;

import org.springframework.context.annotation.*;
import org.springframework.orm.jpa.*;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

		factory.setPersistenceUnitName("Product_Management");
		factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

		return factory;
	}

	@Bean
	public JpaTransactionManager transactionManager() {

		JpaTransactionManager tx = new JpaTransactionManager();
		tx.setEntityManagerFactory(entityManagerFactory().getObject());

		return tx;
	}

}