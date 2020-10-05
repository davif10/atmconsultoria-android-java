package com.davi.atmconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.davi.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sobre);
        String descricao = "A ATM Consultoria é parceira estratégica das mais importantes empresas do mundo, entregando soluções e transformando a experiência do cliente durante cada interação.\n" +
                "Somos a maior equipe de especialistas em relacionamento do mercado: multicultural, altamente qualificada e capacitada, ampla gama de soluções omnichannel integradas, alta tecnologia e os mais rígidos padrões de segurança.\n" +
                "No mercado brasileiro desde 1998, possuímos hoje 10 campi, sendo 8 em São Paulo e 2 na região metropolitana de Natal, no Rio Grande do Norte, que somam 18.000 colaboradores e 11.000 posições de atendimento. A ATM Consultoria vem construindo uma carteira com clientes de diferentes setores econômicos, como serviços financeiros, seguros, tecnologia, nova economia, entre outros.";

        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Fale Conosco")
                .addEmail("atmconsultoria@gmail.com","Envie um e-mail")
                .addWebsite("http://google.com","Acesse nosso site")
                .addGroup("Acesse nossas Redes sociais")
                .addFacebook("google","Facebook")
                .addTwitter("google","Twitter")
                .addYoutube("google","Youtube")
                .addPlayStore("com.google.android.app.plus","Play Store")
                .addGitHub("google","Github")
                .addInstagram("google","Instagram")
                .create();

        setContentView(sobre);
    }
}
