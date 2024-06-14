// Generated by Dagger (https://dagger.dev).
package com.example.foodie.ui.viewmodel;

import com.example.foodie.data.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<UserRepository> userRepoProvider;

  public LoginViewModel_Factory(Provider<UserRepository> userRepoProvider) {
    this.userRepoProvider = userRepoProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(userRepoProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<UserRepository> userRepoProvider) {
    return new LoginViewModel_Factory(userRepoProvider);
  }

  public static LoginViewModel newInstance(UserRepository userRepo) {
    return new LoginViewModel(userRepo);
  }
}