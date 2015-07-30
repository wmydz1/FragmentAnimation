package com.logoocc.fragmentanimation;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends FragmentActivity {

    private int flag;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
         transaction = manager.beginTransaction();


        findViewById(R.id.main_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                Toast.makeText(getApplicationContext(), "click  " + flag, Toast.LENGTH_SHORT).show();
                change();

            }
        });

    }

    private void change() {



//        transaction.setCustomAnimations(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter,
//                R.anim.fragment_slide_right_exit);
        transitionCube();

        if (flag % 2 == 1) {
            transaction.replace(R.id.main_repalce, new Fragment1());
        } else {
            transaction.replace(R.id.main_repalce, new Fragment2());
        }

        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void transitionFade() {
        transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out, android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private void transitionScaleX() {
        transaction.setCustomAnimations(R.anim.scalex_enter, R.anim.scalex_exit, R.anim.scalex_enter, R.anim.scalex_exit);
    }

    private void transitionScaleY() {
        transaction.setCustomAnimations(R.anim.scaley_enter, R.anim.scaley_exit, R.anim.scaley_enter, R.anim.scaley_exit);
    }

    private void transitionScaleXY() {
        transaction.setCustomAnimations(R.anim.scalexy_enter, R.anim.scalexy_exit, R.anim.scalexy_enter, R.anim.scalexy_exit);
    }

    private void transitionSlideVertical() {
        transaction.setCustomAnimations(R.anim.slide_fragment_vertical_right_in, R.anim.slide_fragment_vertical_left_out, R.anim.slide_fragment_vertical_left_in, R.anim.slide_fragment_vertical_right_out);
    }

    private void transitionSlideHorizontal() {
        transaction.setCustomAnimations(R.anim.slide_fragment_horizontal_right_in, R.anim.slide_fragment_horizontal_left_out, R.anim.slide_fragment_horizontal_left_in, R.anim.slide_fragment_horizontal_right_out);
    }

    private void transitionSlideHorizontalPushTop() {
        transaction.setCustomAnimations(R.anim.slide_fragment_horizontal_right_in, R.anim.slide_fragment_vertical_left_out, R.anim.slide_fragment_vertical_left_in, R.anim.slide_fragment_horizontal_right_out);
    }

    private void transitionSlideVerticalPushLeft() {
        transaction.setCustomAnimations(R.anim.slide_fragment_vertical_right_in, R.anim.slide_fragment_horizontal_left_out, R.anim.slide_fragment_horizontal_left_in, R.anim.slide_fragment_vertical_right_out);
    }

    private void transitionGlide() {
        transaction.setCustomAnimations(R.anim.glide_fragment_horizontal_in, R.anim.glide_fragment_horizontal_out, R.anim.glide_fragment_horizontal_in, R.anim.glide_fragment_horizontal_out);
    }

    private void transitionStack() {
        transaction.setCustomAnimations(R.anim.stack_right_in, R.anim.stack_left_out, R.anim.stack_left_in, R.anim.stack_right_out);
    }

    private void transitionCube() {
        transaction.setCustomAnimations(R.anim.cube_right_in, R.anim.cube_left_out, R.anim.cube_left_in, R.anim.cube_right_out);
    }

    private void transitionRotateDown() {
        transaction.setCustomAnimations(R.anim.rotatedown_right_in, R.anim.rotatedown_left_out, R.anim.rotatedown_left_in, R.anim.rotatedown_right_out);
    }

    private void transitionRotateUp() {
        transaction.setCustomAnimations(R.anim.rotateup_right_in, R.anim.rotateup_left_out, R.anim.rotateup_left_in, R.anim.rotateup_right_out);
    }

    private void transitionAccordion() {
        transaction.setCustomAnimations(R.anim.accordion_right_in, R.anim.accordion_left_out, R.anim.accordion_left_in, R.anim.accordion_right_out);
    }

    private void transitionTableHorizontal() {
        transaction.setCustomAnimations(R.anim.table_horizontal_right_in, R.anim.table_horizontal_left_out, R.anim.table_horizontal_left_int, R.anim.table_horizontal_right_out);
    }

    private void transitionTableVertical() {
        transaction.setCustomAnimations(R.anim.table_vertical_right_in, R.anim.table_vertical_left_out, R.anim.table_vertical_left_int, R.anim.table_vertical_right_out);
    }

    private void transitionFlipHorizontal() {
        transaction.setCustomAnimations(R.anim.card_flip_horizontal_right_in, R.anim.card_flip_horizontal_left_out, R.anim.card_flip_horizontal_left_in, R.anim.card_flip_horizontal_right_out);
    }

    private void transitionFlipVertical() {
        transaction.setCustomAnimations(R.anim.card_flip_vertical_right_in, R.anim.card_flip_vertical_left_out, R.anim.card_flip_vertical_left_in, R.anim.card_flip_vertical_right_out);
    }

    private void transitionZoomFromLeftCorner() {
        transaction.setCustomAnimations(R.anim.zoom_from_left_corner_right_in, R.anim.zoom_from_left_corner_left_out, R.anim.zoom_from_left_corner_left_in, R.anim.zoom_from_left_corner_right_out);
    }

    private void transitionZoomFromRightCorner() {
        transaction.setCustomAnimations(R.anim.zoom_from_right_corner_right_in, R.anim.zoom_from_right_corner_left_out, R.anim.zoom_from_right_corner_left_in, R.anim.zoom_from_right_corner_right_out);
    }


}
