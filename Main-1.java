// Creating Package For Main Screen One
package com.planner;

// Importing Android Packages
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainScreen extends Activity implements OnClickListener // Staring Android Activity Class And Use of OnClicklistner Interface 
{
	// Defining Variables For Button, ImageView,TextView
	Button btnDtc , btnMetro ,btnUtilities, btnmaps; 
	ImageView exitImg;
	TextView contactDeveloper;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainscreenlayout); // Calling Layout ID From R.java File
        System.out.println("2 ..... Control at Mainscreen First Line " );
        // Calling MetroButton And DTCButton ID From R.java File
	btnMetro = (Button)findViewById(R.id.buttonMetro);
        btnMetro.setOnClickListener(this);
    	btnDtc = (Button)findViewById(R.id.buttonDtc);
    	btnDtc.setOnClickListener(this);
    	
        exitImg = (ImageView)findViewById(R.id.Mainexitimageview);
        exitImg.setOnClickListener(this);
              
  }
 
	// Applying OnClickLisnter to Doing Event on Each Button
	public void onClick(View itemclicked) {
		// Exception Handling Statement 
		try{	
			switch(itemclicked.getId()) // Conditional Statement to Click Button For Nest Page
{
			case R.id.buttonDtc:
                                // Link Function for going next Page
				Intent godtcscreen = new Intent(getApplicationContext(), DtcServiceScreen.class);
				startActivity(godtcscreen);
				break;
			case R.id.buttonMetro:
 				// Link Function for going next Page
				Intent gometroservices = new Intent(getApplicationContext(), MetroServiceScreen.class);
				startActivity(gometroservices);
				break;
			
			case R.id.Mainexitimageview:
				Toast.makeText(getApplicationContext(), "App Will Exit.. Thanks for using", Toast.LENGTH_SHORT).show();
				finish();
				break;
			}
	}catch(Exception ae){
		Toast.makeText(getApplicationContext(), "Error :"+ae.getMessage(), Toast.LENGTH_SHORT).show();
		 // Link Function for going next Page
		Intent gomain = new Intent(getApplicationContext(),SplashActivity.class);
		finish();
		startActivity(gomain);
		}
	}
	
}
