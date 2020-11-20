package com.eman.trudocapp.presentation.module;

import com.eman.trudocapp.data.repo.ApiBusinessRepo;
import com.eman.trudocapp.data.repo.ApiHelper;
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
public final class ApplicationModule_ProvideApiHelperFactory implements Factory<ApiHelper> {
  private final ApplicationModule module;

  private final Provider<ApiBusinessRepo> apiHelperProvider;

  public ApplicationModule_ProvideApiHelperFactory(ApplicationModule module,
      Provider<ApiBusinessRepo> apiHelperProvider) {
    this.module = module;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public ApiHelper get() {
    return provideApiHelper(module, apiHelperProvider.get());
  }

  public static ApplicationModule_ProvideApiHelperFactory create(ApplicationModule module,
      Provider<ApiBusinessRepo> apiHelperProvider) {
    return new ApplicationModule_ProvideApiHelperFactory(module, apiHelperProvider);
  }

  public static ApiHelper provideApiHelper(ApplicationModule instance, ApiBusinessRepo apiHelper) {
    return Preconditions.checkNotNull(instance.provideApiHelper(apiHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
