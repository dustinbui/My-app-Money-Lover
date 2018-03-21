/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Communication;
import java.io.Serializable;

/**
 *
 * @author Anh Bui
 */
public class QLCT implements Serializable, Communication {

    private int day, month, year;
    private int id;
    private int money;
    private String note;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate() {
        return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
    }

    @Override
    public Object[] toObject() {
        return new Object[]{
            this.getId(), this.getDate(), this.getMoney(), this.getNote()
        };
    }

    public void getMonth(Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
