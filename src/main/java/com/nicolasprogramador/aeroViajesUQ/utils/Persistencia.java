package com.nicolasprogramador.aeroViajesUQ.utils;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Persistencia implements Serializable {

    public Persistencia() {

    }

    public static List<String> leyendoCadenasTexto(String ruta) {
        List<String> lista=new ArrayList<>();
        try
        {
            FileReader fr=new FileReader(ruta);
            BufferedReader br=new BufferedReader(fr);

            String linea="";
            while((linea=br.readLine())!=null)
            {
                lista.add(linea);
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
           e.printStackTrace();
        }
        return lista;
    }

    public static void escribiendoCadenasTexto(String ruta,boolean concatenar,List<String> lista) {
        try
        {
            FileWriter fw=new FileWriter(ruta,concatenar);
            BufferedWriter bw=new BufferedWriter(fw);

            for(String linea: lista)
            {
                bw.write(linea);
                bw.newLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void exportarObjeto(String ruta,Object objeto) {
        try
        {
            ObjectOutputStream objectoutput=new ObjectOutputStream(new FileOutputStream(ruta));
            objectoutput.writeObject(objeto);
            objectoutput.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static Object importarObjeto(String ruta) {
        Object objeto=new Object();
        try
        {
            ObjectInputStream objectinput=new ObjectInputStream(new FileInputStream(ruta));
            objeto=objectinput.readObject();
            objectinput.close();
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return objeto;
    }

    /** @author caflorezvi
     * Serializa un objeto en un archivo en formato XML
     * @param ruta Ruta del archivo donde se va a serializar el objeto
     * @param objeto Objeto a serializar
     * @throws FileNotFoundException
     */
    public static void serializarObjetoXML(String ruta, Object objeto) throws FileNotFoundException {
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream(ruta));
        encoder.writeObject(objeto);
        encoder.close();
    }

    /**  @author caflorezvi
     * Deserializa un objeto desde un archivo XML
     * @param ruta Ruta del archivo a deserializar
     * @return Objeto deserializado
     * @throws IOException
     */
    public static Object deserializarObjetoXML(String ruta) throws IOException{
        XMLDecoder decoder = new XMLDecoder(new FileInputStream(ruta));
        Object objeto = decoder.readObject();
        decoder.close();

        return objeto;
    }


}
