package com.buxmeapp;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.buxmeapp.adapters.TabAdapter;


public class LandingPage extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private LinearLayout container_toolbar;
    private AppBarLayout bLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);
        bLayout = (AppBarLayout) findViewById(R.id.appbar);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        // container_toolbar = (LinearLayout) findViewById(R.id.container_toolbar);
        // container_toolbar.setVisibility(View.VISIBLE);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        if (viewPager != null) {
            setupViewPager(viewPager);
        }


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

      @Override
      public boolean onCreateOptionsMenu(Menu menu ) {
          getMenuInflater().inflate(R.menu.menu_main, menu);
          return true;
      }

      @Override
      public boolean onOptionsItemSelected(MenuItem item) {
          switch (item.getItemId()) {
              case android.R.id.home:
                  mDrawerLayout.openDrawer(GravityCompat.START);
                  return true;
          }
          return super.onOptionsItemSelected(item);
      }

    private void setupViewPager(ViewPager viewPager) {
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "Category 1");
        adapter.addFragment(new FirstFragment(), "Category 2");
        adapter.addFragment(new FirstFragment(), "Category 3");
        //adapter.addFragment(new SecondFragment(), "Category 2");
        //adapter.addFragment(new ThirdFragment(), "Category 3");
        viewPager.setAdapter(adapter);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);

                        mDrawerLayout.closeDrawers();
                        return true;
                    }
                });
    }
}