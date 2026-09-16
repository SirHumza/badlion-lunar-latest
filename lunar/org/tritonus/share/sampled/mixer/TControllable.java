package org.tritonus.share.sampled.mixer;

public interface TControllable {
   void setParentControl(TCompoundControl var1);

   TCompoundControl getParentControl();

   void commit();
}
