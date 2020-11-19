package com.eman.trudocapp.data.repo;

import com.eman.trudocapp.data.ApiService;
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
public final class ApiDetailsRepo_Factory implements Factory<ApiDetailsRepo> {
  private final Provider<ApiService> apiServiceProvider;

  public ApiDetailsRepo_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ApiDetailsRepo get() {
    return newInstance(apiServiceProvider.get());
  }

  public static ApiDetailsRepo_Factory create(Provider<ApiService> apiServiceProvider) {
    return new ApiDetailsRepo_Factory(apiServiceProvider);
  }

  public static ApiDetailsRepo newInstance(ApiService apiService) {
    return new ApiDetailsRepo(apiService);
  }
}
