package com.todorename.tutorialsproject;

import android.app.Application;
import dagger.ObjectGraph;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ivbaranov on 10.10.14.
 */
public class App extends Application {

  private ObjectGraph objectGraph;

  @Override
  public void onCreate() {
    super.onCreate();
    objectGraph = ObjectGraph.create(getModules().toArray());
    objectGraph.inject(this);
  }

  public ObjectGraph createScopedGraph(Object... modules) {
    return objectGraph.plus(modules);
  }

  private List<Object> getModules() {
    return Arrays.asList(new AppModule());
  }
}
