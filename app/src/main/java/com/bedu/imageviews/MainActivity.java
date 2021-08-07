package com.bedu.imageviews;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 locationsViewPager = findViewById(R.id.locationsViewPager);

        List<TravelLocation> travelLocations = new ArrayList<>();

        TravelLocation travelLocationEiffelTower = new TravelLocation();
        travelLocationEiffelTower.image = "@drawable/image_torreeiffel.jpg";
        travelLocationEiffelTower.title = "France";
        travelLocationEiffelTower.location = "Eiffel Tower";
        travelLocationEiffelTower.starRating = 4.8f;
        travelLocations.add(travelLocationEiffelTower);

        TravelLocation travelLocationMountainView = new TravelLocation();
        travelLocationEiffelTower.image = "https://www.travelmanagers.com.au/wp-content/uploads/2012/08/AdobeStock_254529936_Railroad-to-Denali-National-Park-Alaska_750x500.jpg";
        travelLocationEiffelTower.title = "Australia";
        travelLocationEiffelTower.location = "Mountain View";
        travelLocationEiffelTower.starRating = 4.5f;
        travelLocations.add(travelLocationMountainView);

        TravelLocation travelLocationTajMahal = new TravelLocation();
        travelLocationEiffelTower.image = "https://upload.wikimedia.org/wikipedia/commons/e/ee/%C4%90%E1%BB%81n_Taj_Mahal.jpg";
        travelLocationEiffelTower.title = "India";
        travelLocationEiffelTower.location = "Taj Mahal";
        travelLocationEiffelTower.starRating = 4.3f;
        travelLocations.add(travelLocationTajMahal);

        TravelLocation travelLocationFozDoIguacu = new TravelLocation();
        travelLocationEiffelTower.image = "https://upload.wikimedia.org/wikipedia/commons/9/97/Foz_de_Igua%C3%A7u_27_Panorama_Nov_2005.jpg";
        travelLocationEiffelTower.title = "Brazil";
        travelLocationEiffelTower.location = "Cataratas do Iguaçu";
        travelLocationEiffelTower.starRating = 4.2f;
        travelLocations.add(travelLocationFozDoIguacu);

        locationsViewPager.setAdapter(new TravelLocationsAdapter(travelLocations));

        locationsViewPager.setClipToPadding(false);
        locationsViewPager.setClipChildren(false);
        locationsViewPager.setOffscreenPageLimit(3);
        locationsViewPager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer(){
            @Override
            public void transformPage(@NotNull View page, float position){
                float r = 1 - Math.abs(position);
                page.setScaleY(0.95f + r * 0.05f);
            }
        });

        locationsViewPager.setPageTransformer(compositePageTransformer);

    }

}

