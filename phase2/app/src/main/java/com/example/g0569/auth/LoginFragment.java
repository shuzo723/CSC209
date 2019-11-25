package com.example.g0569.auth;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.g0569.R;
import com.example.g0569.auth.model.AuthInteractor;

public class LoginFragment extends Fragment implements AuthContract.View {
    private AuthContract.Presenter authPresenter;

    private TextView email;
    private TextView password;

    public LoginFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment
     *
     * @return A new instance of fragment LoginFragment.
     */
    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        this.email = view.findViewById(R.id.email);
        this.password = view.findViewById(R.id.passsword);
        view.findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((AuthInteractor.OnAuthListener) authPresenter).onLogin(email.getText().toString(), password.getText().toString());
            }
        });
        view.findViewById(R.id.to_signup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                authPresenter.toSignupPage();
            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void setPresenter(AuthContract.Presenter presenter) {

    }

    @Override
    public void ShowToast(String text) {
        Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT)
                .show();
    }
}
