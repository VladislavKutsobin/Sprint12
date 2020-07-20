package com.softserve.edu.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.softserve.edu.entity.Communication;
import com.softserve.edu.entity.Entity;
import com.softserve.edu.entity.Solution;
import com.softserve.edu.service.DataService;

public class DataServiceImpl implements DataService {
    private List<Entity> students = new ArrayList<>();
    private List<Entity> mentors = new ArrayList<>();
    private List<Entity> sprints = new ArrayList<>();
    private List<Communication> communication = new ArrayList<>();
    private List<Solution> solution = new ArrayList<>();

    public void addStudent(String studentName) {
        // TODO for students
        if (students.isEmpty()) {
            Entity studentToAdd = new Entity(1, studentName);
            students.add(studentToAdd);
        } else {

            List<Integer> studentsIdList = new ArrayList<>();
            int maxStudentId;

            for (Entity entity : students) {
                studentsIdList.add(entity.getId());
            }

            maxStudentId = Collections.max(studentsIdList);

            students.add(new Entity(++maxStudentId, studentName));
        }
    }

    public void addMentor(String mentorName) {
        // TODO for mentors
        if (mentors.isEmpty()) {
            Entity mentorToAdd = new Entity(1, mentorName);
            mentors.add(mentorToAdd);
        } else {
            List<Integer> mentorsIdList = new ArrayList<>();
            int maxMentorId;

            for(Entity entity : mentors) {
                mentorsIdList.add(entity.getId());
            }

            maxMentorId = Collections.max(mentorsIdList);

            mentors.add(new Entity(++maxMentorId, mentorName));
        }
    }

    public void addSprint(String sprintName) {
        // TODO for sprints
        if (sprints.isEmpty()) {
            Entity sprintToAdd = new Entity(1, sprintName);
            sprints.add(sprintToAdd);
        } else {
            List<Integer> sprintsIdList = new ArrayList<>();
            int maxSprintId;

            for (Entity entity : sprints) {
                sprintsIdList.add(entity.getId());
            }

            maxSprintId = Collections.max(sprintsIdList);

            sprints.add(new Entity(++maxSprintId, sprintName));
        }
    }

    public void addCommunication(String studentName, String mentorName) {
        // TODO for communication
    }

    public void addSolution(String studentName, String sprintName, int score) {
        // TODO for solution
    }
    
    // getters
    
    // TODO
}
