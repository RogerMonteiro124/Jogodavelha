package roger.monteiro.jogodavelha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMultiplayer, btnBot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /*Recuperando os valores dos botoes*/

        btnMultiplayer = (Button) findViewById(R.id.btnSozinho);
        btnBot = (Button) findViewById(R.id.btnBot);

        btnMultiplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),SoloActivity.class);
                startActivity(intent);
            }
        });

        btnBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),BotActivity.class);
                startActivity(intent);
            }
        });
    }
}
