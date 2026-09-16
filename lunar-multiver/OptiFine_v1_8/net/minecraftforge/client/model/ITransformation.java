package net.minecraftforge.client.model;

import javax.vecmath.Matrix4f;

public interface ITransformation {
   Matrix4f getMatrix();

   cq rotate(cq var1);

   int rotate(cq var1, int var2);
}
