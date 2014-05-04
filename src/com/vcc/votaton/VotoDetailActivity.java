package com.vcc.votaton;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * An activity representing a single Voto detail screen. This activity is only
 * used on handset devices. On tablet-size devices, item details are presented
 * side-by-side with a list of items in a {@link VotoListActivity}.
 * <p>
 * This activity is mostly just a 'shell' activity containing nothing more than
 * a {@link VotoDetailFragment}.
 */
public class VotoDetailActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_voto_detail);

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
			arguments.putString(VotoDetailFragment.ARG_ITEM_ID, getIntent()
					.getStringExtra(VotoDetailFragment.ARG_ITEM_ID));
			VotoDetailFragment fragment = new VotoDetailFragment();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction()
					.add(R.id.voto_detail_container, fragment).commit();
		}

		TextView texto = (TextView) findViewById(R.id.text_voto);
		Intent intent = getIntent();
		String selectedID = intent
				.getStringExtra(EstadisticasDetailFragment.ARG_ITEM_ID);
		int elementoSelec = Integer.parseInt(selectedID);
		String subtitle = "";
		int uri = 0;
		ImageView imageview = (ImageView) findViewById(R.id.img_voto);
		switch (elementoSelec) {
		case 1:
			subtitle = "Claro que el voto cuenta. En un pa�s con conciencia, como el que queremos forjar, un voto s� marca la diferencia. Votar es un derecho pol�tico y un deber de todo ciudadano que permite  materializar los intereses en las propuestas presidenciales de quienes, por cuatro a�os, direccionar�n el pa�s."
					+ "\n"
					+ "Tanto la elecci�n de un candidato como la opci�n de voto en blanco permite dar a ver que nos encontramos en un pa�s democr�tico que busca con su esfuerzo crecer econ�mica, cultural y socialmente."
					+ "\n"
					+ "Y LOS BENEFICIOS�"
					+ "\n"
					+ "DESCUENTO del 10% en la matr�cula para estudiantes de universidades p�blicas."
					+ "\n"
					+ "Habr� PRELACI�N si la persona obtiene un empate en los resultados de ex�menes de ingreso a las instituciones."
					+ "\n"
					+ "REBAJA de un mes en la prestaci�n del servicio militar."
					+ "\n"
					+ "PREFERENCIA en caso de adjudicar becas educativas y subsidios de vivienda ofrecidos por el Estado cuando haya igualdad de condiciones."
					+ "\n"
					+ "DESCUENTO del 10% al solicitar el pasaporte durante los 4 d�as siguientes a la votaci�n."
					+ "\n"
					+ "DESCUENTO del 10% en el valor de expedici�n inicial y renovaci�n del pasado judicial, en el tr�mite y duplicados de la Libreta Militar y en duplicados de la C�dula."
					+ "\n"
					+ "MEDIO D�A de descanso compensatorio remunerado por el tiempo que se us� votando."
					+ "\n"
					+ "El �NICO REQUISITO es pedir y presentar el Certificado Electoral correspondiente firmado por el presidente de la mesa de votaci�n.";

			uri = R.drawable.like;
			break;
		case 2:
			subtitle = "�NO! El voto no se vende, con los fraudes electorales le hacemos da�o a nuestra sociedad, apoyamos el delito y la corrupci�n y fomentamos las malas gestiones de quienes no tienen inter�s en las personas."
					+ "\n"
					+ "Penalmente se tipifican 11 acciones que impiden el correcto ejercicio de los derechos pol�ticos, entre ellos se encuentra la venta del voto."
					+ "\n"
					+ "COMPRENDAMOS: cuando una persona prometa, pague o entregue dinero o bienes  a una persona habilitada por la ley para votar buscando consignar ese voto a su favor, por un determinado candidato o por el voto en blanco est� comprando el voto y PUEDE SER CASTIGADO POR LA LEY. Igual ocurrir� con la indtimidaci�n, la suplantaci�n y otros delitos electorales."
					+ "\n"
					+ "INTERIORICEMOS: no es solo la sanci�n, es nuestro futuro el que se ve comprometido. No podemos permitir que al poder lleguen personas sin inter�s."
					+ "\n"
					+ "PREGUNT�MONOS: S� llegan al poder comprando el voto, �qu� esperamos de su gesti�n?"
					+ "\n"
					+ "DENUNCIEMOS: por nuestro futuro y el del pa�s."
					+ "\n"
					+ "COMPARTAMOS el da�o que hace el fraude electoral al pa�s.";

			uri = R.drawable.dislike;
			break;
		case 3:
			subtitle = "VERIFIQUEMOS nuestro puesto de votaci�n y REVISEMOS si somos jurados. �En d�nde?... en www.registraduria.gov.co digitando nuestra c�dula en las opciones de la p�gina principal obtendremos esta informaci�n."
					+ "\n"
					+ "ASISTAMOS responsablemente a nuestro puesto de votaci�n con nuestra C�DULA AMARILLA CON HOLOGRAMAS. "
					+ "\n"
					+ "RECIBAMOS el tarjet�n en el cual debe estar diferenciado cada candidato con su f�rmula, el partido pol�tico al que pertenece y la opci�n de voto en blanco. "
					+ "\n"
					+ "MARQUEMOS claramente una sola opci�n y depositemos nuestra elecci�n el lugar seleccionado. "
					+ "\n"
					+ "RECLAMEMOS nuestro certificado electoral para obtener los beneficios de haber votado. "
					+ "\n"
					+ "�D�nde encuentro informaci�n m�s completa acerca de mis opciones para votar?"
					+ "\n"
					+ "En las p�ginas de los candidatos y sus respectivos partidos:"
					+ "\n"
					+ "PARTIDO ALIANZA VERDE: www.partidoverde.org.co y www.penalosapresidente.co"
					+ "\n"
					+ "PARTIDO CONSERVADOR COLOMBIANO: www.partidoconservador.com y www.martaluciapresidenta.com"
					+ "\n"
					+ "CENTRO DEMOCR�TICO: www.centrodemocratico.com y www.oscarivanzuluaga.com "
					+ "\n"
					+ "POLO DEMOCR�TICO y UNI�N PATRI�TICA: www.polodemocratico.net y www.claralopezpresidenta.co "
					+ "\n"
					+ "UNIDAD NACIONAL: www.unidad-nacional.com y www.juanmanuelsantospresidente.com";

			uri = R.drawable.comovoto;
			break;
		}
		try {
			texto.setText(subtitle);
			Drawable res = getResources().getDrawable(uri);
			imageview.setBackgroundDrawable(res);
		} catch (Exception ex) {
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
					new Intent(this, VotoListActivity.class));
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
