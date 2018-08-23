package com.wootography.photofilters.Interface

/**
 * Created by y.moskalev on 22.08.2018.
 * You can contact me at: y.moskalev@gmail.com
 */
interface EditImageFragmentListener {
    fun onBrightnessChanged(brightness: Int)
    fun onSaturationChanged(saturation: Int)
    fun onConstrantChanged(constrant: Int)
    fun onEditStarted()
    fun onEditComplited()
}