package com.eman.trudocapp.utils

import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.eman.trudocapp.domain.model.Categories


@BindingAdapter("android:businessImage")
fun setImageUrl(view: AppCompatImageView, path: String?) {
    if (path != null)
        if (!path.equals("")) {
            Glide.with(view.getContext()).asBitmap().load(path)
                .diskCacheStrategy(DiskCacheStrategy.ALL).dontAnimate().into(view)
        }
}

@BindingAdapter("android:businessCategory")
fun setCategory(view: TextView, categories: MutableList<Categories>?) {
    if (categories != null)
        if (categories.size > 0) {
            view.text=categories.get(0).title
        }

}

@BindingAdapter("android:businessRate")
fun setRatingBusiness(view: RatingBar, rate: Float) {
    view.rating = rate
}
