package com.trescode.mynotesapp;

import com.trescode.mynotesapp.entity.Note;

import java.util.ArrayList;


public interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}

