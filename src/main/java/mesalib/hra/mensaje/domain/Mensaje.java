package mesalib.hra.mensaje.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "mensajes")
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;


    @Column(name = "contacto")
    private String contacto;

    @Column(name = "contenido")
    private String contenido;

    public Mensaje() { }

    public Mensaje(
            String contacto,
            String contenido) {
        this.contacto = contacto;
        this.contenido = contenido;
    }

    public Long getId() {
        return id;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}
