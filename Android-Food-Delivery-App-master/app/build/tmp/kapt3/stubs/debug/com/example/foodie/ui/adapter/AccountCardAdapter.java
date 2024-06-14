package com.example.foodie.ui.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/foodie/ui/adapter/AccountCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/foodie/ui/adapter/AccountCardAdapter$AccountCardHolder;", "mContext", "Landroid/content/Context;", "accountCardItemList", "", "Lcom/example/foodie/data/entity/AccountCardItem;", "(Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AccountCardHolder", "app_debug"})
public final class AccountCardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.foodie.ui.adapter.AccountCardAdapter.AccountCardHolder> {
    @org.jetbrains.annotations.NotNull
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.foodie.data.entity.AccountCardItem> accountCardItemList;
    
    public AccountCardAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodie.data.entity.AccountCardItem> accountCardItemList) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.foodie.ui.adapter.AccountCardAdapter.AccountCardHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.foodie.ui.adapter.AccountCardAdapter.AccountCardHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/foodie/ui/adapter/AccountCardAdapter$AccountCardHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "design", "Lcom/example/foodie/databinding/AccountCardBinding;", "(Lcom/example/foodie/ui/adapter/AccountCardAdapter;Lcom/example/foodie/databinding/AccountCardBinding;)V", "getDesign", "()Lcom/example/foodie/databinding/AccountCardBinding;", "setDesign", "(Lcom/example/foodie/databinding/AccountCardBinding;)V", "app_debug"})
    public final class AccountCardHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.example.foodie.databinding.AccountCardBinding design;
        
        public AccountCardHolder(@org.jetbrains.annotations.NotNull
        com.example.foodie.databinding.AccountCardBinding design) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.foodie.databinding.AccountCardBinding getDesign() {
            return null;
        }
        
        public final void setDesign(@org.jetbrains.annotations.NotNull
        com.example.foodie.databinding.AccountCardBinding p0) {
        }
    }
}