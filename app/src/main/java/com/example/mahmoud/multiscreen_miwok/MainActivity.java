package com.example.mahmoud.multiscreen_miwok;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Displays a {@link ViewPager} where each page shows a different day of the week.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        // Create an adapter that knows which fragment should be shown on each page
        final MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
