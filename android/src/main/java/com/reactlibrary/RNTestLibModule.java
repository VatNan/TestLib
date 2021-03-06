
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNTestLibModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNTestLibModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNTestLib";
  }

    @ReactMethod
    public void testText(String msg, Callback cb) {
      cb.invoke("Hello: " + msg);
    }
}