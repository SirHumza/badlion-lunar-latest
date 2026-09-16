package org.spongepowered.asm.launch.platform.container;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ContainerHandleVirtual implements IContainerHandle {
   private final String name;
   private final Map<String, String> attributes = new HashMap<>();
   private final Set<IContainerHandle> nestedContainers = new LinkedHashSet<>();

   public ContainerHandleVirtual(String var1) {
      this.name = var1;
   }

   @Override
   public String getId() {
      return this.name;
   }

   @Override
   public String getDescription() {
      return this.toString();
   }

   public String getName() {
      return this.name;
   }

   public ContainerHandleVirtual setAttribute(String var1, String var2) {
      this.attributes.put(var1, var2);
      return this;
   }

   public ContainerHandleVirtual add(IContainerHandle var1) {
      this.nestedContainers.add(var1);
      return this;
   }

   @Override
   public String getAttribute(String var1) {
      return this.attributes.get(var1);
   }

   @Override
   public Collection<IContainerHandle> getNestedContainers() {
      return Collections.unmodifiableSet(this.nestedContainers);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof String && var1.toString().equals(this.name);
   }

   @Override
   public int hashCode() {
      return this.name.hashCode();
   }

   @Override
   public String toString() {
      return String.format("ContainerHandleVirtual(%s:%x)", this.name, this.hashCode());
   }
}
