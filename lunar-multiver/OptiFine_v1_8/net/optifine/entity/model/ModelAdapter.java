package net.optifine.entity.model;

import java.util.ArrayList;
import java.util.List;

public abstract class ModelAdapter {
   private Class entityClass;
   private String name;
   private float shadowSize;
   private String[] aliases;

   public ModelAdapter(Class entityClass, String name, float shadowSize) {
      this.entityClass = entityClass;
      this.name = name;
      this.shadowSize = shadowSize;
   }

   public ModelAdapter(Class entityClass, String name, float shadowSize, String[] aliases) {
      this.entityClass = entityClass;
      this.name = name;
      this.shadowSize = shadowSize;
      this.aliases = aliases;
   }

   public Class getEntityClass() {
      return this.entityClass;
   }

   public String getName() {
      return this.name;
   }

   public String[] getAliases() {
      return this.aliases;
   }

   public float getShadowSize() {
      return this.shadowSize;
   }

   public abstract bbo makeModel();

   public abstract bct getModelRenderer(bbo var1, String var2);

   public abstract String[] getModelRendererNames();

   public abstract IEntityRenderer makeEntityRender(bbo var1, float var2);

   public bct[] getModelRenderers(bbo model) {
      String[] names = this.getModelRendererNames();
      List<bct> list = new ArrayList<>();

      for (int i = 0; i < names.length; i++) {
         String name = names[i];
         bct mr = this.getModelRenderer(model, name);
         if (mr != null) {
            list.add(mr);
         }
      }

      return list.toArray(new bct[list.size()]);
   }
}
