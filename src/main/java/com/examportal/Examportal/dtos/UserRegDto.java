package com.examportal.Examportal.dtos;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserRegDto {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private Long phone;
    private Boolean userActive;

}
