package mesalib.hra.mensaje.application;

import mesalib.hra.mensaje.application.shared.Builder;
import mesalib.hra.mensaje.domain.Mensaje;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import mesalib.hra.mensaje.application.shared.MensajeDto;
import mesalib.hra.mensaje.persistence.IMensajeRepository;
import org.netbeans.lib.cvsclient.response.ResponseException;

@ApplicationScoped
public class Add {

    @Inject
    IMensajeRepository mensajeRepository;

    @Inject
    Builder builder;

    @Transactional
    public MensajeDto addMensaje(MensajeDto mensajeDto) {
        Mensaje mensaje = new Mensaje();

        mensaje.setContacto(mensajeDto.getContacto());
        mensaje.setContenido(mensajeDto.getContenido());

        this.mensajeRepository.persist(mensaje);

        return builder.build(mensaje);
    }

}
