package com.example.foodie.data.datasource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JA\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\'\u0010\u001f\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0017\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0017\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J9\u0010\'\u001a*\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001c0(j\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001c`)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*JA\u0010+\u001a*\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001c0(j\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001c`)2\u0006\u0010,\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006-"}, d2 = {"Lcom/example/foodie/data/datasource/FoodDataSource;", "", "fdao", "Lcom/example/foodie/retrofit/FoodDao;", "fds", "Lcom/example/foodie/data/datasource/FavoriteDataSource;", "(Lcom/example/foodie/retrofit/FoodDao;Lcom/example/foodie/data/datasource/FavoriteDataSource;)V", "getFdao", "()Lcom/example/foodie/retrofit/FoodDao;", "setFdao", "(Lcom/example/foodie/retrofit/FoodDao;)V", "getFds", "()Lcom/example/foodie/data/datasource/FavoriteDataSource;", "setFds", "(Lcom/example/foodie/data/datasource/FavoriteDataSource;)V", "addToCart", "", "foodName", "", "foodImageName", "foodPrice", "", "foodQuantity", "username", "action", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateTotalPrice", "cartFoodList", "", "Lcom/example/foodie/data/entity/CartFood;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmCartTotal", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCartFood", "Lcom/example/foodie/data/entity/CRUDResponse;", "cartFoodId", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCartFood", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFood", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchFood", "searchQuery", "app_debug"})
public final class FoodDataSource {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.retrofit.FoodDao fdao;
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.datasource.FavoriteDataSource fds;
    
    public FoodDataSource(@org.jetbrains.annotations.NotNull
    com.example.foodie.retrofit.FoodDao fdao, @org.jetbrains.annotations.NotNull
    com.example.foodie.data.datasource.FavoriteDataSource fds) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.retrofit.FoodDao getFdao() {
        return null;
    }
    
    public final void setFdao(@org.jetbrains.annotations.NotNull
    com.example.foodie.retrofit.FoodDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.datasource.FavoriteDataSource getFds() {
        return null;
    }
    
    public final void setFds(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.datasource.FavoriteDataSource p0) {
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