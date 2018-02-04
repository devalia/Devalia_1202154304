package android.devalia.com.DEVALIA_1202154304_MODUL1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Context context = getApplicationContext();

        Toast kasian = Toast.makeText(context, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
        Toast senang = Toast.makeText(context, "Disini aja makan malamnya", Toast.LENGTH_LONG);

        TextView menuView = (TextView) findViewById(R.id.menu);
        TextView totalView = (TextView) findViewById(R.id.total);
        TextView porsiView = (TextView) findViewById(R.id.porsi);
        TextView restoView = (TextView) findViewById(R.id.resto);


        Intent intent = getIntent();
        int pTotal = intent.getIntExtra("total", 0);
        String total = Integer.toString(pTotal);

        int pPorsi = intent.getIntExtra("porsi", 0);
        String porsi = Integer.toString(pPorsi);

        String pMenu = intent.getStringExtra("menu");
        int pUang = intent.getIntExtra("uang", 0);

        String pResto = intent.getStringExtra("resto");

        menuView.setText(pMenu);
        totalView.setText(total);
        porsiView.setText(porsi);


        if (pUang >= pTotal) {
            senang.show();
            restoView.setText(pResto);
        } else {
            kasian.show();
            restoView.setText(pResto);
        }
    }
}
