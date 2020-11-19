package com.eman.trudocapp.databinding;
import com.eman.trudocapp.R;
import com.eman.trudocapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemBusinessBindingImpl extends ItemBusinessBinding implements com.eman.trudocapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemBusinessBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemBusinessBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.RatingBar) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.businessImg.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.rating.setTag(null);
        this.titleText.setTag(null);
        this.txtCategory.setTag(null);
        this.txtCount.setTag(null);
        this.txtPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.eman.trudocapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.businessApi == variableId) {
            setBusinessApi((com.eman.trudocapp.domain.model.Business) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.eman.trudocapp.presentation.NavigationListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBusinessApi(@Nullable com.eman.trudocapp.domain.model.Business BusinessApi) {
        this.mBusinessApi = BusinessApi;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.businessApi);
        super.requestRebind();
    }
    public void setListener(@Nullable com.eman.trudocapp.presentation.NavigationListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String businessApiPrice = null;
        java.lang.String businessApiCategoriesGetInt0Title = null;
        java.lang.String businessApiName = null;
        java.util.List<com.eman.trudocapp.domain.model.Categories> businessApiCategories = null;
        java.lang.String javaLangStringBusinessApiReviewCount = null;
        float businessApiRating = 0f;
        int businessApiReviewCount = 0;
        com.eman.trudocapp.domain.model.Business businessApi = mBusinessApi;
        com.eman.trudocapp.presentation.NavigationListener listener = mListener;
        com.eman.trudocapp.domain.model.Categories businessApiCategoriesGetInt0 = null;
        java.lang.String businessApiImageUrl = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (businessApi != null) {
                    // read businessApi.price
                    businessApiPrice = businessApi.getPrice();
                    // read businessApi.name
                    businessApiName = businessApi.getName();
                    // read businessApi.categories
                    businessApiCategories = businessApi.getCategories();
                    // read businessApi.rating
                    businessApiRating = businessApi.getRating();
                    // read businessApi.review_count
                    businessApiReviewCount = businessApi.getReview_count();
                    // read businessApi.image_url
                    businessApiImageUrl = businessApi.getImage_url();
                }


                if (businessApiCategories != null) {
                    // read businessApi.categories.get(0)
                    businessApiCategoriesGetInt0 = businessApiCategories.get(0);
                }
                // read ("") + (businessApi.review_count)
                javaLangStringBusinessApiReviewCount = ("") + (businessApiReviewCount);


                if (businessApiCategoriesGetInt0 != null) {
                    // read businessApi.categories.get(0).title
                    businessApiCategoriesGetInt0Title = businessApiCategoriesGetInt0.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.eman.trudocapp.utils.DataBindAdapterKt.setImageUrl(this.businessImg, businessApiImageUrl);
            com.eman.trudocapp.utils.DataBindAdapterKt.setRatingBusiness(this.rating, businessApiRating);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, businessApiName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCategory, businessApiCategoriesGetInt0Title);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCount, javaLangStringBusinessApiReviewCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPrice, businessApiPrice);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // businessApi.id
        java.lang.String businessApiId = null;
        // businessApi != null
        boolean businessApiJavaLangObjectNull = false;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // businessApi
        com.eman.trudocapp.domain.model.Business businessApi = mBusinessApi;
        // listener
        com.eman.trudocapp.presentation.NavigationListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            businessApiJavaLangObjectNull = (businessApi) != (null);
            if (businessApiJavaLangObjectNull) {


                businessApiId = businessApi.getId();

                listener.onClickBusiness(businessApiId);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): businessApi
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}