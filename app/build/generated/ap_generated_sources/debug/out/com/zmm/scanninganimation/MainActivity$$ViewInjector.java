// Generated code from Butter Knife. Do not modify!
package com.zmm.scanninganimation;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.zmm.scanninganimation.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165234, "field 'mIvDeviceCaliShoes'");
    target.mIvDeviceCaliShoes = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131165233, "field 'mIvDeviceCaliScanning'");
    target.mIvDeviceCaliScanning = (android.widget.ImageView) view;
  }

  public static void reset(com.zmm.scanninganimation.MainActivity target) {
    target.mIvDeviceCaliShoes = null;
    target.mIvDeviceCaliScanning = null;
  }
}
