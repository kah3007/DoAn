// Generated by Dagger (https://dagger.dev).
package com.example.foodie.di;

import com.example.foodie.data.datasource.FoodDataSource;
import com.example.foodie.data.repository.FoodRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideFoodRepositoryFactory implements Factory<FoodRepository> {
  private final AppModule module;

  private final Provider<FoodDataSource> fdsProvider;

  public AppModule_ProvideFoodRepositoryFactory(AppModule module,
      Provider<FoodDataSource> fdsProvider) {
    this.module = module;
    this.fdsProvider = fdsProvider;
  }

  @Override
  public FoodRepository get() {
    return provideFoodRepository(module, fdsProvider.get());
  }

  public static AppModule_ProvideFoodRepositoryFactory create(AppModule module,
      Provider<FoodDataSource> fdsProvider) {
    return new AppModule_ProvideFoodRepositoryFactory(module, fdsProvider);
  }

  public static FoodRepository provideFoodRepository(AppModule instance, FoodDataSource fds) {
    return Preconditions.checkNotNullFromProvides(instance.provideFoodRepository(fds));
  }
}
