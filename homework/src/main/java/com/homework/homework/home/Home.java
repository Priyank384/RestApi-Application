package com.homework.homework.home;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loads")
public class Home {
   @Id
   @Column(name="loadId")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name="loadingPoint")
private String loadingPoint;

@Column(name="uploadingPoint")
private String unloadingPoint;

@Column(name="productType")
private String productType;

@Column(name="truckType")
private String truckType;

@Column(name="noOfTrucks")
private int noOfTrucks;

@Column(name="weight")
private int weight;

@Column(name="comment")
private String comment;

@Column(name="shipperId")
private String shipperId;

@Column(name="date")
private String date;

   public String getLoadingPoint() {
      return loadingPoint;
   }

   public void setLoadingPoint(String loadingPoint) {
      this.loadingPoint = loadingPoint;
   }

   public String getUnloadingPoint() {
      return unloadingPoint;
   }

   public void setUnloadingPoint(String unloadingPoint) {
      this.unloadingPoint = unloadingPoint;
   }

   public String getProductType() {
      return productType;
   }

   public void setProductType(String productType) {
      this.productType = productType;
   }

   public String getTruckType() {
      return truckType;
   }

   public void setTruckType(String truckType) {
      this.truckType = truckType;
   }

   public int getNoOfTrucks() {
      return noOfTrucks;
   }

   public void setNoOfTrucks(int noOfTrucks) {
      this.noOfTrucks = noOfTrucks;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public String getComment() {
      return comment;
   }

   public void setComment(String comment) {
      this.comment = comment;
   }

   public String getShipperId() {
      return shipperId;
   }

   public void setShipperId(String shipperId) {
      this.shipperId = shipperId;
   }

   public String getDate() {
      return date;
   }
   public void setDate(String date){
      this.date=date;
   }
}