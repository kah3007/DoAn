package com.example.foodie.data.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/example/foodie/data/entity/CartFood;", "", "cartFoodId", "", "foodName", "", "foodImageName", "foodPrice", "foodQuantity", "username", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getCartFoodId", "()I", "setCartFoodId", "(I)V", "getFoodImageName", "()Ljava/lang/String;", "setFoodImageName", "(Ljava/lang/String;)V", "getFoodName", "setFoodName", "getFoodPrice", "setFoodPrice", "getFoodQuantity", "setFoodQuantity", "getUsername", "setUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CartFood {
    @com.google.gson.annotations.SerializedName(value = "cartFoodId")
    private int cartFoodId;
    @com.google.gson.annotations.SerializedName(value = "foodName")
    @org.jetbrains.annotations.NotNull
    private java.lang.String foodName;
    @com.google.gson.annotations.SerializedName(value = "foodImageName")
    @org.jetbrains.annotations.NotNull
    private java.lang.String foodImageName;
    @com.google.gson.annotations.SerializedName(value = "foodPrice")
    private int foodPrice;
    @com.google.gson.annotations.SerializedName(value = "foodQuantity")
    private int foodQuantity;
    @com.google.gson.annotations.SerializedName(value = "username")
    @org.jetbrains.annotations.NotNull
    private java.lang.String username;
    
    public CartFood(int cartFoodId, @org.jetbrains.annotations.NotNull
    java.lang.String foodName, @org.jetbrains.annotations.NotNull
    java.lang.String foodImageName, int foodPrice, int foodQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String username) {
        super();
    }
    
    public final int getCartFoodId() {
        return 0;
    }
    
    public final void setCartFoodId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFoodName() {
        return null;
    }
    
    public final void setFoodName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFoodImageName() {
        return null;
    }
    
    public final void setFoodImageName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getFoodPrice() {
        return 0;
    }
    
    public final void setFoodPrice(int p0) {
    }
    
    public final int getFoodQuantity() {
        return 0;
    }
    
    public final void setFoodQuantity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.entity.CartFood copy(int cartFoodId, @org.jetbrains.annotations.NotNull
    java.lang.String foodName, @org.jetbrains.annotations.NotNull
    java.lang.String foodImageName, int foodPrice, int foodQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String username) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}