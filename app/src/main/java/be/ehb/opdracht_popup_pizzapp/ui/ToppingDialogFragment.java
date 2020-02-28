package be.ehb.opdracht_popup_pizzapp.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import java.lang.reflect.Array;
import java.util.ArrayList;

import be.ehb.opdracht_popup_pizzapp.R;

public class ToppingDialogFragment extends DialogFragment {

    String[] toppings = {"Minced meat", "Anchovy", "Ham", "Olives", "Cheese"};

//    private DialogInterface.OnClickListener itemSelectListener = new DialogInterface.OnClickListener() {
//        @Override
//        public void onClick(DialogInterface dialog, int i) {
//            Toast.makeText(getActivity(), "you selected " + toppings[i] + " to put on your pizza", Toast.LENGTH_LONG).show();
//        }
//    };
    private ArrayList selectedItems;
    private DialogInterface.OnClickListener okListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int i) {
            Toast.makeText(getActivity(), "you selected " + selectedItems + " to put on your pizza", Toast.LENGTH_LONG).show();

        }
    };


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        selectedItems = new ArrayList();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Topping");
        builder.setMultiChoiceItems(toppings, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i, boolean isChecked) {
                if (isChecked) {
                    // If the user checked the item, add it to the selected items
                    selectedItems.add(toppings[i]);
                } else if (selectedItems.contains(i)) {
                    // Else, if the item is already in the array, remove it
                    selectedItems.remove(toppings[i]);
                }
            }
        });

        builder.setNegativeButton(android.R.string.cancel, null);

       //TODO:listener ok instellen

        builder.setPositiveButton(android.R.string.ok, okListener);

        return builder.create();
    }

}
//    @NonNull
//    @Override
//    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//
//        builder.setTitle("Topping");
//        builder.setItems(toppings, itemSelectListener);
//        builder.setNegativeButton(android.R.string.cancel, null);
//
//       TODO://listener ok instellen
//
//        builder.setPositiveButton(android.R.string.ok, null);
//
//        return builder.create();
//    }
//}
