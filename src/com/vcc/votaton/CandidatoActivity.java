package com.vcc.votaton;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class CandidatoActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_candidato);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		int candidato = 1;
		try{
		Intent myIntent = getIntent();
		candidato = myIntent.getIntExtra("candidato",1);
		}
		catch(Exception ex){
			Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
		}
		String nombre="";
		TextView texto =(TextView) findViewById(R.id.nombre);
		Button boton = (Button) findViewById(R.id.foto);
		Button segundo = (Button) findViewById(R.id.formula);
		switch(candidato){
			case 1:
				nombre = "Clara Lopez";
				boton.setBackgroundResource(R.drawable.clara);
				segundo.setBackgroundResource(R.drawable.aidajpg);
				break;
			case 2:
				nombre = "Martha Lucía Ramirez";
				boton.setBackgroundResource(R.drawable.martalucia);
				segundo.setBackgroundResource(R.drawable.camilo);
				break;
			case 3:
				nombre = "Enrique Peñaloza";
				boton.setBackgroundResource(R.drawable.penaloza);
				segundo.setBackgroundResource(R.drawable.ospina);
				break;
			case 4:
				nombre = "Juan Manuel Santos";
				boton.setBackgroundResource(R.drawable.santos);
				segundo.setBackgroundResource(R.drawable.vargas);
				break;
			case 5:
				nombre = "Oscar Iván Zuluaga";
				boton.setBackgroundResource(R.drawable.zuluaga);
				segundo.setBackgroundResource(R.drawable.formula_zuluaga);				
				break;
			case 6:
				finishActivity(0);
				break;		
		}
		texto.setText(nombre);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.candidato, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_candidato,
					container, false);
			return rootView;
		}
	}

}
