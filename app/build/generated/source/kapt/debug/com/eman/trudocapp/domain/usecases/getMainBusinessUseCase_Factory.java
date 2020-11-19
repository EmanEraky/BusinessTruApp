package com.eman.trudocapp.domain.usecases;

import com.eman.trudocapp.data.ApiHelper;
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
public final class getMainBusinessUseCase_Factory implements Factory<getMainBusinessUseCase> {
  private final Provider<ApiHelper> apiHelperProvider;

  public getMainBusinessUseCase_Factory(Provider<ApiHelper> apiHelperProvider) {
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public getMainBusinessUseCase get() {
    return newInstance(apiHelperProvider.get());
  }

  public static getMainBusinessUseCase_Factory create(Provider<ApiHelper> apiHelperProvider) {
    return new getMainBusinessUseCase_Factory(apiHelperProvider);
  }

  public static getMainBusinessUseCase newInstance(ApiHelper apiHelper) {
    return new getMainBusinessUseCase(apiHelper);
  }
}
