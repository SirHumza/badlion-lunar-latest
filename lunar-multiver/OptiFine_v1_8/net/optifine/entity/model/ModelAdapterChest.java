package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterChest extends ModelAdapter {
   public ModelAdapterChest() {
      super(aky.class, "chest", 0.0F);
   }

   @Override
   public bbo makeModel() {
      return new baz();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof baz)) {
         return null;
      } else {
         baz modelChest = (baz)model;
         if (modelPart.equals("lid")) {
            return modelChest.a;
         } else if (modelPart.equals("base")) {
            return modelChest.b;
         } else {
            return modelPart.equals("knob") ? modelChest.c : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"lid", "base", "knob"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      bhc dispatcher = bhc.a;
      bhd renderer = dispatcher.a(aky.class);
      if (!(renderer instanceof bhe)) {
         return null;
      }

      if (renderer.getEntityClass() == null) {
         renderer = new bhe();
         renderer.a(dispatcher);
      }

      if (!Reflector.TileEntityChestRenderer_simpleChest.exists()) {
         Config.warn("Field not found: TileEntityChestRenderer.simpleChest");
         return null;
      } else {
         Reflector.setFieldValue(renderer, Reflector.TileEntityChestRenderer_simpleChest, modelBase);
         return renderer;
      }
   }
}
