package ar.edu.utn.frsf.isi.dam.fragmentos_exptes.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo.Expediente;
import ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo.Pase;

@Database(entities = { Expediente.class, Pase.class }, version = 1)
public abstract class ExpedienteDatabase  extends RoomDatabase {
    public abstract ExpedienteDao getExpedienteDao();
    public abstract PaseDao getPaseDao();
}