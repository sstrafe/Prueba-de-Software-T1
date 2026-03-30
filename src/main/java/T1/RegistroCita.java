package T1;

import java.util.ArrayList;
import java.util.List;

public class RegistroCita {
    private List<Cita> citas = new ArrayList<>();

    public String registrarCita(Cita cita) {

        if (cita.getCodigo() == null || !cita.getCodigo().matches("^C\\d{3}$")) {
            return "Ingrese un código de cita válido";
        }
        return "La cita ha sido registrada correctamente";
    }
}
