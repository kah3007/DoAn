package com.example.foodie.databinding;
import com.example.foodie.R;
import com.example.foodie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccountDetailBindingImpl extends FragmentAccountDetailBinding implements com.example.foodie.generated.callback.OnTextChanged.Listener, com.example.foodie.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback4;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAccountDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentAccountDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (android.widget.ImageView) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.buttonUpdateAccount.setTag(null);
        this.editTextAgainNew.setTag(null);
        this.editTextCurrent.setTag(null);
        this.editTextNew.setTag(null);
        this.ivAccountBack.setTag(null);
        this.layoutAgainNew.setTag(null);
        this.layoutCurrent.setTag(null);
        this.layoutNew.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAcoountDetailTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.foodie.generated.callback.OnTextChanged(this, 4);
        mCallback2 = new com.example.foodie.generated.callback.OnTextChanged(this, 2);
        mCallback5 = new com.example.foodie.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.example.foodie.generated.callback.OnTextChanged(this, 3);
        mCallback1 = new com.example.foodie.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.passwordEyeDrawable == variableId) {
            setPasswordEyeDrawable((java.lang.Integer) variable);
        }
        else if (BR.accountDetailFragment == variableId) {
            setAccountDetailFragment((com.example.foodie.ui.fragment.AccountDetailFragment) variable);
        }
        else if (BR.isErrorEnabled == variableId) {
            setIsErrorEnabled((java.lang.Boolean) variable);
        }
        else if (BR.accountDetailTitle == variableId) {
            setAccountDetailTitle((java.lang.String) variable);
        }
        else if (BR.isPassword == variableId) {
            setIsPassword((java.lang.Boolean) variable);
        }
        else if (BR.currentText == variableId) {
            setCurrentText((java.lang.String) variable);
        }
        else if (BR.hintText == variableId) {
            setHintText((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPasswordEyeDrawable(@Nullable java.lang.Integer PasswordEyeDrawable) {
        this.mPasswordEyeDrawable = PasswordEyeDrawable;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.passwordEyeDrawable);
        super.requestRebind();
    }
    public void setAccountDetailFragment(@Nullable com.example.foodie.ui.fragment.AccountDetailFragment AccountDetailFragment) {
        this.mAccountDetailFragment = AccountDetailFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.accountDetailFragment);
        super.requestRebind();
    }
    public void setIsErrorEnabled(@Nullable java.lang.Boolean IsErrorEnabled) {
        this.mIsErrorEnabled = IsErrorEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isErrorEnabled);
        super.requestRebind();
    }
    public void setAccountDetailTitle(@Nullable java.lang.String AccountDetailTitle) {
        this.mAccountDetailTitle = AccountDetailTitle;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.accountDetailTitle);
        super.requestRebind();
    }
    public void setIsPassword(@Nullable java.lang.Boolean IsPassword) {
        this.mIsPassword = IsPassword;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.isPassword);
        super.requestRebind();
    }
    public void setCurrentText(@Nullable java.lang.String CurrentText) {
        this.mCurrentText = CurrentText;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.currentText);
        super.requestRebind();
    }
    public void setHintText(@Nullable java.lang.String HintText) {
        this.mHintText = HintText;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.hintText);
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
        java.lang.Integer passwordEyeDrawable = mPasswordEyeDrawable;
        java.lang.String javaLangStringMevcutHintText = null;
        com.example.foodie.ui.fragment.AccountDetailFragment accountDetailFragment = mAccountDetailFragment;
        java.lang.String javaLangStringTekrarYeniHintText = null;
        java.lang.Boolean isErrorEnabled = mIsErrorEnabled;
        java.lang.String accountDetailTitle = mAccountDetailTitle;
        java.lang.Boolean isPassword = mIsPassword;
        int isPasswordTextInputLayoutENDICONPASSWORDTOGGLETextInputLayoutENDICONNONE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxPasswordEyeDrawable = 0;
        java.lang.String javaLangStringYeniHintText = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsPassword = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsErrorEnabled = false;
        java.lang.String currentText = mCurrentText;
        int isPasswordInputTypeTYPECLASSTEXTInputTypeTYPETEXTVARIATIONPASSWORDInputTypeTYPECLASSTEXT = 0;
        java.lang.String hintText = mHintText;

        if ((dirtyFlags & 0x81L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(passwordEyeDrawable)
                androidxDatabindingViewDataBindingSafeUnboxPasswordEyeDrawable = androidx.databinding.ViewDataBinding.safeUnbox(passwordEyeDrawable);
        }
        if ((dirtyFlags & 0x84L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isErrorEnabled)
                androidxDatabindingViewDataBindingSafeUnboxIsErrorEnabled = androidx.databinding.ViewDataBinding.safeUnbox(isErrorEnabled);
        }
        if ((dirtyFlags & 0x88L) != 0) {
        }
        if ((dirtyFlags & 0x90L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isPassword)
                androidxDatabindingViewDataBindingSafeUnboxIsPassword = androidx.databinding.ViewDataBinding.safeUnbox(isPassword);
            if((dirtyFlags & 0x90L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsPassword) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isPassword) ? TextInputLayout.END_ICON_PASSWORD_TOGGLE : TextInputLayout.END_ICON_NONE
                isPasswordTextInputLayoutENDICONPASSWORDTOGGLETextInputLayoutENDICONNONE = ((androidxDatabindingViewDataBindingSafeUnboxIsPassword) ? (com.google.android.material.textfield.TextInputLayout.END_ICON_PASSWORD_TOGGLE) : (com.google.android.material.textfield.TextInputLayout.END_ICON_NONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isPassword) ? (InputType.TYPE_CLASS_TEXT) | (InputType.TYPE_TEXT_VARIATION_PASSWORD) : InputType.TYPE_CLASS_TEXT
                isPasswordInputTypeTYPECLASSTEXTInputTypeTYPETEXTVARIATIONPASSWORDInputTypeTYPECLASSTEXT = ((androidxDatabindingViewDataBindingSafeUnboxIsPassword) ? ((android.text.InputType.TYPE_CLASS_TEXT) | (android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD)) : (android.text.InputType.TYPE_CLASS_TEXT));
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        if ((dirtyFlags & 0xc0L) != 0) {



                // read ("Mevcut ") + (hintText)
                javaLangStringMevcutHintText = ("Mevcut ") + (hintText);
                // read ("Tekrar Yeni ") + (hintText)
                javaLangStringTekrarYeniHintText = ("Tekrar Yeni ") + (hintText);
                // read ("Yeni ") + (hintText)
                javaLangStringYeniHintText = ("Yeni ") + (hintText);
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.buttonUpdateAccount.setOnClickListener(mCallback5);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextAgainNew, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback4, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextCurrent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback2, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextNew, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback3, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            this.ivAccountBack.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.editTextAgainNew.setInputType(isPasswordInputTypeTYPECLASSTEXTInputTypeTYPETEXTVARIATIONPASSWORDInputTypeTYPECLASSTEXT);
                this.editTextCurrent.setInputType(isPasswordInputTypeTYPECLASSTEXTInputTypeTYPETEXTVARIATIONPASSWORDInputTypeTYPECLASSTEXT);
                this.editTextNew.setInputType(isPasswordInputTypeTYPECLASSTEXTInputTypeTYPETEXTVARIATIONPASSWORDInputTypeTYPECLASSTEXT);
            }
            // api target 1

            this.layoutAgainNew.setEndIconMode(isPasswordTextInputLayoutENDICONPASSWORDTOGGLETextInputLayoutENDICONNONE);
            this.layoutCurrent.setEnabled(androidxDatabindingViewDataBindingSafeUnboxIsPassword);
            this.layoutCurrent.setEndIconMode(isPasswordTextInputLayoutENDICONPASSWORDTOGGLETextInputLayoutENDICONNONE);
            this.layoutNew.setEndIconMode(isPasswordTextInputLayoutENDICONPASSWORDTOGGLETextInputLayoutENDICONNONE);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextCurrent, currentText);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.layoutAgainNew.setHint(javaLangStringTekrarYeniHintText);
            this.layoutCurrent.setHint(javaLangStringMevcutHintText);
            this.layoutNew.setHint(javaLangStringYeniHintText);
        }
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 1

            this.layoutAgainNew.setEndIconDrawable(androidxDatabindingViewDataBindingSafeUnboxPasswordEyeDrawable);
            this.layoutCurrent.setEndIconDrawable(androidxDatabindingViewDataBindingSafeUnboxPasswordEyeDrawable);
            this.layoutNew.setEndIconDrawable(androidxDatabindingViewDataBindingSafeUnboxPasswordEyeDrawable);
        }
        if ((dirtyFlags & 0x84L) != 0) {
            // api target 1

            this.layoutAgainNew.setErrorEnabled(androidxDatabindingViewDataBindingSafeUnboxIsErrorEnabled);
            this.layoutCurrent.setErrorEnabled(androidxDatabindingViewDataBindingSafeUnboxIsErrorEnabled);
            this.layoutNew.setErrorEnabled(androidxDatabindingViewDataBindingSafeUnboxIsErrorEnabled);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAcoountDetailTitle, accountDetailTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // accountDetailFragment
                com.example.foodie.ui.fragment.AccountDetailFragment accountDetailFragment = mAccountDetailFragment;
                // accountDetailFragment != null
                boolean accountDetailFragmentJavaLangObjectNull = false;



                accountDetailFragmentJavaLangObjectNull = (accountDetailFragment) != (null);
                if (accountDetailFragmentJavaLangObjectNull) {


                    accountDetailFragment.errorDisable();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // accountDetailFragment
                com.example.foodie.ui.fragment.AccountDetailFragment accountDetailFragment = mAccountDetailFragment;
                // accountDetailFragment != null
                boolean accountDetailFragmentJavaLangObjectNull = false;



                accountDetailFragmentJavaLangObjectNull = (accountDetailFragment) != (null);
                if (accountDetailFragmentJavaLangObjectNull) {


                    accountDetailFragment.errorDisable();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // accountDetailFragment
                com.example.foodie.ui.fragment.AccountDetailFragment accountDetailFragment = mAccountDetailFragment;
                // accountDetailFragment != null
                boolean accountDetailFragmentJavaLangObjectNull = false;



                accountDetailFragmentJavaLangObjectNull = (accountDetailFragment) != (null);
                if (accountDetailFragmentJavaLangObjectNull) {


                    accountDetailFragment.errorDisable();
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // accountDetailFragment
                com.example.foodie.ui.fragment.AccountDetailFragment accountDetailFragment = mAccountDetailFragment;
                // accountDetailFragment != null
                boolean accountDetailFragmentJavaLangObjectNull = false;



                accountDetailFragmentJavaLangObjectNull = (accountDetailFragment) != (null);
                if (accountDetailFragmentJavaLangObjectNull) {


                    if ((editTextCurrent) != (null)) {


                        editTextCurrent.getText();
                        if ((editTextCurrent.getText()) != (null)) {


                            editTextCurrent.getText().toString();

                            if ((editTextNew) != (null)) {


                                editTextNew.getText();
                                if ((editTextNew.getText()) != (null)) {


                                    editTextNew.getText().toString();

                                    if ((editTextAgainNew) != (null)) {


                                        editTextAgainNew.getText();
                                        if ((editTextAgainNew.getText()) != (null)) {


                                            editTextAgainNew.getText().toString();

                                            accountDetailFragment.updateAccount(editTextCurrent.getText().toString(), editTextNew.getText().toString(), editTextAgainNew.getText().toString());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // accountDetailFragment
                com.example.foodie.ui.fragment.AccountDetailFragment accountDetailFragment = mAccountDetailFragment;
                // accountDetailFragment != null
                boolean accountDetailFragmentJavaLangObjectNull = false;



                accountDetailFragmentJavaLangObjectNull = (accountDetailFragment) != (null);
                if (accountDetailFragmentJavaLangObjectNull) {


                    accountDetailFragment.goToPreviousPage();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): passwordEyeDrawable
        flag 1 (0x2L): accountDetailFragment
        flag 2 (0x3L): isErrorEnabled
        flag 3 (0x4L): accountDetailTitle
        flag 4 (0x5L): isPassword
        flag 5 (0x6L): currentText
        flag 6 (0x7L): hintText
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(isPassword) ? TextInputLayout.END_ICON_PASSWORD_TOGGLE : TextInputLayout.END_ICON_NONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(isPassword) ? TextInputLayout.END_ICON_PASSWORD_TOGGLE : TextInputLayout.END_ICON_NONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(isPassword) ? (InputType.TYPE_CLASS_TEXT) | (InputType.TYPE_TEXT_VARIATION_PASSWORD) : InputType.TYPE_CLASS_TEXT
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(isPassword) ? (InputType.TYPE_CLASS_TEXT) | (InputType.TYPE_TEXT_VARIATION_PASSWORD) : InputType.TYPE_CLASS_TEXT
    flag mapping end*/
    //end
}