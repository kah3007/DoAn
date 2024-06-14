package com.example.foodie.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/foodie/room/FavoriteFoodDao;", "", "addFavoriteFood", "", "favoriteFood", "Lcom/example/foodie/data/entity/FavoriteFood;", "(Lcom/example/foodie/data/entity/FavoriteFood;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavoriteFood", "loadFavoriteFood", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface FavoriteFoodDao {
    
    @androidx.room.Query(value = "SELECT * FROM favorite_food ORDER BY food_name")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loadFavoriteFood(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodie.data.entity.FavoriteFood>> $completion);
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addFavoriteFood(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.entity.FavoriteFood favoriteFood, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteFavoriteFood(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.entity.FavoriteFood favoriteFood, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}