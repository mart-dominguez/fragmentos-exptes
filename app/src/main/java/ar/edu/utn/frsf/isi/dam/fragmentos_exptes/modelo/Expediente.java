package ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.List;

@Entity
public class Expediente {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private Integer id;
    private String nro;
    private String tema;
    private String iniciador;

    public Expediente(Integer id, String nro, String tema, String iniciador) {
        this.id = id;
        this.nro = nro;
        this.tema = tema;
        this.iniciador = iniciador;
    }

    public Expediente(String nro, String tema, String iniciador) {
        this.nro = nro;
        this.tema = tema;
        this.iniciador = iniciador;
    }

    public Expediente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getIniciador() {
        return iniciador;
    }

    public void setIniciador(String iniciador) {
        this.iniciador = iniciador;
    }

}
