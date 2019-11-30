package it.unical.mat.ingsw.DesignPatterns.behaviorals.observer.third;

import java.io.File;

public interface EventListener {
	void update(String eventType, File file);
}
