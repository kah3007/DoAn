package com.example.foodie.databinding;
import com.example.foodie.R;
import com.example.foodie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCartBindingImpl extends FragmentCartBinding implements com.example.foodie.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvCartTitle, 9);
        sViewsWithIds.put(R.id.tvCartTotalTitle, 10);
        sViewsWithIds.put(R.id.tvCartTotalCargo, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.airbnb.lottie.LottieAnimationView) bindings[7]
            , (android.widget.Button) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            );
        this.avOrderAnimation.setTag(null);
        this.buttonCartTotal.setTag(null);
        this.ivCartNoData.setTag(null);
        this.linearLayoutTotal.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvCartCard.setTag(null);
        this.tvCartNoData.setTag(null);
        this.tvCartTotal.setTag(null);
        this.tvOrder.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.example.foodie.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.totalPrice == variableId) {
            setTotalPrice((java.lang.String) variable);
        }
        else if (BR.visibilityAction == variableId) {
            setVisibilityAction((java.lang.String) variable);
        }
        else if (BR.cartCardAdapter == variableId) {
            setCartCardAdapter((com.example.foodie.ui.adapter.CartCardAdapter) variable);
        }
        else if (BR.cartFragment == variableId) {
            setCartFragment((com.example.foodie.ui.fragment.CartFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTotalPrice(@Nullable java.lang.String TotalPrice) {
        this.mTotalPrice = TotalPrice;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.totalPrice);
        super.requestRebind();
    }
    public void setVisibilityAction(@Nullable java.lang.String VisibilityAction) {
        this.mVisibilityAction = VisibilityAction;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.visibilityAction);
        super.requestRebind();
    }
    public void setCartCardAdapter(@Nullable com.example.foodie.ui.adapter.CartCardAdapter CartCardAdapter) {
        this.mCartCardAdapter = CartCardAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.cartCardAdapter);
        super.requestRebind();
    }
    public void setCartFragment(@Nullable com.example.foodie.ui.fragment.CartFragment CartFragment) {
        this.mCartFragment = CartFragment;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.cartFragment);
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
        boolean visibilityActionJavaLangStringHasCartItem = false;
        java.lang.String totalPriceJavaLangStringTL = null;
        int visibilityActionJavaLangStringHasCartItemViewVISIBLEViewGONE = 0;
        java.lang.String totalPrice = mTotalPrice;
        java.lang.String visibilityAction = mVisibilityAction;
        boolean visibilityActionJavaLangStringNoData = false;
        com.example.foodie.ui.adapter.CartCardAdapter cartCardAdapter = mCartCardAdapter;
        int visibilityActionJavaLangStringNoDataViewVISIBLEViewGONE = 0;
        com.example.foodie.ui.fragment.CartFragment cartFragment = mCartFragment;
        int visibilityActionJavaLangStringOrderTakenViewVISIBLEViewGONE = 0;
        boolean visibilityActionJavaLangStringOrderTaken = false;

        if ((dirtyFlags & 0x11L) != 0) {



                // read (totalPrice) + (" TL")
                totalPriceJavaLangStringTL = (totalPrice) + (" TL");
        }
        if ((dirtyFlags & 0x12L) != 0) {



                // read visibilityAction == "hasCartItem"
                visibilityActionJavaLangStringHasCartItem = (visibilityAction) == ("hasCartItem");
                // read visibilityAction == "noData"
                visibilityActionJavaLangStringNoData = (visibilityAction) == ("noData");
                // read visibilityAction == "orderTaken"
                visibilityActionJavaLangStringOrderTaken = (visibilityAction) == ("orderTaken");
            if((dirtyFlags & 0x12L) != 0) {
                if(visibilityActionJavaLangStringHasCartItem) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x12L) != 0) {
                if(visibilityActionJavaLangStringNoData) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x12L) != 0) {
                if(visibilityActionJavaLangStringOrderTaken) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read visibilityAction == "hasCartItem" ? View.VISIBLE : View.GONE
                visibilityActionJavaLangStringHasCartItemViewVISIBLEViewGONE = ((visibilityActionJavaLangStringHasCartItem) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read visibilityAction == "noData" ? View.VISIBLE : View.GONE
                visibilityActionJavaLangStringNoDataViewVISIBLEViewGONE = ((visibilityActionJavaLangStringNoData) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read visibilityAction == "orderTaken" ? View.VISIBLE : View.GONE
                visibilityActionJavaLangStringOrderTakenViewVISIBLEViewGONE = ((visibilityActionJavaLangStringOrderTaken) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.avOrderAnimation.setVisibility(visibilityActionJavaLangStringOrderTakenViewVISIBLEViewGONE);
            this.ivCartNoData.setVisibility(visibilityActionJavaLangStringNoDataViewVISIBLEViewGONE);
            this.linearLayoutTotal.setVisibility(visibilityActionJavaLangStringHasCartItemViewVISIBLEViewGONE);
            this.rvCartCard.setVisibility(visibilityActionJavaLangStringHasCartItemViewVISIBLEViewGONE);
            this.tvCartNoData.setVisibility(visibilityActionJavaLangStringNoDataViewVISIBLEViewGONE);
            this.tvOrder.setVisibility(visibilityActionJavaLangStringOrderTakenViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.buttonCartTotal.setOnClickListener(mCallback15);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.rvCartCard.setAdapter(cartCardAdapter);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCartTotal, totalPriceJavaLangStringTL);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // cartFragment
        com.example.foodie.ui.fragment.CartFragment cartFragment = mCartFragment;
        // cartFragment != null
        boolean cartFragmentJavaLangObjectNull = false;



        cartFragmentJavaLangObjectNull = (cartFragment) != (null);
        if (cartFragmentJavaLangObjectNull) {


            cartFragment.confirmCartTotal();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): totalPrice
        flag 1 (0x2L): visibilityAction
        flag 2 (0x3L): cartCardAdapter
        flag 3 (0x4L): cartFragment
        flag 4 (0x5L): null
        flag 5 (0x6L): visibilityAction == "hasCartItem" ? View.VISIBLE : View.GONE
        flag 6 (0x7L): visibilityAction == "hasCartItem" ? View.VISIBLE : View.GONE
        flag 7 (0x8L): visibilityAction == "noData" ? View.VISIBLE : View.GONE
        flag 8 (0x9L): visibilityAction == "noData" ? View.VISIBLE : View.GONE
        flag 9 (0xaL): visibilityAction == "orderTaken" ? View.VISIBLE : View.GONE
        flag 10 (0xbL): visibilityAction == "orderTaken" ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}