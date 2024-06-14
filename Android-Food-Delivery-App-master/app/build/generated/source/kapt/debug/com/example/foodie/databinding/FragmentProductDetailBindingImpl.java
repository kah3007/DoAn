package com.example.foodie.databinding;
import com.example.foodie.R;
import com.example.foodie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductDetailBindingImpl extends FragmentProductDetailBinding implements com.example.foodie.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvDetailTitle, 9);
        sViewsWithIds.put(R.id.cardView, 10);
        sViewsWithIds.put(R.id.ivDetailFood, 11);
        sViewsWithIds.put(R.id.ivDetailStar, 12);
        sViewsWithIds.put(R.id.tvDetailStar, 13);
        sViewsWithIds.put(R.id.ivDetailTime, 14);
        sViewsWithIds.put(R.id.tvDetailTime, 15);
        sViewsWithIds.put(R.id.tvDetailCargo, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentProductDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[9]
            );
        this.buttonDetailAddCart.setTag(null);
        this.ivDetailBackButton.setTag(null);
        this.ivDetailDecrease.setTag(null);
        this.ivDetailFavoriteButton.setTag(null);
        this.ivDetailIncrease.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDetailFoodName.setTag(null);
        this.tvDetailPrice.setTag(null);
        this.tvDetailQuantity.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.example.foodie.generated.callback.OnClickListener(this, 4);
        mCallback8 = new com.example.foodie.generated.callback.OnClickListener(this, 1);
        mCallback12 = new com.example.foodie.generated.callback.OnClickListener(this, 5);
        mCallback10 = new com.example.foodie.generated.callback.OnClickListener(this, 3);
        mCallback9 = new com.example.foodie.generated.callback.OnClickListener(this, 2);
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
        if (BR.cartFoodObject == variableId) {
            setCartFoodObject((com.example.foodie.data.entity.CartFood) variable);
        }
        else if (BR.productDetailFragment == variableId) {
            setProductDetailFragment((com.example.foodie.ui.fragment.ProductDetailFragment) variable);
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
    public void setProductDetailFragment(@Nullable com.example.foodie.ui.fragment.ProductDetailFragment ProductDetailFragment) {
        this.mProductDetailFragment = ProductDetailFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.productDetailFragment);
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
        java.lang.String integerToStringCartFoodObjectFoodPriceJavaLangStringTL = null;
        com.example.foodie.data.entity.CartFood cartFoodObject = mCartFoodObject;
        java.lang.String integerToStringCartFoodObjectFoodQuantity = null;
        java.lang.String cartFoodObjectFoodName = null;
        int cartFoodObjectFoodPrice = 0;
        int cartFoodObjectFoodQuantity = 0;
        com.example.foodie.ui.fragment.ProductDetailFragment productDetailFragment = mProductDetailFragment;
        java.lang.String integerToStringCartFoodObjectFoodPrice = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (cartFoodObject != null) {
                    // read cartFoodObject.foodName
                    cartFoodObjectFoodName = cartFoodObject.getFoodName();
                    // read cartFoodObject.foodPrice
                    cartFoodObjectFoodPrice = cartFoodObject.getFoodPrice();
                    // read cartFoodObject.foodQuantity
                    cartFoodObjectFoodQuantity = cartFoodObject.getFoodQuantity();
                }


                // read Integer.toString(cartFoodObject.foodPrice)
                integerToStringCartFoodObjectFoodPrice = java.lang.Integer.toString(cartFoodObjectFoodPrice);
                // read Integer.toString(cartFoodObject.foodQuantity)
                integerToStringCartFoodObjectFoodQuantity = java.lang.Integer.toString(cartFoodObjectFoodQuantity);


                // read (Integer.toString(cartFoodObject.foodPrice)) + (" TL")
                integerToStringCartFoodObjectFoodPriceJavaLangStringTL = (integerToStringCartFoodObjectFoodPrice) + (" TL");
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.buttonDetailAddCart.setOnClickListener(mCallback12);
            this.ivDetailBackButton.setOnClickListener(mCallback8);
            this.ivDetailDecrease.setOnClickListener(mCallback10);
            this.ivDetailFavoriteButton.setOnClickListener(mCallback9);
            this.ivDetailIncrease.setOnClickListener(mCallback11);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetailFoodName, cartFoodObjectFoodName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetailPrice, integerToStringCartFoodObjectFoodPriceJavaLangStringTL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetailQuantity, integerToStringCartFoodObjectFoodQuantity);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // productDetailFragment
                com.example.foodie.ui.fragment.ProductDetailFragment productDetailFragment = mProductDetailFragment;
                // cartFoodObject
                com.example.foodie.data.entity.CartFood cartFoodObject = mCartFoodObject;
                // productDetailFragment != null
                boolean productDetailFragmentJavaLangObjectNull = false;



                productDetailFragmentJavaLangObjectNull = (productDetailFragment) != (null);
                if (productDetailFragmentJavaLangObjectNull) {




                    productDetailFragment.foodQuantityChange("Increase", cartFoodObject);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // productDetailFragment
                com.example.foodie.ui.fragment.ProductDetailFragment productDetailFragment = mProductDetailFragment;
                // productDetailFragment != null
                boolean productDetailFragmentJavaLangObjectNull = false;



                productDetailFragmentJavaLangObjectNull = (productDetailFragment) != (null);
                if (productDetailFragmentJavaLangObjectNull) {


                    productDetailFragment.goToPreviousPage();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // productDetailFragment
                com.example.foodie.ui.fragment.ProductDetailFragment productDetailFragment = mProductDetailFragment;
                // cartFoodObject
                com.example.foodie.data.entity.CartFood cartFoodObject = mCartFoodObject;
                // productDetailFragment != null
                boolean productDetailFragmentJavaLangObjectNull = false;



                productDetailFragmentJavaLangObjectNull = (productDetailFragment) != (null);
                if (productDetailFragmentJavaLangObjectNull) {



                    productDetailFragment.addCart(cartFoodObject);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // productDetailFragment
                com.example.foodie.ui.fragment.ProductDetailFragment productDetailFragment = mProductDetailFragment;
                // cartFoodObject
                com.example.foodie.data.entity.CartFood cartFoodObject = mCartFoodObject;
                // productDetailFragment != null
                boolean productDetailFragmentJavaLangObjectNull = false;



                productDetailFragmentJavaLangObjectNull = (productDetailFragment) != (null);
                if (productDetailFragmentJavaLangObjectNull) {




                    productDetailFragment.foodQuantityChange("Decrease", cartFoodObject);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // productDetailFragment
                com.example.foodie.ui.fragment.ProductDetailFragment productDetailFragment = mProductDetailFragment;
                // productDetailFragment != null
                boolean productDetailFragmentJavaLangObjectNull = false;



                productDetailFragmentJavaLangObjectNull = (productDetailFragment) != (null);
                if (productDetailFragmentJavaLangObjectNull) {


                    productDetailFragment.changeFavoriteColor();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cartFoodObject
        flag 1 (0x2L): productDetailFragment
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}