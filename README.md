# Android-Img2Ascii
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
    compile 'com.github.bachors:Android-Img2Ascii:1.0'
}
```

Usage
-----
```java
...

// bitmap
Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.image);
// Bitmap image = BitmapFactory.decodeFile(filename);

// quality
int quality = 3; // 1 - 3

// convert image(bitmap) to ascii(string)
Img2Ascii image2ascii = new Img2Ascii();
String ascii = image2ascii.convert(image, quality);

// textView.setTypeface(monospaceFont);
// textView.setText(ascii);
```

Demo
-----
![demo](https://4.bp.blogspot.com/-fs8GtDDO7NI/WfhsyEbABII/AAAAAAAAB38/gpTfmPAkNIsPvs2CuVmEqmXX02NTk0O_ACLcBGAs/s1600/PhotoGrid_1509452593105.jpg)
