public class Cliente {
    private String nombre;
    private String documento;
    private String telefono;

    public String getNombre(){
    return this.nombre;
}

public void setNombre(String nuevoNombre){
    this.nombre = nuevoNombre;
}

public String getDocumento(){
    return this.documento;
}

public void setDocumento(String nuevoDocumento){
    this.documento = nuevoDocumento;
}

public String getTelefono(){
    return this.telefono;
}

public void setTelefono(String nuevoTelefono){
    this.telefono = nuevoTelefono;
}

}
