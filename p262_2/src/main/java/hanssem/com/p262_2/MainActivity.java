package hanssem.com.p262_2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity {

    private static PlaceholderFragment fragment1;
    private static Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            fragment1 = new PlaceholderFragment();
            fragment2 = new Fragment2();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, fragment1)
                    .commit();
        }
    }

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            Button button1 = (Button) rootView.findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "첫번째 프래그먼트의 button1 클릭됨.", Toast.LENGTH_LONG).show();

                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();

                }

            });

            return rootView;
        }
    }

    public static class Fragment2 extends Fragment {

        public Fragment2() {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment2, container, false);

            Button button1 = (Button) rootView.findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "두번째 프래그먼트의 button1 클릭됨.", Toast.LENGTH_LONG).show();

                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

                }

            });


            return rootView;
        }

    }

}
