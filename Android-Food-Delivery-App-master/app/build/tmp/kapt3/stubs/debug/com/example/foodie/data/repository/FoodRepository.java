package com.example.foodie.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JA\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\'\u0010\u0018\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0010\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0010\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ9\u0010 \u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00150!j\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0015`\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#JA\u0010$\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00150!j\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0015`\"2\u0006\u0010%\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/example/foodie/data/repository/FoodRepository;", "", "fds", "Lcom/example/foodie/data/datasource/FoodDataSource;", "(Lcom/example/foodie/data/datasource/FoodDataSource;)V", "getFds", "()Lcom/example/foodie/data/datasource/FoodDataSource;", "setFds", "addToCart", "", "foodName", "", "foodImageName", "foodPrice", "", "foodQuantity", "username", "action", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateTotalPrice", "cartFoodList", "", "Lcom/example/foodie/data/entity/CartFood;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmCartTotal", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCartFood", "Lcom/example/foodie/data/entity/CRUDResponse;", "cartFoodId", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCartFood", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFood", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchFood", "searchQuery", "app_debug"})
public final class FoodRepository {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.datasource.FoodDataSource fds;
    
    public FoodRepository(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.datasource.FoodDataSource fds) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.datasource.FoodDataSource getFds() {
        return null;
    }
    
    public final void setFds(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.datasource.FoodDataSource p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadFood(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.HashMap<java.lang.String, java.util.List<java.lang.Object>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchFood(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.HashMap<java.lang.String, java.util.List<java.lang.Object>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadCartFood(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodie.data.entity.CartFood>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object calculateTotalPrice(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodie.data.entity.CartFood> cartFoodList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addToCart(@org.jetbrains.annotations.NotNull
    java.lang.String foodName, @org.jetbrains.annotations.NotNull
    java.lang.String foodImageName, int foodPrice, int foodQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String action, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteCartFood(int cartFoodId, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.foodie.data.entity.CRUDResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object confirmCartTotal(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodie.data.entity.CartFood> cartFoodList, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}