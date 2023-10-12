package com.project.ekart.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BuyerDTO {
    private Long id;
    @NotBlank(message = "first name cannot be blank")
    @Pattern(regexp = "[a-zA-Z]+",message="please provide a valid first name")
    private String firstName;
    @NotBlank(message = "last name cannot be blank")
    @Pattern(regexp = "[a-zA-Z]+",message="please provide a valid last name")
    private String lastName;
    @NotBlank(message = "phone number cannot be blank")
    @Pattern(regexp = "[6-9][0-9]{9}",message="please provide a valid phone number")
    private String phoneNumber;
    @NotBlank(message = "email cannot be blank")
    @Pattern(regexp = "[a-zA-Z0-9]+@[a-z]+(.com)",message="please provide a valid email")
    private String email;
    @NotBlank(message = "password cannot be blank")
    @Pattern(regexp = "[a-zA-Z0-9]{8,12}",message="please provide a valid password")
    private String password;
    private List<AddressDTO> addresses;
}
