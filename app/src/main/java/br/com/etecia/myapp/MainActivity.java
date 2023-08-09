package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Desenhos> listaDesenhos;
    //declarar recycler view
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.idListadesenhos);
        listaDesenhos = new ArrayList<>();


        listaDesenhos.add(
                new Desenhos("Apocalipse",
                        "Filme legal",
                        "ação",
                        R.drawable.apocalipe));

        listaDesenhos.add(
                new Desenhos("Desejos",
                        "Filme bom",
                        "drama",
                        R.drawable.desejos));

        listaDesenhos.add(
                new Desenhos("2067",
                        "Filme aa",
                        "ficção",
                        R.drawable.doismilesessetnaesete));

        listaDesenhos.add(
                new Desenhos("Folha",
                        "Filme natural verde",
                        "drama",
                        R.drawable.folha));

        listaDesenhos.add(
                new Desenhos("Interrogação",
                        "Filme n",
                        "suspense",
                        R.drawable.interrogacao));

        listaDesenhos.add(
                new Desenhos("Medo",
                        "Filme assustado",
                        "terror",
                        R.drawable.medo));
        listaDesenhos.add(
                new Desenhos("Menina",
                        "Filme feminino",
                        "ação",
                        R.drawable.menina));
        listaDesenhos.add(
                new Desenhos("Ponta Bala",
                        "Filme doce",
                        "ação",
                        R.drawable.pontabala));


        //criando classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaDesenhos);

        //tipos de layout de a lista irá seguir
        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 2));

        //fixador de tamanho de lista - deixar a lista mais rápida
        idRecyclerView.setHasFixedSize(true);
        //Ligar o recycleview ao adaptador
        idRecyclerView.setAdapter(adapter);
    }

}