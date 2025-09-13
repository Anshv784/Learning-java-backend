package com.example.RestApiController.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    String id;
    String name;
    String email;
}
