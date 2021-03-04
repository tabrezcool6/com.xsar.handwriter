package com.xsar.handwriter;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;

public class WalkThroughActivityInNext extends AppCompatActivity {

    View walkThroughView;
    Button walkThrough_text, imageButton1, imageButton2, imageButton3, imageButton4, captureButton, skipButton2;
    ImageButton backgroundWallpaperClose, fontLayoutClose, colorClose, capturedAccept, capturedDecline, infoButton;
    LinearLayout next, linesLinearLayout ;
    ImageView arrow1, arrow2, arrow3, arrow4, arrow5, pickImage;
    EditText editText1;
    Animation fadein, toBottom,fromBottom, rotateOpen, fromRight, fromLeft;
    public boolean capturedImage = false;
    LinearLayout linearLayout, exportButton;
    HorizontalScrollView scrollView, textColorScrollView, handWritingScrollView;
    Toolbar toolbarcaptured, toolbar44;
    CardView cardViewWalkthrough;
    Bitmap saveBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        next = findViewById(R.id.export_btn);
        toolbar44 = findViewById(R.id.tool_bar44);
        cardViewWalkthrough = findViewById(R.id.cardViewWalkthrough);
        scrollView = findViewById(R.id.backgroundImageScroll);
        handWritingScrollView = findViewById(R.id.handWritingScrollView);
        textColorScrollView = findViewById(R.id.text_colour_ScrollView);
        linearLayout = findViewById(R.id.linearLayout_Font_Selector);
        toolbarcaptured = findViewById(R.id.toolbarcaptured);
        walkThrough_text =findViewById(R.id.walkThrough_text);
        pickImage = findViewById(R.id.Pick_Image_from_gallery);
        linesLinearLayout = (LinearLayout) findViewById(R.id.linesLinearLayout);
        skipButton2 = (Button) findViewById(R.id.skipButton2);

        backgroundWallpaperClose = findViewById(R.id.backGround_Wallpaper_close_Button);
        fontLayoutClose = findViewById(R.id.font_Layout_close_Button);
        colorClose = findViewById(R.id.Text_Color_Layout_close_Button);

