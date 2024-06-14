package com.example.foodie.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0012H\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0017H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0007\u00a8\u0006\u001f"}, d2 = {"Lcom/example/foodie/di/AppModule;", "", "()V", "provideCollectionReference", "Lcom/google/firebase/firestore/CollectionReference;", "provideFavoriteDataSource", "Lcom/example/foodie/data/datasource/FavoriteDataSource;", "favDao", "Lcom/example/foodie/room/FavoriteFoodDao;", "provideFavoriteFoodDao", "context", "Landroid/content/Context;", "provideFavoriteRepository", "Lcom/example/foodie/data/repository/FavoriteRepository;", "fds", "provideFoodDao", "Lcom/example/foodie/retrofit/FoodDao;", "provideFoodDataSource", "Lcom/example/foodie/data/datasource/FoodDataSource;", "fdao", "provideFoodRepository", "Lcom/example/foodie/data/repository/FoodRepository;", "provideLoginPref", "Lcom/example/foodie/datastore/LoginPref;", "provideUserDataSource", "Lcom/example/foodie/data/datasource/UserDataSource;", "collectionUser", "loginPref", "provideUserRepository", "Lcom/example/foodie/data/repository/UserRepository;", "uds", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.datasource.UserDataSource provideUserDataSource(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference collectionUser, @org.jetbrains.annotations.NotNull
    com.example.foodie.datastore.LoginPref loginPref) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.datasource.FoodDataSource provideFoodDataSource(@org.jetbrains.annotations.NotNull
    com.example.foodie.retrofit.FoodDao fdao, @org.jetbrains.annotations.NotNull
    com.example.foodie.data.datasource.FavoriteDataSource fds) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.datasource.FavoriteDataSource provideFavoriteDataSource(@org.jetbrains.annotations.NotNull
    com.example.foodie.room.FavoriteFoodDao favDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.datasource.UserDataSource uds) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.repository.FoodRepository provideFoodRepository(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.datasource.FoodDataSource fds) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.repository.FavoriteRepository provideFavoriteRepository(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.datasource.FavoriteDataSource fds) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.retrofit.FoodDao provideFoodDao() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.room.FavoriteFoodDao provideFavoriteFoodDao(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.CollectionReference provideCollectionReference() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.datastore.LoginPref provideLoginPref(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}