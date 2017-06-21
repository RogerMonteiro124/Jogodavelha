package roger.monteiro.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

    int jogada = 0, cont1 = 0,cont2 = 0,cont3 = 0,cont4 = 0,cont5 = 0,cont6 = 0,cont7 = 0,cont8 = 0,cont9 = 0;
    String simbolo;
    
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
        setContentView(R.layout.activity_main);

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

    /*Iniciando o jogo*/
        //a11.setText("O");
    /*Evento de clique para cada botao*/
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont1 ++;
                if (cont1 == 1) {
                    if ((jogada % 2) == 0) {
                        simbolo = "O";
                        jogada++;
                        a11.setTextColor(getApplication().getResources().getColor(R.color.colorPrimary));
                    } else {
                        simbolo = "X";
                        jogada++;
                        a11.setTextColor(getApplication().getResources().getColor(R.color.verde));
                    }
                    a11.setText(simbolo);
                } else {
                    Toast.makeText(getApplicationContext(), "Não pode Roubar", Toast.LENGTH_SHORT).show();
                }
                cont1++;
                if (checaVitoriaO()==0){
                    txtResultado.setText("Bolinha ganhou :)");
                }else if (checaVitoriaX()==1){
                    txtResultado.setText("X ganhou :)");
                }else if (todasAsJogadas()==1){
                    
                }
            }
        });


        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont2++;
                if (cont2 == 1){
                    if ((jogada % 2) == 0){
                        simbolo = "O";
                        a12.setTextColor(getApplication().getResources().getColor(R.color.colorPrimary));
                    }else{
                        simbolo = "X";
                        a12.setTextColor(getApplication().getResources().getColor(R.color.verde));
                    }
                    a12.setText(simbolo);
                    jogada++;
                }else {
                    Toast.makeText(getApplicationContext(), "Não pode Roubar", Toast.LENGTH_SHORT).show();
                }
                cont2++;
                if (checaVitoriaO()==0){
                    txtResultado.setText("Bolinha ganhou :)");
                }else if (checaVitoriaX()==1){
                    txtResultado.setText("X ganhou :)");
                }else if (todasAsJogadas()==1){
                    
                }
            }
        });


        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont3++;
                if (cont3==1){
                    if ((jogada % 2) == 0){
                        simbolo = "O";
                        a13.setTextColor(getApplication().getResources().getColor(R.color.colorPrimary));
                    }else{
                        simbolo = "X";
                        a13.setTextColor(getApplication().getResources().getColor(R.color.verde));
                    }
                    a13.setText(simbolo);
                    jogada++;
                }else {
                    Toast.makeText(getApplicationContext(), "Não pode Roubar", Toast.LENGTH_SHORT).show();
                }
                cont3++;
                if (checaVitoriaO()==0){
                    txtResultado.setText("Bolinha ganhou :)");
                }else if (checaVitoriaX()==1){
                    txtResultado.setText("X ganhou :)");
                }else if (todasAsJogadas()==1){
                    
                }
            }
        });


        a21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont4++;
                if (cont4==1){
                    if ((jogada % 2) == 0){
                        simbolo = "O";
                        a21.setTextColor(getApplication().getResources().getColor(R.color.colorPrimary));
                    }else{
                        simbolo = "X";
                        a21.setTextColor(getApplication().getResources().getColor(R.color.verde));
                    }
                    a21.setText(simbolo);
                    jogada++;
                }else {
                    Toast.makeText(getApplicationContext(), "Não pode Roubar", Toast.LENGTH_SHORT).show();
                }
                cont4++;
                if (checaVitoriaO()==0){
                    txtResultado.setText("Bolinha ganhou :)");
                }else if (checaVitoriaX()==1){
                    txtResultado.setText("X ganhou :)");
                }else if (todasAsJogadas()==1){
                    
                }
            }
        });


        a22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont5++;
                if (cont5==1){
                    if ((jogada % 2) == 0){
                        simbolo = "O";
                        a22.setTextColor(getApplication().getResources().getColor(R.color.colorPrimary));
                    }else{
                        simbolo = "X";
                        a22.setTextColor(getApplication().getResources().getColor(R.color.verde));
                    }
                    a22.setText(simbolo);
                    jogada++;
                }else {
                    Toast.makeText(getApplicationContext(), "Não pode Roubar", Toast.LENGTH_SHORT).show();
                }
                cont5++;
                if (checaVitoriaO()==0){
                    txtResultado.setText("Bolinha ganhou :)");
                }else if (checaVitoriaX()==1){
                    txtResultado.setText("X ganhou :)");
                }else if (todasAsJogadas()==1){
                    
                }
            }
        });


        a23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont6++;
                if (cont6==1){
                    if ((jogada % 2) == 0){
                        simbolo = "O";
                        a23.setTextColor(getApplication().getResources().getColor(R.color.colorPrimary));
                    }else{
                        simbolo = "X";
                        a23.setTextColor(getApplication().getResources().getColor(R.color.verde));
                    }
                    a23.setText(simbolo);
                    jogada++;
                }else {
                    Toast.makeText(getApplicationContext(), "Não pode Roubar", Toast.LENGTH_SHORT).show();
                }
                cont6++;
                if (checaVitoriaO()==0){
                    txtResultado.setText("Bolinha ganhou :)");
                }else if (checaVitoriaX()==1){
                    txtResultado.setText("X ganhou :)");
                }else if (todasAsJogadas()==1){
                    
                }
            }
        });


        a31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont7++;
                if (cont7==1){
                    if ((jogada % 2) == 0){
                        simbolo = "O";
                        a31.setTextColor(getApplication().getResources().getColor(R.color.colorPrimary));
                    }else{
                        simbolo = "X";
                        a31.setTextColor(getApplication().getResources().getColor(R.color.verde));
                    }
                    a31.setText(simbolo);
                    jogada++;
                }else {
                    Toast.makeText(getApplicationContext(), "Não pode Roubar", Toast.LENGTH_SHORT).show();
                }
                cont7++;
                if (checaVitoriaO()==0){
                    txtResultado.setText("Bolinha ganhou :)");
                }else if (checaVitoriaX()==1){
                    txtResultado.setText("X ganhou :)");
                }else if (todasAsJogadas()==1){
                    
                }
            }
        });


        a32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont8++;
                if(cont8==1){
                    if ((jogada % 2) == 0){
                        simbolo = "O";
                        a32.setTextColor(getApplication().getResources().getColor(R.color.colorPrimary));
                    }else{
                        simbolo = "X";
                        a32.setTextColor(getApplication().getResources().getColor(R.color.verde));
                    }
                    a32.setText(simbolo);
                    jogada++;
                }else {
                    Toast.makeText(getApplicationContext(), "Não pode Roubar", Toast.LENGTH_SHORT).show();
                }
                cont8++;
                if (checaVitoriaO()==0){
                    txtResultado.setText("Bolinha ganhou :)");
                }else if (checaVitoriaX()==1){
                    txtResultado.setText("X ganhou :)");
                }else if (todasAsJogadas()==1){
                    
                }
            }
        });


        a33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont9++;
                if(cont9==1){
                    if ((jogada % 2) == 0){
                        simbolo = "O";
                        a33.setTextColor(getApplication().getResources().getColor(R.color.colorPrimary));
                    }else{
                        simbolo = "X";
                        a33.setTextColor(getApplication().getResources().getColor(R.color.verde));
                    }
                    a33.setText(simbolo);

                    jogada++;
                }else {
                    Toast.makeText(getApplicationContext(), "Não pode Roubar", Toast.LENGTH_SHORT).show();
                }
                cont9++;
                if (checaVitoriaO()==0){
                    txtResultado.setText("Bolinha ganhou :)");
                }else if (checaVitoriaX()==1){
                    txtResultado.setText("X ganhou :)");
                }else if (todasAsJogadas()==1){
                    
                }
            }
        });


        /*Zerando a partida*/

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a11.setText("");cont1 = 0;
                a12.setText("");cont2 = 0;
                a13.setText("");cont3 = 0;
                a21.setText("");cont4 = 0;
                a22.setText("");cont5 = 0;
                a23.setText("");cont6 = 0;
                a31.setText("");cont7 = 0;
                a32.setText("");cont8 = 0;
                a33.setText("");cont9 = 0;
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
