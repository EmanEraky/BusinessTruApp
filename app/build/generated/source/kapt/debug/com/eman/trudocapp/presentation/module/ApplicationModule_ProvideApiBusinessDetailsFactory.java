package com.eman.trudocapp.presentation.module;

import com.eman.trudocapp.data.repo.ApiDetailsHelper;
import com.eman.trudocapp.data.repo.ApiDetailsRepo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideApiBusinessDetailsFactory implements Factory<ApiDetailsHelper> {
  private final ApplicationModule module;

  private final Provider<ApiDetailsRepo> apiDetailsHelperProvider;

  public ApplicationModule_ProvideApiBusinessDetailsFactory(ApplicationModule module,
      Provider<ApiDetailsRepo> apiDetailsHelperProvider) {
    this.module = module;
    this.apiDetailsHelperProvider = apiDetailsHelperProvider;
  }

  @Override
  public ApiDetailsHelper get() {
    return provideApiBusinessDetails(module, apiDetailsHelperProvider.get());
  }

  public static ApplicationModule_ProvideApiBusinessDetailsFactory create(ApplicationModule module,
      Provider<ApiDetailsRepo> apiDetailsHelperProvider) {
    return new ApplicationModule_ProvideApiBusinessDetailsFactory(module, apiDetailsHelperProvider);
  }

  public static ApiDetailsHelper provideApiBusinessDetails(ApplicationModule instance,
      ApiDetailsRepo apiDetailsHelper) {
    return Preconditions.checkNotNull(instance.provideApiBusinessDetails(apiDetailsHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
