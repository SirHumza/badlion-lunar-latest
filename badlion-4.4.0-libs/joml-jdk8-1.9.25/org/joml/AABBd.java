package org.joml;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.text.NumberFormat;

public class AABBd implements Externalizable {
   public double minX = Double.POSITIVE_INFINITY;
   public double minY = Double.POSITIVE_INFINITY;
   public double minZ = Double.POSITIVE_INFINITY;
   public double maxX = Double.NEGATIVE_INFINITY;
   public double maxY = Double.NEGATIVE_INFINITY;
   public double maxZ = Double.NEGATIVE_INFINITY;

   public AABBd() {
   }

   public AABBd(AABBd source) {
      this.minX = source.minX;
      this.minY = source.minY;
      this.minZ = source.minZ;
      this.maxX = source.maxX;
      this.maxY = source.maxY;
      this.maxZ = source.maxZ;
   }

   public AABBd(Vector3fc min, Vector3fc max) {
      this.minX = min.x();
      this.minY = min.y();
      this.minZ = min.z();
      this.maxX = max.x();
      this.maxY = max.y();
      this.maxZ = max.z();
   }

   public AABBd(Vector3dc min, Vector3dc max) {
      this.minX = min.x();
      this.minY = min.y();
      this.minZ = min.z();
      this.maxX = max.x();
      this.maxY = max.y();
      this.maxZ = max.z();
   }

   public AABBd(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
      this.minX = minX;
      this.minY = minY;
      this.minZ = minZ;
      this.maxX = maxX;
      this.maxY = maxY;
      this.maxZ = maxZ;
   }

   public AABBd set(AABBd source) {
      this.minX = source.minX;
      this.minY = source.minY;
      this.minZ = source.minZ;
      this.maxX = source.maxX;
      this.maxY = source.maxY;
      this.maxZ = source.maxZ;
      return this;
   }

   private AABBd validate() {
      if (!this.isValid()) {
         this.minX = Double.POSITIVE_INFINITY;
         this.minY = Double.POSITIVE_INFINITY;
         this.minZ = Double.POSITIVE_INFINITY;
         this.maxX = Double.NEGATIVE_INFINITY;
         this.maxY = Double.NEGATIVE_INFINITY;
         this.maxZ = Double.NEGATIVE_INFINITY;
      }

      return this;
   }

   public boolean isValid() {
      return this.minX < this.maxX && this.minY < this.maxY && this.minZ < this.maxZ;
   }

   public AABBd setMin(double minX, double minY, double minZ) {
      this.minX = minX;
      this.minY = minY;
      this.minZ = minZ;
      return this;
   }

   public AABBd setMax(double maxX, double maxY, double maxZ) {
      this.maxX = maxX;
      this.maxY = maxY;
      this.maxZ = maxZ;
      return this;
   }

   public AABBd setMin(Vector3dc min) {
      return this.setMin(min.x(), min.y(), min.z());
   }

   public AABBd setMax(Vector3dc max) {
      return this.setMax(max.x(), max.y(), max.z());
   }

   public double getMax(int component) throws IllegalArgumentException {
      switch (component) {
         case 0:
            return this.maxX;
         case 1:
            return this.maxY;
         case 2:
            return this.maxZ;
         default:
            throw new IllegalArgumentException();
      }
   }

   public double getMin(int component) throws IllegalArgumentException {
      switch (component) {
         case 0:
            return this.minX;
         case 1:
            return this.minY;
         case 2:
            return this.minZ;
         default:
            throw new IllegalArgumentException();
      }
   }

   public AABBd union(double x, double y, double z) {
      return this.union(x, y, z, this);
   }

   public AABBd union(Vector3dc p) {
      return this.union(p.x(), p.y(), p.z(), this);
   }

   public AABBd union(double x, double y, double z, AABBd dest) {
      dest.minX = this.minX < x ? this.minX : x;
      dest.minY = this.minY < y ? this.minY : y;
      dest.minZ = this.minZ < z ? this.minZ : z;
      dest.maxX = this.maxX > x ? this.maxX : x;
      dest.maxY = this.maxY > y ? this.maxY : y;
      dest.maxZ = this.maxZ > z ? this.maxZ : z;
      return dest;
   }

   public AABBd union(Vector3dc p, AABBd dest) {
      return this.union(p.x(), p.y(), p.z(), dest);
   }

   public AABBd union(AABBd other) {
      return this.union(other, this);
   }

   public AABBd union(AABBd other, AABBd dest) {
      dest.minX = this.minX < other.minX ? this.minX : other.minX;
      dest.minY = this.minY < other.minY ? this.minY : other.minY;
      dest.minZ = this.minZ < other.minZ ? this.minZ : other.minZ;
      dest.maxX = this.maxX > other.maxX ? this.maxX : other.maxX;
      dest.maxY = this.maxY > other.maxY ? this.maxY : other.maxY;
      dest.maxZ = this.maxZ > other.maxZ ? this.maxZ : other.maxZ;
      return dest;
   }

