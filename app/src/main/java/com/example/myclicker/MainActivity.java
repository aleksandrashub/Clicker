package com.example.myclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mainTxt;
    private ImageButton mainBtn;
    private ImageButton secBtn;
    private  ImageButton thirdBtn;

    public String str;
    private ImageView imgScore;
    private Button uvelBtn;
    private Button umenBtn;
    private  Button obnulBtn;






    private long score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgScore=(ImageView)findViewById(R.id.imgScore);

        mainTxt=(TextView)findViewById(R.id.mainTxt);

        mainBtn=(ImageButton) findViewById(R.id.mainBtn);
        secBtn=(ImageButton) findViewById(R.id.secBtn);
        thirdBtn=(ImageButton) findViewById(R.id.sbrosBtn);

        //привязываем обработчики событий по нажатию кнопок
        mainBtn.setOnClickListener(clickListenerFirst);
        secBtn.setOnClickListener(clickListenerSecond);
        thirdBtn.setOnClickListener(clickListenerThird);


        uvelBtn=(Button) findViewById(R.id.uvelBtn);
        umenBtn=(Button) findViewById(R.id.umenBtn);
        obnulBtn =(Button) findViewById(R.id.obnulBtn);
        Boom(score);

    }


    //включение картинок в зависимости от количества кликов
    public void Boom(long score)
    {
        if ((score>=10 && score <15 ) || (score <= -10 && score >-15))
        {
            imgScore.setImageResource(R.drawable.tensova);
            imgScore.setVisibility(View.VISIBLE);

        }
        else if ((score >= 0 && score < 10) || (score <=0 && score >-10))
        {
            imgScore.setImageResource(R.drawable.sovazero);
            imgScore.setVisibility(View.VISIBLE);

        }
        else
        {
            imgScore.setImageResource(R.drawable.sovafifteen);
            imgScore.setVisibility(View.VISIBLE);
        }


    }

    // нажатие на кнопку увеличения
    View.OnClickListener clickListenerFirst = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            score++;
            if ((score>1 && score<5) || (score<-1 && score >-5))
            {
                 str = "Кнопка нажата: " + score + " раза";
                mainTxt.setText(str);
            }
            else
            {
                 str = "Кнопка нажата: " + score + " раз";
                mainTxt.setText(str);
            }
        Boom(score);
        }
    };


    // нажатие на кнопку уменьшения
    View.OnClickListener clickListenerSecond = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            score--;
            if ((score>1 && score<5) || (score<-1 && score >-5)) {
                 str = "Кнопка нажата: " + score + " раза";
                mainTxt.setText(str);
            }
            else
            {
                 str = "Кнопка нажата: " + score + " раз";
                mainTxt.setText(str);
            }
    Boom(score);
        }
    };
    View.OnClickListener clickListenerThird = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            score=0;
            str = "Кнопка нажата: " + score + " раз";
            mainTxt.setText(str);
            Boom(score);
        }
    };




    View.OnClickListener clickListenerUvel = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {

            score++;
            if ((score>1 && score<5) || (score<-1 && score >-5))
            {
                 str = "Кнопка нажата: " + score + " раза";
                mainTxt.setText(str);
            }
            else
            {
                 str = "Кнопка нажата: " + score + " раз";
                mainTxt.setText(str);
            }
            Boom(score);
        }
    };
    View.OnClickListener clickListenerUmen = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            score--;
            if ((score>1 && score<5) || (score<-1 && score >-5)) {
                 str = "Кнопка нажата: " + score + " раза";
                mainTxt.setText(str);
            }
            else
            {
                 str = "Кнопка нажата: " + score + " раз";
                mainTxt.setText(str);
            }
            Boom(score);
        }
    };
    View.OnClickListener clickListenerObnul = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            score=0;
            String str = "Кнопка нажата: " + score + " раз";
            mainTxt.setText(str);
            Boom(score);
        }
    };



}