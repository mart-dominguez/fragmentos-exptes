package ar.edu.utn.frsf.isi.dam.fragmentos_exptes;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MenuFragment mnuFrg = new MenuFragment();
        FragmentManager frgMngr =  getSupportFragmentManager();
        frgMngr.beginTransaction()
                .add(R.id.fragmentContainer,mnuFrg);
    }
}
