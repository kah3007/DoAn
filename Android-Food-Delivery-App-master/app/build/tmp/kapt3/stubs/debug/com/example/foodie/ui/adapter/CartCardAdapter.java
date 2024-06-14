package com.example.foodie.ui.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/foodie/ui/adapter/CartCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/foodie/ui/adapter/CartCardAdapter$CardCardHolder;", "mContext", "Landroid/content/Context;", "cartFoodList", "", "Lcom/example/foodie/data/entity/CartFood;", "viewModel", "Lcom/example/foodie/ui/viewmodel/CartViewModel;", "username", "", "(Landroid/content/Context;Ljava/util/List;Lcom/example/foodie/ui/viewmodel/CartViewModel;Ljava/lang/String;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardCardHolder", "app_debug"})
public final class CartCardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.foodie.ui.adapter.CartCardAdapter.CardCardHolder> {
    @org.jetbrains.annotations.NotNull
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.foodie.data.entity.CartFood> cartFoodList;
    @org.jetbrains.annotations.NotNull
    private com.example.foodie.ui.viewmodel.CartViewModel viewModel;
    @org.jetbrains.annotations.NotNull
    private java.lang.String username;
    
    public CartCardAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.foodie.data.entity.CartFood> cartFoodList, @org.jetbrains.annotations.NotNull
    com.example.foodie.ui.viewmodel.CartViewModel viewModel, @org.jetbrains.annotations.NotNull
    java.lang.String username) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.foodie.ui.adapter.CartCardAdapter.CardCardHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.foodie.ui.adapter.CartCardAdapter.CardCardHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/foodie/ui/adapter/CartCardAdapter$CardCardHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "design", "Lcom/example/foodie/databinding/CartCardBinding;", "(Lcom/example/foodie/ui/adapter/CartCardAdapter;Lcom/example/foodie/databinding/CartCardBinding;)V", "getDesign", "()Lcom/example/foodie/databinding/CartCardBinding;", "setDesign", "(Lcom/example/foodie/databinding/CartCardBinding;)V", "app_debug"})
    public final class CardCardHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.example.foodie.databinding.CartCardBinding design;
        
        public CardCardHolder(@org.jetbrains.annotations.NotNull
        com.example.foodie.databinding.CartCardBinding design) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.foodie.databinding.CartCardBinding getDesign() {
            return null;
        }
        
        public final void setDesign(@org.jetbrains.annotations.NotNull
        com.example.foodie.databinding.CartCardBinding p0) {
        }
    }
}