package com.will.first_spring_app.configuration;
// Essa classe é uma classe de configuração do Spring
// Ela é responsável por configurar o Spring
// Nesse caso, ela não tem nenhuma configuração, mas poderia ter
// Por exemplo, poderia ser usada para configurar um banco de dados ou um serviço de email
// Para isso, bastaria adicionar as anotações necessárias e os métodos necessários
// Por exemplo, para configurar um banco de dados, poderia ser adicionada a anotação @Configuration e o método @Bean
// Para configurar um serviço de email, poderia ser adicionada a anotação @Configuration e o método @Bean

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    // Fiz esse método para testar a injeção de dependência de um bean
    // Ele retorna uma string
    // Essa string é injetada em um controller
    // O controller injeta essa string e a retorna
    @Bean(name = "customHelloConfiguration")
    public String helloConfiguration() {
        //String name = "Will";
        return "Hello Configuration, seja bem vindo ";
    }
}
