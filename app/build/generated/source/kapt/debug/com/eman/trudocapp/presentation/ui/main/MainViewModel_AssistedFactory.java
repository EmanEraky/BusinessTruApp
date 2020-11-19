package com.eman.trudocapp.presentation.ui.main;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.eman.trudocapp.domain.usecases.getMainBusinessUseCase;
import com.eman.trudocapp.utils.NetworkHelper;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  private final Provider<getMainBusinessUseCase> mainRepositoryUseCase;

  private final Provider<NetworkHelper> networkHelper;

  @Inject
  MainViewModel_AssistedFactory(Provider<getMainBusinessUseCase> mainRepositoryUseCase,
      Provider<NetworkHelper> networkHelper) {
    this.mainRepositoryUseCase = mainRepositoryUseCase;
    this.networkHelper = networkHelper;
  }

  @Override
  @NonNull
  public MainViewModel create(SavedStateHandle arg0) {
    return new MainViewModel(mainRepositoryUseCase.get(), networkHelper.get());
  }
}
