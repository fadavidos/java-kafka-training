package com.fabian.osorio.dtos;

public record CarDTO(String id, String brand, String model) {
    @Override
    public String toString() {
        return "CarDTO{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
