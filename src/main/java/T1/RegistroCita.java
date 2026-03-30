package T1;

import java.util.ArrayList;
import java.util.List;

public class RegistroCita {
    private List<Cita> citas = new ArrayList<>();

    public String registrarCita(Cita cita) {
        if (cita.getCodigo().isEmpty() || cita.getNombre().isEmpty()) {
            return "Debe ingresar todos los datos requeridos";
        }
        if (cita.getCodigo() == null || !cita.getCodigo().matches("^C\\d{3}$")) {
            return "Ingrese un código de cita válido";
        }
        if (cita.getNombre() == null || !cita.getNombre().matches("^[a-zA-Z\\s]{5,}$")) {
            return "El nombre del paciente debe tener al menos cinco caracteres alfabéticos";
        }
        if (cita.getDocumento() < 10000000 || cita.getDocumento() > 99999999) {
            return "Ingrese un número de documento válido";
        }
        if (cita.getFecha() == null || !cita.getFecha().after(new java.util.Date())) {
            return "La fecha de la cita debe ser posterior a la fecha actual";
        }
        return "La cita ha sido registrada correctamente";
    }
}
