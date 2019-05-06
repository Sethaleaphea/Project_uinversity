package demo.app.com.project_uinversity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.view_container,
                    new UniversityActivity()).commit();
        }
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectFragment = null;

            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    selectFragment = new UniversityActivity();
                    break;

                case R.id.nav_notification:
                    selectFragment = new ProfileActivity();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.view_container,
                    selectFragment).commit();

            return true;
        }
    };
}

