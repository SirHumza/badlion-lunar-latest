package org.slf4j.helpers;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Marker;

public class BasicMarker implements Marker {
   private static final long serialVersionUID = -2849567615646933777L;
   private final String name;
   private final List<Marker> referenceList = new CopyOnWriteArrayList<>();
   private static final String OPEN = "[ ";
   private static final String CLOSE = " ]";
   private static final String SEP = ", ";

   BasicMarker(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("A marker name cannot be null");
      }

      this.name = var1;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public void add(Marker var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
      }

      if (!this.contains(var1)) {
         if (!var1.contains(this)) {
            this.referenceList.add(var1);
         }
      }
   }

   @Override
   public boolean hasReferences() {
      return this.referenceList.size() > 0;
   }

   @Deprecated
   @Override
   public boolean hasChildren() {
      return this.hasReferences();
   }

   @Override
   public Iterator<Marker> iterator() {
      return this.referenceList.iterator();
   }

   @Override
   public boolean remove(Marker var1) {
      return this.referenceList.remove(var1);
   }

   @Override
   public boolean contains(Marker var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Other cannot be null");
      }

      if (this.equals(var1)) {
         return true;
      }

      if (this.hasReferences()) {
         for (Marker var3 : this.referenceList) {
            if (var3.contains(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean contains(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Other cannot be null");
      }

      if (this.name.equals(var1)) {
         return true;
      }

      if (this.hasReferences()) {
         for (Marker var3 : this.referenceList) {
            if (var3.contains(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (!(var1 instanceof Marker)) {
         return false;
      }

      Marker var2 = (Marker)var1;
      return this.name.equals(var2.getName());
   }

   @Override
   public int hashCode() {
      return this.name.hashCode();
   }

   @Override
   public String toString() {
      if (!this.hasReferences()) {
         return this.getName();
      }

      Iterator var1 = this.iterator();
      StringBuilder var3 = new StringBuilder(this.getName());
      var3.append(' ').append("[ ");

      while (var1.hasNext()) {
         Marker var2 = (Marker)var1.next();
         var3.append(var2.getName());
         if (var1.hasNext()) {
            var3.append(", ");
         }
      }

      var3.append(" ]");
      return var3.toString();
   }
}
