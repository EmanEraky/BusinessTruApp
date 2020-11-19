package com.eman.trudocapp.domain.usecases;

import com.eman.trudocapp.data.ApiDetailsHelper;
import dagger.internal.Factory;
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
public final class getDetailsBusinessUseCase_Factory implements Factory<getDetailsBusinessUseCase> {
  private final Provider<ApiDetailsHelper> apiDetailsHelperProvider;

  public getDetailsBusinessUseCase_Factory(Provider<ApiDetailsHelper> apiDetailsHelperProvider) {
    this.apiDetailsHelperProvider = apiDetailsHelperProvider;
  }

  @Override
  public getDetailsBusinessUseCase get() {
    return newInstance(apiDetailsHelperProvider.get());
  }

  public static getDetailsBusinessUseCase_Factory create(
      Provider<ApiDetailsHelper> apiDetailsHelperProvider) {
    return new getDetailsBusinessUseCase_Factory(apiDetailsHelperProvider);
  }

  public static getDetailsBusinessUseCase newInstance(ApiDetailsHelper apiDetailsHelper) {
    return new getDetailsBusinessUseCase(apiDetailsHelper);
  }
}
