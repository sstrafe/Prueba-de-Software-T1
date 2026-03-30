package T1;

import java.util.Date;

public class Cita {

    String codigo;
    String nombre;
    int documento;
    Date fecha;

    public Cita(String codigo, String nombre, int documento, Date fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.documento = documento;
        this.fecha = fecha;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
