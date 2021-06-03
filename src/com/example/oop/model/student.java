/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.oop.model;

/**
 *
 * @author oladele
 */
public class student
{

    private int id;
    private String fname;
    private String course;
    private int fee;

    public int getId()
    {
	return id;
    }

    public void setId(int id)
    {
	this.id = id;
    }

    public String getFname()
    {
	return fname;
    }

    public void setFname(String fname)
    {
	this.fname = fname;
    }

    public String getCourse()
    {
	return course;
    }

    public void setCourse(String course)
    {
	this.course = course;
    }

    public int getFee()
    {
	return fee;
    }

    public void setFee(int fee)
    {
	this.fee = fee;
    }

}
