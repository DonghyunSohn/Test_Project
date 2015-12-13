package hanssem.com.p262;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * 새로운 프래그먼트를 추가하여 원래의 프래그먼트에서 전환하여 보여주는 방법을 알 수 있습니다.
 *
 * @author Mike
 *
 */
public class MainActivity extends AppCompatActivity {

    Fragment fragment1;
    Fragment fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if (savedInstanceState == null) {

            fragment1 = new MainActivityFragment();
            fragment2 = new Fragment2();

//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, fragment1)
//                    .commit();
        }



//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            Button button1 = (Button) findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

                }

            });

            Button button2 = (Button) findViewById(R.id.button2);
            button2.setOnclickListener(new View.OnclickListener() {
        public void onClick(View v) {

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();


        }
    });

    /**
     * 새로 추가한 두 번째 프래그먼트 클래스
     */
//    public class Fragment2 extends Fragment {
//
//        public Fragment2() {
//
//        }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment2, container, false);
//
//            Button button2 = (Button) findViewById(R.id.button2);
//            button2.setOnClickListener(new View.OnClickListener() {
//
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(getActivity(), "두번째 프래그먼트의 button1 클릭됨.", Toast.LENGTH_LONG).show();
//
//                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
//
//                }
//
//            });
//
//
//            return rootView;
//        }
//
//    }

}