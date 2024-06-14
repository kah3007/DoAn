package com.example.foodie.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J.\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dJ\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020 J\u0006\u0010%\u001a\u00020\u001bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/example/foodie/ui/viewmodel/FavoritesViewModel;", "Landroidx/lifecycle/ViewModel;", "foodRepo", "Lcom/example/foodie/data/repository/FoodRepository;", "favRepo", "Lcom/example/foodie/data/repository/FavoriteRepository;", "(Lcom/example/foodie/data/repository/FoodRepository;Lcom/example/foodie/data/repository/FavoriteRepository;)V", "_addCartStatus", "Landroidx/lifecycle/MutableLiveData;", "", "_favoriteFoodCardList", "", "Lcom/example/foodie/data/entity/FavoriteFood;", "addCartStatus", "getAddCartStatus", "()Landroidx/lifecycle/MutableLiveData;", "getFavRepo", "()Lcom/example/foodie/data/repository/FavoriteRepository;", "setFavRepo", "(Lcom/example/foodie/data/repository/FavoriteRepository;)V", "favoriteFoodCardList", "getFavoriteFoodCardList", "getFoodRepo", "()Lcom/example/foodie/data/repository/FoodRepository;", "setFoodRepo", "(Lcom/example/foodie/data/repository/FoodRepository;)V", "addToCart", "", "foodName", "", "foodImageName", "foodPrice", "", "foodQuantity", "username", "deleteFavoriteFood", "foodId", "loadFavoriteFood", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class FavoritesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.repository.FoodRepository foodRepo;
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.repository.FavoriteRepository favRepo;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodie.data.entity.FavoriteFood>> _favoriteFoodCardList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodie.data.entity.FavoriteFood>> favoriteFoodCardList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _addCartStatus = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> addCartStatus = null;
    
    @javax.inject.Inject
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull
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
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodie.data.entity.FavoriteFood>> getFavoriteFoodCardList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAddCartStatus() {
        return null;
    }
    
    public final void loadFavoriteFood() {
    }
    
    public final void deleteFavoriteFood(int foodId) {
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull
    java.lang.String foodName, @org.jetbrains.annotations.NotNull
    java.lang.String foodImageName, int foodPrice, int foodQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
}