package net.optifine.entity.model;

public class ModelAdapterCaveSpider extends ModelAdapterSpider {
   public ModelAdapterCaveSpider() {
      super(vm.class, "cave_spider", 0.7F);
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bil render = new bil(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
