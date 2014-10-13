package com.todorename.tutorialsproject;

/**
 * Created by ivbaranov on 09.10.14.
 */
public class MainPresenterImpl implements MainPresenter {

  private MainView mainView;
  private PathInteractor pathInteractor;
  //чего делать с path? как его еще передать из интерактора во вью?
  private String path;

  public MainPresenterImpl(MainView mainView, PathInteractor pathInteractor){
    this.mainView = mainView;
    this.pathInteractor = pathInteractor;
  }

  @Override public void initPicture() {
    this.path = pathInteractor.getPath();
    mainView.showPicture(this.path);

  }

  @Override public void setTostText() {
    mainView.onPictureClicked("Путь к картинке: " + this.path);
  }
}

/* TODO RENAME */