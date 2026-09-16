package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterBook extends ModelAdapter {
   public ModelAdapterBook() {
      super(ale.class, "book", 0.0F);
   }

   @Override
   public bbo makeModel() {
      return new bay();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bay)) {
         return null;
      } else {
         bay modelBook = (bay)model;
         if (modelPart.equals("cover_right")) {
            return modelBook.a;
         } else if (modelPart.equals("cover_left")) {
            return modelBook.b;
         } else if (modelPart.equals("pages_right")) {
            return modelBook.c;
         } else if (modelPart.equals("pages_left")) {
            return modelBook.d;
         } else if (modelPart.equals("flipping_page_right")) {
            return modelBook.e;
         } else if (modelPart.equals("flipping_page_left")) {
            return modelBook.f;
         } else {
            return modelPart.equals("book_spine") ? modelBook.g : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"cover_right", "cover_left", "pages_right", "pages_left", "flipping_page_right", "flipping_page_left", "book_spine"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      bhc dispatcher = bhc.a;
      bhd renderer = dispatcher.a(ale.class);
      if (!(renderer instanceof bhf)) {
         return null;
      }

      if (renderer.getEntityClass() == null) {
         renderer = new bhf();
         renderer.a(dispatcher);
      }

      if (!Reflector.TileEntityEnchantmentTableRenderer_modelBook.exists()) {
         Config.warn("Field not found: TileEntityEnchantmentTableRenderer.modelBook");
         return null;
      } else {
         Reflector.setFieldValue(renderer, Reflector.TileEntityEnchantmentTableRenderer_modelBook, modelBase);
         return renderer;
      }
   }
}
