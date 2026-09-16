package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterSign extends ModelAdapter {
   public ModelAdapterSign() {
      super(aln.class, "sign", 0.0F);
   }

   @Override
   public bbo makeModel() {
      return new bbx();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbx)) {
         return null;
      } else {
         bbx modelSign = (bbx)model;
         if (modelPart.equals("board")) {
            return modelSign.a;
         } else {
            return modelPart.equals("stick") ? modelSign.b : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"board", "stick"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      bhc dispatcher = bhc.a;
      bhd renderer = dispatcher.a(aln.class);
      if (!(renderer instanceof bhj)) {
         return null;
      }

      if (renderer.getEntityClass() == null) {
         renderer = new bhj();
         renderer.a(dispatcher);
      }

      if (!Reflector.TileEntitySignRenderer_model.exists()) {
         Config.warn("Field not found: TileEntitySignRenderer.model");
         return null;
      } else {
         Reflector.setFieldValue(renderer, Reflector.TileEntitySignRenderer_model, modelBase);
         return renderer;
      }
   }
}
