package org.spongepowered.asm.launch.platform;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.connect.IMixinConnector;
import org.spongepowered.asm.service.IClassProvider;
import org.spongepowered.asm.service.MixinService;

public class MixinConnectorManager {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final Set<String> connectorClasses = new LinkedHashSet<>();
   private final List<IMixinConnector> connectors = new ArrayList<>();

   MixinConnectorManager() {
   }

   void addConnector(String var1) {
      this.connectorClasses.add(var1);
   }

   void inject() {
      this.loadConnectors();
      this.initConnectors();
   }

   void loadConnectors() {
      IClassProvider var1 = MixinService.getService().getClassProvider();

      for (String var3 : this.connectorClasses) {
         Class var4 = null;

         try {
            Class var5 = var1.findClass(var3);
            if (!IMixinConnector.class.isAssignableFrom(var5)) {
               logger.error("Mixin Connector [" + var3 + "] does not implement IMixinConnector");
               continue;
            }

            var4 = var5;
         } catch (ClassNotFoundException var7) {
            logger.catching(var7);
            continue;
         }

         try {
            IMixinConnector var9 = (IMixinConnector)var4.getDeclaredConstructor().newInstance();
            this.connectors.add(var9);
            logger.info("Successfully loaded Mixin Connector [{}]", var3);
         } catch (ReflectiveOperationException var6) {
            logger.warn("Error loading Mixin Connector [{}]", var3, var6);
         }
      }

      this.connectorClasses.clear();
   }

   void initConnectors() {
      for (IMixinConnector var2 : this.connectors) {
         try {
            var2.connect();
         } catch (Exception var4) {
            logger.warn("Error initialising Mixin Connector [" + var2.getClass().getName() + "]", var4);
         }
      }
   }
}
