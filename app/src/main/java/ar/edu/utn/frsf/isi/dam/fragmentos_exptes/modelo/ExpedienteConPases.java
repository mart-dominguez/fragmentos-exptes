package ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class ExpedienteConPases {
    @Embedded
    public Expediente expediente;

    @Relation(parentColumn = "id", entityColumn = "idExpediente")
    public List<Pase> pases;
}
