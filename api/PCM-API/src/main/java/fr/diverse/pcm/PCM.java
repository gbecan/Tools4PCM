package fr.diverse.pcm;

import java.util.List;

public interface PCM {

	String getName();
	void setName(String name);
	
	List<Product> getProducts();
	void addProduct(Product product);
	void removeProduct(Product product);
	
	List<AbstractFeature> getFeatures();
	void addFeature(Feature feature);
	void removeFeature(Feature feature);
	
}
