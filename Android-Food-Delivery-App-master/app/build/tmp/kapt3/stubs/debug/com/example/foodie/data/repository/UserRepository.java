package com.example.foodie.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bJ$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/foodie/data/repository/UserRepository;", "", "uds", "Lcom/example/foodie/data/datasource/UserDataSource;", "(Lcom/example/foodie/data/datasource/UserDataSource;)V", "getUds", "()Lcom/example/foodie/data/datasource/UserDataSource;", "setUds", "isLoginCheck", "Landroidx/lifecycle/MutableLiveData;", "", "", "loadAccountCard", "Lcom/example/foodie/data/entity/AccountCardItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "account", "password", "signUp", "email", "username", "updateAccount", "", "updateStatus", "app_debug"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.datasource.UserDataSource uds;
    
    public UserRepository(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.datasource.UserDataSource uds) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.datasource.UserDataSource getUds() {
        return null;
    }
    
    public final void setUds(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.datasource.UserDataSource p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> isLoginCheck() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> login(@org.jetbrains.annotations.NotNull
    java.lang.String account, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> signUp(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadAccountCard(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.foodie.data.entity.AccountCardItem>> $completion) {
        return null;
    }
    
    public final void updateAccount(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> updateStatus) {
    }
}