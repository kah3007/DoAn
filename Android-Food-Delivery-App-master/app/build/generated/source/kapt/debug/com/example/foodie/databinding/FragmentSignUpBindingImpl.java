package com.example.foodie.databinding;
import com.example.foodie.R;
import com.example.foodie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSignUpBindingImpl extends FragmentSignUpBinding implements com.example.foodie.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivEmailSignUp, 13);
        sViewsWithIds.put(R.id.editTextEmailSignUp, 14);
        sViewsWithIds.put(R.id.ivUsernameSignUp, 15);
        sViewsWithIds.put(R.id.editTextUsernameSignUp, 16);
        sViewsWithIds.put(R.id.ivPasswordSignUp, 17);
        sViewsWithIds.put(R.id.editTextPasswordSignUp, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSignUpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentSignUpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[9]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[18]
            , (android.widget.EditText) bindings[16]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ProgressBar) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[6]
            );
        this.buttonSignUp.setTag(null);
        this.emailSignUpLayout.setTag(null);
        this.ivSignUp.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.passwordSignUpLayout.setTag(null);
        this.progressBarSignUp.setTag(null);
        this.tvEmailSignUp.setTag(null);
        this.tvLoginClick.setTag(null);
        this.tvPasswordSignUp.setTag(null);
        this.tvProgressSignUp.setTag(null);
        this.tvSignUp.setTag(null);
        this.tvUsernameSignUp.setTag(null);
        this.usernameSignUpLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.foodie.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.example.foodie.generated.callback.OnClickListener(this, 2);
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
        if (BR.isSignUp == variableId) {
            setIsSignUp((java.lang.Boolean) variable);
        }
        else if (BR.signUpFragment == variableId) {
            setSignUpFragment((com.example.foodie.ui.fragment.SignUpFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsSignUp(@Nullable java.lang.Boolean IsSignUp) {
        this.mIsSignUp = IsSignUp;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isSignUp);
        super.requestRebind();
    }
    public void setSignUpFragment(@Nullable com.example.foodie.ui.fragment.SignUpFragment SignUpFragment) {
        this.mSignUpFragment = SignUpFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.signUpFragment);
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
        boolean androidxDatabindingViewDataBindingSafeUnboxIsSignUp = false;
        int isSignUpViewVISIBLEViewGONE = 0;
        int isSignUpViewGONEViewVISIBLE = 0;
        java.lang.Boolean isSignUp = mIsSignUp;
        com.example.foodie.ui.fragment.SignUpFragment signUpFragment = mSignUpFragment;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isSignUp)
                androidxDatabindingViewDataBindingSafeUnboxIsSignUp = androidx.databinding.ViewDataBinding.safeUnbox(isSignUp);
            if((dirtyFlags & 0x5L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsSignUp) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isSignUp) ? View.VISIBLE : View.GONE
                isSignUpViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsSignUp) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isSignUp) ? View.GONE : View.VISIBLE
                isSignUpViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxIsSignUp) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.buttonSignUp.setOnClickListener(mCallback6);
            this.tvLoginClick.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.buttonSignUp.setVisibility(isSignUpViewGONEViewVISIBLE);
            this.emailSignUpLayout.setVisibility(isSignUpViewGONEViewVISIBLE);
            this.ivSignUp.setVisibility(isSignUpViewGONEViewVISIBLE);
            this.passwordSignUpLayout.setVisibility(isSignUpViewGONEViewVISIBLE);
            this.progressBarSignUp.setVisibility(isSignUpViewVISIBLEViewGONE);
            this.tvEmailSignUp.setVisibility(isSignUpViewGONEViewVISIBLE);
            this.tvLoginClick.setVisibility(isSignUpViewGONEViewVISIBLE);
            this.tvPasswordSignUp.setVisibility(isSignUpViewGONEViewVISIBLE);
            this.tvProgressSignUp.setVisibility(isSignUpViewVISIBLEViewGONE);
            this.tvSignUp.setVisibility(isSignUpViewGONEViewVISIBLE);
            this.tvUsernameSignUp.setVisibility(isSignUpViewGONEViewVISIBLE);
            this.usernameSignUpLayout.setVisibility(isSignUpViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // signUpFragment != null
                boolean signUpFragmentJavaLangObjectNull = false;
                // signUpFragment
                com.example.foodie.ui.fragment.SignUpFragment signUpFragment = mSignUpFragment;



                signUpFragmentJavaLangObjectNull = (signUpFragment) != (null);
                if (signUpFragmentJavaLangObjectNull) {



                    if ((editTextEmailSignUp) != (null)) {


                        editTextEmailSignUp.getText();
                        if ((editTextEmailSignUp.getText()) != (null)) {


                            editTextEmailSignUp.getText().toString();

                            if ((editTextUsernameSignUp) != (null)) {


                                editTextUsernameSignUp.getText();
                                if ((editTextUsernameSignUp.getText()) != (null)) {


                                    editTextUsernameSignUp.getText().toString();

                                    if ((editTextPasswordSignUp) != (null)) {


                                        editTextPasswordSignUp.getText();
                                        if ((editTextPasswordSignUp.getText()) != (null)) {


                                            editTextPasswordSignUp.getText().toString();

                                            signUpFragment.clickButton(buttonSignUp, editTextEmailSignUp.getText().toString(), editTextUsernameSignUp.getText().toString(), editTextPasswordSignUp.getText().toString());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // signUpFragment != null
                boolean signUpFragmentJavaLangObjectNull = false;
                // signUpFragment
                com.example.foodie.ui.fragment.SignUpFragment signUpFragment = mSignUpFragment;



                signUpFragmentJavaLangObjectNull = (signUpFragment) != (null);
                if (signUpFragmentJavaLangObjectNull) {



                    signUpFragment.clickTextView(tvLoginClick);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isSignUp
        flag 1 (0x2L): signUpFragment
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isSignUp) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isSignUp) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isSignUp) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isSignUp) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}