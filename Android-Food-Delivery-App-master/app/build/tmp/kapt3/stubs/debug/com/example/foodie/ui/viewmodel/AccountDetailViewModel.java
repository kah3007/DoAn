package com.example.foodie.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J>\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007J\u0014\u0010!\u001a\u00020\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0004\u00a8\u0006\""}, d2 = {"Lcom/example/foodie/ui/viewmodel/AccountDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepo", "Lcom/example/foodie/data/repository/UserRepository;", "(Lcom/example/foodie/data/repository/UserRepository;)V", "_againNewTextError", "Landroidx/lifecycle/MutableLiveData;", "", "_currentTextError", "_newTextError", "_updateStatus", "", "againNewTextError", "getAgainNewTextError", "()Landroidx/lifecycle/MutableLiveData;", "currentTextError", "getCurrentTextError", "newTextError", "getNewTextError", "updateStatus", "getUpdateStatus", "getUserRepo", "()Lcom/example/foodie/data/repository/UserRepository;", "setUserRepo", "checkUpdate", "", "action", "currentText", "newText", "againNewText", "email", "username", "password", "updateAccount", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AccountDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.repository.UserRepository userRepo;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _updateStatus = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> updateStatus = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _currentTextError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> currentTextError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _newTextError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> newTextError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _againNewTextError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> againNewTextError = null;
    
    @javax.inject.Inject
    public AccountDetailViewModel(@org.jetbrains.annotations.NotNull
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
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getUpdateStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCurrentTextError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNewTextError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAgainNewTextError() {
        return null;
    }
    
    public final void checkUpdate(@org.jetbrains.annotations.NotNull
    java.lang.String action, @org.jetbrains.annotations.NotNull
    java.lang.String currentText, @org.jetbrains.annotations.NotNull
    java.lang.String newText, @org.jetbrains.annotations.NotNull
    java.lang.String againNewText, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void updateAccount(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> updateStatus) {
    }
}