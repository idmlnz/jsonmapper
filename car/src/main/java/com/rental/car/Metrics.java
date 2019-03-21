package com.rental.car;

/**
 * Created by imalonzo on 8/13/18.
 */
public class Metrics {
  private float yoymaintenancecost;

  private float depreciation;

  private RentalCount rentalcount;

  public float getYoymaintenancecost() {
    return yoymaintenancecost;
  }

  public void setYoymaintenancecost(float yoymaintenancecost) {
    this.yoymaintenancecost = yoymaintenancecost;
  }

  public float getDepreciation() {
    return depreciation;
  }

  public void setDepreciation(float depreciation) {
    this.depreciation = depreciation;
  }

  public RentalCount getRentalcount() {
    return rentalcount;
  }

  public void setRentalcount(RentalCount rentalcount) {
    this.rentalcount = rentalcount;
  }

}
