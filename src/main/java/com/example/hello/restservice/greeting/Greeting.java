package com.example.hello.restservice.greeting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {
    private Long id;
    private String content;
}
