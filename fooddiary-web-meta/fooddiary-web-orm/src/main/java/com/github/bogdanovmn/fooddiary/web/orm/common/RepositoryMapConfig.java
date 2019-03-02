package com.github.bogdanovmn.fooddiary.web.orm.common;

import com.github.bogdanovmn.fooddiary.web.orm.entity.UserRole;
import com.github.bogdanovmn.fooddiary.web.orm.entity.UserRoleRepository;
import com.github.bogdanovmn.common.spring.jpa.EntityRepositoryMapFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.github.bogdanovmn.common.spring")
class RepositoryMapConfig {
	@Autowired
	private UserRoleRepository userRoleRepository;

	@Bean
	EntityRepositoryMapFactory entityRepositoryMapFactory() {
		return new EntityRepositoryMapFactory.Builder()
			.map(UserRole.class,  userRoleRepository)
			.build();
	}
}
