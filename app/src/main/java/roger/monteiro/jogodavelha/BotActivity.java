package roger.monteiro.jogodavelha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by roger on 24/06/17.
 */

public class BotActivity extends AppCompatActivity {

    /*Criando as variaveis dos botoes*/

    Button a11;
    Button a12;
    Button a13;
    Button a21;
    Button a22;
    Button a23;
    Button a31;
    Button a32;
    Button a33;
    Button btnRestar;

    TextView txtVez,txtResultado;
    String simbolo;
    int jogada = 0, contBot = 0;

    /*Funcao verifica se ja houve um vencedor*/

    public int checaVitoriaO(){
        if (a11.getText()=="O" && a12.getText()=="O" && a13.getText()=="O"){
            a11.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a12.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a13.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 0;
        }else if (a11.getText()=="O" && a21.getText()=="O" && a31.getText()=="O"){
            a11.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a21.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a31.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 0;
        }else if (a13.getText()=="O" && a23.getText()=="O" && a33.getText()=="O"){
            a13.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a23.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a33.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 0;
        }else if (a21.getText()=="O" && a22.getText()=="O" && a23.getText()=="O"){
            a21.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a22.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a23.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 0;
        }else if (a12.getText()=="O" && a22.getText()=="O" && a32.getText()=="O"){
            a12.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a22.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a32.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 0;
        }else if (a31.getText()=="O" && a32.getText()=="O" && a33.getText()=="O"){
            a31.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a32.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a33.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 0;
        }else if (a11.getText()=="O" && a22.getText()=="O" && a33.getText()=="O"){
            a11.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a22.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a33.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 0;
        }else if (a13.getText()=="O" && a22.getText()=="O" && a31.getText()=="O"){
            a13.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a22.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a31.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 0;
        }else return -1;

    }

    public int checaVitoriaX(){
        if (a11.getText()=="X" && a12.getText()=="X" && a13.getText()=="X"){
            a11.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a12.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a13.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 1;
        }else if (a11.getText()=="X" && a21.getText()=="X" && a31.getText()=="X"){
            a11.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a21.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a31.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 1;
        }else if (a13.getText()=="X" && a23.getText()=="X" && a33.getText()=="X"){
            a13.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a23.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a33.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 1;
        }else if (a21.getText()=="X" && a22.getText()=="X" && a23.getText()=="X"){
            a21.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a22.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a23.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 1;
        }else if (a12.getText()=="X" && a22.getText()=="X" && a32.getText()=="X"){
            a12.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a22.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a32.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 1;
        }else if (a31.getText()=="X" && a32.getText()=="X" && a33.getText()=="X"){
            a31.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a32.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a33.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 1;
        }else if (a11.getText()=="X" && a22.getText()=="X" && a33.getText()=="X"){
            a11.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a22.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a33.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 1;
        }else if (a13.getText()=="X" && a22.getText()=="X" && a31.getText()=="X"){
            a13.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a22.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            a31.setBackgroundColor(getApplication().getResources().getColor(R.color.red));
            return 1;
        }else return -1;

    }

    public void fim(){
        a11.setEnabled(false);
        a12.setEnabled(false);
        a13.setEnabled(false);
        a21.setEnabled(false);
        a22.setEnabled(false);
        a23.setEnabled(false);
        a31.setEnabled(false);
        a32.setEnabled(false);
        a33.setEnabled(false);
    }

    public void comeco(){
        a11.setEnabled(true);
        a12.setEnabled(true);
        a13.setEnabled(true);
        a21.setEnabled(true);
        a22.setEnabled(true);
        a23.setEnabled(true);
        a31.setEnabled(true);
        a32.setEnabled(true);
        a33.setEnabled(true);
    }

