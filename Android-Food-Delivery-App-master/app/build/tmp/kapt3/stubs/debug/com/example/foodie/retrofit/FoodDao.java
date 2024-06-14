package com.example.foodie.retrofit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/foodie/retrofit/FoodDao;", "", "addToCart", "Lcom/example/foodie/data/entity/CRUDResponse;", "foodName", "", "foodImageName", "foodPrice", "", "foodQuantity", "username", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCartFood", "cartFoodId", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCartFood", "Lcom/example/foodie/data/entity/CartFoodResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFood", "Lcom/example/foodie/data/entity/FoodResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface FoodDao {
    
    @retrofit2.http.GET(value = "yemekler/tumYemekleriGetir.php")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loadFood(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.foodie.data.entity.FoodResponse> $completion);
    
    @retrofit2.http.POST(value = "yemekler/sepeteYemekEkle.php")
    @retrofit2.http.FormUrlEncoded
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addToCart(@retrofit2.http.Field(value = "yemek_adi")
    @org.jetbrains.annotations.NotNull
    java.lang.String foodName, @retrofit2.http.Field(value = "yemek_resim_adi")
    @org.jetbrains.annotations.NotNull
    java.lang.String foodImageName, @retrofit2.http.Field(value = "yemek_fiyat")
    int foodPrice, @retrofit2.http.Field(value = "yemek_siparis_adet")
    int foodQuantity, @retrofit2.http.Field(value = "kullanici_adi")
    @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.foodie.data.entity.CRUDResponse> $completion);
    
    @retrofit2.http.POST(value = "yemekler/sepettekiYemekleriGetir.php")
    @retrofit2.http.FormUrlEncoded
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loadCartFood(@retrofit2.http.Field(value = "kullanici_adi")
    @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.foodie.data.entity.CartFoodResponse> $completion);
    
    @retrofit2.http.POST(value = "yemekler/sepettenYemekSil.php")
    @retrofit2.http.FormUrlEncoded
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteCartFood(@retrofit2.http.Field(value = "sepet_yemek_id")
    int cartFoodId, @retrofit2.http.Field(value = "kullanici_adi")
    @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.foodie.data.entity.CRUDResponse> $completion);
}