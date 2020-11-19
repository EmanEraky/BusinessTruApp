package com.eman.trudocapp.presentation.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/eman/trudocapp/presentation/ui/detail/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "detailsUseCase", "Lcom/eman/trudocapp/domain/usecases/getDetailsBusinessUseCase;", "networkHelper", "Lcom/eman/trudocapp/utils/NetworkHelper;", "(Lcom/eman/trudocapp/domain/usecases/getDetailsBusinessUseCase;Lcom/eman/trudocapp/utils/NetworkHelper;)V", "_business", "Landroidx/lifecycle/MutableLiveData;", "Lcom/eman/trudocapp/utils/Resource;", "Lcom/eman/trudocapp/domain/model/Business;", "business", "getBusiness", "()Landroidx/lifecycle/MutableLiveData;", "getDetailsUseCase", "()Lcom/eman/trudocapp/domain/usecases/getDetailsBusinessUseCase;", "setDetailsUseCase", "(Lcom/eman/trudocapp/domain/usecases/getDetailsBusinessUseCase;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getNetworkHelper", "()Lcom/eman/trudocapp/utils/NetworkHelper;", "getDetailsBusiness", "", "app_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.eman.trudocapp.utils.Resource<com.eman.trudocapp.domain.model.Business>> _business = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id = "";
    @org.jetbrains.annotations.NotNull()
    private com.eman.trudocapp.domain.usecases.getDetailsBusinessUseCase detailsUseCase;
    @org.jetbrains.annotations.NotNull()
    private final com.eman.trudocapp.utils.NetworkHelper networkHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.eman.trudocapp.utils.Resource<com.eman.trudocapp.domain.model.Business>> getBusiness() {
        return null;
    }
    
    public final void getDetailsBusiness(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.trudocapp.domain.usecases.getDetailsBusinessUseCase getDetailsUseCase() {
        return null;
    }
    
    public final void setDetailsUseCase(@org.jetbrains.annotations.NotNull()
    com.eman.trudocapp.domain.usecases.getDetailsBusinessUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.trudocapp.utils.NetworkHelper getNetworkHelper() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.eman.trudocapp.domain.usecases.getDetailsBusinessUseCase detailsUseCase, @org.jetbrains.annotations.NotNull()
    com.eman.trudocapp.utils.NetworkHelper networkHelper) {
        super();
    }
}