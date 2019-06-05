/**
* <ul>
* Android Tutorial, An <strong>Android2EE</strong>'s project.</br>
* Produced by <strong>Dr. Mathias SEGUY</strong> with the smart contribution of <strong>Julien PAPUT</strong>.</br>
* Delivered by <strong>http://android2ee.com/</strong></br>
* Belongs to <strong>Mathias Seguy</strong></br>
* ****************************************************************************************************************</br>
* This code is free for any usage but can't be distribute.</br>
* The distribution is reserved to the site <strong>http://android2ee.com</strong>.</br>
* The intelectual property belongs to <strong>Mathias Seguy</strong>.</br>
* <em>http://mathias-seguy.developpez.com/</em></br>
* </br>
* For any information (Advice, Expertise, J2EE or Android Training, Rates, Business):</br>
* <em>mathias.seguy.it@gmail.com</em></br>
* *****************************************************************************************************************</br>
* Ce code est libre de toute utilisation mais n'est pas distribuable.</br>
* Sa distribution est reservée au site <strong>http://android2ee.com</strong>.</br>
* Sa propriété intellectuelle appartient à <strong>Mathias Séguy</strong>.</br>
* <em>http://mathias-seguy.developpez.com/</em></br>
* </br>
* Pour tous renseignements (Conseil, Expertise, Formations J2EE ou Android, Prestations, Forfaits):</br>
* <em>mathias.seguy.it@gmail.com</em></br>
* *****************************************************************************************************************</br>
* Merci à vous d'avoir confiance en Android2EE les Ebooks de programmation Android.
* N'hésitez pas à nous suivre sur twitter: http://fr.twitter.com/#!/android2ee
* N'hésitez pas à suivre le blog Android2ee sur Developpez.com : http://blog.developpez.com/android2ee-mathias-seguy/
* *****************************************************************************************************************</br>
* com.android2ee.android.tuto</br>
* 25 mars 2011</br>
*/
package com.android2ee.android.tuto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

/**
 * @author (Julien PAPUT sous la direction du Dr. Mathias Séguy)
 * @goals
 * This class aims to:
 * <ul><li>Switch image when user click on buttons</li></ul>
 */
public class ViewFlipperTuto extends Activity {
	
	/******************************************************************************************/
	/** Attributes **************************************************************************/
	/******************************************************************************************/
	//the previous button
	Button previous;
	//the next button
	Button next;
	//the ViewFlipper
	ViewFlipper viewFlipper;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
	//Attributes instantiation
	viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
	previous = (Button) findViewById(R.id.previous);
	next = (Button) findViewById(R.id.next);
	
	//Define animation
	viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_push_left_in));
	viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_push_left_out));
	
	//On previous button click
	previous.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			//switch image to the previous
			viewFlipper.showPrevious();
		}
	});
	
	//On next button click
	next.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			//switch image to the next
			viewFlipper.showNext();	
		}
	});
	}
}
