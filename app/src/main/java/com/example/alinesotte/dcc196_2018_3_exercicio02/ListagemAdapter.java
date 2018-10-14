package com.example.alinesotte.dcc196_2018_3_exercicio02;

import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ListagemAdapter extends RecyclerView.Adapter<ListagemAdapter.ViewHolder> {

    private Cursor cursor;

    public ListagemAdapter(Cursor cursor) {
        this.cursor = cursor;
    }

    public void setCursor(Cursor c) {
        this.cursor = c;

    }

    @NonNull
    @Override
    public ListagemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View livroView = inflater.inflate(R.layout.activity_listagem,parent,false);
        ViewHolder holder = new ViewHolder(livroView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListagemAdapter.ViewHolder holder, int position) {
        int idxSerie = cursor.getColumnIndexOrThrow(ListagemContract.Lista.COLUMN_NAME_SERIE);

        int idxTemporada = cursor.getColumnIndexOrThrow(ListagemContract.Lista.COLUMN_NAME_TEMPORADA);

        int idxEpisodio = cursor.getColumnIndexOrThrow(ListagemContract.Lista.COLUMN_NAME_EPISODIO);

        cursor.moveToPosition(position);
        holder.txt_serie.setText(cursor.getString(idxSerie));
        holder.txt_temporada.setText(cursor.getString(idxTemporada));
        holder.txt_episodio.setText(String.valueOf(cursor.getString(idxEpisodio)));
    }

    @Override
    public int getItemCount() {
        return cursor.getCount();}

    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txt_serie;
        public TextView txt_temporada;
        public TextView txt_episodio;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_serie= itemView.findViewById(R.id.textserie);
            txt_temporada = itemView.findViewById(R.id.texttemporada);
            txt_episodio = itemView.findViewById(R.id.textepisodio);
        }
    }

}
