package com.magnumopus.managedbeans;

import javax.faces.bean.ManagedBean;

import com.magnumopus.models.Exercise;

@ManagedBean
public class ExerciseMB {
	
	private Exercise exercise = new Exercise();

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
}
