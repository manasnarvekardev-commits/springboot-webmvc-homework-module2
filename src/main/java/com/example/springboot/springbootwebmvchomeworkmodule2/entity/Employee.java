package com.example.springboot.springbootwebmvchomeworkmodule2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long employeeId;


    private String name;


    private String email;


    private String phoneNumber;

    private Boolean isActive;

    private BigDecimal salary;


    private Integer employeeCode;


    private String address;


    private String companyCreditCard;

    private LocalDate joiningDate;


    private Integer performanceRating;


    private LocalDate appraisalDate;


    private String linkedIn;


    private boolean termsAccepted;


    private boolean isOnLeave;


    private Integer yearsOfExperience;


    private Integer salaryAdjustment;


    private LocalDate resignationDate;


    private Integer leaveBalanceAdjustment;


    private List<String> skills;


    private LocalDate dateOfBirth;


    private LocalDate contractEndDate;


    private String employeeReferenceCode;


    private List<String> emergencyContacts;

}
