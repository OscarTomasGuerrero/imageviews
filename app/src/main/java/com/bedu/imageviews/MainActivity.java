package com.bedu.imageviews;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

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
        travelLocationEiffelTower.imageUrl = "https://viajes.nationalgeographic.com.es/medio/2019/03/29/torre-eiffel-hoy_f7a97d88_1200x1821.jpg";
        travelLocationEiffelTower.title = "France";
        travelLocationEiffelTower.location = "Eiffel Tower";
        travelLocationEiffelTower.starRating = 4.8f;
        travelLocations.add(travelLocationEiffelTower);

        TravelLocation travelLocationMountainView = new TravelLocation();
        travelLocationEiffelTower.imageUrl = "https://www.travelmanagers.com.au/wp-content/uploads/2012/08/AdobeStock_254529936_Railroad-to-Denali-National-Park-Alaska_750x500.jpg";
        travelLocationEiffelTower.title = "Australia";
        travelLocationEiffelTower.location = "Mountain View";
        travelLocationEiffelTower.starRating = 4.5f;
        travelLocations.add(travelLocationMountainView);

        TravelLocation travelLocationTajMahal = new TravelLocation();
        travelLocationEiffelTower.imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/ee/%C4%90%E1%BB%81n_Taj_Mahal.jpg";
        travelLocationEiffelTower.title = "India";
        travelLocationEiffelTower.location = "Taj Mahal";
        travelLocationEiffelTower.starRating = 4.3f;
        travelLocations.add(travelLocationTajMahal);

        TravelLocation travelLocationFozDoIguacu = new TravelLocation();
        travelLocationEiffelTower.imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/97/Foz_de_Igua%C3%A7u_27_Panorama_Nov_2005.jpg";
        travelLocationEiffelTower.title = "Brazil";
        travelLocationEiffelTower.location = "Cataratas do Iguaçu";
        travelLocationEiffelTower.starRating = 4.2f;
        travelLocations.add(travelLocationTajMahal);

        locationsViewPager.setAdapter(new TravelLocationsAdapter(travelLocations));
    }

}

