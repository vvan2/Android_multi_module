package org.umc.eatthis_compose.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> clientProvider;

  private final Provider<Converter.Factory> converterFactoryProvider;

  public NetworkModule_ProvidesRetrofitFactory(Provider<OkHttpClient> clientProvider,
      Provider<Converter.Factory> converterFactoryProvider) {
    this.clientProvider = clientProvider;
    this.converterFactoryProvider = converterFactoryProvider;
  }

  @Override
  public Retrofit get() {
    return providesRetrofit(clientProvider.get(), converterFactoryProvider.get());
  }

  public static NetworkModule_ProvidesRetrofitFactory create(Provider<OkHttpClient> clientProvider,
      Provider<Converter.Factory> converterFactoryProvider) {
    return new NetworkModule_ProvidesRetrofitFactory(clientProvider, converterFactoryProvider);
  }

  public static Retrofit providesRetrofit(OkHttpClient client, Converter.Factory converterFactory) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesRetrofit(client, converterFactory));
  }
}
