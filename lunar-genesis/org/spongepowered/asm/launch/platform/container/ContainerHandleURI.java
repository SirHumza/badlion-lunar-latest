package org.spongepowered.asm.launch.platform.container;

import java.io.File;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import org.spongepowered.asm.launch.platform.MainAttributes;
import org.spongepowered.asm.util.Files;

public class ContainerHandleURI implements IContainerHandle {
   private final URI uri;
   private final MainAttributes attributes;

   public ContainerHandleURI(URI var1) {
      this.uri = var1;
      this.attributes = MainAttributes.of(var1);
   }

   @Override
   public String getId() {
      return null;
   }

   @Override
   public String getDescription() {
      return this.uri.toString();
   }

   public URI getURI() {
      return this.uri;
   }

   @Deprecated
   public File getFile() {
      return this.uri != null && "file".equals(this.uri.getScheme()) ? Files.toFile(this.uri) : null;
   }

   @Override
   public String getAttribute(String var1) {
      return this.attributes.get(var1);
   }

   @Override
   public Collection<IContainerHandle> getNestedContainers() {
      return Collections.emptyList();
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof ContainerHandleURI) ? false : this.uri.equals(((ContainerHandleURI)var1).uri);
   }

   @Override
   public int hashCode() {
      return this.uri.hashCode();
   }

   @Override
   public String toString() {
      return String.format("ContainerHandleURI(%s)", this.uri);
   }
}
