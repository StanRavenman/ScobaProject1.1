package com.example.scobaproject_experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.scobaproject_experiment2.R;

public class MainActivity extends AppCompatActivity {

    EditText s1;
    TextView s2;
    //EditText s3;
    //int answerColor;

   // private static final String KEY_COLOR_T = "COLOR";
   // private static final String KEY_COLOR_S = "COLOR";////////TEXT FLIPPING
//    private static final String KEY_COUNT = "COUNT";  ////////TEXT FLIPPING
//    private static final String KEY_COLORZ = "COLORZ";  ////////TEXT FLIPPING

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = findViewById(R.id.editText_input);
        s2 = findViewById(R.id.textView_result);//s3 = findViewById(R.id.answer);

    }

    public void convert(View view) {

        String s = s1.getText().toString();
        if (s.equals("")) s2.setText("");
        else {

            if (s.charAt(0)=='['||s.charAt(0)==']'){
                String sum = "";
                String[] textString = com.example.scobaproject_experiment2.ScobaConverter.scobaToLetter(s);
                for (int i = 0; i < textString.length; i++) {
                    sum = sum + textString[i];

                }
                s2.setText(sum);
                //s2.requestFocus();

             } else {
                String sum = "";
                String[] scobaString = com.example.scobaproject_experiment2.ScobaConverter.letterToScoba(s);
                for (int i = 0; i < scobaString.length; i++) {

                    sum = sum + scobaString[i];

                }
                s2.setText(sum);
                //s2.requestFocus();
             }

        }




    }


    public void clear(View view) {
        s1.setText("");
    }
}





 /*  public void textToScoba(View view) {
        String s = s1.getText().toString();
        String sum = "";

//        if (s.equals("")) {
//            answerColor=getResources().getColor(R.color.orange);
//            s2.setTextColor(answerColor);
//            s2.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC), Typeface.ITALIC);
//            //s3.setTypeface(Typeface.DEFAULT_BOLD);
//            s2.setText("Please, input text!");
//
//
//        } else {
            String[] scobaString = ScobaConverter.letterToScoba(s);
            for (int i = 0; i < scobaString.length; i++) {

                //////////////////ПРОВЕРКА НА НУЛЛ??????
//                if (ScobaConverter.btext == false) {
//                    s3.setTextColor(getResources().getColor(R.color.orange));
//                    s3.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC), Typeface.ITALIC);
//                    //s3.setTypeface(Typeface.DEFAULT_BOLD);
//                    s3.setText("Incorrect symbol in text!");
//                    break;
//                }


                sum = sum + scobaString[i];
            }


            s2.setTypeface(Typeface.DEFAULT);
            answerColor=getResources().getColor(R.color.yellow);
            s2.setTextColor(answerColor);
            s2.setText(sum);


      //  }


    }

    public void scobaToText(View view) {
        String s = s2.getText().toString();

        String sum = "";

//        if (s.equals("")) {
//            answerColor=getResources().getColor(R.color.orange);
//            s1.setTextColor(answerColor);
//            s1.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC), Typeface.ITALIC);
//
//            s1.setText("Please, input scobi!");
//        } else {
            String[] textString = ScobaConverter.scobaToLetter(s);
            for (int i = 0; i < textString.length; i++) {

                //////////////////ПРОВЕРКА НА НУЛЛ??????
//                if (ScobaConverter.bscoba == false) {
//                    s3.setTextColor(getResources().getColor(R.color.orange));
//                    s3.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC), Typeface.ITALIC);
//                    //s3.setTypeface(Typeface.DEFAULT_BOLD);
//                    s3.setText("Incorrect symbol in scobi!");
//                    break;
//                }

                sum = sum + textString[i];

            }

            s1.setTypeface(Typeface.DEFAULT);
            answerColor=getResources().getColor(R.color.green);
            s1.setTextColor(answerColor);
            s1.setText(sum);

        //}
    }*/

