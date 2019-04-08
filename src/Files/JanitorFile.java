/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import Domain.Janitor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jason
 */
public class JanitorFile {
    public boolean saveJanitor(Janitor janitor) throws FileNotFoundException, IOException, ClassNotFoundException {
        File myFile = new File(Util.Utilities.PATHTOSAVEJANITORS);
        List<Janitor> janitorList = new ArrayList<>();
        if (myFile.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));

            Object aux = ois.readObject();
            janitorList = (List<Janitor>) aux;
            ois.close();
        }
        janitorList.add(janitor);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(myFile));
        oos.writeUnshared(janitorList);
        oos.close();
        return true;

    }//Fin de metodo saveJanitor

    public List<Janitor> read() throws FileNotFoundException, IOException, ClassNotFoundException {

        File miArchivo = new File(Util.Utilities.PATHTOSAVEJANITORS);
        List<Janitor> janitorList = new ArrayList<>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));

            Object aux = ois.readObject();
            janitorList = (List<Janitor>) aux;
            ois.close();
            if (janitorList == null || janitorList.isEmpty()) {
                janitorList = new ArrayList();
                janitorList.add(new Janitor());
                return janitorList;
            }
            return janitorList;
        } else {
            janitorList.add(new Janitor());
            return janitorList;
        }

    }//Fin de metodo

    public boolean search(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File miArchivo = new File(Util.Utilities.PATHTOSAVEJANITORS);
        List<Janitor> janitorList = new ArrayList<>();
        
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
            Object aux = ois.readObject();
            janitorList = (List<Janitor>) aux;
            ois.close();
        }
        for (int i = 0; i < janitorList.size(); i++) {

            String s = janitorList.get(i).getName();
            for (int j = 0; j < s.length(); j++) {
                for (int x = 0; x < name.length(); x++) {
                    if (janitorList.get(i).getName().equalsIgnoreCase(name)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }// //Fin de metodo search

    public Janitor getJanitor(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File myFile = new File(Util.Utilities.PATHTOSAVEJANITORS);
        List<Janitor> janitorList = new ArrayList<>();
        if (myFile.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = ois.readObject();
            janitorList = (List<Janitor>) aux;
            ois.close();
        }
        for (int i = 0; i < janitorList.size(); i++) {

            String s = janitorList.get(i).getName();
            for (int j = 0; j < s.length(); j++) {
                for (int x = 0; x < name.length(); x++) {
                    if (janitorList.get(i).getName().equalsIgnoreCase(name)) {
                        return janitorList.get(i);
                    }
                }
            }
        }
        return null;

    }//Fin de metodo

    public boolean delete(String name) throws IOException, FileNotFoundException, ClassNotFoundException {
        File myFile = new File(Util.Utilities.PATHTOSAVEJANITORS);
        List<Janitor> janitorList = new ArrayList<Janitor>();
        if (myFile.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = ois.readObject();
            janitorList = (List<Janitor>) aux;
            ois.close();
        }
        for (int i = 0; i < janitorList.size(); i++) {
            if (janitorList.get(i).getName().equalsIgnoreCase(name)) {
                janitorList.remove(janitorList.get(i));
                ObjectOutputStream ouput = new ObjectOutputStream(new FileOutputStream(myFile));
                ouput.writeUnshared(janitorList);
                ouput.close();
                return true;
            }
        }

        return false;
    }
}
