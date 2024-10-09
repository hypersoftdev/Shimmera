**Shimmra Library Documentation**

**Introduction:**

Shimmra is an Android library that displays a shimmer effect over images while they load using Glide. It supports customizable placeholder images, shimmer duration, direction, shape, colors, and more. Shimmra aims to improve user experience during image loading by adding a visually engaging shimmer effect.

**Features:**

- **Shimmer with Placeholder**: Adds a shimmer effect alongside a placeholder image during loading.
- **Color Customization**: Allows customization of shimmer base and highlight colors.
- **Direction and Shape**: Configures the shimmer's animation direction and shape (linear or radial).
- **Glide Integration**: Uses Glide to handle image loading efficiently, including placeholders.

**Installation:**

To install the library, add the following to your project’s build.gradle file:



dependencies {

implementation 'com.github.yourusername:shimmra:1.0.0'

}

**Usage:**

**1\. Shimmer with Placeholder**

You can use the ShimmeraWithPlaceholder class to display an image with a shimmer effect and a placeholder while the image is being loaded.

**XML Example:**



<com.example.shimmer.ShimmeraWithPlaceholder

android:id="@+id/shimmerPlaceholder"

android:layout_width="match_parent"

android:layout_height="wrap_content"

app:pl_shimmer_duration="1000"

app:pl_shimmer_baseAlpha="0.7"

app:pl_shimmer_highlightAlpha="1.0"

app:pl_placeholderImage="@drawable/placeholder_img"

app:shimmer_placeholder_direction="left_to_right"

app:shimmer_placeholder_shape="linear" />

**Loading Image Programmatically:**



val shimmerPlaceholder = findViewById&lt;ShimmeraWithPlaceholder&gt;(R.id.shimmerPlaceholder)

shimmerPlaceholder.loadImage("<https://example.com/image.jpg>")

**2\. Shimmer with Custom Colors**

Use the ShimmeraColorBase class for a shimmer effect with custom base and highlight colors.

**XML Example:**



<com.example.shimmer.ShimmeraColorBase

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

**Loading Image Programmatically:**



val shimmerColor = findViewById&lt;ShimmeraColorBase&gt;(R.id.shimmerColor)

shimmerColor.loadImage("<https://example.com/image.jpg>")

**Custom Attributes:**

**ShimmeraWithPlaceholder Attributes:**

| **Attribute** | **Description** | **Default** |
| --- | --- | --- |
| pl_shimmer_duration | Duration of the shimmer effect (in milliseconds) | 1000 |
| pl_shimmer_baseAlpha | Base alpha of the shimmer | 0.7 |
| pl_shimmer_highlightAlpha | Highlight alpha of the shimmer | 1.0 |
| pl_placeholderImage | Drawable resource ID for the placeholder image | N/A |
| shimmer_placeholder_direction | Direction of the shimmer animation | bottom_to_top |
| shimmer_placeholder_shape | Shape of the shimmer animation (linear or radial) | radial |

**ShimmeraColorBase Attributes:**

| **Attribute** | **Description** | **Default** |
| --- | --- | --- |
| shimmer_colo_duration | Duration of the shimmer effect (in milliseconds) | 1000 |
| shimmer_colo_baseAlpha | Base alpha of the shimmer | 0.7 |
| shimmer_colo_highlightAlpha | Highlight alpha of the shimmer | 1.0 |
| shimmer_colo_base_color | Base color of the shimmer | light_gray |
| shimmer_colo_highlight_color | Highlight color of the shimmer | dark_gray |
| shimmer_colo_direction | Direction of the shimmer animation | bottom_to_top |
| shimmer_colo_shape | Shape of the shimmer animation (linear or radial) | radial |

**License:**

The Shimmra library is distributed under the MIT License.