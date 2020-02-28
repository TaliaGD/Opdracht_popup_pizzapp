package be.ehb.opdracht_popup_pizzapp.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import be.ehb.opdracht_popup_pizzapp.R;

public class SizeDialogFragment extends DialogFragment {

    String[] sizes = {"Small", "Medium", "Large"};
    private DialogInterface.OnClickListener itemSelectListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int i) {
            Toast.makeText(getActivity(), "you are going for a " + sizes[i] + " pizza", Toast.LENGTH_SHORT).show();

        }
    };


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Sizes");
        //builder.setItems(sizes, itemSelectListener);
        builder.setItems(sizes, itemSelectListener);
        builder.setNegativeButton(android.R.string.cancel, null);

        return builder.create();
    }
}
