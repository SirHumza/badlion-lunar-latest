package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterEnderChest extends ModelAdapter {
   public ModelAdapterEnderChest() {
      super(alf.class, "ender_chest", 0.0F);
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
      bhd renderer = dispatcher.a(alf.class);
      if (!(renderer instanceof bhg)) {
         return null;
      }

      if (renderer.getEntityClass() == null) {
         renderer = new bhg();
         renderer.a(dispatcher);
      }

      if (!Reflector.TileEntityEnderChestRenderer_modelChest.exists()) {
         Config.warn("Field not found: TileEntityEnderChestRenderer.modelChest");
         return null;
      } else {
         Reflector.setFieldValue(renderer, Reflector.TileEntityEnderChestRenderer_modelChest, modelBase);
         return renderer;
      }
   }
}
