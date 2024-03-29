package com.example.ieeegbpec.Fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.ieeegbpec.R;

public class HomeFragment extends Fragment {

    private ViewFlipper viewFlipper;
    private int[] image_resources = {R.drawable.technology3, R.drawable.technology,
            R.drawable.technology2, R.drawable.technology4};

    @SuppressLint("InflateParams")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, null);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewFlipper = view.findViewById(R.id.view_flipper);

        for(int image: image_resources){
            FlipperImage(image);
        }
    }

    private void FlipperImage(int image){
        ImageView imageView = new ImageView(getActivity());
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3001);
        viewFlipper.setAutoStart(true);
        viewFlipper.startFlipping();

        viewFlipper.setInAnimation(getActivity(), android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(getActivity(), android.R.anim.slide_out_right);

    }
}






        /*ViewPager viewPager = view.findViewById(R.id.view_pager);
        CustomSwipe customSwipe = new CustomSwipe(getActivity());

        viewPager.setAdapter(customSwipe);*/

        /*Picasso.get().load("http://prankster101.com/newsite/wp-content/uploads/event-icon.png").fit().centerCrop().into((ImageView) view.findViewById(R.id.icon_events));
        Picasso.get().load("https://www.trzcacak.rs/myfile/full/197-1972262_carriers-win-big-with-uncrash-success-flat-icon.png").fit().centerCrop().into((ImageView) view.findViewById(R.id.icon_achievements));
        Picasso.get().load("https://icon-library.net/images/projects-icon/projects-icon-3.jpg").fit().centerCrop().into((ImageView) view.findViewById(R.id.icon_projects));
        Picasso.get().load("http://sites.ieee.org/sb-wayne/files/2016/03/cropped-IEEE-Icon.png").fit().centerCrop().into((ImageView) view.findViewById(R.id.icon_ieee));
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTbfX3jgJQqDlMevbu0QLHWXdPPiXZ1WXNuzIyld8a4S0eNp9W7g").fit().centerCrop().into((ImageView) view.findViewById(R.id.icon_resources));*/

        //view.findViewById(R.id.background).getBackground().setAlpha(90);

        /*view.findViewById(R.id.card1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Events", Toast.LENGTH_SHORT).show();

                Fragment fragment = new EventsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                assert fragmentManager != null;
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.screen_area, fragment).commit();
            }
        });
        view.findViewById(R.id.card2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Achievements", Toast.LENGTH_SHORT).show();

                Fragment fragment = new AchievementsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                assert fragmentManager != null;
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.screen_area, fragment).commit();
            }
        });
        view.findViewById(R.id.card3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Projects", Toast.LENGTH_SHORT).show();

                Fragment fragment = new ProjectsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                assert fragmentManager != null;
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.screen_area, fragment).commit();
            }
        });
        view.findViewById(R.id.card4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "IEEE", Toast.LENGTH_SHORT).show();

                Fragment fragment = new IEEEFragment();
                FragmentManager fragmentManager = getFragmentManager();
                assert fragmentManager != null;
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.screen_area, fragment).commit();
            }
        });
        view.findViewById(R.id.card5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "IEEE Resources", Toast.LENGTH_SHORT).show();
            }
        });*/