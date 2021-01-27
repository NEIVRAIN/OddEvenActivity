package com.cpe50;

public class Candle {
	private String color;
	private int height;
	protected double price;
		
public Candle(String color, int height) {
	this.color = color;
	this.height = height;
}
public void setColor(String color) {
	this.color = color;
} 
public String getColor() {
	return color;
}
public void setHeight(int h) {
	final double PER_INCH = 2;
	height=h;
	price = height * PER_INCH;
}
public int getHeight() {
	return height;
}
public double getPrice() {
	return price;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return color + ", " + height + ", " + price;
}

}
