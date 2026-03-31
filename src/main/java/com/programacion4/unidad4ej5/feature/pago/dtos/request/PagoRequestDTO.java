package com.programacion4.unidad4ej5.feature.pago.dtos.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class PagoRequestDTO {

    @NotNull(message = "El monto es obligatorio")
    @DecimalMin(value = "1000.00", message = "El monto no puede ser menor a 1000.00")
    @Digits(integer = 10, fraction = 2, message = "El monto debe soportar hasta 2 decimales")
    private BigDecimal monto;

    @NotBlank(message = "El código de transacción es obligatorio")
    @Pattern(regexp = "^PAY-[A-Z0-9]{4}-[A-Z0-9]{4}$", message = "El código debe seguir el patrón PAY-XXXX-XXXX")
    private String codigoTransaccion;

    @NotNull(message = "La fecha de vencimiento es obligatoria")
    @Future(message = "La fecha de vencimiento debe ser en el futuro")
    private LocalDate fechaVencimiento;

    @NotBlank(message = "El tipo de pago es obligatorio")
    @Pattern(regexp = "^(EFECTIVO|DEBITO|CREDITO|TRANSFERENCIA)$", message = "Tipo de pago inválido")
    private String tipoPago;

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

}