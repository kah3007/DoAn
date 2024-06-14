package com.example.foodie.databinding;
import com.example.foodie.R;
import com.example.foodie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.example.foodie.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivAccountLogin, 11);
        sViewsWithIds.put(R.id.editTextAccountLogin, 12);
        sViewsWithIds.put(R.id.ivPasswordLogin, 13);
        sViewsWithIds.put(R.id.editTextPasswordLogin, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.Button) bindings[7]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[14]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.ProgressBar) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            );
        this.accountLoginLayout.setTag(null);
        this.buttonLogin.setTag(null);
        this.ivLogin.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.passwordLoginLayout.setTag(null);
        this.progressBarLogin.setTag(null);
        this.tvAccountLogin.setTag(null);
        this.tvLogin.setTag(null);
        this.tvPasswordLogin.setTag(null);
        this.tvProgressLogin.setTag(null);
        this.tvSignUpClick.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.example.foodie.generated.callback.OnClickListener(this, 1);
        mCallback14 = new com.example.foodie.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginFragment == variableId) {
            setLoginFragment((com.example.foodie.ui.fragment.LoginFragment) variable);
        }
        else if (BR.loginStatus == variableId) {
            setLoginStatus((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginFragment(@Nullable com.example.foodie.ui.fragment.LoginFragment LoginFragment) {
        this.mLoginFragment = LoginFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.loginFragment);
        super.requestRebind();
    }
    public void setLoginStatus(@Nullable java.lang.String LoginStatus) {
        this.mLoginStatus = LoginStatus;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.loginStatus);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewVISIBLEViewGONE = 0;
        com.example.foodie.ui.fragment.LoginFragment loginFragment = mLoginFragment;
        boolean loginStatusJavaLangStringLoading = false;
        int loginStatusJavaLangStringLoginViewGONEViewVISIBLE = 0;
        java.lang.String loginStatus = mLoginStatus;
        int loginStatusJavaLangStringLoginViewVISIBLEViewGONE = 0;
        boolean loginStatusJavaLangStringLogin = false;
        int loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x6L) != 0) {



                // read loginStatus == "loading"
                loginStatusJavaLangStringLoading = (loginStatus) == ("loading");
            if((dirtyFlags & 0x6L) != 0) {
                if(loginStatusJavaLangStringLoading) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x200L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x208L) != 0) {

                // read loginStatus == "login"
                loginStatusJavaLangStringLogin = (loginStatus) == ("login");
            if((dirtyFlags & 0x200L) != 0) {
                if(loginStatusJavaLangStringLogin) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x8L) != 0) {
                if(loginStatusJavaLangStringLogin) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }

            if ((dirtyFlags & 0x200L) != 0) {

                    // read loginStatus == "login" ? View.GONE : View.VISIBLE
                    loginStatusJavaLangStringLoginViewGONEViewVISIBLE = ((loginStatusJavaLangStringLogin) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x8L) != 0) {

                    // read loginStatus == "login" ? View.VISIBLE : View.GONE
                    loginStatusJavaLangStringLoginViewVISIBLEViewGONE = ((loginStatusJavaLangStringLogin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }

        if ((dirtyFlags & 0x6L) != 0) {

                // read loginStatus == "loading" ? View.GONE : loginStatus == "login" ? View.VISIBLE : View.GONE
                loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewVISIBLEViewGONE = ((loginStatusJavaLangStringLoading) ? (android.view.View.GONE) : (loginStatusJavaLangStringLoginViewVISIBLEViewGONE));
                // read loginStatus == "loading" ? View.GONE : loginStatus == "login" ? View.GONE : View.VISIBLE
                loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewGONEViewVISIBLE = ((loginStatusJavaLangStringLoading) ? (android.view.View.GONE) : (loginStatusJavaLangStringLoginViewGONEViewVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.accountLoginLayout.setVisibility(loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewGONEViewVISIBLE);
            this.buttonLogin.setVisibility(loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewGONEViewVISIBLE);
            this.ivLogin.setVisibility(loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewGONEViewVISIBLE);
            this.passwordLoginLayout.setVisibility(loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewGONEViewVISIBLE);
            this.progressBarLogin.setVisibility(loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewVISIBLEViewGONE);
            this.tvAccountLogin.setVisibility(loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewGONEViewVISIBLE);
            this.tvLogin.setVisibility(loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewGONEViewVISIBLE);
            this.tvPasswordLogin.setVisibility(loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewGONEViewVISIBLE);
            this.tvProgressLogin.setVisibility(loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewVISIBLEViewGONE);
            this.tvSignUpClick.setVisibility(loginStatusJavaLangStringLoadingViewGONELoginStatusJavaLangStringLoginViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.buttonLogin.setOnClickListener(mCallback13);
            this.tvSignUpClick.setOnClickListener(mCallback14);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // loginFragment != null
                boolean loginFragmentJavaLangObjectNull = false;
                // loginFragment
                com.example.foodie.ui.fragment.LoginFragment loginFragment = mLoginFragment;



                loginFragmentJavaLangObjectNull = (loginFragment) != (null);
                if (loginFragmentJavaLangObjectNull) {



                    if ((editTextAccountLogin) != (null)) {


                        editTextAccountLogin.getText();
                        if ((editTextAccountLogin.getText()) != (null)) {


                            editTextAccountLogin.getText().toString();

                            if ((editTextPasswordLogin) != (null)) {


                                editTextPasswordLogin.getText();
                                if ((editTextPasswordLogin.getText()) != (null)) {


                                    editTextPasswordLogin.getText().toString();

                                    loginFragment.clickLoginButton(buttonLogin, editTextAccountLogin.getText().toString(), editTextPasswordLogin.getText().toString());
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // loginFragment != null
                boolean loginFragmentJavaLangObjectNull = false;
                // loginFragment
                com.example.foodie.ui.fragment.LoginFragment loginFragment = mLoginFragment;



                loginFragmentJavaLangObjectNull = (loginFragment) != (null);
                if (loginFragmentJavaLangObjectNull) {



                    loginFragment.clickTextView(tvSignUpClick);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginFragment
        flag 1 (0x2L): loginStatus
        flag 2 (0x3L): null
        flag 3 (0x4L): loginStatus == "loading" ? View.GONE : loginStatus == "login" ? View.VISIBLE : View.GONE
        flag 4 (0x5L): loginStatus == "loading" ? View.GONE : loginStatus == "login" ? View.VISIBLE : View.GONE
        flag 5 (0x6L): loginStatus == "login" ? View.GONE : View.VISIBLE
        flag 6 (0x7L): loginStatus == "login" ? View.GONE : View.VISIBLE
        flag 7 (0x8L): loginStatus == "login" ? View.VISIBLE : View.GONE
        flag 8 (0x9L): loginStatus == "login" ? View.VISIBLE : View.GONE
        flag 9 (0xaL): loginStatus == "loading" ? View.GONE : loginStatus == "login" ? View.GONE : View.VISIBLE
        flag 10 (0xbL): loginStatus == "loading" ? View.GONE : loginStatus == "login" ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}