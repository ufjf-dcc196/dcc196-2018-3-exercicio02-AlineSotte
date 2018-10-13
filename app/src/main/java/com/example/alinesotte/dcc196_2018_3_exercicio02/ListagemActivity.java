package com.example.alinesotte.dcc196_2018_3_exercicio02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListagemActivity extends AppCompatActivity {

     private Button  ircadastrar, excluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);


        ircadastrar=(Button)findViewById(R.id.btncastrarlist);
        excluir=(Button)findViewById(R.id.btnexcluir);

        ircadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ListagemActivity.this,CadastroActivity.class);
                startActivity(intent3);
            }
        });
    }
}
