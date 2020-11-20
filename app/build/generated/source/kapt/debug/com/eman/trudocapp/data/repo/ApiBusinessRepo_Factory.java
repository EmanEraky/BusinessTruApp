package com.eman.trudocapp.data.repo;

import com.eman.trudocapp.data.api.ApiService;
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
public final class ApiBusinessRepo_Factory implements Factory<ApiBusinessRepo> {
  private final Provider<ApiService> apiServiceProvider;

  public ApiBusinessRepo_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ApiBusinessRepo get() {
    return newInstance(apiServiceProvider.get());
  }

  public static ApiBusinessRepo_Factory create(Provider<ApiService> apiServiceProvider) {
    return new ApiBusinessRepo_Factory(apiServiceProvider);
  }

  public static ApiBusinessRepo newInstance(ApiService apiService) {
    return new ApiBusinessRepo(apiService);
  }
}
