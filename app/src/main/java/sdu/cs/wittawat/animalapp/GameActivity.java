package sdu.cs.wittawat.animalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    ImageView questionIMG;
    ImageButton volumeButton;
    MediaPlayer mediaPlayer;
    int questionCount = 10;
    ArrayList<Integer> qid = new ArrayList<Integer>();
    String answer;
    int score = 0;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionIMG = findViewById(R.id.questionImage);
        volumeButton = findViewById(R.id.volButton);

        for (int i = 1; i <= questionCount; i++) {
            qid.add(i);
        }
        Collections.shuffle(qid);
        setQuestion(qid.remove(0));
    } // onCreate

    private void setQuestion(int qid) {
        if (qid == 1){
            answer = "นก";
            questionIMG.setImageResource(R.drawable.bird); //แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.bird); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<>(); //Array สำหรับ random choice
            choice.add("นก");
            choice.add("วัว");
            choice.add("หมา");
            choice.add("ยุง");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        } //end if

        if (qid == 2) {
            answer = "แมว";
            questionIMG.setImageResource(R.drawable.cat);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.cat); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<>(); //Array สำหรับ random choice
            choice.add("แมว");
            choice.add("ยุง");
            choice.add("สิงโต");
            choice.add("หมา");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 3) {
            answer = "วัว";
            questionIMG.setImageResource(R.drawable.cow);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.cow); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<>(); //Array สำหรับ random choice
            choice.add("วัว");
            choice.add("แกะ");
            choice.add("ช้าง");
            choice.add("หมู");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 4) {
            answer = "หมา";
            questionIMG.setImageResource(R.drawable.dog);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.dog); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<>(); //Array สำหรับ random choice
            choice.add("หมา");
            choice.add("แมว");
            choice.add("แกะ");
            choice.add("ม้า");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 5) {
            answer = "ช้าง";
            questionIMG.setImageResource(R.drawable.elephant);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<>(); //Array สำหรับ random choice
            choice.add("ช้าง");
            choice.add("ม้า");
            choice.add("วัว");
            choice.add("สิงโต");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 6) {
            answer = "ม้า";
            questionIMG.setImageResource(R.drawable.horse);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.horse); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("ม้า");
            choice.add("นก");
            choice.add("หมา");
            choice.add("แกะ");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 7) {
            answer = "สิงโต";
            questionIMG.setImageResource(R.drawable.lion);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.lion); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("สิงโต");
            choice.add("หมู");
            choice.add("นก");
            choice.add("แมว");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 8) {
            answer = "ยุง";
            questionIMG.setImageResource(R.drawable.mosquito);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("ยุง");
            choice.add("ม้า");
            choice.add("แมว");
            choice.add("ช้าง");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 9) {
            answer = "หมู";
            questionIMG.setImageResource(R.drawable.pig);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.pig); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("หมู");
            choice.add("สิงโต");
            choice.add("ยุง");
            choice.add("นก");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 10) {
            answer = "แกะ";
            questionIMG.setImageResource(R.drawable.sheep);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("แกะ");
            choice.add("หมา");
            choice.add("หมู");
            choice.add("วัว");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if
    } //setQuestion

    public void playSound(View view) { //method แสดงเสียง
        mediaPlayer.start();
    }//end playSound

    public void choiceAns(View view) {
        Button button = (Button) view;
        String buttonString = button.getText().toString();

        if (buttonString.equals(answer)){
            score++;
        }//if
        if (qid.isEmpty()){
            nameString = getIntent().getStringExtra("name");
            dialogboxScore(nameString);
        }else {
            setQuestion(qid.remove(0));
        }
    }// choiceAns

    private void dialogboxScore(String nameString) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณ  " + nameString + " ได้ " + score + "คะแนน ")
                .setCancelable(false);
                builder.setPositiveButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                })
                .setNegativeButton("กลับหน้าหลัก", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }// dialogboxScore
} // class
