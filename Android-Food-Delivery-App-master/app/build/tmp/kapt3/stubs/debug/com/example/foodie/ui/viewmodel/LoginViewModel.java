package com.example.foodie.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004\u00a8\u0006\u0015"}, d2 = {"Lcom/example/foodie/ui/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepo", "Lcom/example/foodie/data/repository/UserRepository;", "(Lcom/example/foodie/data/repository/UserRepository;)V", "userData", "Landroidx/lifecycle/MutableLiveData;", "", "", "getUserData", "()Landroidx/lifecycle/MutableLiveData;", "setUserData", "(Landroidx/lifecycle/MutableLiveData;)V", "getUserRepo", "()Lcom/example/foodie/data/repository/UserRepository;", "setUserRepo", "isLoginCheck", "", "login", "account", "password", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.repository.UserRepository userRepo;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> userData;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.repository.UserRepository userRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.foodie.data.repository.UserRepository getUserRepo() {
        return null;
    }
    
    public final void setUserRepo(@org.jetbrains.annotations.NotNull
    com.example.foodie.data.repository.UserRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getUserData() {
        return null;
    }
    
    public final void setUserData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> p0) {
    }
    
    public final void isLoginCheck() {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    java.lang.String account, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
}