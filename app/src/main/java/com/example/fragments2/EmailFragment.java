package com.example.fragments2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
/**
 * A simple {@link Fragment} subclass that allows the user to compose and "send" an email.
 * It contains fields for the email address and message body, and a button to trigger the action.
 * Use the {@link SmsFragment#newInstance} factory method to
 * create an instance of this fragment if you need to pass arguments upon creation.
 */

public class EmailFragment extends Fragment {
    // UI elements
    private EditText etText, etEmail;
    private Button btSendEmail;
    /**
     * Required empty public constructor for Fragment instantiation.
     */
    public EmailFragment() {
// Required empty public constructor
    }
    public static EmailFragment newInstance() {
        EmailFragment fragment = new EmailFragment();
        return fragment;
    }
    /**
     * Called to do initial creation of a fragment.
     * This is called after onAttach(Activity) and before onCreateView(LayoutInflater, ViewGroup, Bundle).
     *
     * @param savedInstanceState If the fragment is being re-created from
     * a previous saved state, this is the state.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    /**
     * Called to have the fragment instantiate its user interface view.
     * This is optional, and non-graphical fragments can return null. This will be called between
     * onCreate(Bundle) and onViewCreated(View, Bundle).
     *
     * @param inflater The LayoutInflater object that can be used to inflate
     * any views in the fragment,
     * @param container If non-null, this is the parent view that the fragment's
     * UI should be attached to. The fragment should not add the view itself,
     * but this can be used to generate the LayoutParams of the view.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     * from a previous saved state as given here.
     * @return Return the View for the fragment's UI, or null.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_email, container, false);
// Initialize UI elements by finding them in the inflated view

        etText = view.findViewById(R.id.etText); // EditText for the email message
        etEmail = view.findViewById(R.id.etEmail); // EditText for the recipient's email address
        btSendEmail = view.findViewById(R.id.btnSendEmail); // Button to trigger sending the email
// Set a click listener for the send email button
        btSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Get the text from the EditText fields
                String msg = etText.getText().toString();
                String email = etEmail.getText().toString();
// Display a Toast message with the email and message content.
// In a real application, you would typically use an Intent to send an actual email.
                Toast.makeText(getActivity(), email + "-" +msg, Toast.LENGTH_LONG ).show();
            }
        });
// Return the inflated view
        return view;
    }
}