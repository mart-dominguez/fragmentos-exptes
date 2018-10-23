package ar.edu.utn.frsf.isi.dam.fragmentos_exptes;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo.Expediente;


/**
 * A simple {@link Fragment} subclass.
 */
public class AltaExpediente extends Fragment {

    public interface OnGuardarExpedienteListener{
        public void guardar(Expediente e);
    }
    private Button btnGuardar;
    private EditText iniciador;
    private EditText nro;
    private EditText tema;
    private OnGuardarExpedienteListener listenerGuardar;
    public AltaExpediente() {
        // Required empty public constructor
    }
    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);
        try {
            listenerGuardar = (OnGuardarExpedienteListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnArticleSelectedListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_alta_expediente, container, false);
        btnGuardar = (Button) v.findViewById(R.id.btnGuardar);
        iniciador = (EditText) v.findViewById(R.id.expteIniciador);
        nro = (EditText) v.findViewById(R.id.expteNro);
        tema = (EditText) v.findViewById(R.id.expteTema);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expediente e = new Expediente();
                e.setTema(tema.getText().toString());
                e.setNro(nro.getText().toString());
                e.setIniciador(iniciador.getText().toString());
                listenerGuardar.guardar(e);
            }
        });
        return v;
    }

}
