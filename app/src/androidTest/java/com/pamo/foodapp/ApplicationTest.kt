package com.pamo.foodapp


import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.rule.GrantPermissionRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class ApplicationTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(SplashActivity::class.java)

    @Rule
    @JvmField
    var mGrantPermissionRule =
        GrantPermissionRule.grant(
            "android.permission.READ_EXTERNAL_STORAGE"
        )

    @Test
    fun applicationTest() {
        pressBack()

        val appCompatButton = onView(
            allOf(
                withId(R.id.btnGetStarted), withText("Get Started"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.RelativeLayout")),
                        1
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatButton.perform(click())

        val recyclerView = onView(
            allOf(
                withId(R.id.rv_main_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    2
                )
            )
        )
        recyclerView.perform(actionOnItemAtPosition<ViewHolder>(2, click()))

        val recyclerView2 = onView(
            allOf(
                withId(R.id.rv_main_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    2
                )
            )
        )
        recyclerView2.perform(actionOnItemAtPosition<ViewHolder>(2, click()))

        val recyclerView3 = onView(
            allOf(
                withId(R.id.rv_sub_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    4
                )
            )
        )
        recyclerView3.perform(actionOnItemAtPosition<ViewHolder>(0, click()))

        val appCompatImageButton = onView(
            allOf(
                withId(R.id.imgToolbarBtnBack),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.appBar),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatImageButton.perform(click())

        val recyclerView4 = onView(
            allOf(
                withId(R.id.rv_main_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    2
                )
            )
        )
        recyclerView4.perform(actionOnItemAtPosition<ViewHolder>(4, click()))

        val recyclerView5 = onView(
            allOf(
                withId(R.id.rv_sub_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    4
                )
            )
        )
        recyclerView5.perform(actionOnItemAtPosition<ViewHolder>(6, click()))

        val appCompatImageButton2 = onView(
            allOf(
                withId(R.id.imgToolbarBtnBack),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.appBar),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatImageButton2.perform(click())

        val recyclerView6 = onView(
            allOf(
                withId(R.id.rv_main_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    2
                )
            )
        )
        recyclerView6.perform(actionOnItemAtPosition<ViewHolder>(1, click()))

        val recyclerView7 = onView(
            allOf(
                withId(R.id.rv_sub_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    4
                )
            )
        )
        recyclerView7.perform(actionOnItemAtPosition<ViewHolder>(15, click()))

        val appCompatImageButton3 = onView(
            allOf(
                withId(R.id.imgToolbarBtnBack),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.appBar),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatImageButton3.perform(click())

        val recyclerView8 = onView(
            allOf(
                withId(R.id.rv_main_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    2
                )
            )
        )
        recyclerView8.perform(actionOnItemAtPosition<ViewHolder>(13, click()))

        val recyclerView9 = onView(
            allOf(
                withId(R.id.rv_sub_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    4
                )
            )
        )
        recyclerView9.perform(actionOnItemAtPosition<ViewHolder>(0, click()))

        val appCompatImageButton4 = onView(
            allOf(
                withId(R.id.imgToolbarBtnBack),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.appBar),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatImageButton4.perform(click())

        val recyclerView10 = onView(
            allOf(
                withId(R.id.rv_main_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    2
                )
            )
        )
        recyclerView10.perform(actionOnItemAtPosition<ViewHolder>(11, click()))

        val recyclerView11 = onView(
            allOf(
                withId(R.id.rv_sub_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    4
                )
            )
        )
        recyclerView11.perform(actionOnItemAtPosition<ViewHolder>(6, click()))

        val appCompatImageButton5 = onView(
            allOf(
                withId(R.id.imgToolbarBtnBack),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.appBar),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatImageButton5.perform(click())

        val recyclerView12 = onView(
            allOf(
                withId(R.id.rv_main_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    2
                )
            )
        )
        recyclerView12.perform(actionOnItemAtPosition<ViewHolder>(6, click()))

        val recyclerView13 = onView(
            allOf(
                withId(R.id.rv_sub_category),
                childAtPosition(
                    withClassName(`is`("android.widget.LinearLayout")),
                    4
                )
            )
        )
        recyclerView13.perform(actionOnItemAtPosition<ViewHolder>(5, click()))

        val appCompatImageButton6 = onView(
            allOf(
                withId(R.id.imgToolbarBtnBack),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.appBar),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatImageButton6.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
