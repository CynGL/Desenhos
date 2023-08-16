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

        idRecyclerView = findViewById(R.id.idListaJogadoras);
        listaDesenhos = new ArrayList<>();


        listaDesenhos.add(
                new Desenhos(
                        "Leticia",
                        "Filme legal",
                        "ação",
                        R.drawable.leticiabr));

        listaDesenhos.add(
                new Desenhos("Adriana",
                        "Filme bom",
                        "drama",
                        R.drawable.adrianabr));

        listaDesenhos.add(
                new Desenhos("Ana Vitoria",
                        "Filme aa",
                        "ficção",
                        R.drawable.anavitoriabr));

        listaDesenhos.add(
                new Desenhos("Antonia",
                        "Filme natural verde",
                        "drama",
                        R.drawable.antoniabr));

        listaDesenhos.add(
                new Desenhos("Ary Borges",
                        "Filme n",
                        "suspense",
                        R.drawable.aryborgesbr));

        listaDesenhos.add(
                new Desenhos("Bia Zaneratto",
                        "Filme assustado",
                        "terror",
                        R.drawable.biazanerattobr));
        listaDesenhos.add(
                new Desenhos("Bruninha",
                        "Filme feminino",
                        "ação",
                        R.drawable.bruninhabr));
        listaDesenhos.add(
                new Desenhos("Debinha",
                        "Filme doce",
                        "ação",
                        R.drawable.debinhabr));

        listaDesenhos.add(
                new Desenhos("Gabi Nunes",
                        "Filme doce",
                        "ação",
                        R.drawable.gabinunesbr));

        listaDesenhos.add(
                new Desenhos("Geyse",
                        "Filme doce",
                        "ação",
                        R.drawable.geysebr));


        listaDesenhos.add(
                new Desenhos("Julia Bianchi",
                        "Filme doce",
                        "ação",
                        R.drawable.juliabianchibr));


        listaDesenhos.add(
                new Desenhos("Kathellen",
                        "Filme doce",
                        "ação",
                        R.drawable.kathellenbr));


        listaDesenhos.add(
                new Desenhos("Kerolin",
                        "Filme doce",
                        "ação",
                        R.drawable.kerolinbr));


        listaDesenhos.add(
                new Desenhos("Lauren",
                        "Filme doce",
                        "ação",
                        R.drawable.laurenbr));


        listaDesenhos.add(
                new Desenhos("Ludmila",
                        "Filme doce",
                        "ação",
                        R.drawable.ludmilabr));


        listaDesenhos.add(
                new Desenhos("Marta",
                        "Filme doce",
                        "ação",
                        R.drawable.martabr));


        listaDesenhos.add(
                new Desenhos("Nycole",
                        "Filme doce",
                        "ação",
                        R.drawable.nycolebr));


        listaDesenhos.add(
                new Desenhos("Rafaelle",
                        "Filme doce",
                        "ação",
                        R.drawable.rafaellebr));

        listaDesenhos.add(
                new Desenhos("Tainara",
                        "Filme doce",
                        "ação",
                        R.drawable.tainarabr));

        listaDesenhos.add(
                new Desenhos("Tamires",
                        "Filme doce",
                        "ação",
                        R.drawable.tamiresbr));

        listaDesenhos.add(
                new Desenhos("Tarciane",
                        "Filme doce",
                        "ação",
                        R.drawable.tarcianebr));

        listaDesenhos.add(
                new Desenhos("Yasmim",
                        "Filme doce",
                        "ação",
                        R.drawable.yasmimbr));





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