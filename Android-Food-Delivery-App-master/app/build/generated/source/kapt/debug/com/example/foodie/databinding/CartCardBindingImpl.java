package com.example.foodie.databinding;
import com.example.foodie.R;
import com.example.foodie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CartCardBindingImpl extends CartCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardViewImage, 4);
        sViewsWithIds.put(R.id.ivCartFood, 5);
        sViewsWithIds.put(R.id.ivCartDelete, 6);
        sViewsWithIds.put(R.id.tvCartCargo, 7);
        sViewsWithIds.put(R.id.ivDecrease, 8);
        sViewsWithIds.put(R.id.ivIncrease, 9);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CartCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private CartCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCartFoodName.setTag(null);
        this.tvCartFoodPrice.setTag(null);
        this.tvQuantity.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.cartFoodObject == variableId) {
            setCartFoodObject((com.example.foodie.data.entity.CartFood) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCartFoodObject(@Nullable com.example.foodie.data.entity.CartFood CartFoodObject) {
        this.mCartFoodObject = CartFoodObject;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.cartFoodObject);
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
        java.lang.String cartFoodObjectFoodName = null;
        int cartFoodObjectFoodPrice = 0;
        com.example.foodie.data.entity.CartFood cartFoodObject = mCartFoodObject;
        int cartFoodObjectFoodQuantity = 0;
        java.lang.String cartFoodObjectFoodPriceJavaLangStringTL = null;
        java.lang.String integerToStringCartFoodObjectFoodQuantity = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (cartFoodObject != null) {
                    // read cartFoodObject.foodName
                    cartFoodObjectFoodName = cartFoodObject.getFoodName();
                    // read cartFoodObject.foodPrice
                    cartFoodObjectFoodPrice = cartFoodObject.getFoodPrice();
                    // read cartFoodObject.foodQuantity
                    cartFoodObjectFoodQuantity = cartFoodObject.getFoodQuantity();
                }


                // read (cartFoodObject.foodPrice) + (" TL")
                cartFoodObjectFoodPriceJavaLangStringTL = (cartFoodObjectFoodPrice) + (" TL");
                // read Integer.toString(cartFoodObject.foodQuantity)
                integerToStringCartFoodObjectFoodQuantity = java.lang.Integer.toString(cartFoodObjectFoodQuantity);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCartFoodName, cartFoodObjectFoodName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCartFoodPrice, cartFoodObjectFoodPriceJavaLangStringTL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvQuantity, integerToStringCartFoodObjectFoodQuantity);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cartFoodObject
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}