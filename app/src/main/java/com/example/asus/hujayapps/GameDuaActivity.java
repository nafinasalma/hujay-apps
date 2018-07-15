package com.example.asus.hujayapps;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class GameDuaActivity extends AppCompatActivity {

    TextView tv_p1;

    ImageView back_11, back_12, back_13, back_14, back_21, back_22, back_23, back_24, back_31, back_32, back_33, back_34;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106,
            201, 202, 203, 204, 205, 206};

    int gambar101, gambar102, gambar103, gambar104, gambar105, gambar106,
            gambar201, gambar202, gambar203, gambar204, gambar205, gambar206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int playerPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_dua);

        tv_p1 = (TextView) findViewById(R.id.tv_p1);

        back_11 = (ImageView) findViewById(R.id.back_11);
        back_12 = (ImageView) findViewById(R.id.back_12);
        back_13 = (ImageView) findViewById(R.id.back_13);
        back_14 = (ImageView) findViewById(R.id.back_14);
        back_21 = (ImageView) findViewById(R.id.back_21);
        back_22 = (ImageView) findViewById(R.id.back_22);
        back_23 = (ImageView) findViewById(R.id.back_23);
        back_24 = (ImageView) findViewById(R.id.back_24);
        back_31 = (ImageView) findViewById(R.id.back_31);
        back_32 = (ImageView) findViewById(R.id.back_32);
        back_33 = (ImageView) findViewById(R.id.back_33);
        back_34 = (ImageView) findViewById(R.id.back_34);

        back_11.setTag(0);
        back_12.setTag(1);
        back_13.setTag(2);
        back_14.setTag(3);
        back_21.setTag(4);
        back_22.setTag(5);
        back_23.setTag(6);
        back_24.setTag(7);
        back_31.setTag(8);
        back_32.setTag(9);
        back_33.setTag(10);
        back_34.setTag(11);

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        back_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_11, theCard);
            }
        });

        back_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_12, theCard);
            }
        });

        back_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_13, theCard);
            }
        });

        back_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_14, theCard);
            }
        });

        back_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_21, theCard);
            }
        });

        back_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_22, theCard);
            }
        });

        back_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_23, theCard);
            }
        });

        back_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_24, theCard);
            }
        });

        back_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_31, theCard);
            }
        });

        back_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_32, theCard);
            }
        });

        back_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_33, theCard);
            }
        });

        back_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = (int) view.getTag();
                doStuff(back_34, theCard);
            }
        });
    }

    private void doStuff(ImageView iv, int card) {
        if (cardsArray[card] == 101) {
            iv.setImageResource(gambar101);
        } else if (cardsArray[card] == 102) {
            iv.setImageResource(gambar102);
        } else if (cardsArray[card] == 103) {
            iv.setImageResource(gambar103);
        } else if (cardsArray[card] == 104) {
            iv.setImageResource(gambar104);
        } else if (cardsArray[card] == 105) {
            iv.setImageResource(gambar105);
        } else if (cardsArray[card] == 106) {
            iv.setImageResource(gambar106);
        } else if (cardsArray[card] == 201) {
            iv.setImageResource(gambar201);
        } else if (cardsArray[card] == 202) {
            iv.setImageResource(gambar202);
        } else if (cardsArray[card] == 203) {
            iv.setImageResource(gambar203);
        } else if (cardsArray[card] == 204) {
            iv.setImageResource(gambar204);
        } else if (cardsArray[card] == 205) {
            iv.setImageResource(gambar205);
        } else if (cardsArray[card] == 206) {
            iv.setImageResource(gambar206);
        }

        if (cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if(cardNumber == 2) {
            secondCard = cardsArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            back_11.setEnabled(false);
            back_12.setEnabled(false);
            back_13.setEnabled(false);
            back_14.setEnabled(false);
            back_21.setEnabled(false);
            back_22.setEnabled(false);
            back_23.setEnabled(false);
            back_24.setEnabled(false);
            back_31.setEnabled(false);
            back_32.setEnabled(false);
            back_33.setEnabled(false);
            back_34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate() {
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                back_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                back_12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                back_13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                back_14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                back_21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                back_22.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                back_23.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                back_24.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                back_31.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                back_32.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                back_33.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                back_34.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond == 0) {
                back_11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                back_12.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                back_13.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                back_14.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                back_21.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                back_22.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                back_23.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                back_24.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                back_31.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                back_32.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                back_33.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                back_34.setVisibility(View.INVISIBLE);
            }

            playerPoints++;
            tv_p1.setText("P1: " + playerPoints);
        }
            back_11.setImageResource(R.drawable.ic_back);
            back_12.setImageResource(R.drawable.ic_back);
            back_13.setImageResource(R.drawable.ic_back);
            back_14.setImageResource(R.drawable.ic_back);
            back_21.setImageResource(R.drawable.ic_back);
            back_22.setImageResource(R.drawable.ic_back);
            back_23.setImageResource(R.drawable.ic_back);
            back_24.setImageResource(R.drawable.ic_back);
            back_31.setImageResource(R.drawable.ic_back);
            back_32.setImageResource(R.drawable.ic_back);
            back_33.setImageResource(R.drawable.ic_back);
            back_34.setImageResource(R.drawable.ic_back);

        tv_p1.setTextColor(Color.WHITE);
        {

            back_11.setEnabled(true);
            back_12.setEnabled(true);
            back_13.setEnabled(true);
            back_14.setEnabled(true);
            back_21.setEnabled(true);
            back_22.setEnabled(true);
            back_23.setEnabled(true);
            back_24.setEnabled(true);
            back_31.setEnabled(true);
            back_32.setEnabled(true);
            back_33.setEnabled(true);
            back_34.setEnabled(true);

            checkEnd();
        }
    }

    private void checkEnd() {
        if (back_11.getVisibility() == View.INVISIBLE &&
                back_12.getVisibility() == View.INVISIBLE &&
                back_13.getVisibility() == View.INVISIBLE &&
                back_14.getVisibility() == View.INVISIBLE &&
                back_21.getVisibility() == View.INVISIBLE &&
                back_22.getVisibility() == View.INVISIBLE &&
                back_23.getVisibility() == View.INVISIBLE &&
                back_24.getVisibility() == View.INVISIBLE &&
                back_31.getVisibility() == View.INVISIBLE &&
                back_32.getVisibility() == View.INVISIBLE &&
                back_33.getVisibility() == View.INVISIBLE &&
                back_34.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(GameDuaActivity.this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\nP1: " + playerPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), GameDuaActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources() {
        gambar101 = R.drawable.hagame;
        gambar102 = R.drawable.zonk;
        gambar103 = R.drawable.dalgame;
        gambar104 = R.drawable.dzalgame;
        gambar105 = R.drawable.rogame;
        gambar106 = R.drawable.khogame;
        gambar201 = R.drawable.hagame2;
        gambar202 = R.drawable.zonk2;
        gambar203 = R.drawable.dalgame2;
        gambar204 = R.drawable.dzalgame2;
        gambar205 = R.drawable.rogame2;
        gambar206 = R.drawable.khogame2;
    }
}
