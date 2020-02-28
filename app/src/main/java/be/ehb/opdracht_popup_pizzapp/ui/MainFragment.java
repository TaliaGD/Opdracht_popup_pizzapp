package be.ehb.opdracht_popup_pizzapp.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import be.ehb.opdracht_popup_pizzapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

//    private View.OnClickListener toastListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            //wat gebeurt er on klik we gaan een toast maken
//            Toast toasty = Toast.makeText(getActivity(), "Hello popup", Toast.LENGTH_LONG);
//            //om de toast van plaats te veranderen
//            // toasty.setGravity(Gravity.TOP,0,0);
//            toasty.show();
//        }
//    };





//on klik listener voor mijn Size btn aangemaakt nadat ik naar de knop heb verwezen en de lisener heb aangesproken die ik hier nog moet uitwerken
    private View.OnClickListener sizeListener = new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        new SizeDialogFragment().show(getParentFragmentManager(), "sdf");

    }
};

    private View.OnClickListener toppingListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            new ToppingDialogFragment().show(getParentFragmentManager(), "dsf");
        }
    };

//    private View.OnClickListener orderListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(my)
//
//        }
//    };


    private View rootView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       rootView = inflater.inflate(R.layout.fragment_main, container, false);


       //verwijzing naar Size knop
        Button btnSize = rootView.findViewById(R.id.btn_size);
        //listener naar knop size
        btnSize.setOnClickListener(sizeListener);


        Button btnToppings = rootView.findViewById(R.id.btn_toppings);
        btnToppings.setOnClickListener(toppingListener);

//        Button btnOrder = rootView.findViewById(R.id.btn_order);
//        btnOrder.setOnClickListener(orderListener);


       return rootView;
    }

}
