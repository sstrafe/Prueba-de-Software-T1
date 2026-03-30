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
        Cita cita = new Cita("A123", "Juan Perez", 12345678, fecha);
        assertEquals("Ingrese un código de cita válido", registro.registrarCita(cita));
    }

    @Test
    @DisplayName("Validar nombre mínimo 5 caracteres alfabéticos")
    void validarNombrePaciente() {
        RegistroCita registro = new RegistroCita();
        java.util.Date fecha = java.sql.Date.valueOf("2026-12-31");
        Cita cita = new Cita("C123", "Lui1", 12345678, fecha);
        assertEquals("El nombre del paciente debe tener al menos cinco caracteres alfabéticos", registro.registrarCita(cita));
    }
    @Test
    @DisplayName("Validar documento exactamente 8 dígitos")
    void validarDocumento() {
        RegistroCita registro = new RegistroCita();
        java.util.Date fecha = java.sql.Date.valueOf("2026-12-31");
        Cita cita = new Cita("C123", "Juan Perez", 123, fecha);
        assertEquals("Ingrese un número de documento válido", registro.registrarCita(cita));
    }
}