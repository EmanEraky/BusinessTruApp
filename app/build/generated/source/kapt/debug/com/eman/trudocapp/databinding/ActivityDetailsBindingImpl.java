package com.eman.trudocapp.databinding;
import com.eman.trudocapp.R;
import com.eman.trudocapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityDetailsBindingImpl extends ActivityDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.progress_bar, 7);
        sViewsWithIds.put(R.id.img_phone, 8);
        sViewsWithIds.put(R.id.floating_share, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.ProgressBar) bindings[7]
            , (android.widget.RatingBar) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mediaImage.setTag(null);
        this.subtitleText3.setTag(null);
        this.txtAddress.setTag(null);
        this.txtCategory.setTag(null);
        this.txtReview.setTag(null);
        this.txtTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.businessDetail == variableId) {
            setBusinessDetail((com.eman.trudocapp.domain.model.Business) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBusinessDetail(@Nullable com.eman.trudocapp.domain.model.Business BusinessDetail) {
        this.mBusinessDetail = BusinessDetail;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.businessDetail);
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
        java.lang.String businessDetailLocationCity = null;
        com.eman.trudocapp.domain.model.Location businessDetailLocation = null;
        com.eman.trudocapp.domain.model.Business businessDetail = mBusinessDetail;
        java.lang.String javaLangStringReviewCountBusinessDetailReviewCount = null;
        java.lang.String javaLangStringAddressBusinessDetailLocationAddress1 = null;
        java.lang.String javaLangStringAddressBusinessDetailLocationAddress1JavaLangString = null;
        int businessDetailReviewCount = 0;
        float businessDetailRating = 0f;
        java.lang.String javaLangStringCategoryBusinessDetailCategoriesGetInt0Title = null;
        java.lang.String businessDetailCategoriesGetInt0Title = null;
        java.lang.String javaLangStringAddressBusinessDetailLocationAddress1JavaLangStringBusinessDetailLocationCity = null;
        java.lang.String businessDetailImageUrl = null;
        java.util.List<com.eman.trudocapp.domain.model.Categories> businessDetailCategories = null;
        java.lang.String businessDetailName = null;
        java.lang.String businessDetailLocationAddress1 = null;
        com.eman.trudocapp.domain.model.Categories businessDetailCategoriesGetInt0 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (businessDetail != null) {
                    // read businessDetail.location
                    businessDetailLocation = businessDetail.getLocation();
                    // read businessDetail.review_count
                    businessDetailReviewCount = businessDetail.getReview_count();
                    // read businessDetail.rating
                    businessDetailRating = businessDetail.getRating();
                    // read businessDetail.image_url
                    businessDetailImageUrl = businessDetail.getImage_url();
                    // read businessDetail.categories
                    businessDetailCategories = businessDetail.getCategories();
                    // read businessDetail.name
                    businessDetailName = businessDetail.getName();
                }


                if (businessDetailLocation != null) {
                    // read businessDetail.location.city
                    businessDetailLocationCity = businessDetailLocation.getCity();
                    // read businessDetail.location.address1
                    businessDetailLocationAddress1 = businessDetailLocation.getAddress1();
                }
                // read ("ReviewCount : ") + (businessDetail.review_count)
                javaLangStringReviewCountBusinessDetailReviewCount = ("ReviewCount : ") + (businessDetailReviewCount);
                if (businessDetailCategories != null) {
                    // read businessDetail.categories.get(0)
                    businessDetailCategoriesGetInt0 = businessDetailCategories.get(0);
                }


                // read ("Address : ") + (businessDetail.location.address1)
                javaLangStringAddressBusinessDetailLocationAddress1 = ("Address : ") + (businessDetailLocationAddress1);
                if (businessDetailCategoriesGetInt0 != null) {
                    // read businessDetail.categories.get(0).title
                    businessDetailCategoriesGetInt0Title = businessDetailCategoriesGetInt0.getTitle();
                }


                // read (("Address : ") + (businessDetail.location.address1)) + (" , ")
                javaLangStringAddressBusinessDetailLocationAddress1JavaLangString = (javaLangStringAddressBusinessDetailLocationAddress1) + (" , ");
                // read ("Category : ") + (businessDetail.categories.get(0).title)
                javaLangStringCategoryBusinessDetailCategoriesGetInt0Title = ("Category : ") + (businessDetailCategoriesGetInt0Title);


                // read ((("Address : ") + (businessDetail.location.address1)) + (" , ")) + (businessDetail.location.city)
                javaLangStringAddressBusinessDetailLocationAddress1JavaLangStringBusinessDetailLocationCity = (javaLangStringAddressBusinessDetailLocationAddress1JavaLangString) + (businessDetailLocationCity);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.eman.trudocapp.utils.DataBindAdapterKt.setImageUrl(this.mediaImage, businessDetailImageUrl);
            com.eman.trudocapp.utils.DataBindAdapterKt.setRatingBusiness(this.subtitleText3, businessDetailRating);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAddress, javaLangStringAddressBusinessDetailLocationAddress1JavaLangStringBusinessDetailLocationCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCategory, javaLangStringCategoryBusinessDetailCategoriesGetInt0Title);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReview, javaLangStringReviewCountBusinessDetailReviewCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTitle, businessDetailName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): businessDetail
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}