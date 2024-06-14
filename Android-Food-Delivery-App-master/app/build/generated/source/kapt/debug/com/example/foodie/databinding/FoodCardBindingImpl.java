package com.example.foodie.databinding;
import com.example.foodie.R;
import com.example.foodie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FoodCardBindingImpl extends FoodCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.foodCard, 3);
        sViewsWithIds.put(R.id.tvDiscount, 4);
        sViewsWithIds.put(R.id.favoriteCard, 5);
        sViewsWithIds.put(R.id.ivFavoriteButton, 6);
        sViewsWithIds.put(R.id.ivPrice, 7);
        sViewsWithIds.put(R.id.ivCargo, 8);
        sViewsWithIds.put(R.id.tvCargo, 9);
        sViewsWithIds.put(R.id.ivTime, 10);
        sViewsWithIds.put(R.id.tvTime, 11);
        sViewsWithIds.put(R.id.imageCard, 12);
        sViewsWithIds.put(R.id.ivFood, 13);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FoodCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FoodCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvFoodName.setTag(null);
        this.tvFoodPrice.setTag(null);
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
        if (BR.foodObject == variableId) {
            setFoodObject((com.example.foodie.data.entity.Food) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFoodObject(@Nullable com.example.foodie.data.entity.Food FoodObject) {
        this.mFoodObject = FoodObject;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.foodObject);
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
        int foodObjectFoodPrice = 0;
        java.lang.String foodObjectFoodName = null;
        com.example.foodie.data.entity.Food foodObject = mFoodObject;
        java.lang.String foodObjectFoodPriceJavaLangStringTL = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (foodObject != null) {
                    // read foodObject.foodPrice
                    foodObjectFoodPrice = foodObject.getFoodPrice();
                    // read foodObject.foodName
                    foodObjectFoodName = foodObject.getFoodName();
                }


                // read (foodObject.foodPrice) + (" TL")
                foodObjectFoodPriceJavaLangStringTL = (foodObjectFoodPrice) + (" TL");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFoodName, foodObjectFoodName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFoodPrice, foodObjectFoodPriceJavaLangStringTL);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): foodObject
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}