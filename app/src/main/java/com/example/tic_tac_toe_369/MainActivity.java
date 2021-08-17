package com.example.tic_tac_toe_369;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9;
    String startgame="X";
    int b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int xcount=0,ocount=0,i=0;
    TextView xview,oview;
    Button reset;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1=findViewById(R.id.IV1);
        i2=findViewById(R.id.IV2);
        i3=findViewById(R.id.IV3);
        i4=findViewById(R.id.IV4);
        i5=findViewById(R.id.IV5);
        i6=findViewById(R.id.IV6);
        i7=findViewById(R.id.IV7);
        i8=findViewById(R.id.IV8);
        i9=findViewById(R.id.IV9);
        xview=findViewById(R.id.SX);
        oview=findViewById(R.id.SY);
        reset=findViewById(R.id.B1);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setImageDrawable(null);
                i2.setImageDrawable(null);
                i3.setImageDrawable(null);
                i4.setImageDrawable(null);
                i5.setImageDrawable(null);
                i6.setImageDrawable(null);
                i7.setImageDrawable(null);
                i8.setImageDrawable(null);
                i9.setImageDrawable(null);
                recover();
                xcount=0;
                ocount=0;
                xview.setText("Score X:- "+String.valueOf(xcount));
                oview.setText("Score O:- "+String.valueOf(ocount));
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    i1.setImageResource(R.drawable.xxx);
                    startgame="O";
                    b1=1;
                    i++;

                }
                else{
                    i1.setImageResource(R.drawable.ooo);
                    startgame="X";
                    b1  =0;
                    i++;
                }
                if(i>4){
                    wingame();

                }
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    i2.setImageResource(R.drawable.xxx);
                    startgame="O";
                    b2=1;
                    i++;
                }
                else{
                    i2.setImageResource(R.drawable.ooo);
                    startgame="X";
                    b2=0;
                    i++;
                }
                if(i>4){
                    wingame();

                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    i3.setImageResource(R.drawable.xxx);
                    startgame="O";
                    b3=1;
                    i++;
                }
                else{
                    i3.setImageResource(R.drawable.ooo);
                    startgame="X";
                    b3=0;
                    i++;
                }
                if(i>4){
                    wingame();

                }
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    i4.setImageResource(R.drawable.xxx);
                    startgame="O";
                    b4=1;
                    i++;
                }
                else{
                    i4.setImageResource(R.drawable.ooo);
                    startgame="X";
                    b4=0;
                    i++;
                }
                if(i>4){
                    wingame();

                }
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    i5.setImageResource(R.drawable.xxx);
                    startgame="O";
                    b5=1;
                    i++;
                }
                else{
                    i5.setImageResource(R.drawable.ooo);
                    startgame="X";
                    b5=0;
                    i++;
                }
                if(i>4){
                    wingame();

                }
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    i6.setImageResource(R.drawable.xxx);
                    startgame="O";
                    b6=1;
                    i++;
                }
                else{
                    i6.setImageResource(R.drawable.ooo);
                    startgame="X";
                    b6=0;
                    i++;
                }
                if(i>4){
                    wingame();

                }
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    i7.setImageResource(R.drawable.xxx);
                    startgame="O";
                    b7=1;
                    i++;
                }
                else{
                    i7.setImageResource(R.drawable.ooo);
                    startgame="X";
                    b7=0;
                    i++;
                }
                if(i>4){
                    wingame();

                }
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    i8.setImageResource(R.drawable.xxx);
                    startgame="O";
                    b8=1;
                    i++;
                }
                else{
                    i8.setImageResource(R.drawable.ooo);
                    startgame="X";
                    b8=0;
                    i++;
                }
                if(i>4){
                    wingame();

                }
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("X")){
                    i9.setImageResource(R.drawable.xxx);
                    startgame="O";
                    b9=1;
                    i++;
                }
                else{
                    i9.setImageResource(R.drawable.ooo);
                    startgame="X";
                    b9=0;
                    i++;
                }
                if(i>4){
                    wingame();

                }
            }
        });



    }

    private void wingame() {
        if(b1==1 && b2==1 && b3==1){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            xview.setText("Score X:- "+String.valueOf(xcount));

        }
        else if(b4==1 && b5==1 && b6==1){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            xview.setText("Score X:- "+String.valueOf(xcount));

        }
        else if(b7==1 && b8==1 && b9==1){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            xview.setText("Score X:- "+String.valueOf(xcount));

        }
        else if(b1==1 && b4==1 && b7==1){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            xview.setText("Score X:- "+String.valueOf(xcount));

        }
        else if(b2==1 && b5==1 && b8==1){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            xview.setText("Score X:- "+String.valueOf(xcount));

        }
        else if(b3==1 && b6==1 && b9==1){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            xview.setText("Score X:- "+String.valueOf(xcount));

        }
        else if(b1==1 && b5==1 && b9==1){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            xview.setText("Score X:- "+String.valueOf(xcount));

        }
        else if(b3==1 && b5==1 && b7==1){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            xcount++;
            xview.setText("Score X:- "+String.valueOf(xcount));

        }
        else if(b1==0 && b2==0 && b3==0){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            oview.setText("Score O:- "+String.valueOf(ocount));

        }
        else if(b4==0 && b5==0 && b6==0){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            oview.setText("Score O:- "+String.valueOf(ocount));

        }
        else if(b7==0 && b8==0 && b9==0){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            oview.setText("Score O:- "+String.valueOf(ocount));

        }
        else if(b1==0 && b4==0 && b7==0){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            oview.setText("Score O:- "+String.valueOf(ocount));

        }
        else if(b1==0 && b5==0 && b9==0){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            oview.setText("Score O:- "+String.valueOf(ocount));

        }
        else if(b2==0 && b5==0 && b8==0){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            oview.setText("Score O:- "+String.valueOf(ocount));

        }
        else if(b3==0 && b6==0 && b9==0){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            oview.setText("Score O:- "+String.valueOf(ocount));

        }
        else if(b3==0 && b5==0 && b7==0){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player O Win!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    reco();

                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            ocount++;
            oview.setText("Score O:- "+String.valueOf(ocount));

        }
        else {
            if(i==9){
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setMessage("Draw!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        reco();

                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();

            }
        }



    }

    private void reco() {
        i1.setImageDrawable(null);
        i2.setImageDrawable(null);
        i3.setImageDrawable(null);
        i4.setImageDrawable(null);
        i5.setImageDrawable(null);
        i6.setImageDrawable(null);
        i7.setImageDrawable(null);
        i8.setImageDrawable(null);
        i9.setImageDrawable(null);
        recover();
    }


    private void recover() {
        b1=6;
        b2=6;
        b3=6;
        b4=6;
        b5=6;
        b6=6;
        b7=6;
        b8=6;
        b9=6;
        i=0;

    }
}