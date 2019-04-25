package sdu.cs.wittawat.animalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Explicit
    EditText userEditText, passEditText;
    Button loginButton;
    String userString, passString;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEditText = findViewById(R.id.edtUser);
        passEditText = findViewById(R.id.edtPass);
        loginButton = findViewById(R.id.button);
        imageView = findViewById(R.id.imgView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userString = userEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();

                if ((userString.length() == 0) || (passString.length() ==0)) {
                    Toast.makeText(getApplicationContext(), "กรุณากรอกข้อมูลให้ครบถ้วน", Toast.LENGTH_SHORT).show();
                } else
                    {
                    if ((passString.equals("1234"))) {
                        Toast.makeText(getApplicationContext(), "Hello there " + userString, Toast.LENGTH_SHORT).show();

                        Intent Intent = new Intent(MainActivity.this, GameActivity.class);
                        Intent.putExtra("name", userString);
                        startActivity(Intent);
                    } else
                        {
                        Toast.makeText(getApplicationContext(), "กรอกข้อมูลให้ถูกต้อง", Toast.LENGTH_SHORT).show();
                        } //else 2
                    } //else 1
            } //oncllick
        });
    } //onCreate
} //class