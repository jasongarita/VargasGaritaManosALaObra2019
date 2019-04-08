/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import Domain.Driver;
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
public class DriverFile {
    public boolean addDriver(Driver driver) throws FileNotFoundException, IOException, ClassNotFoundException {
        File myFile = new File(Util.Utilities.PATHTOSAVEDRIVERS);
        List<Driver> driverList = new ArrayList<>();
        if (myFile.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));

            Object aux = ois.readObject();
            driverList = (List<Driver>) aux;
            ois.close();
        }
        driverList.add(driver);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(myFile));
        oos.writeUnshared(driverList);
        oos.close();
        return true;

    }//addDriver end

    public List<Driver> read() throws FileNotFoundException, IOException, ClassNotFoundException {

        File myFile = new File(Util.Utilities.PATHTOSAVEDRIVERS);
        List<Driver> driverList = new ArrayList<>();
        if (myFile.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));

            Object aux = ois.readObject();
            driverList = (List<Driver>) aux;
            ois.close();
            if (driverList == null || driverList.isEmpty()) {
                driverList = new ArrayList();
                driverList.add(new Driver() {});
                return driverList;
            }
            return driverList;
        } else {
            driverList.add(new Driver() {});
            return driverList;
        }

    }

    public boolean search(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File myFile = new File(Util.Utilities.PATHTOSAVEDRIVERS);
        List<Driver> driverList = new ArrayList<>();
        if (myFile.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = ois.readObject();
            driverList = (List<Driver>) aux;
            ois.close();
        }
        for (int i = 0; i < driverList.size(); i++) {

            String s = driverList.get(i).getName();
            for (int j = 0; j < s.length(); j++) {
                for (int x = 0; x < name.length(); x++) {
                    if (driverList.get(i).getName().equalsIgnoreCase(name)) {
                        return true;
                    }
                }

            }
        }
        return false;

    }

    public Driver getDriver(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File myFile = new File(Util.Utilities.PATHTOSAVEDRIVERS);
        List<Driver> driverList = new ArrayList<>();

        if (myFile.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = ois.readObject();
            driverList = (List<Driver>) aux;
            ois.close();
        }
        for (int i = 0; i < driverList.size(); i++) {

            String s = driverList.get(i).getName();
            for (int j = 0; j < s.length(); j++) {
                for (int x = 0; x < name.length(); x++) {
                    if (driverList.get(i).getName().equalsIgnoreCase(name)) {
                        return driverList.get(i);
                    }
                }

            }
        }
        return null;

    }

    public boolean delete(String name) throws IOException, FileNotFoundException, ClassNotFoundException {
        File myFile = new File(Util.Utilities.PATHTOSAVEDRIVERS);
        List<Driver> driverList = new ArrayList<Driver>();
        if (myFile.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = ois.readObject();
            driverList = (List<Driver>) aux;
            ois.close();
        }//if

        for (int i = 0; i < driverList.size(); i++) {
            if (driverList.get(i).getName().equalsIgnoreCase(name)) {
                driverList.remove(driverList.get(i));
                ObjectOutputStream ouput = new ObjectOutputStream(new FileOutputStream(myFile));
                ouput.writeUnshared(driverList);
                ouput.close();
                return true;
            }
        }

        return false;
    }
}
