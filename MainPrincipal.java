package br.edu.ufam.icet.rocha.cleandro.appeduc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainPrincipal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private GridviewAdapter mAdapter;
    private ArrayList<String> listDisc;
    private ArrayList<Integer> listImgDisc;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        prepareList();
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridviewAdapter(this,listDisc,listImgDisc);
        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);

        // Implement On Item click listener

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position, long arg3) {

                //int selectCount = gridView.getCheckedItemCount();

                switch (position) {

                    case 0:
                        Intent itmat = new Intent(MainPrincipal.this, Matematica.class);
                        startActivity(itmat);
                        break;
                    case 1:
                        Intent itpor = new Intent(MainPrincipal.this, Matematica.class);
                        startActivity(itpor);
                        break;
                    default:
                        if (position == 2) {
                            Toast.makeText(MainPrincipal.this,
                                    "Opcao Ciencias " + position, Toast.LENGTH_LONG)
                                    .show();
                        } else if (position == 3) {
                            Toast.makeText(MainPrincipal.this,
                                    "Opcao História: " + position, Toast.LENGTH_LONG)
                                    .show();
                        } else if (position == 4) {
                            Toast.makeText(MainPrincipal.this,
                                    "Opcao Geografia: " + position, Toast.LENGTH_LONG).show();
                        } else if (position == 5) {
                            Toast.makeText(MainPrincipal.this,
                                    "Nova Opcao: " + position, Toast.LENGTH_LONG).show();

                        }
                }
            }
        });



    }

    private void prepareList() {
        listDisc = new ArrayList<String>();

        listDisc.add("Matemática");
        listDisc.add("Português");
        listDisc.add("Ciências");
        listDisc.add("História");
        listDisc.add("Geografia");
        listDisc.add("...");



        listImgDisc = new ArrayList<Integer>();
        listImgDisc.add(R.drawable.discmat);
        listImgDisc.add(R.drawable.discpor);
        listImgDisc.add(R.drawable.disccien);
        listImgDisc.add(R.drawable.dischist);
        listImgDisc.add(R.drawable.discgeo);
        listImgDisc.add(R.drawable.discoutras);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
