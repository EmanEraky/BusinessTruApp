package com.eman.trudocapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/eman/trudocapp/data/ApiService;", "", "getBusiness", "Lcom/eman/trudocapp/domain/model/BusinessAll;", "location", "", "limit", "", "offset", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBusinessDetails", "Lcom/eman/trudocapp/domain/model/Business;", "Id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "businesses/search")
    public abstract java.lang.Object getBusiness(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "location")
    java.lang.String location, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.eman.trudocapp.domain.model.BusinessAll> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "businesses/{Id}")
    public abstract java.lang.Object getBusinessDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "Id")
    java.lang.String Id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.eman.trudocapp.domain.model.Business> p1);
}