   public AABBd correctBounds() {
      if (this.minX > this.maxX) {
         double tmp = this.minX;
         this.minX = this.maxX;
         this.maxX = tmp;
      }

      if (this.minY > this.maxY) {
         double tmp = this.minY;
         this.minY = this.maxY;
         this.maxY = tmp;
      }

      if (this.minZ > this.maxZ) {
         double tmp = this.minZ;
         this.minZ = this.maxZ;
         this.maxZ = tmp;
      }

      return this;
   }

   public AABBd translate(Vector3dc xyz) {
      return this.translate(xyz.x(), xyz.y(), xyz.z(), this);
   }

   public AABBd translate(Vector3dc xyz, AABBd dest) {
      return this.translate(xyz.x(), xyz.y(), xyz.z(), dest);
   }

   public AABBd translate(Vector3fc xyz) {
      return this.translate(xyz.x(), xyz.y(), xyz.z(), this);
   }

   public AABBd translate(Vector3fc xyz, AABBd dest) {
      return this.translate(xyz.x(), xyz.y(), xyz.z(), dest);
   }

   public AABBd translate(double x, double y, double z) {
      return this.translate(x, y, z, this);
   }

   public AABBd translate(double x, double y, double z, AABBd dest) {
      dest.minX = this.minX + x;
      dest.minY = this.minY + y;
      dest.minZ = this.minZ + z;
      dest.maxX = this.maxX + x;
      dest.maxY = this.maxY + y;
      dest.maxZ = this.maxZ + z;
      return dest;
   }

   public AABBd intersection(AABBd other, AABBd dest) {
      dest.minX = Math.max(this.minX, other.minX);
      dest.minY = Math.max(this.minY, other.minY);
      dest.minZ = Math.max(this.minZ, other.minZ);
      dest.maxX = Math.min(this.maxX, other.maxX);
      dest.maxY = Math.min(this.maxY, other.maxY);
      dest.maxZ = Math.min(this.maxZ, other.maxZ);
      return dest.validate();
   }

   public AABBd intersection(AABBd other) {
      return this.intersection(other, this);
   }

   public boolean containsAABB(AABBd aabb) {
      return aabb.minX >= this.minX
         && aabb.maxX <= this.maxX
         && aabb.minY >= this.minY
         && aabb.maxY <= this.maxY
         && aabb.minZ >= this.minZ
         && aabb.maxZ <= this.maxZ;
   }

   public boolean containsAABB(AABBf aabb) {
      return aabb.minX >= this.minX
         && aabb.maxX <= this.maxX
         && aabb.minY >= this.minY
         && aabb.maxY <= this.maxY
         && aabb.minZ >= this.minZ
         && aabb.maxZ <= this.maxZ;
   }

   public boolean containsAABB(AABBi aabb) {
      return aabb.minX >= this.minX
         && aabb.maxX <= this.maxX
         && aabb.minY >= this.minY
         && aabb.maxY <= this.maxY
         && aabb.minZ >= this.minZ
         && aabb.maxZ <= this.maxZ;
   }

   public boolean containsPoint(double x, double y, double z) {
      return x >= this.minX && y >= this.minY && z >= this.minZ && x <= this.maxX && y <= this.maxY && z <= this.maxZ;
   }

   public boolean containsPoint(Vector3dc point) {
      return this.containsPoint(point.x(), point.y(), point.z());
   }

   public boolean intersectsPlane(double a, double b, double c, double d) {
      return Intersectiond.testAabPlane(this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ, a, b, c, d);
   }

   public boolean intersectsPlane(Planed plane) {
      return Intersectiond.testAabPlane(this, plane);
   }

   public boolean intersectsAABB(AABBd other) {
      return this.maxX >= other.minX
         && this.maxY >= other.minY
         && this.maxZ >= other.minZ
         && this.minX <= other.maxX
         && this.minY <= other.maxY
         && this.minZ <= other.maxZ;
   }

   public boolean intersectsSphere(double centerX, double centerY, double centerZ, double radiusSquared) {
      return Intersectiond.testAabSphere(this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ, centerX, centerY, centerZ, radiusSquared);
   }

   public boolean intersectsSphere(Spheref sphere) {
      return Intersectiond.testAabSphere(this, sphere);
   }

   public boolean intersectsRay(double originX, double originY, double originZ, double dirX, double dirY, double dirZ) {
      return Intersectiond.testRayAab(originX, originY, originZ, dirX, dirY, dirZ, this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ);
   }

   public boolean intersectsRay(Rayd ray) {
      return Intersectiond.testRayAab(ray, this);
   }

   public boolean intersectsRay(double originX, double originY, double originZ, double dirX, double dirY, double dirZ, Vector2d result) {
      return Intersectiond.intersectRayAab(
         originX, originY, originZ, dirX, dirY, dirZ, this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ, result
      );
   }

   public boolean intersectsRay(Rayd ray, Vector2d result) {
      return Intersectiond.intersectRayAab(ray, this, result);
   }

