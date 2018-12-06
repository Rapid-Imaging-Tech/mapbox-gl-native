package com.mapbox.mapboxsdk.location;

import com.mapbox.mapboxsdk.location.modes.CameraMode;

public interface OnLocationCameraTransitionListener {
  void onLocationCameraTransitionFinished(@CameraMode.Mode int cameraMode);
  void onLocationCameraTransitionCanceled(@CameraMode.Mode int cameraMode);
}