        editText1 = findViewById(R.id.edit_text_InNext);
        capturedAccept = findViewById(R.id.captured_accept);
        capturedDecline = findViewById(R.id.captured_decline);

        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);
        captureButton = findViewById(R.id.textCaptureButton);


        fadein = AnimationUtils.loadAnimation(WalkThroughActivityInNext.this, R.anim.fadein);
        toBottom = AnimationUtils.loadAnimation(WalkThroughActivityInNext.this, R.anim.to_bottom_original_size);
        fromBottom = AnimationUtils.loadAnimation(WalkThroughActivityInNext.this, R.anim.from_bottom_anim);
        fromRight = AnimationUtils.loadAnimation(WalkThroughActivityInNext.this, R.anim.enter_from_right);
        fromLeft = AnimationUtils.loadAnimation(WalkThroughActivityInNext.this, R.anim.enter_from_left);
        rotateOpen = AnimationUtils.loadAnimation(WalkThroughActivityInNext.this, R.anim.rotate_open_anim);

        arrow1 = findViewById(R.id.indicator_arrow1);
        arrow2 = findViewById(R.id.indicator_arrow2);
        arrow3 = findViewById(R.id.indicator_arrow3);
        arrow4 = findViewById(R.id.indicator_arrow4);
        arrow5 = findViewById(R.id.indicator_arrow5);

        infoButton = findViewById(R.id.walkthroughNext);
        next.setVisibility(View.GONE);
        infoButton.setVisibility(View.GONE);

        homeUI();
        skipButton2.setVisibility(View.VISIBLE);
        skipButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        walkThroughView = findViewById(R.id.walkThroughInNext);
        walkThroughView.setVisibility(View.VISIBLE);
        walkThroughView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        imageButton1.setVisibility(View.INVISIBLE);
        imageButton2.setVisibility(View.INVISIBLE);
        imageButton3.setVisibility(View.INVISIBLE);
        imageButton4.setVisibility(View.INVISIBLE);
        captureButton.setVisibility(View.INVISIBLE);
        toolbar44.setVisibility(View.INVISIBLE);

        final TranslateAnimation animation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 40.0f);
        animation.setDuration(1000);
        animation.setRepeatCount(Animation.INFINITE);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @SuppressLint("SetTextI18n")
            @Override
            public void run() {
                editText1.setText("AN OVERVIEW ON HOW TO USE...\n" +
                        "\n" +
                        "Here you can convert text to handwritten form by directly capturing Pictures or by importing them from Gallery.\n "+
                        "\n" + "\n" +
                        "SELECT\n" +
                        "\n" +
                        "Camera : Capture clear image of printed text\n" +
                        "Open Text File : Open .txt Files from External Storage \n"+
                        "Create Text File : Type or Copy/Paste the text you want \n"+
                        "Import from Gallery : On Top-Right Corner, Click Gallery Icon to import Images from the Gallery \n"+
                        "\n" +"\n" +

                        "GET TEXT FROM IMAGES \n"+
                        "\n"
                        + "Copy recognized text from all images, Edit and paste it in a single text file \n"+
                        "\n" + "\n"+
                        "GET FILES FROM PHONE\n"+
                        "\n" +
                        "Text file selected from the phone will be displayed here or edited text file from images will be displayed here, " +
                        "You can save the text file for future use or go to final Activity.  \n"+"\n" +"\n" +

                        "FINAL ACTIVITY.\n"+"\n" +
                        "* Select your desired paper for background.\n" +
                        "* Choose your favourite handwriting.\n" +
                        "* Adjust the text size. \n" +
                        "* Choose Ink color. \n"+
                        "* Import and add hand drawn diagram from gallery in\n" +
                        "  selected ink color at the cursor position.\n"+
                        "* Scroll and Capture the images of final text.\n"+
                        "* Save or Cancel the captured image.\n"+
                        "* Finally Export as Pdf File.\n"
                );
                toolbar44.startAnimation(fadein);
                toolbar44.setVisibility(View.VISIBLE);

                imageButton1.setVisibility(View.VISIBLE);
                imageButton2.setVisibility(View.VISIBLE);
                imageButton3.setVisibility(View.VISIBLE);
                imageButton4.setVisibility(View.VISIBLE);
                captureButton.setVisibility(View.VISIBLE);

                cardViewWalkthrough.setVisibility(View.VISIBLE);
                walkThrough_text.startAnimation(fadein);
                walkThrough_text.setVisibility(View.VISIBLE);

                imageButton1.setClickable(false);
                imageButton2.setClickable(false);
                imageButton3.setClickable(false);
                imageButton4.setClickable(false);
                captureButton.setClickable(false);
            }
        }, 1000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                arrow1.startAnimation(animation);
                arrow1.setVisibility(View.VISIBLE);
                imageButton1.setClickable(true);
                walkThrough_text.setText(R.string.button1);
            }
        }, 3250);


        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrow1.clearAnimation();
                arrow1.setVisibility(View.GONE);

                scrollView.setVisibility(View.VISIBLE);
                backgroundWallpaperClose.setVisibility(View.VISIBLE);

                scrollView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.fullScroll(ScrollView.FOCUS_RIGHT);
                    }
                }, 1000);

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        editText1.setBackground(getResources().getDrawable(R.drawable.paper_background_3));
                        scrollView.setVisibility(View.INVISIBLE);
                        backgroundWallpaperClose.setVisibility(View.INVISIBLE);

                        walkThrough_text.setText(R.string.button2);
                        arrow2.startAnimation(animation);
                        arrow2.setVisibility(View.VISIBLE);

                        imageButton1.setEnabled(false);
                        imageButton2.setClickable(true);
                        imageButton3.setClickable(false);
                        imageButton4.setClickable(false);
                        captureButton.setClickable(false);
                    }
                }, 3000);

                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 3250);
            }
        });







        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrow2.clearAnimation();
                arrow2.setVisibility(View.GONE);

                        linearLayout.setVisibility(View.VISIBLE);
                        fontLayoutClose.setVisibility(View.VISIBLE);

                handWritingScrollView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        handWritingScrollView.fullScroll(ScrollView.FOCUS_RIGHT);
                    }
                }, 1000);

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        editText1.setTextSize(20);

                        Typeface type0 = ResourcesCompat.getFont(WalkThroughActivityInNext.this, R.font.handwriting_03);
                        editText1.setTypeface(type0);

                        linearLayout.setVisibility(View.INVISIBLE);
                        fontLayoutClose.setVisibility(View.INVISIBLE);

                        walkThrough_text.setText(R.string.button3);
                        arrow4.startAnimation(animation);
                        arrow4.setVisibility(View.VISIBLE);

                        imageButton2.setEnabled(false);
                        imageButton3.setClickable(true);
                        imageButton4.setClickable(false);
                        captureButton.setClickable(false);
                    }
                }, 3000);

                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 3250);
                }
        });


        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrow4.clearAnimation();
                arrow4.setVisibility(View.GONE);

                textColorScrollView.setVisibility(View.VISIBLE);
                colorClose.setVisibility(View.VISIBLE);

                textColorScrollView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textColorScrollView.fullScroll(ScrollView.FOCUS_RIGHT);
                    }
                }, 1000);

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        editText1.setTextColor(getResources().getColor(R.color.ColourBlue));
                        textColorScrollView.setVisibility(View.INVISIBLE);
                        colorClose.setVisibility(View.INVISIBLE);

                        walkThrough_text.setText(R.string.button4);
                        arrow5.startAnimation(animation);
                        arrow5.setVisibility(View.VISIBLE);

                        imageButton3.setEnabled(false);
                        imageButton4.setClickable(true);
                        captureButton.setClickable(false);
                    }
                }, 3000);

                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 3250);

            }
        });






        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrow5.clearAnimation();
                arrow5.setVisibility(View.GONE);

                imageButton4.setEnabled(false);
                        linesLinearLayout.setVisibility(View.VISIBLE);

                Handler handler1 = new Handler();

                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //walkThrough_text.setText("You are ready to go");
                        arrow3.startAnimation(animation);
                        arrow3.setVisibility(View.VISIBLE);
                    }
                }, 500);


                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        captureButton.setClickable(true);
                    }
                }, 1000);



            }
        });

        captureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrow3.clearAnimation();
                arrow3.setVisibility(View.GONE);
                cardViewWalkthrough.setVisibility(View.GONE);

                editText1.setCursorVisible(false);
                editText1.buildDrawingCache();
                saveBitmap = Bitmap.createBitmap(editText1.getDrawingCache());
                pickImage.setVisibility(View.VISIBLE);
                pickImage.setImageBitmap(saveBitmap);
                capturedAccept.setVisibility(View.VISIBLE);
                capturedDecline.setVisibility(View.VISIBLE);
                toolbarcaptured.setVisibility(View.VISIBLE);
                editText1.destroyDrawingCache();
                capturedImage = true;

                captureButton.setEnabled(false);

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 3000);

                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        finish();
                    }
                }, 8000);

            }
        });




    }

    private void viewUI(View view, TextView textView, TextView textView2, int width, int height){
        Display display = getWindowManager().getDefaultDisplay();
        int screenWidth = display.getWidth();
        int screenHeight = display.getHeight();

        CardView.MarginLayoutParams click = (CardView.MarginLayoutParams) view.getLayoutParams();
        click.width = (screenWidth * width) / 100;
        click.height = (screenWidth * height) / 100;
        view.setLayoutParams(click);
        textView.setTextSize((screenWidth*3)/100);
        textView2.setTextSize((screenWidth*2)/80);
    }

        private void homeUI() {
        Display display = getWindowManager().getDefaultDisplay();
        int screenWidth = display.getWidth();
        int screenHeight = display.getHeight();

        CardView.MarginLayoutParams cardParams = (CardView.MarginLayoutParams) cardViewWalkthrough.getLayoutParams();
        cardParams.width = (screenWidth * 94) / 100;
        cardParams.height = (screenWidth * 47) / 100;
        cardViewWalkthrough.setLayoutParams(cardParams);

    }

    @Override
    public void onBackPressed() {

    }


}