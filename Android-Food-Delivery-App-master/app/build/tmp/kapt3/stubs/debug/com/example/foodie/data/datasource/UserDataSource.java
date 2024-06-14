package com.example.foodie.data.datasource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012J$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012J\u0014\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J<\u0010$\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\"\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010&j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001`\'H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/example/foodie/data/datasource/UserDataSource;", "", "collectionUser", "Lcom/google/firebase/firestore/CollectionReference;", "loginPref", "Lcom/example/foodie/datastore/LoginPref;", "(Lcom/google/firebase/firestore/CollectionReference;Lcom/example/foodie/datastore/LoginPref;)V", "getCollectionUser", "()Lcom/google/firebase/firestore/CollectionReference;", "setCollectionUser", "(Lcom/google/firebase/firestore/CollectionReference;)V", "getLoginPref", "()Lcom/example/foodie/datastore/LoginPref;", "setLoginPref", "(Lcom/example/foodie/datastore/LoginPref;)V", "userData", "Landroidx/lifecycle/MutableLiveData;", "", "", "getUserData", "()Landroidx/lifecycle/MutableLiveData;", "setUserData", "(Landroidx/lifecycle/MutableLiveData;)V", "isLoginCheck", "loadAccountCard", "Lcom/example/foodie/data/entity/AccountCardItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "account", "password", "signUp", "email", "username", "updateAccount", "", "updateStatus", "updateWithId", "updatedUser", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "app_debug"})
public final class UserDataSource {
    @org.jetbrains.annotations.NotNull
    private com.google.firebase.firestore.CollectionReference collectionUser;
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.datastore.LoginPref loginPref;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> userData;
    
    public UserDataSource(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference collectionUser, @org.jetbrains.annotations.NotNull
    com.example.foodie.datastore.LoginPref loginPref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.CollectionReference getCollectionUser() {
        return null;
    }
    
    public final void setCollectionUser(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.datastore.LoginPref getLoginPref() {
        return null;
    }
    
    public final void setLoginPref(@org.jetbrains.annotations.NotNull
    com.example.foodie.datastore.LoginPref p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getUserData() {
        return null;
    }
    
    public final void setUserData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> p0) {
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
    
    private final void updateWithId(java.lang.String email, java.lang.String username, java.util.HashMap<java.lang.String, java.lang.Object> updatedUser) {
    }
    
    public final void updateAccount(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> updateStatus) {
    }
}