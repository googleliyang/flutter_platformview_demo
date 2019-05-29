#import "FlutterPluginDemoPlugin.h"
#import <flutter_plugin_demo/flutter_plugin_demo-Swift.h>

@implementation FlutterPluginDemoPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterPluginDemoPlugin registerWithRegistrar:registrar];
}
@end
