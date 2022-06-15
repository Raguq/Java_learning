package ru.stqa.pft.sandbox;

public class Point {

  public double Xa;
  public double Xb;
  public double Ya;
  public double Yb;

  public Point(double Xa, double Xb, double Ya, double Yb) {
    this.Xa = Xa;
    this.Xb = Xb;
    this.Ya = Ya;
    this.Yb = Yb;

  }
  public double distance() {
    return Math.sqrt(((Xb - Xa) * (Xb - Xa)) + ((Yb - Ya) * (Yb - Ya)));
  }
}
