package com.vcc.votaton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.TextView;

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

		switch (elementoSelec) {
			case 1:
				subtitle = (String) getString(R.string.MPobrezaN);
				break;
			case 2:
				subtitle = (String) getString(R.string.MPobrezaE);
				break;
			case 3:
				subtitle = (String) getString(R.string.MPobrezaM);				
				break;
			case 4:
				subtitle = (String) getString(R.string.MIndiceG);
				break;
			case 5:
				subtitle = (String) getString(R.string.MAnalfabetismo);
				break;
			case 6:
				subtitle = (String) getString(R.string.MRezagoE);
				break;
			case 7:
				subtitle = (String) getString(R.string.MTrabajoInfantil);
				break;
			case 8:
				subtitle = (String) getString(R.string.MTrabajoInformal);
				break;
			case 9:
				subtitle = (String) getString(R.string.MDesempleoAltaD);
				break;
			case 10:
				subtitle = (String) getString(R.string.MHogarInadecuadoME);
				break;
			case 11:
				subtitle = (String) getString(R.string.MHogarSinAS);
				break;
			case 12:
				subtitle = (String) getString(R.string.MHogarSinAFAM);
				break;
		}
		text1.setText(subtitle);
		
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
