package com.eman.trudocapp.presentation.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/eman/trudocapp/presentation/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepositoryUseCase", "Lcom/eman/trudocapp/domain/usecases/getMainBusinessUseCase;", "networkHelper", "Lcom/eman/trudocapp/utils/NetworkHelper;", "(Lcom/eman/trudocapp/domain/usecases/getMainBusinessUseCase;Lcom/eman/trudocapp/utils/NetworkHelper;)V", "_business", "Landroidx/lifecycle/MutableLiveData;", "Lcom/eman/trudocapp/utils/Resource;", "Lcom/eman/trudocapp/domain/model/BusinessAll;", "businesses", "getBusinesses", "()Landroidx/lifecycle/MutableLiveData;", "getMainRepositoryUseCase", "()Lcom/eman/trudocapp/domain/usecases/getMainBusinessUseCase;", "getNetworkHelper", "()Lcom/eman/trudocapp/utils/NetworkHelper;", "getBusinessResponse", "", "offset", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.eman.trudocapp.utils.Resource<com.eman.trudocapp.domain.model.BusinessAll>> _business = null;
    @org.jetbrains.annotations.NotNull()
    private final com.eman.trudocapp.domain.usecases.getMainBusinessUseCase mainRepositoryUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.eman.trudocapp.utils.NetworkHelper networkHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.eman.trudocapp.utils.Resource<com.eman.trudocapp.domain.model.BusinessAll>> getBusinesses() {
        return null;
    }
    
    public final void getBusinessResponse(int offset) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.trudocapp.domain.usecases.getMainBusinessUseCase getMainRepositoryUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.trudocapp.utils.NetworkHelper getNetworkHelper() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.eman.trudocapp.domain.usecases.getMainBusinessUseCase mainRepositoryUseCase, @org.jetbrains.annotations.NotNull()
    com.eman.trudocapp.utils.NetworkHelper networkHelper) {
        super();
    }
}