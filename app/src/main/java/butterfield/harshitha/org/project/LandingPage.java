package butterfield.harshitha.org.project;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class LandingPage extends AppCompatActivity {


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
   mDrawerLayout.addDrawerListener(mToggle);
   mToggle.syncState();

        ActionBar actionBar = getSupportActionBar();
   actionBar.setDisplayHomeAsUpEnabled(true);
   actionBar.setIcon(R.drawable.logo_color);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setLogo(R.drawable.logo_color);


    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item ) {
       if(mToggle.onOptionsItemSelected(item)) {
           return true;
       }
        return super.onOptionsItemSelected(item);
    }
}
