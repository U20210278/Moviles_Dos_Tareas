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


public class FragmentoUno extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragmento_uno, container, false);
        // Encuentra el botón en el diseño
        Button btnEscribeme = rootView.findViewById(R.id.btnEscribeme);

        btnEscribeme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnviarWhat();
            }
        });
        return rootView;

        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_fragmento_uno, container, false);

    }

    private void EnviarWhat() {
        String numeroWhatsApp = "79236602"; // Reemplaza esto con tu número de WhatsApp
        String Mensaje = "Hola Quiero HablarContigo..!!!";



        if (numeroWhatsApp.toString().isEmpty()){

            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "HOla Quiero hablar contigo .");
            sendIntent.setType("text/plain");
            sendIntent.setPackage("com.whatsapp");
            startActivity(sendIntent);

        }else{
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_VIEW);
            String uri = "whatsapp://send?phone="+numeroWhatsApp+"HOla Quiero hablar contigo .";
            sendIntent.setData(Uri.parse(uri));
            startActivity(sendIntent);


        }



    }
}