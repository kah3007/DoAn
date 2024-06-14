package com.example.foodie.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J.\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cJ\u001e\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001fJ&\u0010\'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006*"}, d2 = {"Lcom/example/foodie/ui/viewmodel/ProductDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "foodRepo", "Lcom/example/foodie/data/repository/FoodRepository;", "favRepo", "Lcom/example/foodie/data/repository/FavoriteRepository;", "(Lcom/example/foodie/data/repository/FoodRepository;Lcom/example/foodie/data/repository/FavoriteRepository;)V", "_addCartStatus", "Landroidx/lifecycle/MutableLiveData;", "", "_cartFoodObject", "Lcom/example/foodie/data/entity/CartFood;", "addCartStatus", "getAddCartStatus", "()Landroidx/lifecycle/MutableLiveData;", "cartFoodObject", "getCartFoodObject", "getFavRepo", "()Lcom/example/foodie/data/repository/FavoriteRepository;", "setFavRepo", "(Lcom/example/foodie/data/repository/FavoriteRepository;)V", "getFoodRepo", "()Lcom/example/foodie/data/repository/FoodRepository;", "setFoodRepo", "(Lcom/example/foodie/data/repository/FoodRepository;)V", "addToCart", "", "foodName", "", "foodImageName", "foodPrice", "", "foodQuantity", "username", "foodQuantityChange", "action", "tempCartFoodObject", "removeFavorite", "foodId", "setFavorite", "updateCart", "updatedCartFood", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProductDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.repository.FoodRepository foodRepo;
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.repository.FavoriteRepository favRepo;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.foodie.data.entity.CartFood> _cartFoodObject = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.foodie.data.entity.CartFood> cartFoodObject = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _addCartStatus = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> addCartStatus = null;
    
    @javax.inject.Inject
    public ProductDetailViewModel(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.repository.FoodRepository foodRepo, @org.jetbrains.annotations.NotNull
    com.example.foodie.data.repository.FavoriteRepository favRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.repository.FoodRepository getFoodRepo() {
        return null;
    }
    
    public final void setFoodRepo(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.repository.FoodRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.repository.FavoriteRepository getFavRepo() {
        return null;
    }
    
    public final void setFavRepo(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.repository.FavoriteRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.foodie.data.entity.CartFood> getCartFoodObject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAddCartStatus() {
        return null;
    }
    
    public final void setFavorite(int foodId, @org.jetbrains.annotations.NotNull
    java.lang.String foodName, @org.jetbrains.annotations.NotNull
    java.lang.String foodImageName, int foodPrice) {
    }
    
    public final void removeFavorite(int foodId) {
    }
    
    public final void foodQuantityChange(@org.jetbrains.annotations.NotNull
    java.lang.String action, @org.jetbrains.annotations.NotNull
    com.example.foodie.data.entity.CartFood tempCartFoodObject, int foodPrice) {
    }
    
    public final void updateCart(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.entity.CartFood updatedCartFood) {
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull
    java.lang.String foodName, @org.jetbrains.annotations.NotNull
    java.lang.String foodImageName, int foodPrice, int foodQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
}