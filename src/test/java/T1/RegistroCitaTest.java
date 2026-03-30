package T1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegistroCitaTest {

    @Test
    @DisplayName("Validar código de cita formato C123")
    void validarCodigoCita() {
        RegistroCita registro = new RegistroCita();
        java.util.Date fecha = java.sql.Date.valueOf("2025-12-31");
        Cita cita = new Cita("C123", "Juan Perez", 12345678, fecha);
        assertEquals("Ingrese un código de cita válido", registro.registrarCita(cita));
    }
}