    public void usuarioJogouEm(final Button btn){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simbolo = "X";
                btn.setTextColor(getApplication().getResources().getColor(R.color.verde));
                btn.setText(simbolo);
                btn.setEnabled(false);
                Jogo();
                if (checaVitoriaO()==0){
                    txtResultado.setText(R.string.bolinhaganhou);
                    fim();
                }else if (checaVitoriaX()==1){
                    txtResultado.setText(R.string.xganhou);
                    fim();
                }else if (todasAsJogadas()==1){

                }

            }
        });
    }

    public boolean usuarioJoga(Button pos){
        if (pos.getText()=="X"){
            return true;
        }else{
            return false;
        }
    }

    public void botJoga(Button pos){
        pos.setText("O");
        pos.setTextColor(getApplication().getResources().getColor(R.color.colorPrimary));
        pos.setEnabled(false);
    }

    public void Jogo(){
        if(checaVitoriaO()==0){
            fim();
        }
        if (checaVitoriaX()==1){
            fim();
        }
        botJoga(a11);
        if (contBot == 0){
            if (usuarioJoga(a12)){
                botJoga(a22);
                contBot++;
                jogada = 1;
            }else if (usuarioJoga(a13)){
                botJoga(a31);
                contBot++;
                jogada = 2;
            }else if (usuarioJoga(a21)){
                botJoga(a22);
                contBot++;
                jogada = 3;
            }
            else if (usuarioJoga(a22)){
                botJoga(a33);
                contBot++;
                jogada = 4;
            }
            else if (usuarioJoga(a23)){
                botJoga(a13);
                contBot++;
                jogada = 5;
            }
            else if (usuarioJoga(a31)){
                botJoga(a13);
                contBot++;
                jogada = 6;
            }
            else if (usuarioJoga(a32)){
                botJoga(a13);
                contBot++;
                jogada = 7;
            }
            else if (usuarioJoga(a33)){
                botJoga(a13);
                contBot++;
                jogada = 8;
            }
        }else if (contBot == 1){
            if (jogada==1) {
                if (!usuarioJoga(a33)) {
                    botJoga(a33);
                    contBot++;
                } else if (usuarioJoga(a33)) {
                    botJoga(a31);
                    contBot++;
                }
            }else if (jogada == 2){
                if(!usuarioJoga(a21)) {
                    botJoga(a21);
                    contBot++;
                    }else if (usuarioJoga(a21)){
                    botJoga(a33);
                    contBot++;
                }
            }
            else if (jogada == 3){
                if(!usuarioJoga(a33)) {
                    botJoga(a33);
                    contBot++;
                }else if (usuarioJoga(a33)){
                    botJoga(a13);
                    contBot++;
                }
            }
            else if (jogada == 4){
                if(usuarioJoga(a13)) {
                    botJoga(a31);
                    contBot++;
                }else if (usuarioJoga(a31)){
                    botJoga(a13);
                    contBot++;
                }else if (usuarioJoga(a21)){
                    botJoga(a23);
                    contBot++;
                }else if (usuarioJoga(a23)){
                    botJoga(a21);
                    contBot++;
                }else if (usuarioJoga(a12)){
                    botJoga(a32);
                    contBot++;
                }else if (usuarioJoga(a32)){
                    botJoga(a12);
                    contBot++;
                }
            }
            else if (jogada == 5){
                if(!usuarioJoga(a12)) {
                    botJoga(a12);
                    contBot++;
                }else if (usuarioJoga(a12)){
                    botJoga(a31);
                    contBot++;
                }
            }
            else if (jogada == 6){
                if(!usuarioJoga(a12)) {
                    botJoga(a12);
                    contBot++;
                }else if (usuarioJoga(a12)){
                    botJoga(a33);
                    contBot++;
                }
            }
            else if (jogada == 7){
                if(!usuarioJoga(a12)) {
                    botJoga(a12);
                    contBot++;
                }else if (usuarioJoga(a12)){
                    botJoga(a31);
                    contBot++;
                }
            }
            else if (jogada == 8){
                if(!usuarioJoga(a12)) {
                    botJoga(a12);
                    contBot++;
                }else if (usuarioJoga(a12)){
                    botJoga(a31);
                    contBot++;
                }
            }

        }else if (contBot == 2){
            if (jogada == 1){
                if (!usuarioJoga(a21)){
                    botJoga(a21);
                    contBot++;
                }
                else if (!usuarioJoga(a13)){
                    botJoga(a13);
                    contBot++;
                }
            }else if (jogada == 2){
                if (!usuarioJoga(a32)){
                    botJoga(a32);

                }else if (!usuarioJoga(a22)){
                    botJoga(a22);
                    contBot++;
                }
            }
            else if (jogada == 3){
                if (!usuarioJoga(a31)){
                    botJoga(a31);

                }else if (!usuarioJoga(a12)){
                    botJoga(a12);
                    contBot++;
                }
            }
            else if (jogada == 4){
                if(!usuarioJoga(a31)) {
                    botJoga(a31);
                    contBot++;
                }else if (!usuarioJoga(a32)){
                    botJoga(a32);
                    contBot++;
                }else if (!usuarioJoga(a21)){
                    botJoga(a21);
                    contBot++;
                }else if (!usuarioJoga(a13)){
                    botJoga(a13);
                    contBot++;
                }else if (!usuarioJoga(a31)){
                    botJoga(a31);
                    contBot++;
                }else if (!usuarioJoga(a12)){
                    botJoga(a12);
                    contBot++;
                }else if (!usuarioJoga(a23)){
                    botJoga(a23);
                    contBot++;
                }
            }
            else if (jogada == 5){
                if (!usuarioJoga(a21)){
                    botJoga(a21);

                }else if (!usuarioJoga(a22)){
                    botJoga(a22);
                    contBot++;
                }
            }
            else if (jogada == 6){
                if (!usuarioJoga(a22)){
                    botJoga(a22);

                }else if (!usuarioJoga(a23)){
                    botJoga(a23);
                    contBot++;
                }
            }
            else if (jogada == 7){
                if (!usuarioJoga(a22)){
                    botJoga(a22);

                }else if (!usuarioJoga(a21)){
                    botJoga(a21);
                    contBot++;
                }
            }
            else if (jogada == 8){
                if (!usuarioJoga(a22)){
                    botJoga(a22);

                }else if (!usuarioJoga(a21)){
                    botJoga(a21);
                    contBot++;
                }
            }
        }

    }
        /*Verifica se todos os campos ja estao jogados*/
    public int todasAsJogadas(){
        if ((a11.getText()=="O"||a11.getText()=="X")&&(a12.getText()=="O"||a12.getText()=="X")&&(a13.getText()=="O"||a13.getText()=="X")&&(a21.getText()=="O"||a21.getText()=="X")&&(a22.getText()=="O"||a22.getText()=="X")&&(a23.getText()=="O"||a23.getText()=="X")&&(a31.getText()=="O"||a31.getText()=="X")&&(a32.getText()=="O"||a32.getText()=="X")&&(a33.getText()=="O"||a33.getText()=="O")){
            return 0;
        }
        return 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);

        /*Recuperando os valores dos botoes*/

        a11 = (Button) findViewById(R.id.a11);
        a12 = (Button) findViewById(R.id.a12);
        a13 = (Button) findViewById(R.id.a13);
        a21 = (Button) findViewById(R.id.a21);
        a22 = (Button) findViewById(R.id.a22);
        a23 = (Button) findViewById(R.id.a23);
        a31 = (Button) findViewById(R.id.a31);
        a32 = (Button) findViewById(R.id.a32);
        a33 = (Button) findViewById(R.id.a33);

        /*Setando layout dos botoes*/
        a11.setBackgroundResource(android.R.drawable.btn_default);
        a12.setBackgroundResource(android.R.drawable.btn_default);
        a13.setBackgroundResource(android.R.drawable.btn_default);
        a21.setBackgroundResource(android.R.drawable.btn_default);
        a22.setBackgroundResource(android.R.drawable.btn_default);
        a23.setBackgroundResource(android.R.drawable.btn_default);
        a31.setBackgroundResource(android.R.drawable.btn_default);
        a32.setBackgroundResource(android.R.drawable.btn_default);
        a33.setBackgroundResource(android.R.drawable.btn_default);

        btnRestar = (Button) findViewById(R.id.bntrestart);
        txtVez = (TextView) findViewById(R.id.txtVez);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        Jogo();
        usuarioJogouEm(a11);
        usuarioJogouEm(a12);
        usuarioJogouEm(a13);
        usuarioJogouEm(a21);
        usuarioJogouEm(a22);
        usuarioJogouEm(a23);
        usuarioJogouEm(a31);
        usuarioJogouEm(a32);
        usuarioJogouEm(a33);

        /*Zerando a partida*/

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comeco();botJoga(a11);
                contBot=0;jogada=0;
                a12.setText("");
                a13.setText("");
                a21.setText("");
                a22.setText("");
                a23.setText("");
                a31.setText("");
                a32.setText("");
                a33.setText("");
                a11.setBackgroundResource(android.R.drawable.btn_default);
                a12.setBackgroundResource(android.R.drawable.btn_default);
                a13.setBackgroundResource(android.R.drawable.btn_default);
                a21.setBackgroundResource(android.R.drawable.btn_default);
                a22.setBackgroundResource(android.R.drawable.btn_default);
                a23.setBackgroundResource(android.R.drawable.btn_default);
                a31.setBackgroundResource(android.R.drawable.btn_default);
                a32.setBackgroundResource(android.R.drawable.btn_default);
                a33.setBackgroundResource(android.R.drawable.btn_default);
                txtResultado.setText("");
            }
        });

    }

}
