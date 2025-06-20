package pe.vallegrande.institucion.DTO;



public class institucionDTO {
    private long id;
    private String nombreInstitucion;
    private String correo;

    // Constructor
    public institucionDTO(long id, String nombreInstitucion, String correo) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.correo = correo;
    }

    // Getters y Setters
    public long getId() {
        return id;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

