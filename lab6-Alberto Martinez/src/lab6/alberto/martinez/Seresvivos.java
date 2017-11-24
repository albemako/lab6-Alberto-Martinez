/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.alberto.martinez;

import java.io.Serializable;

/**
 *
 * @author Alberto
 */
public class Seresvivos implements Serializable{
public final long SerializableUID=123L;
public String raza;
public int ki;
public int max;
public String planeta;

    public Seresvivos(String raza, int ki, int max, String planeta) {
        
        this.raza = raza;
        this.ki = ki;
        this.max = max;
        this.planeta = planeta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return raza;
    }


    
}
