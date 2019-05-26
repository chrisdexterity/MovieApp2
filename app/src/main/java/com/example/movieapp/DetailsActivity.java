package com.example.movieapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Year;

public class DetailsActivity extends AppCompatActivity {
    //declare view by variables
    ImageView mImagePoster;
    TextView mTitle,mYear,mDetails;
    //is an array of mivie poster
    int[] Images={
            R.drawable.bb,R.drawable.bbbb,R.drawable.bnhjk,R.drawable.
            bnmj,R.drawable.bty,R.drawable.bv,R.drawable.cfg,
            R.drawable.frt,R.drawable.gyt,R.drawable.hhh,R.drawable.huy,
            R.drawable.jjj,R.drawable.kil,R.drawable.mmmm,
            R.drawable.nmb,R.drawable.nnn,R.drawable.nuj,R.drawable.shaz,

    };
    //array of movie title
    String[] movietitle={"Titanic","Escape Room","Ninja Movie","Tsunami",
            "The Originals","Strangers","Girl Night",
            "The Unbreakable","Spoken","Juvinile","Options",
            "Forgotten","Spiritual Breath","Miss Bala","Treasure","Inspired",
            "The Royal girl","priceTag"

    };
    //array of release year
    String[] yearelease={"2019","2018","2017","2019","2020","2018","2018","2019","2019","2020",
            "2018","2018","2016","2020","2019","2017","2018","2019"

    };
    //array of array description
    String[] Des={"A beautiful mystery that unfolds slowly","Three yousters Battle the force of confinement",
            "The moves are unfolded by the master","A worlds most feared calamity strikes",
            "Fake and real unfolds as the world descovers","Meet the most interesting strangers of all time",
            "Sometimes this girls need to move out and be taught the things","Strong is an understament for this fellow",
            "The only and only truth told","Children live a painful life in the name os crime"
            ,"There are only two of the: Find out","The mind is surprisingly very forgetful to some of us",
            "Beutiful series of all time","Mystery meets Religion","Hidden but not for long","some motivation and wisdom goes a long way",
            "Royalty meets poverty and the unthinkable happens","The one thing that does not have a price tag"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //assign view to variable
        mImagePoster=findViewById(R.id.imageView);
        mTitle=findViewById(R.id.MTitle);
        mYear=findViewById(R.id.Year);
        mDetails=findViewById(R.id.movieDes);

        //recieve intent
        Intent recieve=getIntent();


        int pos=recieve.getIntExtra("pos",0);
        mImagePoster.setImageResource(Images[pos]);
        mTitle.setText(movietitle[pos]);
        mYear.setText(yearelease[pos]);
        mDetails.setText(Des[pos]);


    }
}
