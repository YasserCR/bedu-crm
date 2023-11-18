package org.bedu.crmbedu.models;

import org.bedu.crmbedu.models.builders.RespuestaErrorBuilder;

import java.time.LocalDate;
import java.util.Map;

public class RespuestaError {
    private final LocalDate timestamp = LocalDate.now();
    private int estatus;
    private String mensaje;
    private Map<String, String> errores;
    private String ruta;

    public static RespuestaErrorBuilder builder(){
        return new RespuestaErrorBuilder();
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Map<String, String> getErrores() {
        return errores;
    }

    public void setErrores(Map<String, String> errores) {
        this.errores = errores;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
