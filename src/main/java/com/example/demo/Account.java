package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Account {
    @Id
    private Long id;
    private String number;
    private Integer balance;
}
