# Android-Img2Ascii
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Img2Ascii-red.svg?style=flat)](https://android-arsenal.com/details/1/6393)
[![Release](https://jitpack.io/v/bachors/Android-Img2Ascii.svg)](https://jitpack.io/#bachors/Android-Img2Ascii)

Convert image to ascii.

Gradle
------
```
allprojects {
   repositories {
      ...
      maven { url 'https://jitpack.io' }
   }
}
```
```
dependencies {
    ...
    compile 'com.github.bachors:Android-Img2Ascii:2.0'
}
```

Usage
-----
```java
...

// bitmap
Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.image);
// Bitmap image = BitmapFactory.decodeFile(filename);

new Img2Ascii()
   .bitmap(image)
   .quality(3) // 1 - 3
   //.color(true)
   .convert(new Img2Ascii.Listener() {
      @Override
      public void onProgress(int percentage) {
         textView.setText(String.valueOf(percentage) + " %");
      }
      @Override
      public void onResponse(Spannable text) {
         textView.setText(text);
      }
   });
```

Demo
-----
![demo](https://4.bp.blogspot.com/-fs8GtDDO7NI/WfhsyEbABII/AAAAAAAAB38/gpTfmPAkNIsPvs2CuVmEqmXX02NTk0O_ACLcBGAs/s1600/PhotoGrid_1509452593105.jpg)
