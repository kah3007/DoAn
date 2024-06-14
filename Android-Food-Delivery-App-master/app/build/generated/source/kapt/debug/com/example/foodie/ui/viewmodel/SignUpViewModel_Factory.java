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
public final class SignUpViewModel_Factory implements Factory<SignUpViewModel> {
  private final Provider<UserRepository> userRepoProvider;

  public SignUpViewModel_Factory(Provider<UserRepository> userRepoProvider) {
    this.userRepoProvider = userRepoProvider;
  }

  @Override
  public SignUpViewModel get() {
    return newInstance(userRepoProvider.get());
  }

  public static SignUpViewModel_Factory create(Provider<UserRepository> userRepoProvider) {
    return new SignUpViewModel_Factory(userRepoProvider);
  }

  public static SignUpViewModel newInstance(UserRepository userRepo) {
    return new SignUpViewModel(userRepo);
  }
}