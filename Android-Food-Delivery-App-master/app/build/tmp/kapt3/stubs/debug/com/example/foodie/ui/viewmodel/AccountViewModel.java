package com.example.foodie.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/example/foodie/ui/viewmodel/AccountViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepo", "Lcom/example/foodie/data/repository/UserRepository;", "(Lcom/example/foodie/data/repository/UserRepository;)V", "_accountCardList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/foodie/data/entity/AccountCardItem;", "accountCardList", "getAccountCardList", "()Landroidx/lifecycle/MutableLiveData;", "getUserRepo", "()Lcom/example/foodie/data/repository/UserRepository;", "setUserRepo", "loadAccountCard", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AccountViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.data.repository.UserRepository userRepo;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodie.data.entity.AccountCardItem>> _accountCardList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodie.data.entity.AccountCardItem>> accountCardList = null;
    
    @javax.inject.Inject
    public AccountViewModel(@org.jetbrains.annotations.NotNull
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
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.foodie.data.entity.AccountCardItem>> getAccountCardList() {
        return null;
    }
    
    public final void loadAccountCard() {
    }
}