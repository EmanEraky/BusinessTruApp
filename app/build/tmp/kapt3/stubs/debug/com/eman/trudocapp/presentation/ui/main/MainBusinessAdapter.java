package com.eman.trudocapp.presentation.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/eman/trudocapp/presentation/ui/main/MainBusinessAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/eman/trudocapp/presentation/ui/main/MainBusinessAdapter$DataViewHolder;", "businesses", "Ljava/util/ArrayList;", "Lcom/eman/trudocapp/domain/model/Business;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/eman/trudocapp/presentation/NavigationListener;", "(Ljava/util/ArrayList;Lcom/eman/trudocapp/presentation/NavigationListener;)V", "getListener", "()Lcom/eman/trudocapp/presentation/NavigationListener;", "setListener", "(Lcom/eman/trudocapp/presentation/NavigationListener;)V", "addData", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DataViewHolder", "app_debug"})
public final class MainBusinessAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.eman.trudocapp.presentation.ui.main.MainBusinessAdapter.DataViewHolder> {
    private java.util.ArrayList<com.eman.trudocapp.domain.model.Business> businesses;
    @org.jetbrains.annotations.NotNull()
    private com.eman.trudocapp.presentation.NavigationListener listener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.eman.trudocapp.presentation.ui.main.MainBusinessAdapter.DataViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.eman.trudocapp.presentation.ui.main.MainBusinessAdapter.DataViewHolder holder, int position) {
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.eman.trudocapp.domain.model.Business> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.trudocapp.presentation.NavigationListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.eman.trudocapp.presentation.NavigationListener p0) {
    }
    
    public MainBusinessAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.eman.trudocapp.domain.model.Business> businesses, @org.jetbrains.annotations.NotNull()
    com.eman.trudocapp.presentation.NavigationListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/eman/trudocapp/presentation/ui/main/MainBusinessAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/eman/trudocapp/databinding/ItemBusinessBinding;", "(Lcom/eman/trudocapp/databinding/ItemBusinessBinding;)V", "getBinding", "()Lcom/eman/trudocapp/databinding/ItemBusinessBinding;", "app_debug"})
    public static final class DataViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.eman.trudocapp.databinding.ItemBusinessBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.eman.trudocapp.databinding.ItemBusinessBinding getBinding() {
            return null;
        }
        
        public DataViewHolder(@org.jetbrains.annotations.NotNull()
        com.eman.trudocapp.databinding.ItemBusinessBinding binding) {
            super(null);
        }
    }
}