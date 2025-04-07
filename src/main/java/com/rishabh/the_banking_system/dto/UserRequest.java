package com.rishabh.the_banking_system.dto;

import lombok.*;

import java.math.BigDecimal;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String firstName;
    private String lastName;
    private String otherName;
    private String gender;
    private String address;
    private String stateOfOrigin;
    private String accountNumber;
    private String email;
    private String password;
    private String phoneNumber;
    private String alternativePhoneNumber;
}
