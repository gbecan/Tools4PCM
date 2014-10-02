package fr.diverse.pcm;

import java.util.List;

public interface FeatureGroup extends AbstractFeature {

	List<FeatureGroup> getFeatures();
	void addFeature(Feature feature);
	void removeFeature(Feature feature);
	
}
