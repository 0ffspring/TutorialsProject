
package com.todorename.tutorialsproject.holdr;

import android.view.View;
import com.todorename.tutorialsproject.R;
import me.tatarka.holdr.Holdr;

public class Holdr_ActivityMain
    extends Holdr
{

    public final static int LAYOUT = R.layout.activity_main;
    /**
     * View for {@link com.todorename.tutorialsproject.R.id#activity_main_image_holder}.
     * 
     */
    public android.widget.ImageView activityMainImageHolder;

    /**
     * Constructs a new {@link me.tatarka.holdr.Holdr} for {@link com.todorename.tutorialsproject.R.layout#activity_main}.
     * 
     * @param view
     *     The root view to search for the holdr's views.
     */
    public Holdr_ActivityMain(View view) {
        super(view);
        activityMainImageHolder = ((android.widget.ImageView) view.findViewById(R.id.activity_main_image_holder));
    }

}
