package ar.edu.utn.frsf.isi.dam.fragmentos_exptes;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ar.edu.utn.frsf.isi.dam.fragmentos_exptes.dao.ExpedienteRepository;
import ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo.Expediente;

public class MainActivity extends AppCompatActivity implements  AltaExpediente.OnGuardarExpedienteListener{
    private Button btnAltaExpte;
    private Button btnAltaPase;

    @Override
    public void guardar(final Expediente e) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                ExpedienteRepository.getInstance(MainActivity.this).getExpteDao().crear(e);
            }
        };
        Thread t = new Thread(r);
        t.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAltaExpte = (Button) findViewById(R.id.btnAltaExpediente);
        btnAltaExpte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AltaExpediente frgAltaExpte = new AltaExpediente();
                FragmentManager frgMngr =  getSupportFragmentManager();
                frgMngr.beginTransaction()
                        .replace(R.id.contenedorFragmento,frgAltaExpte)
                        .addToBackStack(null)
                        .commit();
            }
        });
        btnAltaPase = (Button) findViewById(R.id.btnNuevoPase);
        btnAltaPase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AltaPaseFragment paseFragment = new AltaPaseFragment();
                FragmentManager frgMngr =  getSupportFragmentManager();
                frgMngr.beginTransaction()
                        .replace(R.id.contenedorFragmento,paseFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
