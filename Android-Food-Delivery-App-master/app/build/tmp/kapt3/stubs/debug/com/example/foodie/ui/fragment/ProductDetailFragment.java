package com.example.foodie.ui.fragment;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0016J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/foodie/ui/fragment/ProductDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/foodie/databinding/FragmentProductDetailBinding;", "bundle", "Lcom/example/foodie/ui/fragment/ProductDetailFragmentArgs;", "getBundle", "()Lcom/example/foodie/ui/fragment/ProductDetailFragmentArgs;", "bundle$delegate", "Landroidx/navigation/NavArgsLazy;", "isFavorite", "", "loginPref", "Lcom/example/foodie/datastore/LoginPref;", "getLoginPref", "()Lcom/example/foodie/datastore/LoginPref;", "setLoginPref", "(Lcom/example/foodie/datastore/LoginPref;)V", "viewModel", "Lcom/example/foodie/ui/viewmodel/ProductDetailViewModel;", "addCart", "", "cartFoodObject", "Lcom/example/foodie/data/entity/CartFood;", "changeFavoriteColor", "foodQuantityChange", "action", "", "goToPreviousPage", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
public final class ProductDetailFragment extends androidx.fragment.app.Fragment {
    private com.example.foodie.databinding.FragmentProductDetailBinding binding;
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavArgsLazy bundle$delegate = null;
    private boolean isFavorite = false;
    private com.example.foodie.ui.viewmodel.ProductDetailViewModel viewModel;
    @javax.inject.Inject
    public com.example.foodie.datastore.LoginPref loginPref;
    
    public ProductDetailFragment() {
        super();
    }
    
    private final com.example.foodie.ui.fragment.ProductDetailFragmentArgs getBundle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.datastore.LoginPref getLoginPref() {
        return null;
    }
    
    public final void setLoginPref(@org.jetbrains.annotations.NotNull
    com.example.foodie.datastore.LoginPref p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void goToPreviousPage() {
    }
    
    public final void changeFavoriteColor() {
    }
    
    public final void foodQuantityChange(@org.jetbrains.annotations.NotNull
    java.lang.String action, @org.jetbrains.annotations.NotNull
    com.example.foodie.data.entity.CartFood cartFoodObject) {
    }
    
    public final void addCart(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.entity.CartFood cartFoodObject) {
    }
}