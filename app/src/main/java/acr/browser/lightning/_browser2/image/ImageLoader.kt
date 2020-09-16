package acr.browser.lightning._browser2.image

import acr.browser.lightning.database.Bookmark
import android.widget.ImageView

/**
 * Created by anthonycr on 9/15/20.
 */
interface ImageLoader {

    fun loadImage(imageView: ImageView, bookmark: Bookmark)

}
