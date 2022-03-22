package com.example.alert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.custom);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    public void openAlertDialog(View view) {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("Ngopi?")
                .setMessage("Apa kamu butuh kopi?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Kamu memilih Yes", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
    public void openAlertDialog2(View view) {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("Kopi")
                .setMessage("Apa anda butuh kopi?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Kamu memilih Ya", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Kamu memilih Tidak", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    public void Toast(View view) {
        Toast toast = Toast.makeText(this, "Ini adalah pesan Toast", Toast.LENGTH_LONG);

        toast.show();
    }


    @Override
    public void onClick(View view) {
        Custom.Builder
                .with(this)
                .setTitle("Hallo Gaes")
                .setMessage("Kalian suka susu atau kopi ?")
                .setNegativeBtnText("Susu")
                .setPositiveBtnText("Kopi")
                .setAnimation(Animation.POP)
                .isCancellable(true)
                .setIcon(R.drawable.ic_star_border_black_24dp, View.VISIBLE)
                .onPositiveClicked(dialog -> Toast.makeText(MainActivity.this, "Rate", Toast.LENGTH_SHORT).show())
                .onNegativeClicked(dialog -> Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show())
                .build()
                .show();
    }
}