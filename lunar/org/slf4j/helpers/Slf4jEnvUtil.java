package org.slf4j.helpers;

public class Slf4jEnvUtil {
   public static String slf4jVersion() {
      Package var0 = Slf4jEnvUtil.class.getPackage();
      return var0 == null ? null : var0.getImplementationVersion();
   }
}
