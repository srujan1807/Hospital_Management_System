package com.HealthManagement.Hospital_Management.API;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.PrivateKey;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class API_Response<T> {

    private int status;
    private boolean success;
    private String Message;
    private LocalDateTime timestamp;
    private T data;

}
