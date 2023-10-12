package com.project.ekart.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class AddressDTO {
    private Long id;
    @NotBlank(message = "door no cannot be blank")
    @Pattern(regexp = "[0-9]+",message="please provide a valid door no")
    private String doorNo;
    @NotBlank(message = "landmark cannot be blank")
    @Pattern(regexp = "[a-zA-Z]+",message="please provide a valid landmark")
    private String landmark;
    @NotBlank(message = "area cannot be blank")
    @Pattern(regexp = "[a-zA-Z]+",message="please provide a valid area")
    private String area;
    @NotBlank(message = "district cannot be blank")
    @Pattern(regexp = "[a-zA-Z]+",message="please provide a valid district")
    private String district;
    @NotBlank(message = "state cannot be blank")
    @Pattern(regexp = "[a-zA-Z]+",message="please provide a valid state")
    private String state;
    @NotBlank(message = "country cannot be blank")
    @Pattern(regexp = "[a-zA-Z]+",message="please provide a valid country")
    private String country;
    @NotBlank(message = "pincode cannot be blank")
    @Pattern(regexp = "[0-9]{6}",message="please provide a valid pincode")
    private String pincode;
    @NotBlank(message = "nick name cannot be blank")
    @Pattern(regexp = "[a-zA-Z]+",message="please provide a valid nickname")
    private String nickname;
}
