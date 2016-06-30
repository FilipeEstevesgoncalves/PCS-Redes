package simuladorderedes.modelo.Dao;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import simuladorderedes.modelo.RedeModelo;

public class PersistenciaXML {

    public static Object ler(String filename) {
        Object o = new Object();
        try {
            XMLDecoder xmlDecoder = null;
            try {
                xmlDecoder = new XMLDecoder(new FileInputStream(filename + ".xml"));
                o = xmlDecoder.readObject();
            } finally {
                if (xmlDecoder != null) {
                    xmlDecoder.close();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return o;
    }

    public static void escrever(Object o, String file) {
        try {
            XMLEncoder xmlEncoder = null;
            try {
                xmlEncoder = new XMLEncoder(
                        new FileOutputStream(file + ".xml"));
                xmlEncoder.writeObject(o);

            } finally {
                if (xmlEncoder != null) {
                    xmlEncoder.close();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
