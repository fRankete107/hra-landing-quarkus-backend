package mesalib.hra.mensaje.persistence;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import mesalib.hra.mensaje.domain.Mensaje;

public class IMensajeRepository implements PanacheRepository<Mensaje> {
}
