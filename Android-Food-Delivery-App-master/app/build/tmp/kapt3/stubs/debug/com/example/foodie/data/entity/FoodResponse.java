package com.example.foodie.data.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/foodie/data/entity/FoodResponse;", "", "foodList", "", "Lcom/example/foodie/data/entity/Food;", "success", "", "(Ljava/util/List;I)V", "getFoodList", "()Ljava/util/List;", "setFoodList", "(Ljava/util/List;)V", "getSuccess", "()I", "setSuccess", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class FoodResponse {
    @com.google.gson.annotations.SerializedName(value = "yemekler")
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.foodie.data.entity.Food> foodList;
    @com.google.gson.annotations.SerializedName(value = "success")
    private int success;
    
    public FoodResponse(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodie.data.entity.Food> foodList, int success) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.foodie.data.entity.Food> getFoodList() {
        return null;
    }
    
    public final void setFoodList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodie.data.entity.Food> p0) {
    }
    
    public final int getSuccess() {
        return 0;
    }
    
    public final void setSuccess(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.foodie.data.entity.Food> component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.entity.FoodResponse copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodie.data.entity.Food> foodList, int success) {
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