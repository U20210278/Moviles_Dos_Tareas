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


public class FragmentoDos extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragmento_dos, container, false);
        Button Uni = rootView.findViewById(R.id.btnUni);
        
        Uni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.univo.edu.sv/";
                // Crea un Intent con la acción ACTION_VIEW y la URI de la URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                    // Abre la URL en un navegador
                    startActivity(intent);

            }
        });
 return rootView;

        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_fragmento_dos, container, false);
    }
}