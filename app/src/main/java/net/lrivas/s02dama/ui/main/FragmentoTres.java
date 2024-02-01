package net.lrivas.s02dama.ui.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.lrivas.s02dama.R;


public class FragmentoTres extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_fragmento_tres, container, false);
        Button Correo = rootView.findViewById(R.id.btncon);

        Correo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correo();
                
            }
        });

        return rootView;


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragmento_tres, container, false);
    }

    private void correo() {
        // Dirección de correo electrónico del destinatario
        String destinatario = "irluis968@gmail.com";

        // Asunto del correo electrónico
        String asunto = "Asunto del correo";

        // Cuerpo del correo electrónico
        String cuerpo = "Este es el cuerpo del correo.";

        // Crea un Intent con la acción ACTION_SENDTO y la URI de correo
        Uri uri = Uri.parse("mailto:" + destinatario);
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);

        // Establece el asunto y el cuerpo del correo electrónico
        intent.putExtra(Intent.EXTRA_SUBJECT, asunto);
        intent.putExtra(Intent.EXTRA_TEXT, cuerpo);
        startActivity(intent);

    }
}