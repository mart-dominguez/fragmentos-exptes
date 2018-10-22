package ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(foreignKeys = @ForeignKey(entity = Expediente.class,
        parentColumns = "id",
        childColumns = "idExpediente"))
public class Pase {
    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private Integer idExpediente;
    private String iniciador;
    private String destino;
    private Long fecha;

    public Pase() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(Integer idExpediente) {
        this.idExpediente = idExpediente;
    }

    public String getIniciador() {
        return iniciador;
    }

    public void setIniciador(String iniciador) {
        this.iniciador = iniciador;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Long getFecha() {
        return fecha;
    }

    public void setFecha(Long fecha) {
        this.fecha = fecha;
    }
}
