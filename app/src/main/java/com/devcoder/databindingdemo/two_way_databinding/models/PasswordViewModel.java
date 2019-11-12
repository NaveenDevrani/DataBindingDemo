package com.devcoder.databindingdemo.two_way_databinding.models;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;
import androidx.databinding.library.baseAdapters.BR;

public class PasswordViewModel extends BaseObservable {

    private static String password = "";
    public final ObservableField<String> passwords =
            new ObservableField<>();

    @Bindable
    public String getPasswordQuality() {
        if (password == null || password.isEmpty()) {
            return "Enter a password";
        } else if (password.equals("password")) {
            return "very bad";
        } else if (password.length() < 6) {
            return "short";
        } else {
            return "Okay";
        }
    }

    private void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
        notifyPropertyChanged(BR.passwordQuality);
    }

    @Bindable
    public TextWatcher getPasswordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                password = "";
                // Do nothing.
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s != null)
                    setPassword(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Do nothing.
            }
        };
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    @BindingAdapter("textChangedListeners")
    public static void bindTextWatcher(EditText editText, TextWatcher textWatcher) {
        if (textWatcher != null)
            editText.addTextChangedListener(textWatcher);
//            editText.addTextChangedListener(new TextWatcher() {
//                @Override
//                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//                }
//
//                @Override
//                public void onTextChanged(CharSequence s, int start, int before, int count) {
//                    if (s != null) {
//                        setPassword(s.toString());
//                    }
//                }
//
//                @Override
//                public void afterTextChanged(Editable s) {
//
//                }
//            });
    }
}
