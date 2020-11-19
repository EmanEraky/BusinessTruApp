package com.eman.trudocapp.presentation.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\'H\u0016J\u0012\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J \u0010+\u001a\u00020$2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H\u0002J\u0006\u0010-\u001a\u00020$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/eman/trudocapp/presentation/ui/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/eman/trudocapp/presentation/NavigationListener;", "()V", "adapter", "Lcom/eman/trudocapp/presentation/ui/main/MainBusinessAdapter;", "binding", "Lcom/eman/trudocapp/databinding/ActivityMainBinding;", "getBinding", "()Lcom/eman/trudocapp/databinding/ActivityMainBinding;", "setBinding", "(Lcom/eman/trudocapp/databinding/ActivityMainBinding;)V", "isLoading", "", "list", "Ljava/util/ArrayList;", "Lcom/eman/trudocapp/domain/model/Business;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "mainViewModel", "Lcom/eman/trudocapp/presentation/ui/main/MainViewModel;", "getMainViewModel", "()Lcom/eman/trudocapp/presentation/ui/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "startPos", "", "getStartPos", "()I", "setStartPos", "(I)V", "totalBusiness", "addScrollerListener", "", "onClickBusiness", "id", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "renderList", "lBusiness", "setObserveBusiness", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.eman.trudocapp.presentation.NavigationListener {
    @org.jetbrains.annotations.NotNull()
    public com.eman.trudocapp.databinding.ActivityMainBinding binding;
    private int totalBusiness = 0;
    private boolean isLoading = false;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.eman.trudocapp.presentation.ui.main.MainBusinessAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public java.util.ArrayList<com.eman.trudocapp.domain.model.Business> list;
    private int startPos = 0;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.trudocapp.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.eman.trudocapp.databinding.ActivityMainBinding p0) {
    }
    
    private final com.eman.trudocapp.presentation.ui.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.eman.trudocapp.domain.model.Business> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.eman.trudocapp.domain.model.Business> p0) {
    }
    
    public final int getStartPos() {
        return 0;
    }
    
    public final void setStartPos(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void addScrollerListener() {
    }
    
    public final void setObserveBusiness() {
    }
    
    private final void renderList(java.util.ArrayList<com.eman.trudocapp.domain.model.Business> lBusiness) {
    }
    
    @java.lang.Override()
    public void onClickBusiness(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public MainActivity() {
        super();
    }
}