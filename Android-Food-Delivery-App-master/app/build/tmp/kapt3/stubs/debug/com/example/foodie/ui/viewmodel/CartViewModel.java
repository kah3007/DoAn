package com.example.foodie.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J>\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\nR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006 "}, d2 = {"Lcom/example/foodie/ui/viewmodel/CartViewModel;", "Landroidx/lifecycle/ViewModel;", "foodRepo", "Lcom/example/foodie/data/repository/FoodRepository;", "(Lcom/example/foodie/data/repository/FoodRepository;)V", "_cartFoodCardList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/foodie/data/entity/CartFood;", "_totalPrice", "", "cartFoodCardList", "getCartFoodCardList", "()Landroidx/lifecycle/MutableLiveData;", "getFoodRepo", "()Lcom/example/foodie/data/repository/FoodRepository;", "setFoodRepo", "totalPrice", "getTotalPrice", "calculateTotalPrice", "", "cartFoodAction", "action", "cartFoodId", "", "foodName", "foodImageName", "foodPrice", "foodQuantity", "username", "confirmCartTotal", "loadCartFood", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CartViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.repository.FoodRepository foodRepo;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodie.data.entity.CartFood>> _cartFoodCardList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodie.data.entity.CartFood>> cartFoodCardList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _totalPrice = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> totalPrice = null;
    
    @javax.inject.Inject
    public CartViewModel(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.repository.FoodRepository foodRepo) {
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
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodie.data.entity.CartFood>> getCartFoodCardList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTotalPrice() {
        return null;
    }
    
    public final void loadCartFood(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
    
    private final void calculateTotalPrice() {
    }
    
    public final void confirmCartTotal(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
    
    public final void cartFoodAction(@org.jetbrains.annotations.NotNull
    java.lang.String action, int cartFoodId, @org.jetbrains.annotations.NotNull
    java.lang.String foodName, @org.jetbrains.annotations.NotNull
    java.lang.String foodImageName, int foodPrice, int foodQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
}