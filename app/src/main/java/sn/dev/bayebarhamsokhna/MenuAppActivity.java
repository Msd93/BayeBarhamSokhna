package sn.dev.bayebarhamsokhna;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import sn.dev.bayebarhamsokhna.help.AProposActivity;
import sn.dev.bayebarhamsokhna.theme.Theme0Activity;
import sn.dev.bayebarhamsokhna.theme.Theme1Activity;
import sn.dev.bayebarhamsokhna.theme.Theme2Activity;
import sn.dev.bayebarhamsokhna.theme.Theme3Activity;
import sn.dev.bayebarhamsokhna.theme.Theme4Activity;
import sn.dev.bayebarhamsokhna.theme.Theme5Activity;
import sn.dev.bayebarhamsokhna.theme.Theme6Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;


public class MenuAppActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;
    private LinearLayout linearLayout;
    // Image dans le DrawerLayout
    private ImageView imageView0, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        overridePendingTransition (R.anim.slide_in_right, R.anim.slide_out_left);
        setContentView (R.layout.activity_menu_app);

        linearLayout = (LinearLayout)findViewById (R.id.linearLayout);
        navigationView = (NavigationView)findViewById (R.id.navigationView);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabld(true);

        // Refermer le DrawerLayout lorquon click hors du meu
        linearLayout.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawer (GravityCompat.START);
            }
        });
        // Manipulation des menus
        navigationView.getMenu ().getItem (0).setOnMenuItemClickListener (new MenuItem.OnMenuItemClickListener ( ) {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent (getApplicationContext (), Theme0Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
                return true;
            }
        });
        navigationView.getMenu ().getItem (1).setOnMenuItemClickListener (new MenuItem.OnMenuItemClickListener ( ) {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent (getApplicationContext (), Theme1Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
                return true;
            }
        });
        navigationView.getMenu ().getItem (2).setOnMenuItemClickListener (new MenuItem.OnMenuItemClickListener ( ) {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent (getApplicationContext (), Theme2Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
                return true;
            }
        });
        navigationView.getMenu ().getItem (3).setOnMenuItemClickListener (new MenuItem.OnMenuItemClickListener ( ) {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent (getApplicationContext (), Theme3Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
                return true;
            }
        });
        navigationView.getMenu ().getItem (4).setOnMenuItemClickListener (new MenuItem.OnMenuItemClickListener ( ) {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent (getApplicationContext (), Theme4Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
                return true;
            }
        });
        navigationView.getMenu ().getItem (5).setOnMenuItemClickListener (new MenuItem.OnMenuItemClickListener ( ) {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent (getApplicationContext (), Theme5Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
                return true;
            }
        });
        navigationView.getMenu ().getItem (6).setOnMenuItemClickListener (new MenuItem.OnMenuItemClickListener ( ) {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent (getApplicationContext (), Theme6Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
                return true;
            }
        });
        navigationView.getMenu ().getItem (7).setOnMenuItemClickListener (new MenuItem.OnMenuItemClickListener ( ) {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent (getApplicationContext (), AProposActivity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
                return true;
            }
        });
        navigationView.getMenu ().getItem (8).setOnMenuItemClickListener (new MenuItem.OnMenuItemClickListener ( ) {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                overridePendingTransition (R.anim.slide_in_right, R.anim.slide_out_right);
                drawerLayout.closeDrawer (GravityCompat.START);
                finish ();
                return true;
            }
        });

        // Navigation a partir des images de l ecran principal
        imageView0 = (ImageView)findViewById (R.id.themeImg0);
        imageView1 = (ImageView)findViewById (R.id.themeImg1);
        imageView2 = (ImageView)findViewById (R.id.themeImg2);
        imageView3 = (ImageView)findViewById (R.id.themeImg3);
        imageView4 = (ImageView)findViewById (R.id.themeImg4);
        imageView5 = (ImageView)findViewById (R.id.themeImg5);
        imageView6 = (ImageView)findViewById (R.id.themeImg6);

        imageView0.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext (), Theme0Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
            }
        });
        imageView1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext (), Theme1Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
            }
        });
        imageView2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext (), Theme2Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        });
        imageView3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext (), Theme3Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
            }
        });
        imageView4.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext (), Theme4Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
            }
        });
        imageView5.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext (), Theme5Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
            }
        });
        imageView6.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext (), Theme6Activity.class);
                startActivity (intent);
                drawerLayout.closeDrawer (GravityCompat.START);
            }
        });
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
