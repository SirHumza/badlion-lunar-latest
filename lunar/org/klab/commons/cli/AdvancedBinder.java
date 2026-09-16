package org.klab.commons.cli;

import java.io.File;
import java.lang.reflect.Field;
import vavi.beans.BeanUtil;
import vavi.beans.DefaultBinder;

public class AdvancedBinder extends DefaultBinder {
   public void bind(Object var1, Field var2, Class<?> var3, String var4, Object var5) {
      if (var3.equals(Boolean.class)) {
         BeanUtil.setFieldValue(var2, var1, var4 != null && var4.length() != 0 ? Boolean.parseBoolean(var4) : Boolean.TRUE);
      } else if (var3.equals(boolean.class)) {
         BeanUtil.setFieldValue(var2, var1, var4 != null && var4.length() != 0 ? Boolean.parseBoolean(var4) : true);
      } else if (var3.equals(File.class)) {
         BeanUtil.setFieldValue(var2, var1, var4 != null && var4.length() != 0 ? new File(var4) : null);
      } else {
         super.bind(var1, var2, var3, var4, var5);
      }
   }
}
