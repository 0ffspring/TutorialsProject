package com.todorename.tutorialsproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.squareup.picasso.Picasso;
import com.todorename.tutorialsproject.holdr.Holdr_ActivityMain;
import dagger.ObjectGraph;
import javax.inject.Inject;

public class MainActivity extends Activity implements MainView {

  private ObjectGraph activityGraph;

  @Inject MainPresenter presenter;
  private Holdr_ActivityMain holdr;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);
    activityGraph = ((App) getApplication()).createScopedGraph(new MainModule(this));
    activityGraph.inject(this);

    holdr = new Holdr_ActivityMain(findViewById(R.id.activity_main_image_holder));
    presenter.initPicture();
    holdr.activityMainImageHolder.setOnClickListener(view -> presenter.setTostText());
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    activityGraph = null;
  }

  @Override public void showPicture(String path) {
    Picasso.with(this).load(path).into(holdr.activityMainImageHolder);
  }

  @Override public void onPictureClicked(String text) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show();
  }
}
