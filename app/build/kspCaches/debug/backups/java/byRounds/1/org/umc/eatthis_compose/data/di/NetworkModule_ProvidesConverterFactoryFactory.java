package org.umc.eatthis_compose.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.Converter;

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
    "cast"
})
public final class NetworkModule_ProvidesConverterFactoryFactory implements Factory<Converter.Factory> {
  @Override
  public Converter.Factory get() {
    return providesConverterFactory();
  }

  public static NetworkModule_ProvidesConverterFactoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Converter.Factory providesConverterFactory() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesConverterFactory());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvidesConverterFactoryFactory INSTANCE = new NetworkModule_ProvidesConverterFactoryFactory();
  }
}
