package com.hypersoft.shimmera

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerFrameLayout

class ShimmeraColorBase @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val imageView: AppCompatImageView
    private val shimmerViewContainer: ShimmerFrameLayout
    private var shimmerDuration: Long = 1000L
    private var shimmerBaseColor : Int =0
    private var shimmerBaseAlpha: Float = 0.7f
    private var shimmerHighlightAlpha: Float = 1.0f
    private var shimmerHighlightsColor : Int = 0

    private var shimmerDirection = Shimmer.Direction.BOTTOM_TO_TOP
    private var shimmerShape = Shimmer.Shape.RADIAL

    init {
        LayoutInflater.from(context).inflate(R.layout.shimmera_imageview_layout, this, true)
        imageView = findViewById(R.id.image_view)
        shimmerViewContainer = findViewById(R.id.shimmer_view_container)

        // Set up custom attributes
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.ShimmeraColorBase)
            shimmerDuration = typedArray.getInt(R.styleable.ShimmeraColorBase_shimmer_colo_duration, 1000).toLong()
            shimmerBaseAlpha = typedArray.getFloat(R.styleable.ShimmeraColorBase_shimmer_colo_baseAlpha, 0.7f)
            shimmerHighlightAlpha = typedArray.getFloat(R.styleable.ShimmeraColorBase_shimmer_colo_highlightAlpha, 1.0f)
            shimmerBaseColor = typedArray.getColor(R.styleable.ShimmeraColorBase_shimmer_colo_base_color,resources.getColor(R.color.light_gray,context.theme))
            shimmerHighlightsColor = typedArray.getColor(R.styleable.ShimmeraColorBase_shimmer_colo_highlight_color,resources.getColor(R.color.dark_gray,context.theme))

            val directionIndex = typedArray.getInt(R.styleable.ShimmeraColorBase_shimmer_colo_direction, 3)
            shimmerDirection = when (directionIndex) {
                0 -> Shimmer.Direction.LEFT_TO_RIGHT
                1 -> Shimmer.Direction.RIGHT_TO_LEFT
                2 -> Shimmer.Direction.TOP_TO_BOTTOM
                else -> Shimmer.Direction.BOTTOM_TO_TOP
            }
            val shapeIndex = typedArray.getInt(R.styleable.ShimmeraColorBase_shimmer_colo_shape, 1)
            shimmerShape = when (shapeIndex) {
                0 -> Shimmer.Shape.LINEAR
                else -> Shimmer.Shape.RADIAL
            }

            typedArray.recycle()
        }


        // Set up shimmer effect
        val shimmer = Shimmer.ColorHighlightBuilder()
            .setDuration(shimmerDuration)
            .setBaseAlpha(shimmerBaseAlpha)
            .setHighlightAlpha(shimmerHighlightAlpha)
            .setBaseColor(shimmerBaseColor) // Set the base color
            .setDirection(shimmerDirection)
            .setShape(shimmerShape)
            .setHighlightColor(shimmerHighlightsColor)
            .build()
        shimmerViewContainer.setShimmer(shimmer)
    }



    private fun hideShimmer() {
        shimmerViewContainer.stopShimmer() // Stop shimmer
        shimmerViewContainer.hideShimmer()
    }

    fun <T> loadImage(url: T){
        Glide.with(context).load(url).apply(
            RequestOptions().placeholder(R.drawable.placeholder_img))
            .listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>, isFirstResource: Boolean): Boolean {
                    hideShimmer()
                    return false
                }
                override fun onResourceReady(resource: Drawable, model: Any, target: Target<Drawable>?, dataSource: DataSource, isFirstResource: Boolean): Boolean {
                    hideShimmer()
                    return false
                }

            })
            .into(imageView)
    }
}