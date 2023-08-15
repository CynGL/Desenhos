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


    private List<Desenhos> lstDesenhos;

    //criando construtor de classe com parâmetros ( alt + insert e depois shift + seta para baixo)
    public MyAdapter(Context mContexto, List<Desenhos> lstDesenhos) {
        this.mContexto = mContexto;
        this.lstDesenhos = lstDesenhos;
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

        holder.idTituloDesenhos.setText(lstDesenhos.get(position).getTitulo());
        holder.idImagemDesenhos.setImageResource(lstDesenhos.get(position).getImagem());
    }

    public void onClick (View v) {

        Intent intent = new Intent(mContexto, ApresentaDesenhoActivity.class);

        intent.putExtra("Nome da Jogadora", lstDesenhos.get(position).getTitulo());
        intent.putExtra("Titulos", lstDesenhos.get(position).getDescricao());
        intent.putExtra("Times", lstDesenhos.get(position).getCategoria());
        intent.putExtra("Posição", lstDesenhos.get(position).getImagem());

        mContexto.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView idTituloDesenhos;

        ImageView idImagemDesenhos;

        CardView idCardDesenhos;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            idTituloDesenhos = itemView.findViewById(R.id.idTituloDesenhos);
            idImagemDesenhos = itemView.findViewById(R.id.idImgDesenhos);
            idCardDesenhos = itemView.findViewById(R.id.idCardDesenhos);
        }
    }

}
