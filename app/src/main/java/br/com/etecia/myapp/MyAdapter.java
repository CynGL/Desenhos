package br.com.etecia.myapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;


    private List<Desenhos> lstJogadoras;

    //criando construtor de classe com parâmetros ( alt + insert e depois shift + seta para baixo)
    public MyAdapter(Context mContexto, List<Desenhos> lstJogadoras) {
        this.mContexto = mContexto;
        this.lstJogadoras = lstJogadoras;
    }



    public MyAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_desenhos,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.idTituloDesenhos.setText(lstJogadoras.get(position).getTitulo());
        holder.idImagemDesenhos.setImageResource(lstJogadoras.get(position).getImagem());
    }

    public void onClick (View v) {

        Intent intent = new Intent(mContexto, ApresentaSelecaoActivity.class);

        intent.putExtra("Nome da Jogadora", lstJogadoras.get(position).getTitulo());
        intent.putExtra("Titulos", lstJogadoras.get(position).getDescricao());
        intent.putExtra("Times", lstJogadoras.get(position).getCategoria());
        intent.putExtra("Posição", lstJogadoras.get(position).getImagem());

        mContexto.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView idNomeJogadora;

        ImageView idImagemJogadora;

        CardView idCardJogadoras;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            idNomeJogadora = itemView.findViewById(R.id.idNomeJogadora);
            idImagemJogadora = itemView.findViewById(R.id.idImgJogadoras);
            idCardJogadoras = itemView.findViewById(R.id.idCardJogadoras);
        }
    }

}
