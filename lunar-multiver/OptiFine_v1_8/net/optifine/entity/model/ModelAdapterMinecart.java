package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterMinecart extends ModelAdapter {
   public ModelAdapterMinecart() {
      super(va.class, "minecart", 0.5F);
   }

   protected ModelAdapterMinecart(Class entityClass, String name, float shadow) {
      super(entityClass, name, shadow);
   }

   @Override
   public bbo makeModel() {
      return new bbn();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbn)) {
         return null;
      } else {
         bbn modelMinecart = (bbn)model;
         if (modelPart.equals("bottom")) {
            return modelMinecart.a[0];
         } else if (modelPart.equals("back")) {
            return modelMinecart.a[1];
         } else if (modelPart.equals("front")) {
            return modelMinecart.a[2];
         } else if (modelPart.equals("right")) {
            return modelMinecart.a[3];
         } else if (modelPart.equals("left")) {
            return modelMinecart.a[4];
         } else {
            return modelPart.equals("dirt") ? modelMinecart.a[5] : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"bottom", "back", "front", "right", "left", "dirt"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bjm render = new bjm(renderManager);
      if (!Reflector.RenderMinecart_modelMinecart.exists()) {
         Config.warn("Field not found: RenderMinecart.modelMinecart");
         return null;
      } else {
         Reflector.setFieldValue(render, Reflector.RenderMinecart_modelMinecart, modelBase);
         render.c = shadowSize;
         return render;
      }
   }
}
