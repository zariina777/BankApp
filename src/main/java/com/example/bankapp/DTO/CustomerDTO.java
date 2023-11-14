package com.example.bankapp.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerDTO {
    // заходит и возвращает поля айди фамилия и тд, возвращает ответ на мой запрос
    private String firstName;
    private String lastName;
    private String email;
    private String accountName;
    private Date dateOfBirth;

}


