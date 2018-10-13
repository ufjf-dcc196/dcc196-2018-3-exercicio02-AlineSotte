package com.example.alinesotte.dcc196_2018_3_exercicio02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ListagemActivity extends AppCompatActivity {

     private Button  ircadastrar, excluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);


        ircadastrar=(Button)findViewById(R.id.btncastrarlist);
        excluir=(Button)findViewById(R.id.btnexcluir);
    }
}
