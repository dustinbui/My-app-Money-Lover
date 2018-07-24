/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anh Bui
 */
public class IOFile {

    public void write(ArrayList list, String name) {
        try {
            FileOutputStream fos = new FileOutputStream(new File(name));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (Exception e) {
        }
    }

    public ArrayList read(String name) {
        ArrayList list = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream(new File(name));
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList) ois.readObject();
        } catch (Exception e) {
        }
        return list;
    }
}
