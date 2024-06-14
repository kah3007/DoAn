package com.example.foodie.databinding;
import com.example.foodie.R;
import com.example.foodie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FavoriteCardBindingImpl extends FavoriteCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.favoriteImageCard, 3);
        sViewsWithIds.put(R.id.ivFavoriteFood, 4);
        sViewsWithIds.put(R.id.tvFavoriteDiscount, 5);
        sViewsWithIds.put(R.id.favoriteButtonCar, 6);
        sViewsWithIds.put(R.id.ivFavoriteButton, 7);
        sViewsWithIds.put(R.id.buttonFavoritesCart, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FavoriteCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FavoriteCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvFavoriteFoodName.setTag(null);
        this.tvFavoriteFoodPrice.setTag(null);
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
        if (BR.favoriteFoodObject == variableId) {
            setFavoriteFoodObject((com.example.foodie.data.entity.FavoriteFood) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFavoriteFoodObject(@Nullable com.example.foodie.data.entity.FavoriteFood FavoriteFoodObject) {
        this.mFavoriteFoodObject = FavoriteFoodObject;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.favoriteFoodObject);
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
        java.lang.String favoriteFoodObjectFoodPriceJavaLangStringTL = null;
        int favoriteFoodObjectFoodPrice = 0;
        com.example.foodie.data.entity.FavoriteFood favoriteFoodObject = mFavoriteFoodObject;
        java.lang.String favoriteFoodObjectFoodName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (favoriteFoodObject != null) {
                    // read favoriteFoodObject.foodPrice
                    favoriteFoodObjectFoodPrice = favoriteFoodObject.getFoodPrice();
                    // read favoriteFoodObject.foodName
                    favoriteFoodObjectFoodName = favoriteFoodObject.getFoodName();
                }


                // read (favoriteFoodObject.foodPrice) + (" TL")
                favoriteFoodObjectFoodPriceJavaLangStringTL = (favoriteFoodObjectFoodPrice) + (" TL");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavoriteFoodName, favoriteFoodObjectFoodName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFavoriteFoodPrice, favoriteFoodObjectFoodPriceJavaLangStringTL);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): favoriteFoodObject
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}