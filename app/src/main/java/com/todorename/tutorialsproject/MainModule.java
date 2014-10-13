package com.todorename.tutorialsproject;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by ivbaranov on 09.10.14.
 */
@Module(
    injects = {
        MainActivity.class
    },
    addsTo = AppModule.class)
public class MainModule {
  private MainView mainView;

  public MainModule(MainView mainView) {
    this.mainView = mainView;
  }

  //@Provides @Singleton public MainActivity provideContext() {
  //  return mainView;
  //}

  @Provides @Singleton public PathInteractor providePathInteractor() {
    return new PathInteractorImpl();
  }

  @Provides @Singleton public MainPresenter provideMainPresenter(PathInteractor p) {
    return new MainPresenterImpl(mainView, p);
  }
}