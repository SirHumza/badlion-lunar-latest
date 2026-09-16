package org.spongepowered.asm.launch.platform.container;

import java.nio.file.Path;
import java.util.List;
import java.util.Map.Entry;
import org.spongepowered.asm.service.MixinService;

public class ContainerHandleModLauncher extends ContainerHandleVirtual {
   public ContainerHandleModLauncher(String var1) {
      super(var1);
   }

   public void addResource(String var1, Path var2) {
      this.add(new ContainerHandleModLauncher.Resource(var1, var2));
   }

   public void addResource(Entry<String, Path> var1) {
      this.add(new ContainerHandleModLauncher.Resource((String)var1.getKey(), (Path)var1.getValue()));
   }

   public void addResource(Object var1) {
      if (var1 instanceof Entry) {
         this.addResource((Entry<String, Path>)var1);
      } else {
         MixinService.getService().getLogger("mixin").error("Unrecognised resource type {} passed to {}", var1.getClass(), this);
      }
   }

   public void addResources(List<?> var1) {
      for (Object var3 : var1) {
         this.addResource(var3);
      }
   }

   @Override
   public String toString() {
      return String.format("ModLauncher Root Container(%s:%x)", this.getName(), this.hashCode());
   }

   class Resource extends ContainerHandleURI {
      private String name;
      private Path path;

      public Resource(String var2, Path var3) {
         super(var3.toUri());
         this.name = var2;
         this.path = var3;
      }

      @Override
      public String getId() {
         String var1 = this.name;
         int var2 = var1.lastIndexOf(46);
         if (var2 > 0) {
            var1 = var1.substring(0, var2);
         }

         return var1;
      }

      @Override
      public String getDescription() {
         return this.path.toAbsolutePath().toString();
      }

      @Override
      public String toString() {
         return String.format("ContainerHandleModLauncher.Resource(%s:%s)", this.name, this.path);
      }
   }
}
