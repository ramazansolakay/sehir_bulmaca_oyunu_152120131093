package com.example.kelimeoyunu;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelimeOyunu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//BASLAT
		Button btn_baslat = (Button)findViewById(R.id.button_basla);
		btn_baslat.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent ekraniki = new Intent(KelimeOyunu.this,Oyun.class);

				startActivity(ekraniki);
				
			}
		});
		
		//�IKI�
		Button btn_cikis = (Button)findViewById(R.id.button_cikis);
		btn_cikis.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				System.exit(0);
				
			}
		});
		
	}
}

