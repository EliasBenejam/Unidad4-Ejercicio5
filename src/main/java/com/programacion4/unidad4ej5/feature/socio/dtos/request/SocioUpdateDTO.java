package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class SocioUpdateDTO {

    public interface OnCreate {}
    public interface OnUpdate {}

    @Null(groups = OnCreate.class, message = "El ID debe ser nulo al crear")
    @NotNull(groups = OnUpdate.class, message = "El ID es obligatorio al actualizar")
    private Long id;

    @URL(message = "La URL de la foto debe ser válida")
    private String urlFoto;

    @Size(min = 3, max = 15, message = "El alias debe tener entre 3 y 15 caracteres")
    @Pattern(regexp = "^[^\\s]+$", message = "El alias no puede contener espacios")
    private String alias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}