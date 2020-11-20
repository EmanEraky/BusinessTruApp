package com.eman.trudocapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"setCategory", "", "view", "Landroid/widget/TextView;", "categories", "", "Lcom/eman/trudocapp/domain/model/Categories;", "setImageUrl", "Landroidx/appcompat/widget/AppCompatImageView;", "path", "", "setRatingBusiness", "Landroid/widget/RatingBar;", "rate", "", "app_debug"})
public final class DataBindAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"android:businessImage"})
    public static final void setImageUrl(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String path) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:businessCategory"})
    public static final void setCategory(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.util.List<com.eman.trudocapp.domain.model.Categories> categories) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:businessRate"})
    public static final void setRatingBusiness(@org.jetbrains.annotations.NotNull()
    android.widget.RatingBar view, float rate) {
    }
}