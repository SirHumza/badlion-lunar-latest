package net.optifine.config;

import net.optifine.util.EntityUtils;

public class EntityClassLocator implements IObjectLocator {
   @Override
   public Object getObject(jy loc) {
      return EntityUtils.getEntityClassByName(loc.a());
   }
}
