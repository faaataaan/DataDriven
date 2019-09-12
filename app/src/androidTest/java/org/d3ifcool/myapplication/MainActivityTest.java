package org.d3ifcool.myapplication;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void simpleTestDataDriven() {
        onView(withId(R.id.editText_nim)).perform(typeText(Mahasiswa.user1.getNim()));
        onView(withId(R.id.editText_nama)).perform(typeText(Mahasiswa.user1.getNama()));
        onView(withId(R.id.editText_uts)).perform(typeText(Mahasiswa.user1.getUts()));
        onView(withId(R.id.editText_uas)).perform(typeText(Mahasiswa.user1.getUas()));

        onView(withId(R.id.button_test)).perform(click());
    }

    @Test
    public void simpleTestDataDriven2() {
        onView(withId(R.id.editText_nim)).perform(typeText(Mahasiswa.user2.getNim()));
        onView(withId(R.id.editText_nama)).perform(typeText(Mahasiswa.user2.getNama()));
        onView(withId(R.id.editText_uts)).perform(typeText(Mahasiswa.user2.getUts()));
        onView(withId(R.id.editText_uas)).perform(typeText(Mahasiswa.user2.getUas()));

        onView(withId(R.id.button_test)).perform(click());
    }

    @Test
    public void simpleTestDataDriven3() {
        onView(withId(R.id.editText_nim)).perform(typeText(Mahasiswa.user3.getNim()));
        onView(withId(R.id.editText_nama)).perform(typeText(Mahasiswa.user3.getNama()));
        onView(withId(R.id.editText_uts)).perform(typeText(Mahasiswa.user3.getUts()));
        onView(withId(R.id.editText_uas)).perform(typeText(Mahasiswa.user3.getUas()));

        onView(withId(R.id.button_test)).perform(click());
    }
}