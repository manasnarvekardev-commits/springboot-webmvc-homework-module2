package com.example.springboot.springbootwebmvchomeworkmodule2.dto;

import com.example.springboot.springbootwebmvchomeworkmodule2.validation.PrimeNumber;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @NotBlank
    private String name;

    @Email
    @NotNull
    private String email;

    @NotNull
    @Digits(integer = 10, fraction = 0)
    private String phoneNumber;

    private Boolean isActive;

    @PositiveOrZero
    @Digits(integer = 6, fraction = 2)
    @DecimalMin(value = "2")
    @DecimalMax(value = "3")
    private BigDecimal salary;

    @Min(0L)
    @Max(10)
    private Integer employeeCode;

    @Length(min = 20, max = 60)
    private String address;

    @CreditCardNumber
    private String companyCreditCard;

    @PastOrPresent
    private LocalDate joiningDate;

    @Range(min = 1, max = 5)
    @PrimeNumber
    private Integer performanceRating;

    @FutureOrPresent
    private LocalDate appraisalDate;

    @URL
    private String linkedIn;

    @AssertTrue
    private boolean termsAccepted;

    @AssertFalse
    private boolean isOnLeave;

    @Positive
    private Integer yearsOfExperience;

    @Negative
    private Integer salaryAdjustment;

    @Null
    private LocalDate resignationDate;

    @NegativeOrZero
    private Integer leaveBalanceAdjustment;

    @Size(min = 1, max = 5)
    private List<String> skills;

    @Past
    private LocalDate dateOfBirth;

    @Future
    private LocalDate contractEndDate;

    @Pattern(regexp = "EMP-[0-9]{4}")
    private String employeeReferenceCode;

    @NotEmpty
    private List<String> emergencyContacts;

}

