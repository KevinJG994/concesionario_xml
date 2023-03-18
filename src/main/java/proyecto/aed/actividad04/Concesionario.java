package proyecto.aed.actividad04;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlRootElement(namespace = "concesionario.xml.jaxb.model")
@XmlType(propOrder = {"nombre", "ubicacion", "coche"})
public class Concesionario {

    private String nombre;
    private String ubicacion;
    private ArrayList<Coche> coche = new ArrayList();

    public Concesionario() {
    }

    @XmlElementWrapper(name = "listaCoches")
    @XmlElement(name = "coche")
    public ArrayList<Coche> getCoche() {
        return coche;
    }

    public void setCoche(ArrayList<Coche> coche) {
        this.coche = coche;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
