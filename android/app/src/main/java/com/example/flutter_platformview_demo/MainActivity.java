package com.example.flutter_platformview_demo;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import io.flutter.plugins.GeneratedPluginRegistrant;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import static io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import static io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformView;
public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // registrarFor("kitty").platformViewRegistry()
     //       .registerViewFactory("plugins.felix.angelov/textview", new TextViewFactory(registrarFor("kitty").messenger()));
    final String key = MainActivity.class.getCanonicalName();
    if (this.hasPlugin(key)) return;
    PluginRegistry.Registrar regis =  this.registrarFor(key);
    regis.platformViewRegistry().registerViewFactory("plugins.felix.angelov/textview", new TextViewFactory(regis.messenger()));

//    MyViewFlutterPlugin.registerWith(this);

    GeneratedPluginRegistrant.registerWith(this);
  }
}
