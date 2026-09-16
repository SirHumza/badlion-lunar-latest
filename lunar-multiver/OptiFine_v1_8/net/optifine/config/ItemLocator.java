package net.optifine.config;

public class ItemLocator implements IObjectLocator {
   @Override
   public Object getObject(jy loc) {
      return zw.d(loc.toString());
   }
}
