/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.oop.studentcontroller;

import com.example.oop.model.student;
import java.util.List;

/**
 *
 * @author olade
 */
public interface studentDAO
{

    public void save(student students);

    public void update(student students);

    public void delete(student students);

    public student get(student students);

    public List<student> list();
}
