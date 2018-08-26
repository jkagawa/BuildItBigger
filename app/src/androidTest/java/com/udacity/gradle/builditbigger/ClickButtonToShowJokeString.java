//package com.udacity.gradle.builditbigger;
//
//import android.support.test.rule.ActivityTestRule;
//import android.support.test.runner.AndroidJUnit4;
//
//
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import static android.support.test.espresso.Espresso.onView;
//import static android.support.test.espresso.action.ViewActions.click;
//import static android.support.test.espresso.assertion.ViewAssertions.matches;
//import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
//import static android.support.test.espresso.matcher.ViewMatchers.withId;
//import static android.support.test.espresso.matcher.ViewMatchers.withText;
//import static org.hamcrest.Matchers.not;
//
///**
// * Created by Joshua on 8/12/2018.
// */
//
//@RunWith(AndroidJUnit4.class)
//public class ClickButtonToShowJokeString {
//
//    @Rule
//    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
//
//    @Test
//    public void ClickOnButton() {
//
//        onView(withId(R.id.button))
//                .perform(click());
//
//        onView(withId(R.id.joke_text_view))
//                .check(matches(not(withText(""))));
//
//    }
//
//}
