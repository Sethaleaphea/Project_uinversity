package demo.app.com.project_uinversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class UniversityActivity extends Fragment {
   // private LinearLayout linearLayoutSchool;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.university, container, false);

        LinearLayout linearLayoutHome = (LinearLayout) view.findViewById(R.id.linear_school);
        linearLayoutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutSchool();
            }
        });
        return view;
    }

    private void openAboutSchool(){
        AboutSchoolActivity aboutSchoolActivity = new AboutSchoolActivity();
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.view_container, aboutSchoolActivity);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}


