package com.example.foodie.data.datasource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/foodie/data/datasource/FavoriteDataSource;", "", "favDao", "Lcom/example/foodie/room/FavoriteFoodDao;", "(Lcom/example/foodie/room/FavoriteFoodDao;)V", "getFavDao", "()Lcom/example/foodie/room/FavoriteFoodDao;", "setFavDao", "addFavoriteFood", "", "foodId", "", "foodName", "", "foodImageName", "foodPrice", "(ILjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavoriteFood", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFavoriteFood", "", "Lcom/example/foodie/data/entity/FavoriteFood;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FavoriteDataSource {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.room.FavoriteFoodDao favDao;
    
    public FavoriteDataSource(@org.jetbrains.annotations.NotNull
    com.example.foodie.room.FavoriteFoodDao favDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.room.FavoriteFoodDao getFavDao() {
        return null;
    }
    
    public final void setFavDao(@org.jetbrains.annotations.NotNull
    com.example.foodie.room.FavoriteFoodDao p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadFavoriteFood(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodie.data.entity.FavoriteFood>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addFavoriteFood(int foodId, @org.jetbrains.annotations.NotNull
    java.lang.String foodName, @org.jetbrains.annotations.NotNull
    java.lang.String foodImageName, int foodPrice, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteFavoriteFood(int foodId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}