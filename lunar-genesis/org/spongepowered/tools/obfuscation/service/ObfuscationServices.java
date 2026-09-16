package org.spongepowered.tools.obfuscation.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.Map.Entry;
import javax.tools.Diagnostic.Kind;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.tools.obfuscation.ObfuscationType;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;

public final class ObfuscationServices {
   private static ObfuscationServices instance;
   private final ServiceLoader<IObfuscationService> serviceLoader;
   private final Set<IObfuscationService> services = new HashSet<>();
   private boolean providerInitDone = false;

   private ObfuscationServices() {
      this.serviceLoader = ServiceLoader.load(IObfuscationService.class, this.getClass().getClassLoader());
   }

   public static ObfuscationServices getInstance() {
      if (instance == null) {
         instance = new ObfuscationServices();
      }

      return instance;
   }

   public void initProviders(IMixinAnnotationProcessor var1) {
      if (!this.providerInitDone) {
         this.providerInitDone = true;
         boolean var2 = false;
         LinkedHashMap var3 = new LinkedHashMap();

         try {
            for (IObfuscationService var5 : this.serviceLoader) {
               if (!this.services.contains(var5)) {
                  this.services.add(var5);
                  String var6 = var5.getClass().getSimpleName();
                  Collection var7 = var5.getObfuscationTypes(var1);
                  if (var7 != null) {
                     for (ObfuscationTypeDescriptor var9 : var7) {
                        try {
                           ObfuscationType var10 = ObfuscationType.create(var9, var1);
                           Set var11 = (Set)var3.get(var6);
                           if (var11 == null) {
                              var3.put(var6, var11 = new LinkedHashSet());
                           }

                           var11.add(var10.getKey());
                           var2 |= var10.isDefault();
                        } catch (Exception var12) {
                           var12.printStackTrace();
                        }
                     }
                  }
               }
            }
         } catch (ServiceConfigurationError var13) {
            var1.printMessage(Kind.ERROR, var13.getClass().getSimpleName() + ": " + var13.getMessage());
            var13.printStackTrace();
         }

         if (var3.size() > 0) {
            StringBuilder var14 = new StringBuilder("Supported obfuscation types:");

            for (Entry var17 : var3.entrySet()) {
               var14.append(' ').append((String)var17.getKey()).append(" supports [").append(Joiner.on(',').join((Iterable<?>)var17.getValue())).append(']');
            }

            var1.printMessage(IMessagerEx.MessageType.INFO, var14.toString());
         }

         if (!var2) {
            String var15 = var1.getOption("defaultObfuscationEnv");
            if (var15 == null) {
               var1.printMessage(
                  Kind.WARNING,
                  "No default obfuscation environment was specified and \"searge\" is not available. Please ensure defaultObfuscationEnv is specified in your build configuration"
               );
            } else {
               var1.printMessage(
                  Kind.WARNING,
                  "Specified default obfuscation environment \""
                     + var15.toLowerCase(Locale.ROOT)
                     + "\" was not defined. This probably means your build configuration is out of date or a required service is missing"
               );
            }
         }
      }
   }

   public Set<String> getSupportedOptions() {
      HashSet var1 = new HashSet();

      for (IObfuscationService var3 : this.services) {
         Set var4 = var3.getSupportedOptions();
         if (var4 != null) {
            var1.addAll(var4);
         }
      }

      return var1;
   }

   public IObfuscationService getService(Class<? extends IObfuscationService> var1) {
      for (IObfuscationService var3 : this.services) {
         if (var1.getName().equals(var3.getClass().getName())) {
            return var3;
         }
      }

      return null;
   }
}
