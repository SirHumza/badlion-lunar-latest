package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigSyntax;
import java.util.ArrayList;
import java.util.Collection;

final class ConfigNodeRoot extends ConfigNodeComplexValue {
   private final ConfigOrigin origin;

   ConfigNodeRoot(Collection<AbstractConfigNode> var1, ConfigOrigin var2) {
      super(var1);
      this.origin = var2;
   }

   protected ConfigNodeRoot newNode(Collection<AbstractConfigNode> var1) {
      throw new ConfigException.BugOrBroken("Tried to indent the root object");
   }

   protected ConfigNodeComplexValue value() {
      for (AbstractConfigNode var2 : this.children) {
         if (var2 instanceof ConfigNodeComplexValue) {
            return (ConfigNodeComplexValue)var2;
         }
      }

      throw new ConfigException.BugOrBroken("ConfigNodeRoot did not contain a value");
   }

   protected ConfigNodeRoot setValue(String var1, AbstractConfigNodeValue var2, ConfigSyntax var3) {
      ArrayList var4 = new ArrayList<>(this.children);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         AbstractConfigNode var6 = (AbstractConfigNode)var4.get(var5);
         if (var6 instanceof ConfigNodeComplexValue) {
            if (var6 instanceof ConfigNodeArray) {
               throw new ConfigException.WrongType(
                  this.origin, "The ConfigDocument had an array at the root level, and values cannot be modified inside an array."
               );
            }

            if (var6 instanceof ConfigNodeObject) {
               if (var2 == null) {
                  var4.set(var5, ((ConfigNodeObject)var6).removeValueOnPath(var1, var3));
               } else {
                  var4.set(var5, ((ConfigNodeObject)var6).setValueOnPath(var1, var2, var3));
               }

               return new ConfigNodeRoot(var4, this.origin);
            }
         }
      }

      throw new ConfigException.BugOrBroken("ConfigNodeRoot did not contain a value");
   }

   protected boolean hasValue(String var1) {
      Path var2 = PathParser.parsePath(var1);
      ArrayList var3 = new ArrayList<>(this.children);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         AbstractConfigNode var5 = (AbstractConfigNode)var3.get(var4);
         if (var5 instanceof ConfigNodeComplexValue) {
            if (var5 instanceof ConfigNodeArray) {
               throw new ConfigException.WrongType(
                  this.origin, "The ConfigDocument had an array at the root level, and values cannot be modified inside an array."
               );
            }

            if (var5 instanceof ConfigNodeObject) {
               return ((ConfigNodeObject)var5).hasValue(var2);
            }
         }
      }

      throw new ConfigException.BugOrBroken("ConfigNodeRoot did not contain a value");
   }
}
