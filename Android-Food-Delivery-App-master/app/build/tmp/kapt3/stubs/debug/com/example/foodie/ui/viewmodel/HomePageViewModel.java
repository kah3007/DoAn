package com.example.foodie.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\nJ&\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001dR&\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R?\u0010\u0011\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tj\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b`\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006$"}, d2 = {"Lcom/example/foodie/ui/viewmodel/HomePageViewModel;", "Landroidx/lifecycle/ViewModel;", "foodRepo", "Lcom/example/foodie/data/repository/FoodRepository;", "favRepo", "Lcom/example/foodie/data/repository/FavoriteRepository;", "(Lcom/example/foodie/data/repository/FoodRepository;Lcom/example/foodie/data/repository/FavoriteRepository;)V", "_foodCardList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "", "", "", "getFavRepo", "()Lcom/example/foodie/data/repository/FavoriteRepository;", "setFavRepo", "(Lcom/example/foodie/data/repository/FavoriteRepository;)V", "foodCardList", "Lkotlin/collections/HashMap;", "getFoodCardList", "()Landroidx/lifecycle/MutableLiveData;", "getFoodRepo", "()Lcom/example/foodie/data/repository/FoodRepository;", "setFoodRepo", "(Lcom/example/foodie/data/repository/FoodRepository;)V", "loadFood", "", "removeFavorite", "foodId", "", "searchFood", "searchQuery", "setFavorite", "foodName", "foodImageName", "foodPrice", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomePageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.repository.FoodRepository foodRepo;
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.repository.FavoriteRepository favRepo;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.util.List<java.lang.Object>>> _foodCardList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.util.List<java.lang.Object>>> foodCardList = null;
    
    @javax.inject.Inject
    public HomePageViewModel(@org.jetbrains.annotations.NotNull
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
    public final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.util.List<java.lang.Object>>> getFoodCardList() {
        return null;
    }
    
    public final void loadFood() {
    }
    
    public final void searchFood(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
    }
    
    public final void setFavorite(int foodId, @org.jetbrains.annotations.NotNull
    java.lang.String foodName, @org.jetbrains.annotations.NotNull
    java.lang.String foodImageName, int foodPrice) {
    }
    
    public final void removeFavorite(int foodId) {
    }
}