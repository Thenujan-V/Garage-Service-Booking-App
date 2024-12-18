package com.example.booking.Entity;

import com.example.booking.Enum.FuelType;
import com.example.booking.Enum.Status;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "vehicle")
public class VehicleEntity {
    @Id
    @Column(name = "vehicle_id", nullable  = false, unique = true)
    private String vehicleId;
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @Column(name = "vehicle_type", nullable = false)
    private String vehicleType;
    @Column(name = "vehicle_brand", nullable = false)
    private String vehicleBrand;
    @Column(name = "vehicle_model", nullable = false)
    private String vehicleModel;
    @Column(name = "service_type", nullable = false)
    private String serviceType;
    @Enumerated(EnumType.STRING)
    @Column(name = "fuel_type", nullable = false)
    private FuelType fuelType;

    @Column(name = "vehicle_is_active", nullable = false)
    private Boolean vehicleIsActive = true;
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false)
    @CreationTimestamp
    private LocalDateTime updatedAt;
}
