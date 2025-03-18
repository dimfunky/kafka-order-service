package com.dimfunky.orderapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateOrderRequest {
    @NotBlank
    String firstName;

    @NotBlank
    String secondName;

    @NotBlank
    @Pattern(regexp = "\\+7\\([0-9]{3}\\)[0-9]{7}")
    String phone;

    @NotBlank
    @Email
    String email;

    @NotNull
    Product product;

    String description;
}
