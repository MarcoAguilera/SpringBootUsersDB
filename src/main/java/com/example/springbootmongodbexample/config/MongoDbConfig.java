// package com.example.springbootmongodbexample.config;
// import com.example.springbootmongodbexample.document.Users;
// import com.example.springbootmongodbexample.repo.UsersRepository;




// @EnableMongoRepositories(basePackageClasses = UsersRepository.class)
// @Configuration
// public class MongoDbConfig {
//     @Bean
//     CommandLineRunner commandLineRunner(UsersRepository usersRepository ) {
//         return args -> {
//             usersRepository.save(new Users("Peter123", "Development"));
//             usersRepository.save(new Users("admin", "password"));
//         };
//     }
// }