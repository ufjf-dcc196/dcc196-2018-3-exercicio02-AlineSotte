package com.example.alinesotte.dcc196_2018_3_exercicio02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class CadastroActivity extends AppCompatActivity {

  private Button cadastrook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        cadastrook=(Button)findViewById(R.id.btnconfirmar);

        cadastrook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent(CadastroActivity.this, ListagemActivity.class);
                startActivity(intent4);
            }
        });
    }
}
