package com.example.chris.contactos;

import java.io.Serializable;

/**
 * Created by chris on 05/09/2017.
 */

public class Contacto implements Serializable{
    private String usuario;
    private String email;
    private String tw;
    private String fechaN;
    private int tel;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTw(String tw) {
        this.tw = tw;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public String getTw() {
        return tw;
    }

    public String getFechaN() {
        return fechaN;
    }

    public int getTel() {
        return tel;
    }
}
