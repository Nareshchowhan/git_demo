package com.usermangement.userdao;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
	@NotBlank(message="empty not allowed")
	@NotNull(message="null not allowed")
	@Size(min=3,max=15,message="Name must be within the range 3-15 characters")
	private String name;
	@Email(message="Invalid email format")
	private String email;
	@Pattern(regexp="\\d{10}",message="Invalid Phone number")
	private String phoneNumber;
	@Min(value=1,message="Invalid Age")
	@Max(value=100,message="Invalid Age")
	private Integer age;

}
