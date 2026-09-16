package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterMagmaCube extends ModelAdapter {
   public ModelAdapterMagmaCube() {
      super(vu.class, "magma_cube", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bbl();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbl)) {
         return null;
      }

      bbl modelMagmaCube = (bbl)model;
      if (modelPart.equals("core")) {
         return (bct)Reflector.getFieldValue(modelMagmaCube, Reflector.ModelMagmaCube_core);
      }

      String PREFIX_SEGMENTS = "segment";
      if (modelPart.startsWith(PREFIX_SEGMENTS)) {
         bct[] segments = (bct[])Reflector.getFieldValue(modelMagmaCube, Reflector.ModelMagmaCube_segments);
         if (segments == null) {
            return null;
         }

         String numStr = modelPart.substring(PREFIX_SEGMENTS.length());
         int index = Config.parseInt(numStr, -1);
         index--;
         return index >= 0 && index < segments.length ? segments[index] : null;
      } else {
         return null;
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"core", "segment1", "segment2", "segment3", "segment4", "segment5", "segment6", "segment7", "segment8"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bji render = new bji(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
