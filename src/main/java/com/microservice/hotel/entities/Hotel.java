package com.microservice.hotel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "hotels")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
    @Id
    @UuidGenerator
    private String id;
    @Column(nullable = false)
    private String name;
    private String about;
    @Column(nullable = false)
    private String location;
}
