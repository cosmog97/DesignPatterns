package it.unical.mat.ingsw.DesignPatterns.behaviorals.iterator.second;

public interface SocialNetwork {
	ProfileIterator createFriendsIterator(String profileEmail);

	ProfileIterator createCoworkersIterator(String profileEmail);
}