package net.optifine.config;

import java.util.Arrays;
import java.util.regex.Pattern;
import net.optifine.util.StrUtils;
import org.apache.commons.lang3.StringEscapeUtils;

public class NbtTagValue {
   private String[] parents = null;
   private String name = null;
   private boolean negative = false;
   private int type = 0;
   private String value = null;
   private int valueFormat = 0;
   private static final int TYPE_TEXT = 0;
   private static final int TYPE_PATTERN = 1;
   private static final int TYPE_IPATTERN = 2;
   private static final int TYPE_REGEX = 3;
   private static final int TYPE_IREGEX = 4;
   private static final String PREFIX_PATTERN = "pattern:";
   private static final String PREFIX_IPATTERN = "ipattern:";
   private static final String PREFIX_REGEX = "regex:";
   private static final String PREFIX_IREGEX = "iregex:";
   private static final int FORMAT_DEFAULT = 0;
   private static final int FORMAT_HEX_COLOR = 1;
   private static final String PREFIX_HEX_COLOR = "#";
   private static final Pattern PATTERN_HEX_COLOR = Pattern.compile("^#[0-9a-f]{6}+$");

   public NbtTagValue(String tag, String value) {
      String[] names = Config.tokenize(tag, ".");
      this.parents = Arrays.copyOfRange(names, 0, names.length - 1);
      this.name = names[names.length - 1];
      if (value.startsWith("!")) {
         this.negative = true;
         value = value.substring(1);
      }

      if (value.startsWith("pattern:")) {
         this.type = 1;
         value = value.substring("pattern:".length());
      } else if (value.startsWith("ipattern:")) {
         this.type = 2;
         value = value.substring("ipattern:".length()).toLowerCase();
      } else if (value.startsWith("regex:")) {
         this.type = 3;
         value = value.substring("regex:".length());
      } else if (value.startsWith("iregex:")) {
         this.type = 4;
         value = value.substring("iregex:".length()).toLowerCase();
      } else {
         this.type = 0;
      }

      value = StringEscapeUtils.unescapeJava(value);
      if (this.type == 0 && PATTERN_HEX_COLOR.matcher(value).matches()) {
         this.valueFormat = 1;
      }

      this.value = value;
   }

   public boolean matches(dn nbt) {
      return this.negative ? !this.matchesCompound(nbt) : this.matchesCompound(nbt);
   }

   public boolean matchesCompound(dn nbt) {
      if (nbt == null) {
         return false;
      }

      eb tagBase = nbt;

      for (int i = 0; i < this.parents.length; i++) {
         String tag = this.parents[i];
         tagBase = getChildTag(tagBase, tag);
         if (tagBase == null) {
            return false;
         }
      }

      if (this.name.equals("*")) {
         return this.matchesAnyChild(tagBase);
      }

      tagBase = getChildTag(tagBase, this.name);
      return tagBase == null ? false : this.matchesBase(tagBase);
   }

   private boolean matchesAnyChild(eb tagBase) {
      if (tagBase instanceof dn) {
         dn tagCompound = (dn)tagBase;

         for (String key : tagCompound.c()) {
            eb nbtBase = tagCompound.a(key);
            if (this.matchesBase(nbtBase)) {
               return true;
            }
         }
      }

      if (tagBase instanceof du) {
         du tagList = (du)tagBase;
         int count = tagList.c();

         for (int i = 0; i < count; i++) {
            eb nbtBase = tagList.g(i);
            if (this.matchesBase(nbtBase)) {
               return true;
            }
         }
      }

      return false;
   }

   private static eb getChildTag(eb tagBase, String tag) {
      if (tagBase instanceof dn) {
         dn tagCompound = (dn)tagBase;
         return tagCompound.a(tag);
      }

      if (tagBase instanceof du) {
         du tagList = (du)tagBase;
         if (tag.equals("count")) {
            return new dt(tagList.c());
         }

         int index = Config.parseInt(tag, -1);
         return index >= 0 && index < tagList.c() ? tagList.g(index) : null;
      } else {
         return null;
      }
   }

   public boolean matchesBase(eb nbtBase) {
      if (nbtBase == null) {
         return false;
      }

      String nbtValue = getNbtString(nbtBase, this.valueFormat);
      return this.matchesValue(nbtValue);
   }

   public boolean matchesValue(String nbtValue) {
      if (nbtValue == null) {
         return false;
      }

      switch (this.type) {
         case 0:
            return nbtValue.equals(this.value);
         case 1:
            return this.matchesPattern(nbtValue, this.value);
         case 2:
            return this.matchesPattern(nbtValue.toLowerCase(), this.value);
         case 3:
            return this.matchesRegex(nbtValue, this.value);
         case 4:
            return this.matchesRegex(nbtValue.toLowerCase(), this.value);
         default:
            throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.type);
      }
   }

   private boolean matchesPattern(String str, String pattern) {
      return StrUtils.equalsMask(str, pattern, '*', '?');
   }

   private boolean matchesRegex(String str, String regex) {
      return str.matches(regex);
   }

   private static String getNbtString(eb nbtBase, int format) {
      if (nbtBase == null) {
         return null;
      } else if (nbtBase instanceof ea) {
         ea nbtString = (ea)nbtBase;
         return nbtString.a_();
      } else if (nbtBase instanceof dt) {
         dt i = (dt)nbtBase;
         return format == 1 ? "#" + StrUtils.fillLeft(Integer.toHexString(i.d()), 6, '0') : Integer.toString(i.d());
      } else if (nbtBase instanceof dm) {
         dm b = (dm)nbtBase;
         return Byte.toString(b.f());
      } else if (nbtBase instanceof dz) {
         dz s = (dz)nbtBase;
         return Short.toString(s.e());
      } else if (nbtBase instanceof dv) {
         dv l = (dv)nbtBase;
         return Long.toString(l.c());
      } else if (nbtBase instanceof dr) {
         dr f = (dr)nbtBase;
         return Float.toString(f.h());
      } else if (nbtBase instanceof dp) {
         dp d = (dp)nbtBase;
         return Double.toString(d.g());
      } else {
         return nbtBase.toString();
      }
   }

   @Override
   public String toString() {
      StringBuffer sb = new StringBuffer();

      for (int i = 0; i < this.parents.length; i++) {
         String parent = this.parents[i];
         if (i > 0) {
            sb.append(".");
         }

         sb.append(parent);
      }

      if (sb.length() > 0) {
         sb.append(".");
      }

      sb.append(this.name);
      sb.append(" = ");
      sb.append(this.value);
      return sb.toString();
   }
}
