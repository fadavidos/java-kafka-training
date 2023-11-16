package com.fabian.osorio;
public record PersonDTO(String id, String name, String age){
    @Override
    public String toString() {
        return "PersonDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
