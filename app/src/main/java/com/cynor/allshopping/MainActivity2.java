package com.cynor.allshopping;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity2 extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    private RelativeLayout flipcart;
    private RelativeLayout amazon;
    private RelativeLayout mesho;
    private RelativeLayout snapdeal;
    private RelativeLayout mantra;
    private RelativeLayout jiomart;
    private RelativeLayout shopy;
    private RelativeLayout tata;
    private RelativeLayout aboutus;
    private RelativeLayout history;

    private AdView mAdView;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        setAds();

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        flipcart = findViewById(R.id.flipcart);
        amazon = findViewById(R.id.amazon);
        mesho = findViewById(R.id.mesho);
        snapdeal = findViewById(R.id.snapdeal);
        mantra = findViewById(R.id.mantra);
        jiomart = findViewById(R.id.jiomart);
        shopy = findViewById(R.id.shopy);
        tata = findViewById(R.id.tata);
        aboutus = findViewById(R.id.aboutus);
        history = findViewById(R.id.history);

        flipcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd!= null)
                {
                    mInterstitialAd.show(MainActivity2.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(MainActivity2.this,flipkart.class));
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                }
                else
                {
                    startActivity(new Intent(MainActivity2.this,flipkart.class));
                }
            }
        });



        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd!= null)
                {
                    mInterstitialAd.show(MainActivity2.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(MainActivity2.this,amazon.class));
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                }
                else
                {
                    startActivity(new Intent(MainActivity2.this,amazon.class));
                }

            }
        });

        mesho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd!= null)
                {
                    mInterstitialAd.show(MainActivity2.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(MainActivity2.this,mesho.class));
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                }
                else
                {
                    startActivity(new Intent(MainActivity2.this,mesho.class));
                }

            }
        });

        snapdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd!= null)
                {
                    mInterstitialAd.show(MainActivity2.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(MainActivity2.this,snapdeals.class));
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                }
                else
                {
                    startActivity(new Intent(MainActivity2.this,snapdeals.class));
                }
            }
        });

        mantra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd!= null)
                {
                    mInterstitialAd.show(MainActivity2.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(MainActivity2.this,mantra.class));
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                }
                else
                {
                    startActivity(new Intent(MainActivity2.this,mantra.class));
                }

            }
        });

        jiomart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd!= null)
                {
                    mInterstitialAd.show(MainActivity2.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(MainActivity2.this,jiomart.class));
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                }
                else
                {
                    startActivity(new Intent(MainActivity2.this,jiomart.class));
                }

            }
        });

        shopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd!= null)
                {
                    mInterstitialAd.show(MainActivity2.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(MainActivity2.this,shopy.class));
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                }
                else
                {
                    startActivity(new Intent(MainActivity2.this,shopy.class));
                }

            }
        });

        tata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd!= null)
                {
                    mInterstitialAd.show(MainActivity2.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(MainActivity2.this,tata.class));
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                }
                else
                {
                    startActivity(new Intent(MainActivity2.this,tata.class));
                }

            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, about.class);
                startActivity(intent);

            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd!= null)
                {
                    mInterstitialAd.show(MainActivity2.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(MainActivity2.this,history.class));
                            mInterstitialAd = null;
                            setAds();
                        }
                    });
                }
                else
                {
                    startActivity(new Intent(MainActivity2.this,history.class));
                }

            }
        });

    }




    public void setAds()
    {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                    }
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mInterstitialAd = null;
                    }
                });
    }





    @Override
    public void onBackPressed() { //if user presses the back button do this


            new AlertDialog.Builder(this) //alert the person knowing they are about to close
                    .setTitle("EXIT")
                    .setMessage("Are you sure. You want to close this app?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
        }
    }
