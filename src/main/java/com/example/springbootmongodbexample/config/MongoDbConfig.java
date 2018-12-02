package com.example.springbootmongodbexample.config;

import com.example.springbootmongodbexample.cart.CartItem;
import com.example.springbootmongodbexample.document.Users;
import com.example.springbootmongodbexample.repo.UsersRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;




@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDbConfig {
    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository ) {
        return args -> {
            
                usersRepository.deleteAll();
                Users t1 = new Users("Peter123", "Development");
                Users t2 = new Users("admin", "password");
                usersRepository.save(t1);
                usersRepository.save(t2);

        };
    }
}