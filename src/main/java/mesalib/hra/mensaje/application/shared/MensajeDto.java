package mesalib.hra.mensaje.application.shared;

public class MensajeDto {

    private Long id;

    private String contacto;

    private String contenido;

    public MensajeDto() { }

    public MensajeDto(
            Long id,
            String contacto,
            String contenido) {
        this.id = id;
        this.contacto = contacto;
        this.contenido = contenido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}
