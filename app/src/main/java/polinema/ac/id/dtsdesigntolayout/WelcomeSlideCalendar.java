package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeSlideCalendar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide);
    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeSlideSuperhero.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeBack.class);
        startActivity(i);
    }

    public void clickContactUs(View view) {
        String mailto = "mailto:dts@polinema.ac.id" +
                "&subject=" + Uri.encode("Test Email") +
                "&body=" + Uri.encode("Welcome to dts 2019");
        Intent i = new Intent(Intent.ACTION_SENDTO);
        i.setData(Uri.parse(mailto));
        startActivity(i);
    }
}
