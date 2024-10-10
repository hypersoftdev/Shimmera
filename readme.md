[![](https://jitpack.io/v/hypersoftdev/Shimmera.svg)](https://jitpack.io/#hypersoftdev/Shimmera)

# Shimmera

**Shimmera** is an Android library that displays a shimmer effect over images while they load using Glide. It supports customizable placeholder images, shimmer duration, direction, shape, colors, and more. **Shimmera** aims to enhance user experience during image loading by adding a visually engaging shimmer effect.

## Features:

- **Shimmer with Placeholder**: Adds a shimmer effect alongside a placeholder image during loading.
- **Color Customization**: Allows customization of shimmer base and highlight colors.
- **Direction and Shape**: Configures the shimmer's animation direction and shape (linear or radial).
- **Glide Integration**: Efficiently handles image loading with placeholders using Glide.

## Step-by-Step Usage:

### 1. Dependency Addition

To use the **Shimmera**, follow these steps to update your Gradle files.

#### Gradle Integration

##### Step A: Add Maven Repository
In your **project-level** `build.gradle` or `settings.gradle` file, add the following repository:

```
repositories {
    google()
    mavenCentral()
    maven { url "https://jitpack.io" }
}
```

### Step B: Add Dependencies

Include the **Shimmera** library in your **app-level** `build.gradle` file. Replace `x.x.x` with the latest version: [![](https://jitpack.io/v/hypersoftdev/Shimmera.svg)](https://jitpack.io/#hypersoftdev/Shimmera)

```
implementation 'com.github.hypersoftdev:Shimmera:x.x.x'
```

## Usage:

### 1. Shimmer with Placeholder

You can use the `ShimmeraWithPlaceholder` class to display an image with a shimmer effect and a placeholder while the image is loading.

#### XML Example:

```
<com.hypersoft.shimmera.ShimmeraWithPlaceholder
    android:id="@+id/shimmerPlaceholder"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:pl_shimmer_duration="1000"
    app:pl_shimmer_baseAlpha="0.7"
    app:pl_shimmer_highlightAlpha="1.0"
    app:pl_placeholderImage="@drawable/placeholder_img"
    app:shimmer_placeholder_direction="left_to_right"
    app:shimmer_placeholder_shape="linear" />
```

#### Loading Image Programmatically:

```
val shimmerPlaceholder = findViewById<ShimmeraWithPlaceholder>(R.id.shimmerPlaceholder)
shimmerPlaceholder.loadImage("https://example.com/image.jpg")

```

### 2. Shimmer with Custom Colors

Use the `ShimmeraColorBase` class for a shimmer effect with custom base and highlight colors.

#### XML Example:

```
<com.hypersoft.shimmera.ShimmeraColorBase
android:id="@+id/shimmerColor"
android:layout_width="match_parent"
android:layout_height="wrap_content"
app:shimmer_colo_duration="1500"
app:shimmer_colo_baseAlpha="0.6"
app:shimmer_colo_base_color="@color/baseColor"
app:shimmer_colo_highlightAlpha="0.8"
app:shimmer_colo_highlight_color="@color/highlightColor"
app:shimmer_colo_direction="top_to_bottom"
app:shimmer_colo_shape="radial" />

```

#### Loading Image Programmatically:

```
val shimmerColor = findViewById<ShimmeraColorBase>(R.id.shimmerColor)
shimmerColor.loadImage("https://example.com/image.jpg")
```

## Custom Attributes:

### ShimmeraWithPlaceholder Attributes:

| **Attribute**                | **Description**                                               | **Default**   |
|------------------------------|---------------------------------------------------------------|---------------|
| `pl_shimmer_duration`         | Duration of the shimmer effect (in milliseconds)              | 1000 ms       |
| `pl_shimmer_baseAlpha`        | Base alpha (opacity) of the shimmer                           | 0.7           |
| `pl_shimmer_highlightAlpha`   | Highlight alpha (opacity) of the shimmer                      | 1.0           |
| `pl_placeholderImage`         | Drawable resource ID for the placeholder image                | N/A           |
| `shimmer_placeholder_direction`| Direction of the shimmer animation (`left_to_right`, `top_to_bottom`, etc.) | `bottom_to_top` |
| `shimmer_placeholder_shape`   | Shape of the shimmer animation (`linear` or `radial`)         | `radial`      |

### ShimmeraColorBase Attributes:

| **Attribute**                | **Description**                                               | **Default**   |
|------------------------------|---------------------------------------------------------------|---------------|
| `shimmer_colo_duration`       | Duration of the shimmer effect (in milliseconds)              | 1000 ms       |
| `shimmer_colo_baseAlpha`      | Base alpha (opacity) of the shimmer                           | 0.7           |
| `shimmer_colo_highlightAlpha` | Highlight alpha (opacity) of the shimmer                      | 1.0           |
| `shimmer_colo_base_color`     | Base color of the shimmer                                     | `light_gray`  |
| `shimmer_colo_highlight_color`| Highlight color of the shimmer                                | `dark_gray`   |
| `shimmer_colo_direction`      | Direction of the shimmer animation (`left_to_right`, `top_to_bottom`, etc.) | `bottom_to_top` |
| `shimmer_colo_shape`          | Shape of the shimmer animation (`linear` or `radial`)         | `radial`      |

## Screen Demo

![Demo1](https://github.com/hypersoftdev/Shimmera/blob/master/screens/screen_color_effect.gif?raw=true)
![Demo2](https://github.com/hypersoftdev/Shimmera/blob/master/screens/screen_place_holder.gif?raw=true)

# Acknowledgements

This work would not have been possible without the invaluable contributions of **Jamshed Mehmood**. His expertise, dedication, and unwavering support have been instrumental in bringing this project to fruition.

![Profile](https://github.com/hypersoftdev/Shimmera/blob/master/screens/profile_image.jpg?raw=true)

We are deeply grateful for **Jamshed Mehmood** involvement and his belief in the importance of this work. His contributions have made a significant impact, and we are honored to have had the opportunity to collaborate with him.

# LICENSE

Copyright 2020 Hypersoft Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
