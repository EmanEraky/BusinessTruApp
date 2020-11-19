package com.eman.trudocapp.presentation.ui.main;

import com.eman.trudocapp.domain.usecases.getMainBusinessUseCase;
import com.eman.trudocapp.utils.NetworkHelper;
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
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<getMainBusinessUseCase> mainRepositoryUseCaseProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public MainViewModel_AssistedFactory_Factory(
      Provider<getMainBusinessUseCase> mainRepositoryUseCaseProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.mainRepositoryUseCaseProvider = mainRepositoryUseCaseProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(mainRepositoryUseCaseProvider, networkHelperProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<getMainBusinessUseCase> mainRepositoryUseCaseProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new MainViewModel_AssistedFactory_Factory(mainRepositoryUseCaseProvider, networkHelperProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(
      Provider<getMainBusinessUseCase> mainRepositoryUseCase,
      Provider<NetworkHelper> networkHelper) {
    return new MainViewModel_AssistedFactory(mainRepositoryUseCase, networkHelper);
  }
}
