/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfile;

public class tr extends Thread{
     String name;
     int p;
     int s;

    public tr(String name, int p, int s) {
        this.name = name;
        this.p = p;
        this.s = s;
    }

    public String getname() {
        return name;
    }

    public int getP() {
        return p;
    }

    public int getS() {
        return s;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setP(int p) {
        this.p = p;
    }

    public void setS(int s) {
        this.s = s;
    }
     
}
