package com.example.jetjokes.DI;

import com.example.jetjokes.JokeApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideJokeApiFactory implements Factory<JokeApi> {
  @Override
  public JokeApi get() {
    return provideJokeApi();
  }

  public static AppModule_ProvideJokeApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static JokeApi provideJokeApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideJokeApi());
  }

  private static final class InstanceHolder {
    static final AppModule_ProvideJokeApiFactory INSTANCE = new AppModule_ProvideJokeApiFactory();
  }
}
