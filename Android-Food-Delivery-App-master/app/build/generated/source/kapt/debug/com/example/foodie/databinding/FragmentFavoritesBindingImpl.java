package com.example.foodie.databinding;
import com.example.foodie.R;
import com.example.foodie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFavoritesBindingImpl extends FragmentFavoritesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvFavoriteTitle, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFavoritesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentFavoritesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.ivFavoriteNoData.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvFavoriteCard.setTag(null);
        this.tvFavoriteNoData.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.favoriteCardAdapter == variableId) {
            setFavoriteCardAdapter((com.example.foodie.ui.adapter.FavoriteCardAdapter) variable);
        }
        else if (BR.hasFavoriteItem == variableId) {
            setHasFavoriteItem((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFavoriteCardAdapter(@Nullable com.example.foodie.ui.adapter.FavoriteCardAdapter FavoriteCardAdapter) {
        this.mFavoriteCardAdapter = FavoriteCardAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.favoriteCardAdapter);
        super.requestRebind();
    }
    public void setHasFavoriteItem(@Nullable java.lang.Boolean HasFavoriteItem) {
        this.mHasFavoriteItem = HasFavoriteItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.hasFavoriteItem);
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
        int hasFavoriteItemViewGONEViewVISIBLE = 0;
        int hasFavoriteItemViewVISIBLEViewGONE = 0;
        com.example.foodie.ui.adapter.FavoriteCardAdapter favoriteCardAdapter = mFavoriteCardAdapter;
        java.lang.Boolean hasFavoriteItem = mHasFavoriteItem;
        boolean androidxDatabindingViewDataBindingSafeUnboxHasFavoriteItem = false;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(hasFavoriteItem)
                androidxDatabindingViewDataBindingSafeUnboxHasFavoriteItem = androidx.databinding.ViewDataBinding.safeUnbox(hasFavoriteItem);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxHasFavoriteItem) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(hasFavoriteItem) ? View.GONE : View.VISIBLE
                hasFavoriteItemViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxHasFavoriteItem) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(hasFavoriteItem) ? View.VISIBLE : View.GONE
                hasFavoriteItemViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxHasFavoriteItem) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.ivFavoriteNoData.setVisibility(hasFavoriteItemViewGONEViewVISIBLE);
            this.rvFavoriteCard.setVisibility(hasFavoriteItemViewVISIBLEViewGONE);
            this.tvFavoriteNoData.setVisibility(hasFavoriteItemViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.rvFavoriteCard.setAdapter(favoriteCardAdapter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): favoriteCardAdapter
        flag 1 (0x2L): hasFavoriteItem
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(hasFavoriteItem) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(hasFavoriteItem) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(hasFavoriteItem) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(hasFavoriteItem) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}