package com.ypx.imagepicker.data;

import androidx.annotation.Nullable;

import com.ypx.imagepicker.bean.ImageItem;

public interface ITakePhoto {

    void takePhoto();

    void takeVideo();

    void onTakePhotoResult(@Nullable ImageItem imageItem);
}
