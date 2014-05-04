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
			subtitle = "Claro que el voto cuenta. En un país con conciencia, como el que queremos forjar, un voto sí marca la diferencia. Votar es un derecho político y un deber de todo ciudadano que permite  materializar los intereses en las propuestas presidenciales de quienes, por cuatro años, direccionarán el país."
					+ "\n"
					+ "Tanto la elección de un candidato como la opción de voto en blanco permite dar a ver que nos encontramos en un país democrático que busca con su esfuerzo crecer económica, cultural y socialmente."
					+ "\n"
					+ "Y LOS BENEFICIOS…"
					+ "\n"
					+ "DESCUENTO del 10% en la matrícula para estudiantes de universidades públicas."
					+ "\n"
					+ "Habrá PRELACIÓN si la persona obtiene un empate en los resultados de exámenes de ingreso a las instituciones."
					+ "\n"
					+ "REBAJA de un mes en la prestación del servicio militar."
					+ "\n"
					+ "PREFERENCIA en caso de adjudicar becas educativas y subsidios de vivienda ofrecidos por el Estado cuando haya igualdad de condiciones."
					+ "\n"
					+ "DESCUENTO del 10% al solicitar el pasaporte durante los 4 días siguientes a la votación."
					+ "\n"
					+ "DESCUENTO del 10% en el valor de expedición inicial y renovación del pasado judicial, en el trámite y duplicados de la Libreta Militar y en duplicados de la Cédula."
					+ "\n"
					+ "MEDIO DÍA de descanso compensatorio remunerado por el tiempo que se usó votando."
					+ "\n"
					+ "El ÚNICO REQUISITO es pedir y presentar el Certificado Electoral correspondiente firmado por el presidente de la mesa de votación.";

			uri = R.drawable.like;
			break;
		case 2:
			subtitle = "¡NO! El voto no se vende, con los fraudes electorales le hacemos daño a nuestra sociedad, apoyamos el delito y la corrupción y fomentamos las malas gestiones de quienes no tienen interés en las personas."
					+ "\n"
					+ "Penalmente se tipifican 11 acciones que impiden el correcto ejercicio de los derechos políticos, entre ellos se encuentra la venta del voto."
					+ "\n"
					+ "COMPRENDAMOS: cuando una persona prometa, pague o entregue dinero o bienes  a una persona habilitada por la ley para votar buscando consignar ese voto a su favor, por un determinado candidato o por el voto en blanco está comprando el voto y PUEDE SER CASTIGADO POR LA LEY. Igual ocurrirá con la indtimidación, la suplantación y otros delitos electorales."
					+ "\n"
					+ "INTERIORICEMOS: no es solo la sanción, es nuestro futuro el que se ve comprometido. No podemos permitir que al poder lleguen personas sin interés."
					+ "\n"
					+ "PREGUNTÉMONOS: Sí llegan al poder comprando el voto, ¿qué esperamos de su gestión?"
					+ "\n"
					+ "DENUNCIEMOS: por nuestro futuro y el del país."
					+ "\n"
					+ "COMPARTAMOS el daño que hace el fraude electoral al país.";

			uri = R.drawable.dislike;
			break;
		case 3:
			subtitle = "VERIFIQUEMOS nuestro puesto de votación y REVISEMOS si somos jurados. ¿En dónde?... en www.registraduria.gov.co digitando nuestra cédula en las opciones de la página principal obtendremos esta información."
					+ "\n"
					+ "ASISTAMOS responsablemente a nuestro puesto de votación con nuestra CÉDULA AMARILLA CON HOLOGRAMAS. "
					+ "\n"
					+ "RECIBAMOS el tarjetón en el cual debe estar diferenciado cada candidato con su fórmula, el partido político al que pertenece y la opción de voto en blanco. "
					+ "\n"
					+ "MARQUEMOS claramente una sola opción y depositemos nuestra elección el lugar seleccionado. "
					+ "\n"
					+ "RECLAMEMOS nuestro certificado electoral para obtener los beneficios de haber votado. "
					+ "\n"
					+ "¿Dónde encuentro información más completa acerca de mis opciones para votar?"
					+ "\n"
					+ "En las páginas de los candidatos y sus respectivos partidos:"
					+ "\n"
					+ "PARTIDO ALIANZA VERDE: www.partidoverde.org.co y www.penalosapresidente.co"
					+ "\n"
					+ "PARTIDO CONSERVADOR COLOMBIANO: www.partidoconservador.com y www.martaluciapresidenta.com"
					+ "\n"
					+ "CENTRO DEMOCRÁTICO: www.centrodemocratico.com y www.oscarivanzuluaga.com "
					+ "\n"
					+ "POLO DEMOCRÁTICO y UNIÓN PATRIÓTICA: www.polodemocratico.net y www.claralopezpresidenta.co "
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
