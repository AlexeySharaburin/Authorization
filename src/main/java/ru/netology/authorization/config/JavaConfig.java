//package ru.netology.authorization.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import ru.netology.authorization.controller.AuthorizationController;
//import ru.netology.authorization.repository.UserRepository;
//import ru.netology.authorization.service.AuthorizationService;
//
//@Configuration
//public class JavaConfig {
//
//    @Bean
//    public AuthorizationController authorizationController() {
//        return new AuthorizationController(authorizationService());
//    }
//
//    @Bean
//    public AuthorizationService authorizationService() {
//        return new AuthorizationService(userRepository());
//    }
//
//    @Bean
//    public UserRepository userRepository() {
//        return new UserRepository();
//    }
//
//}
