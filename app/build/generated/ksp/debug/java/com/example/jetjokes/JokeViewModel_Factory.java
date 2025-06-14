package com.example.jetjokes;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class JokeViewModel_Factory implements Factory<JokeViewModel> {
  private final Provider<JokeApi> apiProvider;

  public JokeViewModel_Factory(Provider<JokeApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public JokeViewModel get() {
    return newInstance(apiProvider.get());
  }

  public static JokeViewModel_Factory create(Provider<JokeApi> apiProvider) {
    return new JokeViewModel_Factory(apiProvider);
  }

  public static JokeViewModel newInstance(JokeApi api) {
    return new JokeViewModel(api);
  }
}
