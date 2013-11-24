package com.example.hangman_new;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Keerthana on 11/15/13.
 */
public class StartGame extends Activity {

    private static final String TAG = "Hangman";


    TextView MysteryWord;
    //The view of the hint that is being shown
    TextView Hint;
    //The view ofo the string of letters guessed incorrecty
     TextView WrongLetters;
    //The view of the displayed hangman image
    ImageView Hangmanimg;
    Button Home;
   // Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;





    private int curMan=0;
    private ArrayList<Boolean> curAnswer;
    private String key;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set the content view for the game layout
        setContentView(R.layout.commomscreen);


        MysteryWord = (TextView)findViewById(R.id.txtUnderScore);
        Hint = (TextView)findViewById(R.id.txthint);
        Home = (Button)findViewById(R.id.btnHome);
        Button a = (Button)findViewById(R.id.btnA);
        Button b = (Button)findViewById(R.id.btnB);
        Button c = (Button)findViewById(R.id.btnC);
        Button d = (Button)findViewById(R.id.btnD);
        Button e = (Button)findViewById(R.id.btnE);
        Button f = (Button)findViewById(R.id.btnF);
        Button g = (Button)findViewById(R.id.btnG);
        Button h = (Button)findViewById(R.id.btnH);
        Button i = (Button)findViewById(R.id.btnI);
        Button j = (Button)findViewById(R.id.btnJ);
        Button k = (Button)findViewById(R.id.btnK);
        Button l = (Button)findViewById(R.id.btnL);
        Button m = (Button)findViewById(R.id.btnM);
        Button n = (Button)findViewById(R.id.btnN);
        Button o = (Button)findViewById(R.id.btnO);
        Button p = (Button)findViewById(R.id.btnP);
        Button q = (Button)findViewById(R.id.btnQ);
        Button r = (Button)findViewById(R.id.btnR);
        Button s = (Button)findViewById(R.id.btnS);
        Button t = (Button)findViewById(R.id.btnT);
        Button u = (Button)findViewById(R.id.btnU);
        Button v = (Button)findViewById(R.id.btnV);
        Button w = (Button)findViewById(R.id.btnW);
        Button x = (Button)findViewById(R.id.btnX);
        Button y = (Button)findViewById(R.id.btnY);
        Button z = (Button)findViewById(R.id.btnZ);

        Bundle extras = getIntent().getExtras();

        if(extras!=null){



            String Hintword = extras.getString("hint");
            String strMysteryWord = extras.getString("WordString");
           // String Underscoreword = extras.getString("Storeword");

            //replace the word with an underscore
            String Underscoreword = strMysteryWord.replaceAll("[A-Za-z]", "_ ");
            MysteryWord.setText(Underscoreword);
            Hint.setText(Hintword);


        }



        //Click on home button to move back to the home screen
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentHome = new Intent(StartGame.this,MainActivity.class);
                startActivity(intentHome);
            }
        });


    }

   /* @Override
    public boolean onKeyDown(int keyCode,KeyEvent event){
        switch (keyCode){
            case KeyEvent.KEYCODE_A :
                validateGuess('A');
                break;
            case KeyEvent.KEYCODE_B:
                validateGuess('B');
                break;
            case KeyEvent.KEYCODE_C:
                validateGuess('C');
                break;
            case KeyEvent.KEYCODE_D:
                validateGuess('D');
                break;
            case KeyEvent.KEYCODE_E:
                validateGuess('E');
                break;
            case KeyEvent.KEYCODE_F:
                validateGuess('F');
                break;
            case KeyEvent.KEYCODE_G:
                validateGuess('G');
                break;
            case KeyEvent.KEYCODE_H:
                validateGuess('H');
                break;
            case KeyEvent.KEYCODE_I:
                validateGuess('I');
                break;
            case KeyEvent.KEYCODE_J:
                validateGuess('J');
                break;
            case KeyEvent.KEYCODE_K:
                validateGuess('K');
                break;
            case KeyEvent.KEYCODE_L:
                validateGuess('L');
                break;
            case KeyEvent.KEYCODE_M:
                validateGuess('M');
                break;
            case KeyEvent.KEYCODE_N:
                validateGuess('N');
                break;
            case KeyEvent.KEYCODE_O:
                validateGuess('O');
                break;
            case KeyEvent.KEYCODE_P:
                validateGuess('P');
                break;
            case KeyEvent.KEYCODE_Q:
                validateGuess('Q');
                break;
            case KeyEvent.KEYCODE_R:
                validateGuess('R');
                break;
            case KeyEvent.KEYCODE_S:
                validateGuess('S');
                break;
            case KeyEvent.KEYCODE_T:
                validateGuess('T');
                break;
            case KeyEvent.KEYCODE_U:
                validateGuess('U');
                break;
            case KeyEvent.KEYCODE_V:
                validateGuess('V');
                break;
            case KeyEvent.KEYCODE_W:
                validateGuess('W');
                break;
            case KeyEvent.KEYCODE_X:
                validateGuess('X');
                break;
            case KeyEvent.KEYCODE_Y:
                validateGuess('Y');
                break;
            case KeyEvent.KEYCODE_Z:
                validateGuess('Z');
                break;
            default:
                return  super.onKeyDown(keyCode,event);
        }
        return true;
    }*/


}
