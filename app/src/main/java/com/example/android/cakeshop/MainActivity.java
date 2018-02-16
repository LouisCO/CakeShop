package com.example.android.cakeshop;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.location_icon: case R.id.address:
                // Open map at shop's geolocation
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setData(Uri.parse("geo:0,0?q=" + getString(R.string.latitude) + "," + getString(R.string.longitude) + "(" + getString(R.string.app_name) + ")"));
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
                break;
            case R.id.phone_icon: case R.id.phone:
                // Open dialer with the phone no.
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + getString(R.string.ph_no)));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                break;
            case R.id.email_icon: case R.id.email:
                // Open the mail app with the company's email address as a recipient
                Intent mailIntent = new Intent(Intent.ACTION_SENDTO);
                mailIntent.setData(Uri.parse("mailto:" + getString(R.string.email))); // only email apps should handle this
                if (mailIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mailIntent);
                }
                break;
            case R.id.www_icon: case R.id.www:
                // Open the website in the browser
                Uri webpage = Uri.parse("http://" + getString(R.string.web));
                Intent intentW = new Intent(Intent.ACTION_VIEW, webpage);
                if (intentW.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentW);
                }
                break;
            case R.id.facebook:
                // Open the shop's Facebook page in the browser
                Uri webpageF = Uri.parse(getString(R.string.facebook));
                Intent intentF = new Intent(Intent.ACTION_VIEW, webpageF);
                if (intentF.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentF);
                }
                break;
            case R.id.instagram:
                // Open the shop's Instagram page in the browser
                Uri webpageI = Uri.parse(getString(R.string.instagram));
                Intent intentI = new Intent(Intent.ACTION_VIEW, webpageI);
                if (intentI.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentI);
                }
                break;
            case R.id.twitter:
                // Open the shop's Twitter page in the browser
                Uri webpageT = Uri.parse(getString(R.string.twitter));
                Intent intentT = new Intent(Intent.ACTION_VIEW, webpageT);
                if (intentT.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentT);
                }
                break;
            case R.id.google:
                // Open the shop's Google+ page in the browser
                Uri webpageG = Uri.parse(getString(R.string.google));
                Intent intentG = new Intent(Intent.ACTION_VIEW, webpageG);
                if (intentG.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentG);
                }
                break;
        }
    }
}

