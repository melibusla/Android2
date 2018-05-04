package com.example.alumno.androidclase2;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnSend).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_SEND );
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, "mail@mail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Este es un mail de prueba");//asunto del mail
                intent.putExtra(Intent.EXTRA_TEXT, "Mensaje texto");//cuerpo del mensaje
                Intent mailer = Intent.createChooser(intent, "Enivar mail usando");
                startActivity(intent);
            }
        });
    }
}
