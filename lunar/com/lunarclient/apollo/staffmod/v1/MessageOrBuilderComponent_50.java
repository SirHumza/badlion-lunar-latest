package com.lunarclient.apollo.staffmod.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface DisableStaffModsMessageOrBuilder extends MessageOrBuilder {
   List<StaffMod> getStaffModsList();

   int getStaffModsCount();

   StaffMod getStaffMods(int var1);

   List<Integer> getStaffModsValueList();

   int getStaffModsValue(int var1);
}
