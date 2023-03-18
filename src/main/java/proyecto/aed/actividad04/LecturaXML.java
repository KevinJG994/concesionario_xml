package proyecto.aed.actividad04;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LecturaXML {

    public String leerXML() {
        String cadena, cadenas = "";
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Concesionario.class);
        } catch (JAXBException ex) {
            System.out.println("Error JAXB, err: " + ex.toString());
        }
        Unmarshaller unmarshaller = null;
        try {
            unmarshaller = context.createUnmarshaller();
        } catch (JAXBException ex) {
            System.out.println("Error JAXB, err: " + ex.toString());
        }
        Concesionario concesionario = null;

        try {
            concesionario = (Concesionario) unmarshaller.unmarshal(new File("concesionario.xml"));
        } catch (JAXBException ex) {
            System.out.println("Error JAXB, err: " + ex.toString());
        }

        cadena = "Concesionario: " + concesionario.getNombre() + "\nUbicacion: " + concesionario.getUbicacion() + "\n";
        ArrayList<Coche> coches = concesionario.getCoche();

        for (Coche c : coches) {
            cadenas += "\nCoche\nModelo: " + c.getModelo() + "\nMarca: " + c.getMarca() + "\nColor: " + c.getColor() + "\nMatrícula: " + c.getMatricula() + "\n";
        }
        return cadena + cadenas;
    }

    public String formatoXML() {
        String texto = "";
        String linea;

        try {
            var br = new BufferedReader(new FileReader("concesionario.xml"));
            try {
                linea = br.readLine();
                while (linea != null) {
                    texto += linea + "\n";
                    linea = br.readLine();
                }
                br.close();
            } catch (IOException ex) {
                System.out.println("Error en la Entrada o Salida de Datos, err: " + ex.toString());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero No Encontrado, err: " + ex.toString());
            JOptionPane.showMessageDialog(null, "Fichero NO encontrado!!!");
        }
        return texto;
    }

    public void BorrarArchivo() {
        File fl = new File("concesionario.xml");
        fl.delete();
        JOptionPane.showMessageDialog(null, "Archivo XML eliminado!!!");
    }

}
