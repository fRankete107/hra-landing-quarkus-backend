package mesalib.hra.mensaje.application.shared;

import jakarta.enterprise.context.ApplicationScoped;
import mesalib.hra.mensaje.domain.Mensaje;

@ApplicationScoped
public class Builder {

    public MensajeDto build(Mensaje mensaje) {
        return new MensajeDto(mensaje.getId(), mensaje.getContacto(), mensaje.getContenido());
    }

}
