package com.example.vishaalprasad.pcrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TmCalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tm_calc);
    }

    /*
        public static void main(String[] args) {

	Scanner kb= new Scanner (System.in);
	 String fprimer= kb.next();
	 String rprimer= kb.next();
	 //f primers
	 float fa=0;
	 float fg=0;
	 float fc=0;
	 float ft=0;
	 float ftm=0;
	 //r primers
	 float ra=0;
	 float rg=0;
	 float rc=0;
	 float rt=0;
	 float rtm=0;

	char[] fprimer1=fprimer.toCharArray();
	for(int i=0; i<fprimer1.length; i++){
		switch(fprimer1[i]) {
			case 'a':
			case 'A':
			fa++;
			break;
			case 'c':
			case 'C':
			fc++;
			break;
			case 'g':
			case 'G':
			fg++;
			break;
			case 't':
			case 'T':
			ft++;
			break;

		}
	}
	if(fprimer1.length<14) {
		ftm=((2f*(fa+ft))+(4f*(fg+fc)));
	}
	else {
		ftm=(64.9f+(41f*(fg+fc-16.4f))/(fa+fc+fg+ft));
	}
char[] rprimer1=fprimer.toCharArray();
	for(int i=0; i<rprimer1.length; i++){
		switch(rprimer1[i]) {
			case 'a':
			case 'A':
			ra++;
			break;
			case 'c':
			case 'C':
			rc++;
			break;
			case 'g':
			case 'G':
			rg++;
			break;
			case 't':
			case 'T':
			rt++;
			break;

		}
	}
	if(rprimer1.length<14) {
		rtm=((2f*(fa+ft))+(4f*(fg+fc)));
	}
	else {
		rtm=(64.9f+(41f*(fg+fc-16.4f))/(fa+fc+fg+ft));
	}

	System.out.println(ftm);
	System.out.println(rtm);
     */
}