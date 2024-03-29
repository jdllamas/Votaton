package com.vcc.votaton;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * An activity representing a single Item detail screen. This activity is only
 * used on handset devices. On tablet-size devices, item details are presented
 * side-by-side with a list of items in a {@link EstadisticasListActivity}.
 * <p>
 * This activity is mostly just a 'shell' activity containing nothing more than
 * a {@link EstadisticasDetailFragment}.
 */
public class EstadisticasDetailActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_estadisticas_detail);

		// Show the Up button in the action bar.
		getActionBar().setDisplayHomeAsUpEnabled(true);

		// savedInstanceState is non-null when there is fragment state
		// saved from previous configurations of this activity
		// (e.g. when rotating the screen from portrait to landscape).
		// In this case, the fragment will automatically be re-added
		// to its container so we don't need to manually add it.
		// For more information, see the Fragments API guide at:
		//
		// http://developer.android.com/guide/components/fragments.html
		//
		if (savedInstanceState == null) {
			// Create the detail fragment and add it to the activity
			// using a fragment transaction.
			Bundle arguments = new Bundle();
			arguments.putString(EstadisticasDetailFragment.ARG_ITEM_ID, getIntent()
					.getStringExtra(EstadisticasDetailFragment.ARG_ITEM_ID));
			EstadisticasDetailFragment fragment = new EstadisticasDetailFragment();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction()
					.add(R.id.estadisticas_detail_container, fragment).commit();
		}
		
		TextView text1 =(TextView) findViewById(R.id.text_estadistica);		
		Intent intent = getIntent();
		String selectedID = intent.getStringExtra(EstadisticasDetailFragment.ARG_ITEM_ID);
		int elementoSelec = Integer.parseInt(selectedID);
		String subtitle="";
		int uri=0;
		ImageView imageview= (ImageView)findViewById(R.id.img_estadistica);		
		switch (elementoSelec) {
			case 1:
				subtitle = (String) getString(R.string.MPobrezaN);
				uri=R.drawable.epobrezan;
				break;
			case 2:
				subtitle = (String) getString(R.string.MPobrezaE);
				uri = R.drawable.epobrezae;
				break;
			case 3:
				subtitle = (String) getString(R.string.MPobrezaM);
				uri = R.drawable.epobrezam;
				break;
			case 4:
				subtitle = (String) getString(R.string.MIndiceG);
				uri = R.drawable.eindiceg;
				break;
			case 5:
				subtitle = (String) getString(R.string.MAnalfabetismo);
				uri = R.drawable.eanalfabetismo;
				break;
			case 6:
				subtitle = (String) getString(R.string.MRezagoE);
				uri = R.drawable.erezagoe;
				break;
			case 7:
				subtitle = (String) getString(R.string.MTrabajoInfantil);
				uri = R.drawable.etrabajoinfantil;
				break;
			case 8:
				subtitle = (String) getString(R.string.MTrabajoInformal);
				uri = R.drawable.etrabajoinformal;
				break;
			case 9:
				subtitle = (String) getString(R.string.MDesempleoAltaD);
				uri = R.drawable.edesempleoaltad;
				break;
			case 10:
				subtitle = (String) getString(R.string.MHogarInadecuadoME);
				uri = R.drawable.ehogarinadecuadome;
				break;
			case 11:
				subtitle = (String) getString(R.string.MHogarSinAS);
				uri = R.drawable.ehogarsinas;
				break;
			case 12:
				subtitle = (String) getString(R.string.MHogarSinAFAM);
				uri = R.drawable.ehogarsinafam;
				break;
		}
		try{
		text1.setText(subtitle);
		Drawable res = getResources().getDrawable(uri);
		imageview.setBackgroundDrawable(res);
		}catch(Exception ex){
			Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
		}

		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == android.R.id.home) {
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpTo(this,
					new Intent(this, EstadisticasListActivity.class));
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
