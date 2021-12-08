package apps.bienestar.pausasactivasybienestar;

public class Usuarios {
    String clasenombre, correo, celular, empresa;
    public Usuarios(String clasenombre, String correo, String celular, String empresa) {
        this.clasenombre = clasenombre;
        this.correo = correo;
        this.celular = celular;
        this.empresa = empresa;
    }

    public String getClasenombre() {
        return clasenombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmpresa() {
        return empresa;
    }
}
