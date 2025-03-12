package july__25__07__2024;

import java.io.Serializable;

public class Product__Bean implements Serializable
{
private String code,name;
Integer QTY;
Float price;
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getQTY() {
	return QTY;
}
public void setQTY(Integer qTY) {
	QTY = qTY;
}
public Float getPrice() {
	return price;
}
public void setPrice(Float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product__Bean [code=" + code + ", name=" + name + ", QTY=" + QTY + ", price=" + price + "]";
}

}
