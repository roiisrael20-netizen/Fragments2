package com.example.fragments2;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
// ViewPagerAdapter is responsible for providing the fragments that will be displayed in the ViewPager2.
        // It extends FragmentStateAdapter, which is suitable for managing a dynamic collection of fragments,
        // especially when the number of fragments is large or can change.
        public class ViewPagerAdapter extends FragmentStateAdapter {
            // Constructor for the ViewPagerAdapter.
// @param fragmentActivity The FragmentActivity that will host the ViewPager2.
// This is needed by FragmentStateAdapter to manage fragment transactions.
            public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
                super(fragmentActivity);
            }
            // Called by ViewPager2 to create a new fragment for a given position.
// @param position The position of the fragment to be created.
// @return A new Fragment instance for the given position.
            @NonNull
            @Override
            public Fragment createFragment(int position) {
// Determine which fragment to create based on the position.
// This is a common pattern for ViewPager adapters.
                if (position == 0) {
// For the first page (position 0), return an instance of EmailFragment.
                    return new EmailFragment();
                }
                if (position == 1) {
// For the second page (position 1), return an instance of SmsFragment.
                    return new SmsFragment();
                }
// As a fallback, or if there are more positions than explicitly handled,
// return EmailFragment. It's good practice to have a default case,
// though in this specific setup with getItemCount returning 2, this line
// would only be hit if getItemCount were larger and other positions weren't handled.
                return new EmailFragment();

            }
// Called by ViewPager2 to get the total number of fragments (pages) to be displayed.
// @return The total number of fragments.
            @Override
            public int getItemCount() {
// In this adapter, there are always 2 fragments to display.
                return 2; // Number of fragments: EmailFragment and SmsFragment.
            }
        }
