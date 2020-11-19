package com.eman.trudocapp;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.eman.trudocapp.data.ApiDetailsHelper;
import com.eman.trudocapp.data.ApiHelper;
import com.eman.trudocapp.data.ApiService;
import com.eman.trudocapp.data.repo.ApiBusinessRepo;
import com.eman.trudocapp.data.repo.ApiDetailsRepo;
import com.eman.trudocapp.domain.usecases.getDetailsBusinessUseCase;
import com.eman.trudocapp.domain.usecases.getMainBusinessUseCase;
import com.eman.trudocapp.presentation.module.ApplicationModule;
import com.eman.trudocapp.presentation.module.ApplicationModule_ProvideApiBusinessDetailsFactory;
import com.eman.trudocapp.presentation.module.ApplicationModule_ProvideApiHelperFactory;
import com.eman.trudocapp.presentation.module.ApplicationModule_ProvideApiServiceFactory;
import com.eman.trudocapp.presentation.module.ApplicationModule_ProvideOkHttpClientFactory;
import com.eman.trudocapp.presentation.module.ApplicationModule_ProvideRetrofitFactory;
import com.eman.trudocapp.presentation.ui.detail.DetailsActivity;
import com.eman.trudocapp.presentation.ui.detail.DetailsViewModel_AssistedFactory;
import com.eman.trudocapp.presentation.ui.detail.DetailsViewModel_AssistedFactory_Factory;
import com.eman.trudocapp.presentation.ui.main.MainActivity;
import com.eman.trudocapp.presentation.ui.main.MainViewModel_AssistedFactory;
import com.eman.trudocapp.presentation.ui.main.MainViewModel_AssistedFactory_Factory;
import com.eman.trudocapp.utils.NetworkHelper;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_ApplicationC extends App_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private final ApplicationModule applicationModule;

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object apiService = new MemoizedSentinel();

  private volatile Object apiDetailsHelper = new MemoizedSentinel();

  private volatile Object networkHelper = new MemoizedSentinel();

  private volatile Provider<NetworkHelper> networkHelperProvider;

  private volatile Object apiHelper = new MemoizedSentinel();

  private DaggerApp_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam,
      ApplicationModule applicationModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.applicationModule = applicationModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private OkHttpClient getOkHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = ApplicationModule_ProvideOkHttpClientFactory.provideOkHttpClient(applicationModule);
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = ApplicationModule_ProvideRetrofitFactory.provideRetrofit(applicationModule, getOkHttpClient());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private ApiService getApiService() {
    Object local = apiService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = apiService;
        if (local instanceof MemoizedSentinel) {
          local = ApplicationModule_ProvideApiServiceFactory.provideApiService(applicationModule, getRetrofit());
          apiService = DoubleCheck.reentrantCheck(apiService, local);
        }
      }
    }
    return (ApiService) local;
  }

  private ApiDetailsRepo getApiDetailsRepo() {
    return new ApiDetailsRepo(getApiService());
  }

  private ApiDetailsHelper getApiDetailsHelper() {
    Object local = apiDetailsHelper;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = apiDetailsHelper;
        if (local instanceof MemoizedSentinel) {
          local = ApplicationModule_ProvideApiBusinessDetailsFactory.provideApiBusinessDetails(applicationModule, getApiDetailsRepo());
          apiDetailsHelper = DoubleCheck.reentrantCheck(apiDetailsHelper, local);
        }
      }
    }
    return (ApiDetailsHelper) local;
  }

  private NetworkHelper getNetworkHelper() {
    Object local = networkHelper;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = networkHelper;
        if (local instanceof MemoizedSentinel) {
          local = new NetworkHelper(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          networkHelper = DoubleCheck.reentrantCheck(networkHelper, local);
        }
      }
    }
    return (NetworkHelper) local;
  }

  private Provider<NetworkHelper> getNetworkHelperProvider() {
    Object local = networkHelperProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      networkHelperProvider = (Provider<NetworkHelper>) local;
    }
    return (Provider<NetworkHelper>) local;
  }

  private ApiBusinessRepo getApiBusinessRepo() {
    return new ApiBusinessRepo(getApiService());
  }

  private ApiHelper getApiHelper() {
    Object local = apiHelper;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = apiHelper;
        if (local instanceof MemoizedSentinel) {
          local = ApplicationModule_ProvideApiHelperFactory.provideApiHelper(applicationModule, getApiBusinessRepo());
          apiHelper = DoubleCheck.reentrantCheck(apiHelper, local);
        }
      }
    }
    return (ApiHelper) local;
  }

  @Override
  public void injectApp(App app) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private ApplicationModule applicationModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public App_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (applicationModule == null) {
        this.applicationModule = new ApplicationModule();
      }
      return new DaggerApp_HiltComponents_ApplicationC(applicationContextModule, applicationModule);
    }
  }

  private final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public App_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends App_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<getDetailsBusinessUseCase> getDetailsBusinessUseCaseProvider;

      private volatile Provider<DetailsViewModel_AssistedFactory> detailsViewModel_AssistedFactoryProvider;

      private volatile Provider<getMainBusinessUseCase> getMainBusinessUseCaseProvider;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private getDetailsBusinessUseCase getGetDetailsBusinessUseCase() {
        return new getDetailsBusinessUseCase(DaggerApp_HiltComponents_ApplicationC.this.getApiDetailsHelper());
      }

      private Provider<getDetailsBusinessUseCase> getGetDetailsBusinessUseCaseProvider() {
        Object local = getDetailsBusinessUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          getDetailsBusinessUseCaseProvider = (Provider<getDetailsBusinessUseCase>) local;
        }
        return (Provider<getDetailsBusinessUseCase>) local;
      }

      private DetailsViewModel_AssistedFactory getDetailsViewModel_AssistedFactory() {
        return DetailsViewModel_AssistedFactory_Factory.newInstance(getGetDetailsBusinessUseCaseProvider(), DaggerApp_HiltComponents_ApplicationC.this.getNetworkHelperProvider());
      }

      private Provider<DetailsViewModel_AssistedFactory> getDetailsViewModel_AssistedFactoryProvider(
          ) {
        Object local = detailsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          detailsViewModel_AssistedFactoryProvider = (Provider<DetailsViewModel_AssistedFactory>) local;
        }
        return (Provider<DetailsViewModel_AssistedFactory>) local;
      }

      private getMainBusinessUseCase getGetMainBusinessUseCase() {
        return new getMainBusinessUseCase(DaggerApp_HiltComponents_ApplicationC.this.getApiHelper());
      }

      private Provider<getMainBusinessUseCase> getGetMainBusinessUseCaseProvider() {
        Object local = getMainBusinessUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          getMainBusinessUseCaseProvider = (Provider<getMainBusinessUseCase>) local;
        }
        return (Provider<getMainBusinessUseCase>) local;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return MainViewModel_AssistedFactory_Factory.newInstance(getGetMainBusinessUseCaseProvider(), DaggerApp_HiltComponents_ApplicationC.this.getNetworkHelperProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("com.eman.trudocapp.presentation.ui.detail.DetailsViewModel", (Provider) getDetailsViewModel_AssistedFactoryProvider()).put("com.eman.trudocapp.presentation.ui.main.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectDetailsActivity(DetailsActivity arg0) {
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public App_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends App_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public App_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public App_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends App_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.eman.trudocapp.presentation.ui.detail.DetailsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getDetailsViewModel_AssistedFactory();

            case 1: // com.eman.trudocapp.domain.usecases.getDetailsBusinessUseCase 
            return (T) ActivityCImpl.this.getGetDetailsBusinessUseCase();

            case 2: // com.eman.trudocapp.presentation.ui.main.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            case 3: // com.eman.trudocapp.domain.usecases.getMainBusinessUseCase 
            return (T) ActivityCImpl.this.getGetMainBusinessUseCase();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.eman.trudocapp.utils.NetworkHelper 
        return (T) DaggerApp_HiltComponents_ApplicationC.this.getNetworkHelper();

        default: throw new AssertionError(id);
      }
    }
  }
}
