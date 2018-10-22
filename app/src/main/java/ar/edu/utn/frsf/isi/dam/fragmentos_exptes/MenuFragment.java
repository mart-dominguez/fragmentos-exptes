package ar.edu.utn.frsf.isi.dam.fragmentos_exptes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    Button btnAltaExpte;

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_menu, container, false);
        btnAltaExpte = (Button) v.findViewById(R.id.btnAltaExpediente);
        btnAltaExpte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AltaPaseFragment frgAltaPase = new AltaPaseFragment();
                FragmentManager frgMngr =  getActivity().getSupportFragmentManager();
                frgMngr.beginTransaction()
                        .add(R.id.fragmentContainer,frgAltaPase);
                //FragmentManager fragmentManager = getFragmentManager();
                //FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            }
        });
        return v;
    }

}
