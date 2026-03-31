package com.programacion4.unidad4ej5.feature.plan.dtos.request;

import java.util.List;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PlanCreateDTO {

    @NotBlank(message = "El objetivo es obligatorio")
    @Size(min = 10, max = 200, message = "El objetivo debe tener entre 10 y 200 caracteres")
    private String objetivo;

    @NotNull(message = "La frecuencia semanal es obligatoria")
    @Min(value = 1, message = "La frecuencia mínima es 1")
    @Max(value = 7, message = "La frecuencia máxima es 7")
    private Integer frecuenciaSemanal;

    @NotNull(message = "El peso inicial es obligatorio")
    @DecimalMin(value = "30.0", message = "El peso mínimo es 30.0")
    @DecimalMax(value = "250.0", message = "El peso máximo es 250.0")
    private Double pesoInicial;

    @NotNull(message = "La altura es obligatoria")
    @DecimalMin(value = "1.0", message = "La altura mínima es 1.0 metro")
    @DecimalMax(value = "2.5", message = "La altura máxima es 2.5 metros")
    private Double altura;

    @NotEmpty(message = "La lista de ejercicios no puede estar vacía")
    @Size(min = 3, message = "Debe contener al menos 3 ejercicios")
    private List<String> ejercicios;

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Integer getFrecuenciaSemanal() {
        return frecuenciaSemanal;
    }

    public void setFrecuenciaSemanal(Integer frecuenciaSemanal) {
        this.frecuenciaSemanal = frecuenciaSemanal;
    }

    public Double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(Double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public List<String> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<String> ejercicios) {
        this.ejercicios = ejercicios;
    }

}