package ar.edu.utn.frsf.isi.dam.fragmentos_exptes.dao;

import android.arch.persistence.room.Room;
import android.content.Context;

import java.util.List;

import ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo.Expediente;

public class ExpedienteRepository {
    private ExpedienteDao expteDao =null;
    private PaseDao paseDao =null;

    private static ExpedienteRepository _INSTANCE = null;


    private ExpedienteRepository(Context ctx){
        ExpedienteDatabase db = Room.databaseBuilder(ctx.getApplicationContext(),ExpedienteDatabase.class,"expte-db").build();
        expteDao=db.getExpedienteDao();
        paseDao=db.getPaseDao();
    }

    public static ExpedienteRepository getInstance(Context ctx){
        if(_INSTANCE==null)  _INSTANCE=new ExpedienteRepository(ctx);
        return _INSTANCE;
    }

    public ExpedienteDao getExpteDao() {
        return expteDao;
    }

    public void setExpteDao(ExpedienteDao expteDao) {
        this.expteDao = expteDao;
    }

    public PaseDao getPaseDao() {
        return paseDao;
    }

    public void setPaseDao(PaseDao paseDao) {
        this.paseDao = paseDao;
    }
}