   public int intersectsLineSegment(double p0X, double p0Y, double p0Z, double p1X, double p1Y, double p1Z, Vector2d result) {
      return Intersectiond.intersectLineSegmentAab(p0X, p0Y, p0Z, p1X, p1Y, p1Z, this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ, result);
   }

   public int intersectsLineSegment(LineSegmentf lineSegment, Vector2d result) {
      return Intersectiond.intersectLineSegmentAab(lineSegment, this, result);
   }

   public AABBd transform(Matrix4dc m) {
      return this.transform(m, this);
   }

   public AABBd transform(Matrix4dc m, AABBd dest) {
      double dx = this.maxX - this.minX;
      double dy = this.maxY - this.minY;
      double dz = this.maxZ - this.minZ;
      double minx = Double.POSITIVE_INFINITY;
      double miny = Double.POSITIVE_INFINITY;
      double minz = Double.POSITIVE_INFINITY;
      double maxx = Double.NEGATIVE_INFINITY;
      double maxy = Double.NEGATIVE_INFINITY;
      double maxz = Double.NEGATIVE_INFINITY;

      for (int i = 0; i < 8; i++) {
         double x = this.minX + (i & 1) * dx;
         double y = this.minY + (i >> 1 & 1) * dy;
         double z = this.minZ + (i >> 2 & 1) * dz;
         double tx = m.m00() * x + m.m10() * y + m.m20() * z + m.m30();
         double ty = m.m01() * x + m.m11() * y + m.m21() * z + m.m31();
         double tz = m.m02() * x + m.m12() * y + m.m22() * z + m.m32();
         minx = Math.min(tx, minx);
         miny = Math.min(ty, miny);
         minz = Math.min(tz, minz);
         maxx = Math.max(tx, maxx);
         maxy = Math.max(ty, maxy);
         maxz = Math.max(tz, maxz);
      }

      dest.minX = minx;
      dest.minY = miny;
      dest.minZ = minz;
      dest.maxX = maxx;
      dest.maxY = maxy;
      dest.maxZ = maxz;
      return dest;
   }

   public int hashCode() {
      int prime = 31;
      int result = 1;
      long temp = Double.doubleToLongBits(this.maxX);
      result = 31 * result + (int)(temp ^ temp >>> 32);
      temp = Double.doubleToLongBits(this.maxY);
      result = 31 * result + (int)(temp ^ temp >>> 32);
      temp = Double.doubleToLongBits(this.maxZ);
      result = 31 * result + (int)(temp ^ temp >>> 32);
      temp = Double.doubleToLongBits(this.minX);
      result = 31 * result + (int)(temp ^ temp >>> 32);
      temp = Double.doubleToLongBits(this.minY);
      result = 31 * result + (int)(temp ^ temp >>> 32);
      temp = Double.doubleToLongBits(this.minZ);
      return 31 * result + (int)(temp ^ temp >>> 32);
   }

   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      } else if (obj == null) {
         return false;
      } else if (this.getClass() != obj.getClass()) {
         return false;
      } else {
         AABBd other = (AABBd)obj;
         if (Double.doubleToLongBits(this.maxX) != Double.doubleToLongBits(other.maxX)) {
            return false;
         } else if (Double.doubleToLongBits(this.maxY) != Double.doubleToLongBits(other.maxY)) {
            return false;
         } else if (Double.doubleToLongBits(this.maxZ) != Double.doubleToLongBits(other.maxZ)) {
            return false;
         } else if (Double.doubleToLongBits(this.minX) != Double.doubleToLongBits(other.minX)) {
            return false;
         } else {
            return Double.doubleToLongBits(this.minY) != Double.doubleToLongBits(other.minY)
               ? false
               : Double.doubleToLongBits(this.minZ) == Double.doubleToLongBits(other.minZ);
         }
      }
   }

   public String toString() {
      return Runtime.formatNumbers(this.toString(Options.NUMBER_FORMAT));
   }

   public String toString(NumberFormat formatter) {
      return "("
         + Runtime.format(this.minX, formatter)
         + " "
         + Runtime.format(this.minY, formatter)
         + " "
         + Runtime.format(this.minZ, formatter)
         + ") < ("
         + Runtime.format(this.maxX, formatter)
         + " "
         + Runtime.format(this.maxY, formatter)
         + " "
         + Runtime.format(this.maxZ, formatter)
         + ")";
   }

   public void writeExternal(ObjectOutput out) throws IOException {
      out.writeDouble(this.minX);
      out.writeDouble(this.minY);
      out.writeDouble(this.minZ);
      out.writeDouble(this.maxX);
      out.writeDouble(this.maxY);
      out.writeDouble(this.maxZ);
   }

   public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      this.minX = in.readDouble();
      this.minY = in.readDouble();
      this.minZ = in.readDouble();
      this.maxX = in.readDouble();
      this.maxY = in.readDouble();
      this.maxZ = in.readDouble();
   }
}
