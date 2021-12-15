To modify/update the html/game files, `app/src/main/assets/game` is the location you want to look at.

I do have `WebView.setWebContentsDebuggingEnabled(BuildConfig.DEBUG)` set so only on debug builds will this be available.
If you want to disable this entirely, just comment it out in the `MainActivity`.

To change the name of the app, go to `app/src/main/res/values/strings.xml` and you'll find a resource named `app_name`. Change it there.

To change the icon, put the icons in the mipmap folder and in the manifest (`src/main/AndroidManifest.xml`), you'll see an attribute of the application tag called `icon`.
That's where you'll change it. Most probably to something similar to `@mipmap/[name_of_icon_here]`.