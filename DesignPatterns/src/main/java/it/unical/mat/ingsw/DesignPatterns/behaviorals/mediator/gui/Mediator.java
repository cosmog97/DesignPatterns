package it.unical.mat.ingsw.DesignPatterns.behaviorals.mediator.gui;

import javax.swing.ListModel;

/**
 * Common mediator interface.
 */
public interface Mediator {
	void addNewNote(Note note);

	void deleteNote();

	void getInfoFromList(Note note);

	void saveChanges();

	void markNote();

	void clear();

	void sendToFilter(ListModel listModel);

	void setElementsList(ListModel list);

	void registerComponent(Component component);

	void hideElements(boolean flag);

	void createGUI();
}