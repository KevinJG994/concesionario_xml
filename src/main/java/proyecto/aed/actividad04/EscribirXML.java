package proyecto.aed.actividad04;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.PropertyException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscribirXML {

    public void escribirDatos(ArrayList coches, String nombre, String ubicacion) {
        Concesionario concesionario = new Concesionario();

        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Concesionario.class);
        } catch (JAXBException ex) {
            System.out.println("Error JAXB, err: " + ex.toString());
        }

        Marshaller marshaller = null;
        try {
            marshaller = context.createMarshaller();
        } catch (JAXBException ex) {
            System.out.println("Error JAXB, err: " + ex.toString());
        }

        concesionario.setNombre(nombre);
        concesionario.setUbicacion(ubicacion);
        concesionario.setCoche(coches);

        try {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        } catch (PropertyException ex) {
            System.out.println("Error Property Marshaller, err: " + ex.toString());
        }
        try {
            marshaller.marshal(concesionario, new FileWriter("concesionario.xml"));
        } catch (IOException ex) {
            System.out.println("Error en Entrada o Salida de Datos, err: " + ex.toString());
        } catch (JAXBException ex) {
            System.out.println("Error JAXB, err: " + ex.toString());
        }
    }
}
