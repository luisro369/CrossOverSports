package com.luisro00005513.crossoversports.Fragments.FragmentHome;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.luisro00005513.crossoversports.Activities.MainActivity;
import com.luisro00005513.crossoversports.Entities.User;
import com.luisro00005513.crossoversports.R;

public class FragmentoLogin extends Fragment {
    Context context;
    public static String user;
    public static String password;

    public FragmentoLogin(){
        //required
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        Button btnLogin = (Button)view.findViewById(R.id.btnLogin);
        final EditText editUser = (EditText)view.findViewById(R.id.editUsuario);
        final EditText editPass = (EditText)view.findViewById(R.id.editPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                user = editUser.getText().toString();
                password = editPass.getText().toString();
                User userValidation = MainActivity.db.userDAO().finByUserName(user);
                if (userValidation.getUserPass().equals(password)) {
                    FragmentTransaction fr = getFragmentManager().beginTransaction();
                    fr.replace(R.id.fragmento_padre,new FragmentoHome());//CARGAR FRAGMENTO DE NOTICIAS
                    fr.commit();
                }
                else {
                    Log.d("login","fallo inicio");
                }
            }
        });
        return view;
    }
}
